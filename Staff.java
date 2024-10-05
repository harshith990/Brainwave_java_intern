class Staff {
    private String staffId;
    private String name;
    private String role;
    private String contactNumber;
    private String shiftTiming;

    public Staff(String staffId, String name, String role, String contactNumber, String shiftTiming) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.contactNumber = contactNumber;
        this.shiftTiming = shiftTiming;
    }

    public void displayStaffDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Shift Timing: " + shiftTiming);
    }
}
