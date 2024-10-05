class Bill {
    private String billId;
    private String patientId;
    private double amount;
    private String paymentMethod;
    private String billingDate;

    public Bill(String billId, String patientId, double amount, String paymentMethod, String billingDate) {
        this.billId = billId;
        this.patientId = patientId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.billingDate = billingDate;
    }

    public void displayBill() {
        System.out.println("Bill ID: " + billId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Billing Date: " + billingDate);
    }
}
