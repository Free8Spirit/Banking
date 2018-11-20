// sub
package bank;
import java.util.Scanner;

public abstract class Account {
    private double balance;
    Scanner matrix = new Scanner(System.in);
    
    public Account(double balance) {
        int x = 0;
        while (balance < 0) {
            x++;
            System.out.println("Please input a valid balance: ");
            if (matrix.hasNextDouble()) {
                balance = matrix.nextDouble();
            } else {
                System.out.println("No match found");
            }
            matrix.nextLine();
            if (x == 8) {
                System.out.println("Eror: Your Balance Is Preset To $0.00. Thank You!");
                balance = 0;
            } else if(x == 7) {
                System.out.println("This Is Your Final Attempt! If You Fail This Attempt, Your Balance Will Be Preset To $0.00: ");
            } else if (x >= 4) {
                System.out.println("You Have " + (8 - x) +" attempts left, please try again: ");
            }
        }
        this.balance = balance;
    }
    
    public double credit(double balance) {
        this.balance += balance;
        return balance;
    }
    
    public double debit(double balance) {
        if (this.balance - balance < 0) {
            System.out.println("Debit amount exceeded account balance");
        } else {
            this.balance -= balance;
        }
        return balance;
    }
    
    public double currentB() {
        return this.balance;
    }
}