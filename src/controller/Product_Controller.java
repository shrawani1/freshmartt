/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import database.DbConnection;
import models.Product;
import java.sql.*;

public class Product_Controller {
    DbConnection dbConnection;

    public int addProduct(Product product) {
        int id = product.getProductId();
        String name = product.getProductName();
        int price = product.getProductPrice();
        int qty = product.getProductQty();
        String category = product.getProductCategory();
        String addProductQuery = String.format(
                "insert into product_table (productId,productName,productQty,productPrice,productCategory) values(%d,'%s',%d,%d,'%s')",
                id,
                name, qty, price, category);
        System.out.println(addProductQuery);
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(addProductQuery);
        return result;
    }
    public Product fetchProduct(){
           String selectQuery = "select * from product_table";  
           dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
                    try{
                        while(result.next()){
            int productId = Integer.parseInt(result.getString("productId"));
String productName= result.getString("productName");
int productQty = Integer.parseInt(result.getString("productQty"));
int productPrice = Integer.parseInt(result.getString("productPrice"));
String productCategory = result.getString("productCategory");
        Product fetchedProduct = new Product(productId,productName,productQty,productPrice,productCategory);
        System.out.println(fetchedProduct);
return fetchedProduct;
                        }
            } catch(SQLException ex){
            ex.printStackTrace();
            }
        return null;
    
    }
}

