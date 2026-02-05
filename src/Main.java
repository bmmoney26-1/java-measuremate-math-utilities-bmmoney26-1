import java.util.Scanner;




public class Main {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total bill amount: $");
double totalBill= input.nextDouble();
        System.out.print("Tax rate in %: " );
double taxRate = input.nextDouble();
        System.out.print("Tip rate in %: ");
double tipRate = input.nextDouble();

double tax = TipTaxCalculator.calculateTax(totalBill, taxRate);
double tip = TipTaxCalculator.calculateTip(totalBill, tipRate);
double total = TipTaxCalculator.calculateTotal(totalBill, tip, tax);
    long rounded = TipTaxCalculator.roundedTotal(total);
        System.out.println("Your tip amount is: $" + tip);
        System.out.println("Your tax amount is: $" + tax);
        System.out.println("Your total before rounding is: $" + total);

    System.out.println("Your total rounded is: "+ rounded);









input.close();











    }
}
