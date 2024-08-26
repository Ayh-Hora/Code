public class Store {
    // Attributes
    private double totalSales; // Total sales of the store
    private double totalDiscount; // Total discount given by the store
    private int storeId; // Unique identifier for the store
    private String storeName; // Name of the store
    private String location; // Location of the store
    private String openingHour; // Opening hour of the store

    // Constructor
    public Store(int storeId, String storeName, String location, String openingHour) {
        this.storeId = storeId; // Assigning storeId
        this.storeName = storeName; // Assigning storeName
        this.location = location; // Assigning location
        this.openingHour = openingHour; // Assigning openingHour
        this.totalSales = 0.0; // Initializing totalSales to 0.0
        this.totalDiscount = 0.0; // Initializing totalDiscount to 0.0
    }

    // Accessor methods or get methods
    public int getId() {
        return storeId; // Returning storeId
    }

    public String getName() {
        return storeName; // Returning storeName
    }

    public String getLocation() {
        return location; // Returning location
    }

    public String getOpeningHour() {
        return openingHour; // Returning openingHour
    }

    public double getTotalSales() {
        return totalSales; // Returning totalSales
    }

    public double getTotalDiscount() {
        return totalDiscount; // Returning totalDiscount
    }

    // Mutator methods or set methods
    public void setTotalSales(double newTotalSales) {
        this.totalSales += newTotalSales; // Adding newTotalSales to totalSales
    }

    public void setTotalDiscount(double newTotalDiscount) {
        this.totalDiscount += newTotalDiscount; // Adding newTotalDiscount to totalDiscount
    }

    // Display method
    public void display() {
        System.out.println("Store ID: " + storeId); // Printing storeId
        System.out.println("Store Name: " + storeName); // Printing storeName
        System.out.println("Location: " + location); // Printing location
        System.out.println("Opening Hour: " + openingHour); // Printing openingHour

        if (totalSales == 0 && totalDiscount == 0) {
            System.out.println("No sales have been made yet."); // Printing message if no sales made yet
        } else {
            System.out.println("Total Sales: " + totalSales); // Printing totalSales
            System.out.println("Total Discount: " + totalDiscount); // Printing totalDiscount
        }
    }
}
