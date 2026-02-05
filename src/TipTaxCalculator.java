public class TipTaxCalculator {

public static double calculateTax(double totalBill, double taxRate){


return totalBill * (taxRate/100);

}


    public static double calculateTip(double totalBill, double tipRate){


return totalBill * (tipRate/100);

    }



    public static double calculateTotal(double totalBill, double tip, double tax){


return tip + tax + totalBill;
    }




    public static long roundedTotal(double total) {

    return Math.round(total);


    }



}
