
public class Department extends Store {

    private String productName;// Product name
    private double markedPrice;// Marked price of the product
    private double sellingPrice;  // Selling price of the product
    private boolean isinSales; // Indicates whether the product is available for sales

    public Department(int storeId, String storeName, String location, String openingHour, double totalSales, double totalDiscount, String productName, double markedPrice) {
        super(storeId, storeName, location, openingHour); // Invoke superclass constructor
        super.setTotalSales(totalSales); // Set total sales inherited from Store
        super.setTotalDiscount(totalDiscount); // Set total discount inherited from Store
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.sellingPrice = 0; // Initialize selling price to 0                                                                  
        this.isinSales = true; // Product is initially available for sales
    }

    //each attribute has a accessor method
    public String getProductName() {
        return productName; // Returning productName
    }

    public double getMarkedPrice() {
        return markedPrice; // Returning markedPrice
    }

    public double getSellingPrice() {
        return sellingPrice;  // Returning sellingPrice
    }

    public boolean getSales() {
        return isinSales;   // Returning isinsales
    }

    //mutators method for marked price
    public void setMarkPrice(double markedPrice) {
        this.markedPrice = markedPrice;
    }

    //method to calculate selling price and update attributes
    public void calculateDiscountPrice(boolean isinSales, double markedPrice) {
        double discountPer;

        if (isinSales) {
            // Determine discount percentage based on marked price
            if (markedPrice >= 5000) {
                discountPer = 0.2;
            } else if (markedPrice >= 3000) {
                discountPer = 0.1;
            } else if (markedPrice >= 1000) {
                discountPer = 0.05;
            } else {
                discountPer = 0;
            }
            // Calculate selling price after discount
            this.sellingPrice = markedPrice - (markedPrice * discountPer);
            // Update total discount and total sales

            setTotalDiscount(markedPrice - sellingPrice);
            setTotalSales(sellingPrice);
            this.isinSales = false; // Product is no longer available for sales after discount applied
        } else {
            System.out.println("Product is not available for sales.");
        }
    
    }

    @Override
    public void display() {
        super.display(); // Display store details
        System.out.println("Product Name: " + productName);
        if (isinSales) {
            System.out.println("Marked Price: " + markedPrice);
        } else {
            System.out.println("Selling Price: " + sellingPrice);
        }
    }
}
