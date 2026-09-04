public class Patient {

    int patientId;
    String patientName;
    int age;
    String contactNumber;
    String medicalCondition;
    VisitLinkedList visitHistory;

    public Patient(int patientId, String patientName, int age,
                   String contactNumber, String medicalCondition) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
        this.visitHistory = new VisitLinkedList();
    }
}