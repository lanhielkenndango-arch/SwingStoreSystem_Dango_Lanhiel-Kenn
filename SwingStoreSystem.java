/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingstoresystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SwingStoreSystem {

    //Data Storage
    // Using only arrays
    public static final int PRODUCT_COUNT = 4;
    public static String[] productNames = {"Rice", "Sugar", "Coffee", "Milk"};
    public static double[] productPrices = {1000.0, 90.0, 39.0, 600.0};

    // all stocks are 20
    public static int[] inventoryStock = {20, 20, 20, 20};

    // logs for transaction
    public static final int MAX_TRANSACTIONS = 100;
    public static String[] logProductNames = new String[MAX_TRANSACTIONS];
    public static int[] logQuantities = new int[MAX_TRANSACTIONS];
    public static double[] logTotals = new double[MAX_TRANSACTIONS];

    // Index tracker for logs
    public static int transactionCount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. GUI");
            System.out.println("2. End\n");
            System.out.print("Enter: ");
            byte choose = input.nextByte();
            
            try {
                
                if (choose == 1) {
                    java.awt.EventQueue.invokeLater(() -> {
                        StoreTransactionFrame gui = new StoreTransactionFrame();
                        gui.setVisible(true);
                        gui.setAlwaysOnTop(true);
                      
                    });
                } else if (choose == 2) {
                    running = false;
                    System.out.println("Thank you for using this app.");
                } else {
                    System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, invalid input.");
                input.next(); // Clear scanner buffer
            }
        }
        input.close();
    }
}
