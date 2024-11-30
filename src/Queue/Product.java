package Queue;

// class for assigned variables

public class Product {

    private int productCode;
    private String productDescription;
    private int productQuantity;
    private double productPrice;
    private double productDiscount;

    //constructor
    public Product(int productCode, String productDescription, int productQuantity, double productPrice, double productDiscount) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.productPrice = productQuantity;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
    }

    @Override
    public String toString() {
        return String.format("Code: %-4d | Desc: %-10s | Qty: %-4d | Price: %-8.2f | Discount: %-6.2f",
                productCode, productDescription, productQuantity, productPrice, productDiscount);
    }

}

