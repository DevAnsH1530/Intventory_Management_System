import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WareSavvy {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Product p1 = new Product(1,"Sunslik",3.5);
        ims.addProduct(p1);
        Product p2 = new Product(2,"Dove",12.5);
        ims.addProduct(p2);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Find Product by ID");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    Product product = new Product(id, name, price);
                    ims.addProduct(product);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Product ID to Remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    try {
                        Product removedProduct = ims.findProductById(removeId);
                        ims.removeProduct(removedProduct);
                        System.out.println("Product removed successfully.");
                    } catch (ProductNotFoundException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to Find: ");
                    int findId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    try {
                        Product foundProduct = ims.findProductById(findId);
                        System.out.println("Product Found: " + foundProduct.getName());
                    } catch (ProductNotFoundException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

class InventoryManagementSystem {

    private List<Product> products = new ArrayList<>();
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new ProductNotFoundException("Product not found");
    }
}

class Product {
    private int id;
    private String name;
    private double price;
    // Constructors, getters, and setters
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}