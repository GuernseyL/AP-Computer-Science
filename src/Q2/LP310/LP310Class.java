package Q2.LP310;

public class LP310Class {
    private int burgers;
    private int fries;
    private int sodas;
    private double btax;
    private double total;
    private double tax;

    public LP310Class(int burg, int frie, int sod){
        burgers = burg;
        fries = frie;
        sodas = sod;
    }
    public void calc(){
        btax = (burgers * 1.69) + (fries * 1.09) + (sodas * 0.99);
        tax = btax * 0.065;
        total = btax * 1.065;
    }

    public double getBtax() { return btax; }
    public double getTotal() { return total; }
    public double getTax() { return tax; }
}
