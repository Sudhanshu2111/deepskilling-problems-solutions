import java.util.Arrays;
import java.util.Scanner;

class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}

public class SearchDemo {

    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String targetName) {
        int lo = 0, hi = products.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(targetName);
            if (cmp == 0) return mid;
            else if (cmp < 0) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] inventory = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Sneakers", "Footwear"),
            new Product(150, "Coffee Maker", "Home Appliances"),
            new Product(310, "Backpack", "Accessories")
        };

        
        // String searchItem = "Coffee Maker";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target product name:");
        String searchItem = sc.next();

        int idx1 = linearSearch(inventory, searchItem);
        System.out.println("Linear Search found at index: " + idx1
            + " → " + (idx1 >= 0 ? inventory[idx1] : "Not Found"));

        
        Product[] sortedInv = Arrays.copyOf(inventory, inventory.length);
        Arrays.sort(sortedInv, (a, b) -> a.getProductName() .compareToIgnoreCase(b.getProductName()));

        int idx2 = binarySearch(sortedInv, searchItem);
        System.out.println("Binary Search found at index: " + idx2
            + " → " + (idx2 >= 0 ? sortedInv[idx2] : "Not Found"));
    }
}
