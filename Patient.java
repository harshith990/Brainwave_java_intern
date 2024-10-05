class Patient {
    private String patientId;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String contactNumber;
    private String medicalHistory;

    public Patient(String patientId, String name, int age, String gender, String address, String contactNumber, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactNumber = contactNumber;
        this.medicalHistory = medicalHistory;
    }

    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medical History: " + medicalHistory);
    }

    public String getPatientId() {
        return patientId;
    }
}
