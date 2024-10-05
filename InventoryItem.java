class InventoryItem {
    private String itemId;
    private String itemName;
    private int quantity;
    private String supplier;
    private String expirationDate;

    public InventoryItem(String itemId, String itemName, int quantity, String supplier, String expirationDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.supplier = supplier;
        this.expirationDate = expirationDate;
    }

    public void displayItem() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Supplier: " + supplier);
        System.out.println("Expiration Date: " + expirationDate);
    }
}
