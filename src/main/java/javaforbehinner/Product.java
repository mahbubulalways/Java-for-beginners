/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaforbehinner;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Product {

    public static void main(String[] args) {
        int id;
        String title;
        int price;
        String description;
        String category;

        Scanner getId = new Scanner(System.in);
        System.out.println("Enter the id");
        id = getId.nextInt();
        
        System.out.println("Enter the title");
        Scanner getTitle = new Scanner(System.in);
        title = getTitle.nextLine();
        
        System.out.println("Enter the price");
        Scanner getPrice = new Scanner(System.in);
        price = getPrice.nextInt();
        
        System.out.println("Enter the description");
        Scanner getDescrip = new Scanner(System.in);
        description = getDescrip.nextLine();
        
        System.out.println("Enter the category");
        Scanner getCategory = new Scanner(System.in);
        category = getCategory.nextLine();

        System.out.println("ID = " + id);
        System.out.println("Title = " + title);
        System.out.println("Price = " + price);
        System.out.println("Description = " + description);
        System.out.println("Category = " + category);

    }
}
