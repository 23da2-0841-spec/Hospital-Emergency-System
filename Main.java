import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PatientBST patientBST = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        TreatmentStack treatmentStack = new TreatmentStack();
    

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println(" MINI HOSPITAL EMERGENCY MANAGEMENT");
            System.out.println("========================================");

            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Display All Patients");
            System.out.println("5. Add Emergency Patient");
            System.out.println("6. Treat Next Patient");
            System.out.println("7. Display Waiting Queue");
            System.out.println("8. Add Treatment Record");
            System.out.println("9. Remove Latest Treatment");
            System.out.println("10. Display Treatment History");
            System.out.println("11. Add Patient Visit");
            System.out.println("12. Remove Patient Visit");
            System.out.println("13. Search Patient Visit");
            System.out.println("14. Display Patient Visits");
            System.out.println("15. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Contact Number: ");
                    String contact = scanner.nextLine();

                    System.out.print("Enter Medical Condition: ");
                    String condition = scanner.nextLine();

                    Patient patient = new Patient(
                        id,
                        name,
                        age,
                        contact,
                        condition
                    );

                    patientBST.insert(patient);

                    System.out.println("Patient registered successfully.");
                    break;

                case 2:
                    System.out.print("Enter Patient ID to search: ");
                    int searchId = scanner.nextInt();

                    Patient foundPatient = patientBST.search(searchId);

                    if (foundPatient != null) {

                        System.out.println("\nPatient Found:");
                        System.out.println("ID: " + foundPatient.patientId);
                        System.out.println("Name: " + foundPatient.patientName);
                        System.out.println("Age: " + foundPatient.age);
                        System.out.println("Contact: " + foundPatient.contactNumber);
                        System.out.println(
                            "Condition: " + foundPatient.medicalCondition
                        );

                    } else {
                        System.out.println("Patient not found.");
                    }

                    break;

                case 3:
                    System.out.print("Enter Patient ID to delete: ");
                    int deleteId = scanner.nextInt();

                    patientBST.delete(deleteId);

                    System.out.println("Delete operation completed.");
                    break;

                case 4:
                    patientBST.displayPatients();
                    break;

                case 5:
                    System.out.print("Enter Patient ID: ");
                    int emergencyId = scanner.nextInt();

                    Patient emergencyPatient =
                        patientBST.search(emergencyId);

                    if (emergencyPatient != null) {
                        emergencyQueue.enqueue(emergencyPatient);
                    } else {
                        System.out.println("Patient not found.");
                    }

                    break;

                case 6:
                    emergencyQueue.dequeue();
                    break;

                case 7:
                    emergencyQueue.displayQueue();
                    break;

                case 8:
                    System.out.print("Enter Patient ID: ");
                    int treatmentPatientId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Treatment: ");
                    String treatment = scanner.nextLine();

                    String treatmentRecord =
                        "Patient ID: " + treatmentPatientId +
                        " | Treatment: " + treatment;

                    treatmentStack.push(treatmentRecord);
                    break;

                case 9:
                    treatmentStack.pop();
                    break;

                case 10:
                    treatmentStack.displayTreatments();
                    break;

                case 11:
    System.out.print("Enter Patient ID: ");
    int visitPatientId = scanner.nextInt();
    scanner.nextLine();

    Patient visitPatient = patientBST.search(visitPatientId);

    if (visitPatient != null) {

        System.out.print("Enter Visit ID: ");
        int visitId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Visit Date: ");
        String visitDate = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.nextLine();

        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String visitTreatment = scanner.nextLine();

        visitPatient.visitHistory.addVisit(
            visitId,
            visitDate,
            doctorName,
            diagnosis,
            visitTreatment
        );

    } else {
        System.out.println("Patient not found.");
    }

    break;

                case 12:
    System.out.print("Enter Patient ID: ");
    int removePatientId = scanner.nextInt();

    Patient removePatient = patientBST.search(removePatientId);

    if (removePatient != null) {

        System.out.print("Enter Visit ID to remove: ");
        int removeVisitId = scanner.nextInt();

        removePatient.visitHistory.removeVisit(removeVisitId);

    } else {
        System.out.println("Patient not found.");
    }

    break;

                case 13:
    System.out.print("Enter Patient ID: ");
    int searchPatientId = scanner.nextInt();

    Patient searchPatient = patientBST.search(searchPatientId);

    if (searchPatient != null) {

        System.out.print("Enter Visit ID to search: ");
        int searchVisitId = scanner.nextInt();

        searchPatient.visitHistory.searchVisit(searchVisitId);

    } else {
        System.out.println("Patient not found.");
    }

    break;

                case 14:
    System.out.print("Enter Patient ID: ");
    int displayPatientId = scanner.nextInt();

    Patient displayPatient = patientBST.search(displayPatientId);

    if (displayPatient != null) {

        displayPatient.visitHistory.displayVisits();

    } else {
        System.out.println("Patient not found.");
    }

    break;

                case 15:
                    System.out.println(
                        "Thank you for using the Hospital System."
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 15);

        scanner.close();
    }
}