import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue;

    // Constructor
    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    // Add patient to the emergency queue
    public void enqueue(Patient patient) {
        queue.add(patient);
        System.out.println("Patient added to emergency queue.");
    }

    // Remove the next patient for treatment
    public Patient dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = queue.remove();

        System.out.println(
            "Patient removed for treatment: " +
            patient.patientName
        );

        return patient;
    }

    // Display all patients waiting
    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("No patients are waiting.");
            return;
        }

        System.out.println("\nPatients waiting for treatment:");

        for (Patient patient : queue) {

            System.out.println(
                "ID: " + patient.patientId +
                " | Name: " + patient.patientName +
                " | Condition: " + patient.medicalCondition
            );
        }
    }

    // Check whether the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}