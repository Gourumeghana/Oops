import java.util.Scanner;

public class Module4_6 {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      
        
        
        System.out.println("Welcome to the Grand Sale!");
        System.out.println("Please enter the product name:");
        String productName = scanner.nextLine();
      

        System.out.println("Please enter the company the product belongs to:");
        String company = scanner.nextLine();

        System.out.println("Please enter the quantity of the product:");
        int quantity = scanner.nextInt();

        System.out.println("Thank you for providing the information!");

        
        if (company.equalsIgnoreCase("Amazon")) {
            double totalCost = calculateTotalCostAmazon(quantity);
            System.out.println("We recommend purchasing " + productName + " from Amazon.");
            System.out.println("Total cost: $" + totalCost);
        } else if (company.equalsIgnoreCase("Flipkart")) {
            double totalCost = calculateTotalCostFlipkart(quantity);
            System.out.println("We recommend purchasing " + productName + " from Flipkart.");
            System.out.println("Total cost: $" + totalCost);
        } else {
            System.out.println("Sorry, we don't have a recommendation for this product.");
        }
    }

    public static double calculateTotalCostAmazon(int quantity) {
        double pricePerUnit;
        System.out.println("Enter pricePerUnit:");
         pricePerUnit=scanner.nextDouble(); 
        double totalCost = pricePerUnit * quantity;

       
        if (totalCost > 50000) {
            totalCost -= totalCost * 0.15; // 15% discount for purchase above $50,000
        } 

        System.out.println("Are you an HDFC credit card holders(YES/NO)?");
        String res=scanner.next();

if(res=="YES"||res=="yes") {
            totalCost -= totalCost * 0.10; // 10% discount for HDFC credit card holders
        }

        return totalCost;
    }

    public static double calculateTotalCostFlipkart(int quantity) {
         boolean exit=false;
       
        System.out.println("Enter price per unit:"); 
        double pricePerUnit = scanner.nextDouble();
        double totalCost = pricePerUnit * quantity;
        

        
        if (quantity > 30000) {
            totalCost -= totalCost * 0.05; // 5% discount for purchase above $30,000
        }
System.out.println("Are you an RGUKT student(YES/NO)?");
        String ans=scanner.next(); 
 if (ans.equalsIgnoreCase("Yes")) {
                exit=true;
       }
       
if (exit==true) {
                
       
            totalCost -= totalCost * 0.30; // 30% discount for RGUKT students
        }

        return totalCost;
    }
}
