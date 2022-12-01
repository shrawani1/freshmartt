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

    public ResultSet fetchProduct(Product product) {
        String category = product.getProductCategory();
        String selectQuery = "select * from product_table where productCategory='" + category + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public ResultSet selectDeatils(Product product){
        String name = product.getProductName();
        String selectQuery = "select productPrice from product_table where productName='"+name+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
}
