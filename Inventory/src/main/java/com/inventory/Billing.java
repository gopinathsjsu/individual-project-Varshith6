package com.inventory;

import java.io.IOException;
import java.util.Scanner;

import com.controller.Orders;
import com.database.Database;

public class Billing {
    public static void main(String args[]) throws IOException {
    	loadDB();
        System.out.println("Hi There!");
    	Billing billObject = new Billing();
        billObject.initOrderInput();
    }
    
    private static void loadDB() { 
    	Database db = Database.getInstance();
        db.initDB();
    }
    
    private void initOrderInput() { 
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter the order file path");
        String inputFilePath = "";
        try {
            inputFilePath = sc.next();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initTransaction(inputFilePath);
    }
    
    private void initTransaction(String filePath) {
        Orders Orders = new Orders(filePath);
        if (Orders.initiateOrder()) {
            System.out.println(">>Processing Request....>>");
            if (Orders.validateOrder()) {
                Orders.calculateFinalAmount();
                System.out.println("Request placeed!!!");
                Orders.checkoutOrder();
                System.out.println("Final Output is in receipt.csv");
            } else {
                System.out.println("FAILED!! Order cannot be processed!! Please check error logs!!");
                Orders.generateResultFile();
            }
        } else {
            System.out.println("File path seems to be wrong!! Please validate the file path & try again");
            Orders.generateResultFile();
        }
    }
}