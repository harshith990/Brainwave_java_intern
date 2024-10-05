public class HealthRecord {
    private String recordId;
    private String patientId;
    private String diagnosis;
    private String prescription;
    private String labResults;

    public HealthRecord(String recordId, String patientId, String diagnosis, String prescription, String labResults) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.labResults = labResults;
    }

    // Method to retrieve the patient ID
    public String getPatientId() {
        return patientId;
    }

    public void displayHealthRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Prescription: " + prescription);
        System.out.println("Lab Results: " + labResults);
    }
}
