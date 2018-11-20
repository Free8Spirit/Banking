// sub
package bank;

public class Checkings extends Account {
    private static double fee = 0.02;
    
    public Checkings(double balance) {
        super(balance);
    }
    
    public double credit(double balance) {
        super.credit(balance - fee);
        return this.currentB();
    }
    
    public double debit(double balance) {
        super.debit(balance + fee);
        return this.currentB();
    }
}