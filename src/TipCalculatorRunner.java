import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group?: ");
            int numPeople = scan.nextInt();
            scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
            int tipPercent = scan.nextInt();
            scan.nextLine();
            TipCalculator tip1 = new TipCalculator (numPeople, tipPercent);
        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            double userInput = scan.nextDouble();
            scan.nextLine();

        while (userInput > 0) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            userInput = scan.nextDouble();
            scan.nextLine();
            tip1.addMeal(userInput);
        }
        System.out.println("Total Bill Before Tip: " + tip1.getTotalBillBeforeTip());
        System.out.println("tip Percentage: " + tip1.getTipPercentage());
        System.out.println("Total Tip: " + tip1.tipAmount());
        System.out.println("Total Bill With Tip: "+ tip1.totalBill());
        System.out.println("Per Person Cost Before Tip: " + tip1.perPersonCostBeforeTip());
        System.out.println("Tip per Person: " + tip1.perPersonTipAmount());
        System.out.println("Total Cost Per Person: "+ tip1.perPersonTotalCost());
        scan.close();
    }
}
