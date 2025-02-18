import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your income in Lakhs Per Annum : ");
        float tax = 0;
        float income = sc.nextFloat();
        
        if (income <= 4.0) {
            tax = tax + 0;
        }
        else if (income > 4.0 && income <= 8.0) {
            tax = tax + 0.05f * (income - 4.0f);
        }
        else if (income > 8.0f && income <= 12.0f) {
            tax = tax + 0.05f * (8.0f - 4.0f);
            tax = tax + 0.1f * (income - 8.0f);
        }
         else if (income > 12.0f && income <= 16.0f) {
            tax = tax + 0.05f * (8.0f - 4.0f);
            tax = tax + 0.1f * (12.0f - 8.0f);
            tax = tax + 0.15f * (income - 12.0f);
         }
         else if (income > 16.0f && income <= 20.0f) {
            tax = tax + 0.05f * (8.0f - 4.0f);
            tax = tax + 0.1f * (12.0f - 8.0f);
            tax = tax + 0.15f * (16.0f - 12.0f);
            tax = tax + 0.2f * (income - 16.0f);
         }
         else if (income > 20.0f && income <= 24.0f) {
            tax = tax + 0.05f * (8.0f - 4.0f);
            tax = tax + 0.1f * (12.0f - 8.0f);
            tax = tax + 0.15f * (16.0f - 12.0f);
            tax = tax + 0.2f * (16.0f - 20.0f);
            tax = tax + 0.25f * (income - 20.0f);
         }
         else if (income > 24.0f) {
            tax = tax + 0.05f * (8.0f - 4.0f);
            tax = tax + 0.1f * (12.0f - 8.0f);
            tax = tax + 0.15f * (16.0f - 12.0f);
            tax = tax + 0.2f * (16.0f - 20.0f);
            tax = tax + 0.25f * (24.0f - 20.0f);
            tax = tax + 0.3f * (income - 24.0f);
         }
         
         System.out.println("The total payable tax is : " + tax);
         
         sc.close();
    }
}
