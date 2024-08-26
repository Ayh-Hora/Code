
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StoreGUI extends JFrame {

    // Department Components
    private JFrame frame;
    private JTextField StoreId, StoreName, Location, OpeningHour, TotalSales, TotalDiscount;
    private JTextField ProductName, MarkedPrice;
    private JButton btnAddDepartment;
    private JLabel lblLine2, lblDepartment, lblStoreId, lblStoreName, lblLocation, lblOpeningHour, lblTotalSales,
            lblTotalDiscount, lblProductName, lblMarkedPrice;
    private JPanel DepartmentPanel;

    // Retailer Components
    private JTextField StoreId2, StoreName2, Location2, OpeningHour2, TotalSales2, TotalDiscount2;
    private JTextField VATInclusivePrice;
    private JCheckBox checkIsPaymentOnline;
    private JComboBox<String> cmbPurchasedYear; // cmbIsProductRemoved
    private JButton btnAddRetailer;
    private JLabel lblTitle, lblLine1;
    private JPanel RetailerPanel;

    // for loyality pannel
    private JTextField StoreId3, VatInclusivePrice2;
    private JCheckBox checkIsPaymentOnline2;
    private JButton btnSetLoyaltyPoint;

    // For Calculate Discount price
    private JTextField StoreId4;
    private JCheckBox checkIsInsale;
    private JButton btnCalculateDiscountPrice;

    // For RProducts Pannel
    private JTextField StoreId5;
    private JButton btnRemoveProduct;

    // Common Buttons
    private JButton btnDisplay, btnClear;

    private ArrayList<Store> StorageList;

    public StoreGUI() {

        frame = new JFrame();

        StorageList = new ArrayList<>();

        frame.setTitle("Store Management System");
        frame.setSize(1000, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        Color darkGreen = new Color(47, 79, 79); // Dark Green color
        Color peach = new Color(255, 228, 220); // Peach color
        Color white = new Color(220, 220, 220); // White color for text
        Color pannel = new Color(38, 43, 47);
        Color antiq = new Color(245, 245, 224);

        lblTitle = new JLabel("Store Management System");
        lblTitle.setBounds(600, 10, 900, 50);
        lblTitle.setForeground(white);
        lblTitle.setFont(new Font("Rockwell", Font.BOLD, 35));
        add(lblTitle);

        lblLine1 = new JLabel("_________________________________________________");
        lblLine1.setBounds(560, 35, 800, 25);
        lblLine1.setForeground(white);
        lblLine1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        add(lblLine1);

        // Department Section
        DepartmentPanel = new JPanel();
        DepartmentPanel.setLayout(null);
        DepartmentPanel.setBounds(40, 80, 450, 600);
        DepartmentPanel.setBackground(darkGreen);
        getContentPane().setBackground(pannel);

        lblDepartment = new JLabel("Department Section");
        lblDepartment.setBounds(130, 75, 350, 25);
        lblDepartment.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        lblDepartment.setForeground(white);
        DepartmentPanel.add(lblDepartment);

        lblLine2 = new JLabel("_______________________________");
        lblLine2.setBounds(60, 85, 350, 25);
        lblLine2.setForeground(white);
        lblLine2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        DepartmentPanel.add(lblLine2);

        lblStoreId = new JLabel("Store ID ");
        lblStoreId.setBounds(80, 130, 100, 25);
        lblStoreId.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreId.setForeground(white);
        DepartmentPanel.add(lblStoreId);

        StoreId = new JTextField();
        StoreId.setBounds(220, 130, 150, 25);
        StoreId.setBackground(peach);
        DepartmentPanel.add(StoreId);

        lblStoreName = new JLabel("Store Name ");
        lblStoreName.setBounds(80, 170, 100, 25);
        lblStoreName.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreName.setForeground(white);
        DepartmentPanel.add(lblStoreName);

        StoreName = new JTextField();
        StoreName.setBounds(220, 170, 150, 25);
        StoreName.setBackground(peach);
        DepartmentPanel.add(StoreName);

        lblLocation = new JLabel("Location");
        lblLocation.setBounds(80, 210, 100, 25);
        lblLocation.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblLocation.setForeground(white);
        DepartmentPanel.add(lblLocation);

        Location = new JTextField();
        Location.setBounds(220, 210, 150, 25);
        Location.setBackground(peach);
        DepartmentPanel.add(Location);

        lblOpeningHour = new JLabel("Opening Hour");
        lblOpeningHour.setBounds(80, 250, 220, 25);
        lblOpeningHour.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblOpeningHour.setForeground(white);
        DepartmentPanel.add(lblOpeningHour);

        OpeningHour = new JTextField();
        OpeningHour.setBounds(220, 250, 150, 25);
        OpeningHour.setBackground(peach);
        DepartmentPanel.add(OpeningHour);

        lblTotalSales = new JLabel("Total Sales");
        lblTotalSales.setBounds(80, 290, 100, 25);
        lblTotalSales.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblTotalSales.setForeground(white);
        DepartmentPanel.add(lblTotalSales);

        TotalSales = new JTextField();
        TotalSales.setBounds(220, 290, 150, 25);
        TotalSales.setBackground(peach);
        DepartmentPanel.add(TotalSales);

        lblTotalDiscount = new JLabel("Total Discount");
        lblTotalDiscount.setBounds(80, 330, 120, 25);
        lblTotalDiscount.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblTotalDiscount.setForeground(white);
        DepartmentPanel.add(lblTotalDiscount);

        TotalDiscount = new JTextField();
        TotalDiscount.setBounds(220, 330, 150, 25);
        TotalDiscount.setBackground(peach);
        DepartmentPanel.add(TotalDiscount);

        lblProductName = new JLabel("Product Name");
        lblProductName.setBounds(80, 370, 220, 25);
        lblProductName.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblProductName.setForeground(white);
        DepartmentPanel.add(lblProductName);

        ProductName = new JTextField();
        ProductName.setBounds(220, 370, 150, 25);
        ProductName.setBackground(peach);
        DepartmentPanel.add(ProductName);

        lblMarkedPrice = new JLabel("Marked Price");
        lblMarkedPrice.setBounds(80, 410, 100, 25);
        lblMarkedPrice.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblMarkedPrice.setForeground(white);
        DepartmentPanel.add(lblMarkedPrice);

        MarkedPrice = new JTextField();
        MarkedPrice.setBounds(220, 410, 150, 25);
        MarkedPrice.setBackground(peach);
        DepartmentPanel.add(MarkedPrice);

        btnAddDepartment = new JButton("Add Department");
        btnAddDepartment.setBounds(112, 545, 220, 30);
        btnAddDepartment.setFont(new Font("Verdana", Font.BOLD, 13));
        btnAddDepartment.setBackground(antiq);
        DepartmentPanel.add(btnAddDepartment);

        btnAddDepartment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent oe) {
                addDepartment();
            }
        });

        add(DepartmentPanel);

        // {Retailer Section}
        RetailerPanel = new JPanel();
        RetailerPanel.setLayout(null);
        RetailerPanel.setBounds(490, 80, 490, 600);
        RetailerPanel.setBackground(darkGreen);

        JLabel lblRetailer = new JLabel("Retailer Section");
        lblRetailer.setBounds(150, 75, 350, 25);
        lblRetailer.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        lblRetailer.setForeground(white);
        RetailerPanel.add(lblRetailer);

        JLabel lblLine3 = new JLabel("_________________________________");
        lblLine3.setBounds(60, 85, 450, 25);
        lblLine3.setForeground(white);
        lblLine3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        RetailerPanel.add(lblLine3);

        JLabel lblStoreId2 = new JLabel("Store ID");
        lblStoreId2.setBounds(80, 130, 100, 25);
        lblStoreId2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreId2.setForeground(white);
        RetailerPanel.add(lblStoreId2);

        StoreId2 = new JTextField();
        StoreId2.setBounds(250, 130, 150, 25);
        StoreId2.setBackground(peach);
        RetailerPanel.add(StoreId2);

        JLabel lblStoreName2 = new JLabel("Store Name");
        lblStoreName2.setBounds(80, 170, 100, 25);
        lblStoreName2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreName2.setForeground(white);
        RetailerPanel.add(lblStoreName2);

        StoreName2 = new JTextField();
        StoreName2.setBounds(250, 170, 150, 25);
        StoreName2.setBackground(peach);
        RetailerPanel.add(StoreName2);

        JLabel lblLocation2 = new JLabel("Location");
        lblLocation2.setBounds(80, 210, 100, 25);
        lblLocation2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblLocation2.setForeground(white);
        RetailerPanel.add(lblLocation2);

        Location2 = new JTextField();
        Location2.setBounds(250, 210, 150, 25);
        Location2.setBackground(peach);
        RetailerPanel.add(Location2);

        JLabel lblOpeningHour2 = new JLabel("Opening Hour");
        lblOpeningHour2.setBounds(80, 250, 100, 25);
        lblOpeningHour2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblOpeningHour2.setForeground(white);
        RetailerPanel.add(lblOpeningHour2);

        OpeningHour2 = new JTextField();
        OpeningHour2.setBounds(250, 250, 150, 25);
        OpeningHour2.setBackground(peach);
        RetailerPanel.add(OpeningHour2);

        JLabel lblTotalSales2 = new JLabel("Total Sales");
        lblTotalSales2.setBounds(80, 290, 100, 25);
        lblTotalSales2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblTotalSales2.setForeground(white);
        RetailerPanel.add(lblTotalSales2);

        TotalSales2 = new JTextField();
        TotalSales2.setBounds(250, 290, 150, 25);
        TotalSales2.setBackground(peach);
        RetailerPanel.add(TotalSales2);

        JLabel lblTotalDiscount2 = new JLabel("Total Discount");
        lblTotalDiscount2.setBounds(80, 330, 120, 25);
        lblTotalDiscount2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblTotalDiscount2.setForeground(white);
        RetailerPanel.add(lblTotalDiscount2);

        TotalDiscount2 = new JTextField();
        TotalDiscount2.setBounds(250, 330, 150, 25);
        TotalDiscount2.setBackground(peach);
        RetailerPanel.add(TotalDiscount2);

        JLabel lblVATInclusivePrice = new JLabel("VAT Inclusive Price");
        lblVATInclusivePrice.setBounds(80, 370, 150, 25);
        lblVATInclusivePrice.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblVATInclusivePrice.setForeground(white);
        RetailerPanel.add(lblVATInclusivePrice);

        VATInclusivePrice = new JTextField();
        VATInclusivePrice.setBounds(250, 370, 150, 25);
        VATInclusivePrice.setBackground(peach);
        RetailerPanel.add(VATInclusivePrice);

        JLabel lblIsPaymentOnline = new JLabel("Is Payment Online");
        lblIsPaymentOnline.setBounds(80, 410, 150, 25);
        lblIsPaymentOnline.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblIsPaymentOnline.setForeground(white);
        RetailerPanel.add(lblIsPaymentOnline);

        checkIsPaymentOnline = new JCheckBox();
        checkIsPaymentOnline.setBounds(250, 410, 20, 25);
        checkIsPaymentOnline.setBackground(peach);
        RetailerPanel.add(checkIsPaymentOnline);

        JLabel lblPurchasedYear = new JLabel("Purchased Year");
        lblPurchasedYear.setBounds(80, 450, 150, 25);
        lblPurchasedYear.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblPurchasedYear.setForeground(white);
        RetailerPanel.add(lblPurchasedYear);

        String[] years = {"2020", "2021", "2022", "2023"};
        cmbPurchasedYear = new JComboBox<>(years);
        cmbPurchasedYear.setBounds(250, 450, 150, 25);
        RetailerPanel.add(cmbPurchasedYear);

        btnAddRetailer = new JButton("Add Retailer");
        btnAddRetailer.setBounds(112, 545, 220, 30);
        btnAddRetailer.setBackground(peach);
        btnAddRetailer.setFont(new Font("Verdana", Font.BOLD, 13));
        RetailerPanel.add(btnAddRetailer);

        // Action listener for the Add Retailer button
        btnAddRetailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRetailer();
            }
        });

        add(RetailerPanel);

        // For Loyality points
        JPanel LoyalityPanel = new JPanel();
        LoyalityPanel.setLayout(null);
        LoyalityPanel.setBounds(1050, 80, 450, 280);
        LoyalityPanel.setBackground(darkGreen);

        JLabel lblLoyalityPoints = new JLabel(" Loyality points");
        lblLoyalityPoints.setBounds(150, 30, 350, 25);
        lblLoyalityPoints.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        lblLoyalityPoints.setForeground(white);
        LoyalityPanel.add(lblLoyalityPoints);

        JLabel lblLine4 = new JLabel("_________________________________");
        lblLine4.setBounds(40, 40, 400, 25);
        lblLine4.setForeground(white);
        lblLine4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        LoyalityPanel.add(lblLine4);

        JLabel lblStoreId3 = new JLabel("Store ID");
        lblStoreId3.setBounds(60, 80, 100, 25);
        lblStoreId3.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreId3.setForeground(white);
        LoyalityPanel.add(lblStoreId3);

        StoreId3 = new JTextField();
        StoreId3.setBounds(230, 80, 150, 25);
        StoreId3.setBackground(peach);
        LoyalityPanel.add(StoreId3);

        JLabel lblVATInclusivePrice2 = new JLabel("VAT Inclusive Price");
        lblVATInclusivePrice2.setBounds(60, 120, 150, 25);
        lblVATInclusivePrice2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblVATInclusivePrice2.setForeground(white);
        LoyalityPanel.add(lblVATInclusivePrice2);

        VatInclusivePrice2 = new JTextField();
        VatInclusivePrice2.setBounds(230, 120, 150, 25);
        VatInclusivePrice2.setBackground(peach);
        LoyalityPanel.add(VatInclusivePrice2);

        JLabel lblcheckIsPaymentOnline2 = new JLabel("Is Payment Online");
        lblcheckIsPaymentOnline2.setBounds(60, 160, 150, 25);
        lblcheckIsPaymentOnline2.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblcheckIsPaymentOnline2.setForeground(white);
        LoyalityPanel.add(lblcheckIsPaymentOnline2);

        checkIsPaymentOnline2 = new JCheckBox();
        checkIsPaymentOnline2.setBounds(230, 160, 150, 25);
        checkIsPaymentOnline2.setBackground(peach);
        LoyalityPanel.add(checkIsPaymentOnline2);

        btnSetLoyaltyPoint = new JButton("Set Loyalty Point");
        btnSetLoyaltyPoint.setBounds(120, 220, 200, 30);
        btnSetLoyaltyPoint.setBackground(peach);
        btnSetLoyaltyPoint.setFont(new Font("Verdana", Font.BOLD, 13));
        LoyalityPanel.add(btnSetLoyaltyPoint);

        btnSetLoyaltyPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent oe) {
                addLoyaltyPoints();
            }
        });
        add(LoyalityPanel);

        // For Discount pannel
        JPanel DiscountPanel = new JPanel();
        DiscountPanel.setLayout(null);
        DiscountPanel.setBackground(darkGreen);
        DiscountPanel.setBounds(1050, 370, 450, 260);

        JLabel lblDiscount = new JLabel("For Discount");
        lblDiscount.setBounds(150, 30, 350, 25);
        lblDiscount.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        lblDiscount.setForeground(white);
        DiscountPanel.add(lblDiscount);

        JLabel lblLine5 = new JLabel("_________________________________");
        lblLine5.setBounds(40, 40, 400, 25);
        lblLine5.setForeground(white);
        lblLine5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        DiscountPanel.add(lblLine5);

        JLabel lblStoreId4 = new JLabel("Store ID");
        lblStoreId4.setBounds(80, 80, 100, 25);
        lblStoreId4.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreId4.setForeground(white);
        DiscountPanel.add(lblStoreId4);

        StoreId4 = new JTextField();
        StoreId4.setBounds(210, 80, 150, 25);
        StoreId4.setBackground(peach);
        DiscountPanel.add(StoreId4);

        JLabel lblIsInsale = new JLabel("Is In Sale");
        lblIsInsale.setBounds(80, 120, 200, 25);
        lblIsInsale.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblIsInsale.setForeground(white);
        DiscountPanel.add(lblIsInsale);

        checkIsInsale = new JCheckBox();
        checkIsInsale.setBounds(210, 120, 150, 25);
        checkIsInsale.setBackground(peach);
        DiscountPanel.add(checkIsInsale);

        btnCalculateDiscountPrice = new JButton("Calculate Discount Price");
        btnCalculateDiscountPrice.setBounds(130, 180, 220, 30);
        btnCalculateDiscountPrice.setBackground(Color.LIGHT_GRAY);
        btnCalculateDiscountPrice.setFont(new Font("Arial", Font.BOLD, 13));
        DiscountPanel.add(btnCalculateDiscountPrice);

        btnCalculateDiscountPrice.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                CalculateDiscount();
            }

        });

        add(DiscountPanel);

        // Remove Product pannel
        JPanel RemoveProductPanel = new JPanel();
        RemoveProductPanel.setLayout(null);
        RemoveProductPanel.setBackground(darkGreen);
        RemoveProductPanel.setBounds(1050, 650, 450, 250);

        JLabel lblRemoveProducts = new JLabel("To Remove Products");
        lblRemoveProducts.setBounds(120, 30, 350, 25);
        lblRemoveProducts.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        lblRemoveProducts.setForeground(white);
        RemoveProductPanel.add(lblRemoveProducts);

        JLabel lblLine6 = new JLabel("__________________________");
        lblLine6.setBounds(75, 40, 400, 25);
        lblLine6.setForeground(white);
        lblLine6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        RemoveProductPanel.add(lblLine6);

        JLabel lblStoreId5 = new JLabel("Store ID");
        lblStoreId5.setBounds(100, 80, 100, 25);
        lblStoreId5.setFont(new Font("Verdana", Font.PLAIN, 14));
        lblStoreId5.setForeground(white);
        RemoveProductPanel.add(lblStoreId5);

        StoreId5 = new JTextField();
        StoreId5.setBounds(190, 80, 150, 25);
        StoreId5.setBackground(peach);
        RemoveProductPanel.add(StoreId5);

        btnRemoveProduct = new JButton("Remove Product");
        btnRemoveProduct.setBounds(125, 140, 200, 30);
        btnRemoveProduct.setBackground(Color.LIGHT_GRAY);
        btnRemoveProduct.setFont(new Font("Verdana", Font.BOLD, 13));
        RemoveProductPanel.add(btnRemoveProduct);

        btnRemoveProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeproduct();
            }
        });

        add(RemoveProductPanel);

        // Common Buttons
        JPanel CommonButton = new JPanel();
        CommonButton.setLayout(null);
        CommonButton.setBounds(270, 700, 440, 200);
        CommonButton.setBackground(darkGreen);

        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(100, 25, 220, 35);
        btnDisplay.setFont(new Font("Verdana", Font.BOLD, 13));
        btnDisplay.setBackground(Color.LIGHT_GRAY);
        CommonButton.add(btnDisplay);

        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                display();
            }
        });

        btnClear = new JButton("Clear");
        btnClear.setBounds(100, 85, 220, 35);
        btnClear.setFont(new Font("Verdana", Font.BOLD, 13));
        btnClear.setBackground(Color.LIGHT_GRAY);
        CommonButton.add(btnClear);

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent oe) {
                clearFields();
            }
        });

        add(CommonButton);

    }

    public static void main(String[] args) {
        StoreGUI storeGUI = new StoreGUI();
        storeGUI.setVisible(true);
    }
    // Method to handle adding a Retailer

    private void addDepartment() {
        // Retrieve text values from input components
        String storeIdText = StoreId.getText().trim();
        String storeName = StoreName.getText().trim();
        String location = Location.getText().trim();
        String openingHour = OpeningHour.getText().trim();
        String totalSalesText = TotalSales.getText().trim();
        String totalDiscountText = TotalDiscount.getText().trim();
        String productName = ProductName.getText();
        String markedPrice = MarkedPrice.getText();

        // Check if any required field is empty
        if (storeIdText.isEmpty() || storeName.isEmpty() || location.isEmpty() || openingHour.isEmpty()
                || totalSalesText.isEmpty() || totalDiscountText.isEmpty()) {
            JOptionPane.showMessageDialog(StoreGUI.this, "Please fill in all required fields.", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convert text field values to appropriate types
            int storeId = Integer.parseInt(storeIdText);
            if (storeId <= 0) {
                JOptionPane.showMessageDialog(StoreGUI.this, "Store Id can't be negative or zero.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                // Check if storeId already exists
                for (Store store : StorageList) {
                    if (store.getId() == storeId) { // Assuming `getStoreId` method exists
                        JOptionPane.showMessageDialog(StoreGUI.this,
                                "Store ID already exists. Please choose a different ID.", "Input Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                double totalSales = Double.parseDouble(totalSalesText);
                double totalDiscount = Double.parseDouble(totalDiscountText);
                double markedPrice_1 = Double.parseDouble(markedPrice);

                // Create a new Store object
                Department department = new Department(storeId, storeName, location, openingHour, totalSales,
                        totalDiscount, productName, markedPrice_1);

                StorageList.add(department);

                // Display success message
                JOptionPane.showMessageDialog(frame, "Department added successfully!");
            }
        } catch (NumberFormatException e) {
            // Handle invalid number format
            JOptionPane.showMessageDialog(StoreGUI.this, "Please enter valid numbers for the numeric fields.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addRetailer() {
        // Retrieve text values from input components
        String storeIdText = StoreId2.getText().trim();
        String storeName = StoreName2.getText().trim();
        String location = Location2.getText().trim();
        String openingHour = OpeningHour2.getText().trim();
        String totalSalesText = TotalSales2.getText().trim();
        String totalDiscountText = TotalDiscount2.getText().trim();
        String vatInclusivePriceText = VATInclusivePrice.getText().trim();
        String purchasedYear = (String) cmbPurchasedYear.getSelectedItem();

        // Check if any required field is empty
        if (storeIdText.isEmpty() || storeName.isEmpty() || location.isEmpty() || openingHour.isEmpty()
                || totalSalesText.isEmpty() || totalDiscountText.isEmpty() || vatInclusivePriceText.isEmpty()
                || purchasedYear == null) {
            JOptionPane.showMessageDialog(frame, "Please fill in all required fields.", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convert text field values to appropriate types
            int storeId = Integer.parseInt(storeIdText);
            if (storeId <= 0) {
                JOptionPane.showMessageDialog(StoreGUI.this, "Store Id can't be negative or zero.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                for (Store store : StorageList) {
                    if (store.getId() == storeId) {
                        JOptionPane.showMessageDialog(frame, "There is already an existing store id choose new one .",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                double totalSales = Double.parseDouble(totalSalesText);
                double totalDiscount = Double.parseDouble(totalDiscountText);
                int vatInclusivePrice = Integer.parseInt(vatInclusivePriceText);
                boolean PaymentOnline = checkIsPaymentOnline.isSelected();

                // Create a new Retailer object
                Retailer retailer = new Retailer(storeId, storeName, location, openingHour, totalSales, totalDiscount,
                        vatInclusivePrice, PaymentOnline, purchasedYear);

                // Add retailer to the StoreList (assuming StoreList is a class variable)
                StorageList.add(retailer);
                // Display success message
                JOptionPane.showMessageDialog(frame, "Retailer added successfully!");
            }

        } catch (NumberFormatException e) {
            // Handle invalid number format
            JOptionPane.showMessageDialog(frame, "Please enter valid numbers for the numeric fields.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void removeproduct() {
        String storeIdRemove = StoreId5.getText().trim();
        if (storeIdRemove.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in the Store ID.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int storeId = Integer.parseInt(storeIdRemove);
        boolean storeFound = false;
        for (Store store : StorageList) {
            if (store.getId() == storeId) {
                if (store instanceof Retailer) {
                    Retailer retailer = (Retailer) store;

                    if (retailer.getLoyaltyPoint() == 0
                            && (retailer.getPurchasedYear().equals("2020")
                            || retailer.getPurchasedYear().equals("2021")
                            || retailer.getPurchasedYear().equals("2022"))) {
                        try {
                            retailer.removeProduct();
                            JOptionPane.showMessageDialog(frame,
                                    "Product removed successfully from Store ID " + storeId,
                                    "Success", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(frame,
                                    "Error removing product: " + e.getMessage(),
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Product cannot be removed. Ensure loyalty points are zero and purchased year is valid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                storeFound = true;
                break;
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Store ID is not a Retailer.", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (!storeFound) {
            JOptionPane.showMessageDialog(frame, "Store ID not found.", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CalculateDiscount() {
        try {
            int storeId = Integer.parseInt(StoreId4.getText());
            boolean storeExist = false;

            for (Store store : StorageList) {
                if (store.getId() == storeId) {
                    if (store instanceof Department) {
                        Department department = (Department) store;
                        double markedPrice = department.getMarkedPrice();

                        if (checkIsInsale.isSelected()) {
                            // Calculate discount price
                            department.calculateDiscountPrice(checkIsInsale.isSelected(), markedPrice);
                            JOptionPane.showMessageDialog(frame,
                                    "Discount Price Calculated for Store ID " + storeId,
                                    "Discount Calculated", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(frame,
                                    "Discount calculation is only allowed if the store is on sale.",
                                    "Invalid Operation", JOptionPane.ERROR_MESSAGE);
                        }
                        storeExist = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Store ID exists but it is a retailer.", "Invalid Store Type",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            if (!storeExist) {
                JOptionPane.showMessageDialog(frame, "Store ID not found.", "Store Not Found",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter a numeric value for Store ID.", "Invalid Input",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addLoyaltyPoints() {
        try {
            int storeId = Integer.parseInt(StoreId3.getText());
            boolean isPaymentOnline = checkIsPaymentOnline2.isSelected();
            int vatInclusivePrice = Integer.parseInt(VatInclusivePrice2.getText());

            // =====================================
            boolean storeFound = false;
            for (Store store : StorageList) {
                if (store instanceof Retailer && store.getId() == storeId) {
                    Retailer retailer = (Retailer) store;
                    retailer.countLoyaltyPoint(isPaymentOnline, vatInclusivePrice);
                    JOptionPane.showMessageDialog(frame,
                            "Loyalty points set successfully", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    storeFound = true;
                    break;
                }
            }

            // Handle cases where store ID is not found or is not a Retailer
            if (!storeFound) {
                JOptionPane.showMessageDialog(frame, "Store ID not found.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception oe) {
            JOptionPane.showMessageDialog(frame, "An Error Occured ", "Error ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void clearFields() {
        // Department Section
        StoreId.setText("");
        StoreName.setText("");
        Location.setText("");
        OpeningHour.setText("");
        TotalSales.setText("");
        TotalDiscount.setText("");
        ProductName.setText("");
        MarkedPrice.setText("");

        // Retailer Section
        StoreId2.setText("");
        StoreName2.setText("");
        Location2.setText("");
        OpeningHour2.setText("");
        TotalSales2.setText("");
        TotalDiscount2.setText("");
        VATInclusivePrice.setText("");
        checkIsPaymentOnline.setSelected(false);
        cmbPurchasedYear.setSelectedIndex(-1);

        // Loyalty Panel
        StoreId3.setText("");
        VatInclusivePrice2.setText("");
        checkIsPaymentOnline2.setSelected(false);

        // Discount Panel
        StoreId4.setText("");
        checkIsInsale.setSelected(false);

        // Remove Products Panel
        StoreId5.setText("");
    }

    private void display() {
        if (StorageList.isEmpty()) {
            JOptionPane.showMessageDialog(StoreGUI.this, "Stores are not added yet!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (Store store : StorageList) {
                System.out.println("\n=============================");
                store.display();
                System.out.println("===============================\n");

            }
            JOptionPane.showMessageDialog(StoreGUI.this, "Your details are printed in terminal.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
