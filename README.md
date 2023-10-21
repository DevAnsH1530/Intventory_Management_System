# Inventory Management System (Java SE 8)
## Project Description
The Inventory Management System is a Java SE 8 based application designed to help
businesses efficiently manage their inventory. This system utilizes Java's Collections framework,
Multithreading, and Exception Eandling for improved performance and reliability.
### Key Features
1. **Product Management:** Add, edit, and delete products in the inventory. Each product
includes details such as ID, name, price, and quantity on hand.
2. **Inventory Tracking:** Maintain real-time inventory status to check stock levels for products.
3. **Multithreading:** Utilizes multithreading for concurrent access to the inventory to improve
system responsiveness.
4. **Exception Handling:** Robust error handling and graceful error reporting to ensure the
application runs smoothly.
5. **User-friendly Interface:** Command-line interface with easy-to-use commands for product
and inventory management.
### Technologies Used
- **Java Version:** Java SE 8
- **Collections Framework:** Utilized for efficient data storage and retrieval.
- **Multithreading:** Java's `ExecutorService` for handling concurrent access to the inventory.
- **Exception Handling:** Java's exception handling mechanisms for error handling.
### How to Run the Application 
1. Clone this repository to your local machine.
2. Compile the Java code: `javac InventoryManagementSystem.java`.
3. Run the application: `java InventoryManagementSystem`.
### Directory Structure 

- `InventoryManagementSystem.java`: Main application code.
- `Product.java`: Class definition for the Product.
- `ProductNotFoundException.java`: Custom exception class for product-related errors.
### Usage 
Follow the command-line prompts to perform the following operations:
- Add a new product.
- Remove a product.
- List all products.
- Find a product by ID.
- Exit the application.
### Contributors 
- Devansh Gupta
### Acknowledgments
Special thanks to the Java SE 8 development community and the creators of the Collections
framework for making this project possible.
