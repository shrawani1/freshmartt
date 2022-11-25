
package models;


public class Product {
    private int productId;
    private String productName;
    private int productQty;
    private int productPrice;
    private String productCategory;

    public Product(int productId,String productName,int productQty,int productPrice,String productCategory){
        this.productId=productId;
        this.productName=productName;
        this.productQty=productQty;
        this.productPrice=productPrice;
        this.productCategory=productCategory;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQty() {
        return this.productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

}
