public class PatientBST {

    // Node represents one patient in the tree
    class Node {
        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
            left = null;
            right = null;
        }
    }

    Node root;

    // Insert a new patient
    public void insert(Patient patient) {
        root = insertPatient(root, patient);
    }

    private Node insertPatient(Node root, Patient patient) {

        if (root == null) {
            return new Node(patient);
        }

        if (patient.patientId < root.patient.patientId) {
            root.left = insertPatient(root.left, patient);
        }
        else if (patient.patientId > root.patient.patientId) {
            root.right = insertPatient(root.right, patient);
        }
        else {
            System.out.println("Patient ID already exists.");
        }

        return root;
    }

    // Search for a patient using Patient ID
    public Patient search(int patientId) {

        Node current = root;

        while (current != null) {

            if (patientId == current.patient.patientId) {
                return current.patient;
            }

            if (patientId < current.patient.patientId) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }

        return null;
    }

    // Delete a patient using Patient ID
    public void delete(int patientId) {
        root = deletePatient(root, patientId);
    }

    private Node deletePatient(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (patientId < root.patient.patientId) {
            root.left = deletePatient(root.left, patientId);
        }
        else if (patientId > root.patient.patientId) {
            root.right = deletePatient(root.right, patientId);
        }
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node smallestNode = findSmallest(root.right);

            root.patient = smallestNode.patient;

            root.right = deletePatient(
                root.right,
                smallestNode.patient.patientId
            );
        }

        return root;
    }

    // Find the smallest patient ID
    private Node findSmallest(Node root) {

        Node current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    // In-order traversal
    public void displayPatients() {

        if (root == null) {
            System.out.println("No patients found.");
            return;
        }

        System.out.println("\nPatients in ascending Patient ID order:");
        inOrder(root);
    }

    private void inOrder(Node root) {

        if (root != null) {

            inOrder(root.left);

            System.out.println(
                "ID: " + root.patient.patientId +
                " | Name: " + root.patient.patientName +
                " | Age: " + root.patient.age +
                " | Contact: " + root.patient.contactNumber +
                " | Condition: " + root.patient.medicalCondition
            );

            inOrder(root.right);
        }
    }
}