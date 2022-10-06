public class TipCalculator {

    //instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    //constructor
    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;

        totalBillBeforeTip = 0;
    }

    //getter method
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public int GetTipPercentage() {
        return tipPercentage;
    }

    //void method
    public void addMeal (double cost) {
        totalBillBeforeTip += cost;
    }

    //return method
    public double tipAmount() {
        return (tipPercentage * totalBillBeforeTip);
    }
    public double totalBill () {
        return (tipAmount() + totalBillBeforeTip);
    }
    public double PerPersonCostBeforeTip() {
         return (totalBillBeforeTip/numPeople);
    }
    public double PerPersonTipAmount () {
        return (tipAmount()/numPeople);
    }
    public double PerPersonTotalCost () {
        return ((PerPersonCostBeforeTip() + PerPersonTipAmount())/numPeople);
    }
}

