
import java.util.Scanner;
public class JavaBasic_TaxCalculation{

        public static void main(String[] args) {


// Declare constants
            final double SALES_TAX_RATE = 0.07;
            final int SENTINEL = -1;        // Terminating value for input

            // Declare variables
            double price, actualPrice, salesTax;  // inputs and results
            double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  // to accumulate


            // Read the first input to "seed" the while loop
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price =  in.nextDouble();

            while (price != SENTINEL) {
                // Compute the tax

                salesTax = SALES_TAX_RATE * price;
                actualPrice = price - salesTax;


                // Accumulate into the totals
                totalPrice = actualPrice + salesTax;
                totalActualPrice = actualPrice + actualPrice;
                totalSalesTax = salesTax + salesTax;
                // Print results
                System.out.println("Actual price is $" + String.format("%.2f",actualPrice));
                System.out.println("Sales Tax is: $" + String.format("%.2f",salesTax));


                // Read the next input
                System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
                price =  in.nextDouble();
                // Repeat the loop body, only if the input is not the sentinel value.
                // Take note that you need to repeat these two statements inside/outside the loop!
            }
            // print totals
            System.out.println("Total price is: " + String.format("%.2f",totalPrice));
            System.out.println("Total Actual Price is: " + String.format("%.2f",totalActualPrice));
            System.out.println("Total sales tax is: " + String.format("%.2f",totalSalesTax));


        }
    }


