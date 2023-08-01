package com.velocity.product;

import java.sql.SQLException;
import java.util.Scanner;

import java.sql.Connection;


public class product {
	
	


		// To insert product details
		public void insertProductDetails(int productId, String productName, String Discription, int price,
				int availableQuantity) {
			java.sql.Connection con = null;
			java.sql.PreparedStatement ps = null;
			try {
				// Loaded Driver class and Established Connection
				con = Connection.getConnection();//
				// Create Statement
				ps = con.prepareStatement("insert into product values(?,?,?,?,?)");
				ps.setInt(1, productId);
				ps.setString(2, productName);
				ps.setString(3, Discription);
				ps.setInt(4, price);
				ps.setInt(5, availableQuantity);
				// Execute Query
				int i = ps.executeUpdate();
				// track the result
				System.out.println(i + " row's inserted Successfully...");

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (con != null || ps != null) {
						con.close();
						ps.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public void execute() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number of product you want to add : ");
			int count = input.nextInt();
			for (int i = 1; i <= count; i++) {
				System.out.println("Enter Product Id :");
				int productId = input.nextInt();
				System.out.println("Enter Product Name :");
				input.next();
				String productName = input.nextLine();
				System.out.println("Enter Product Discrption :");
				input.next();
				String discription = input.nextLine();
				System.out.println("Enter Product price :");
				int price = input.nextInt();
				System.out.println("Enter Product Availabale Quantity :");
				int availableQuantity = input.nextInt();
				
				this.insertProductDetails(productId, productName, discription, price, availableQuantity);
			}
		}

		public static void main(String[] args) {
			Product product = new Product();
			product.execute();
		}

	}

//}
