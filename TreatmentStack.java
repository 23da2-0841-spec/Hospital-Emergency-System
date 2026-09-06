import java.util.Stack;

public class TreatmentStack {

    private Stack<String> treatmentStack;

    // Constructor
    public TreatmentStack() {
        treatmentStack = new Stack<>();
    }

    // Add a completed treatment record
    public void push(String treatmentRecord) {

        if (treatmentRecord == null || treatmentRecord.trim().isEmpty()) {
            System.out.println("Cannot add an empty treatment record.");
            return;
        }

        treatmentStack.push(treatmentRecord);
        System.out.println("Treatment record added successfully.");
    }

    // Remove the most recently completed treatment
    public String pop() {

        if (treatmentStack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return null;
        }

        String treatment = treatmentStack.pop();

        System.out.println(
            "Removed treatment record: " + treatment
        );

        return treatment;
    }

    // Display all treatment records
    public void displayTreatments() {

        if (treatmentStack.isEmpty()) {
            System.out.println("No treatment records found.");
            return;
        }

        System.out.println("\nTreatment History:");

        for (String treatment : treatmentStack) {
            System.out.println(treatment);
        }
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return treatmentStack.isEmpty();
    }
}