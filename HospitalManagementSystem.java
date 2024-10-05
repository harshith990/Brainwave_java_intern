import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();
        ArrayList<HealthRecord> healthRecords = new ArrayList<>();
        ArrayList<Bill> bills = new ArrayList<>();
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        ArrayList<Staff> staffMembers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("---- Hospital Management System ----");
            System.out.println("1. Register a Patient");
            System.out.println("2. Schedule an Appointment");
            System.out.println("3. View Patient Health Record");
            System.out.println("4. Generate a Bill");
            System.out.println("5. View Inventory");
            System.out.println("6. View Staff Members");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    // Register a patient
                    System.out.print("Enter Patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Contact Number: ");
                    String contactNumber = scanner.nextLine();
                    System.out.print("Enter Medical History: ");
                    String medicalHistory = scanner.nextLine();
                    patients.add(new Patient(patientId, name, age, gender, address, contactNumber, medicalHistory));
                    break;

                case 2:
                    // Schedule an appointment
                    System.out.print("Enter Appointment ID: ");
                    String appointmentId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String appPatientId = scanner.nextLine();
                    System.out.print("Enter Doctor ID: ");
                    String doctorId = scanner.nextLine();
                    System.out.print("Enter Appointment Date: ");
                    String appointmentDate = scanner.nextLine();
                    System.out.print("Enter Appointment Time: ");
                    String appointmentTime = scanner.nextLine();
                    appointments.add(new Appointment(appointmentId, appPatientId, doctorId, appointmentDate, appointmentTime));
                    break;

                case 3:
    // View health records
    System.out.print("Enter Patient ID: ");
    String healthPatientId = scanner.nextLine();
    for (HealthRecord record : healthRecords) {
        if (record.getPatientId().equals(healthPatientId)) {
            record.displayHealthRecord();
        }
    }
    break;

                case 4:
                    // Generate a bill
                    System.out.print("Enter Bill ID: ");
                    String billId = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String billPatientId = scanner.nextLine();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter Payment Method: ");
                    String paymentMethod = scanner.nextLine();
                    System.out.print("Enter Billing Date: ");
                    String billingDate = scanner.nextLine();
                    bills.add(new Bill(billId, billPatientId, amount

, paymentMethod, billingDate));
                    System.out.println("Bill generated successfully!");
                    break;

                case 5:
                    // View Inventory
                    System.out.println("---- Inventory List ----");
                    for (InventoryItem item : inventory) {
                        item.displayItem();
                    }
                    break;

                case 6:
                    // View Staff Members
                    System.out.println("---- Staff Members ----");
                    for (Staff staff : staffMembers) {
                        staff.displayStaffDetails();
                    }
                    break;

                case 7:
                    // Exit
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}

