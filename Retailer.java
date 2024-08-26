
public class Retailer extends Store {

    // Attributes
    private int vatInclusivePrice; // VAT inclusive price of the product
    private int loyaltyPoint;  // Loyalty points earned by the customer
    private boolean isPaymentOnline; // Indicates whether payment is made online
    private String purchasedYear;   // Year when the product was purchased
    private boolean isProductRemoved; // Indicates if the product has been removed

    // Constructor
    public Retailer(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount, int vatInclusivePrice, boolean isPaymentOnline, String purchasedYear) {
        // Call superclass constructor
        super(storeId, storeName, location, openingHour);
        // Set total sales and total discount using superclass methods
        super.setTotalSales(totalSales);
        super.setTotalDiscount(totalDiscount);

        // Initialize attributes
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0; // Default loyalty points is zero
        this.isProductRemoved = false;
    }

    // Accessor methods
    public int getVatInclusivePrice() {
        return vatInclusivePrice; // Returning vatInclusivePrice
    }

    public int getLoyaltyPoint() {
        return loyaltyPoint;    // Returning loyaltyPoint
    }

    public boolean getPaymentOnline() {
        return isPaymentOnline; // Returning ispaymentOnline
    }

    public String getPurchasedYear() {
        return purchasedYear;    // Returning purchasedYear
    }

    public boolean isProductRemoved() {
        return isProductRemoved;  // Returning isproductRemoved
    }

    // Mutator method for isPaymentOnline
    public void setPaymentOnline(boolean isPaymentOnline) {
        this.isPaymentOnline = isPaymentOnline;
    }

    // Method to calculate loyalty points based on VAT payment
    public void countLoyaltyPoint(boolean isPaymentOnline, int newvatInclusivePrice) {
        if (isPaymentOnline) {
            // Calculate loyalty points (1% of VAT inclusive price)
            this.loyaltyPoint = (newvatInclusivePrice) / 100;
            System.out.println("this is test" + isPaymentOnline);
        } else {
            this.loyaltyPoint = 0;
        }
    }

    // Method to remove product if conditions are met
    public void removeProduct() {
        if (this.loyaltyPoint == 0) {
            // Check if purchased year is within the allowed range
            if (purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022")) {
                // Mark product as removed and reset attributes
                isProductRemoved = true;
                vatInclusivePrice = 0;
                loyaltyPoint = 0;
                isPaymentOnline = false;
            }
        }
    }

    // Method to display details of the Retailer class
    @Override
    public void display() {
        // Call superclass display method to display common attributes
        super.display();

        // Display specific attributes of Retailer class
        System.out.println("VAT Inclusive Price: " + vatInclusivePrice);
        System.out.println("Loyalty Point: " + loyaltyPoint);
        System.out.println("Is Payment Online: " + isPaymentOnline);
        System.out.println("Purchased Year: " + purchasedYear);

        // Check if product has been removed and display message accordingly
        if (isProductRemoved) {
            System.out.println("Product has been removed.");
        }
    }
}
