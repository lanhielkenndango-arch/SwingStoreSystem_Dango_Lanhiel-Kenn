Swing Store System

Overview
Swing Store System is a Java Swing-based graphical user interface (GUI) application that simulates a basic point-of-sale and inventory management system. It allows users to process orders, manage a shopping cart, view real-time inventory, and track transaction history. 

To strictly follow the project requirements, this application does not use `ArrayList` or databases. All data storage and tracking are handled entirely using parallel arrays.

Project Structure (Frames)

The application is divided into three main graphical frames:

1. Store Transaction Frame 
This is the main dashboard of the application. 
Ordering: Users can select a product from a drop-down menu and enter a quantity. Clicking **Order** validates the input, checks if there is enough stock, calculates the subtotal, and adds the item to a temporary background cart.
Checkout: Clicking **Checkout** processes all items in the temporary cart, calculates the grand total, permanently deducts the quantities from the global inventory, and saves the transaction data to the logs.
Navigation: Contains buttons to easily navigate to the Inventory and Logs frames.

2. Inventory Frame 
A read-only screen that displays the current stock levels for all products.
- It dynamically reads from the inventory stock parallel array to show how many units of Rice, Sugar, Coffee, and Milk are remaining after transactions.
- Includes a "Back" button to safely dispose of the frame and return to the main transaction window.

3. Transaction Logs Frame 
A read-only screen that acts as a receipt history or ledger.
- It displays a formatted list of all successfully completed transactions, reading directly from the `logProductNames`, `logQuantities`, and `logTotals` parallel arrays.
- Includes a "Back" button to return to the main store interface.
