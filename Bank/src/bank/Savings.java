// sub
package bank;

public class Savings extends Account {
    private static double rate = 0.03;
    
    public Savings(double balance) {
        super(balance);
    }
    
    public double CalcInterest() {
        double interesting = this.currentB() * rate;
        return interesting;
    }
}