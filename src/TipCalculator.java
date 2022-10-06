public class TipCalculator {

    //instance variables
    private int numPeople;
    private double tipPercentage;
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
    public double getTipPercentage() {

        return tipPercentage;
    }

    //void method
    public void addMeal (double cost) {
        totalBillBeforeTip += cost;
    }

    //return method
    public double tipAmount() {
        return ((tipPercentage * totalBillBeforeTip)/100);
    }
    public double totalBill () {
        return (tipAmount() + totalBillBeforeTip);
    }
    public double perPersonCostBeforeTip() {

        return (totalBillBeforeTip/numPeople);
    }
    public double perPersonTipAmount () {

        return (tipAmount()/numPeople);
    }
    public double perPersonTotalCost () {

        return (perPersonCostBeforeTip() + perPersonTipAmount());
    }

}

