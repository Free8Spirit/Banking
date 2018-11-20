// Author: Vert, David  11/11/2018
package bank;

public class Bank {

    public static void main(String[] args) {
        //Account fail = new Account(99.99);    // Abstract;
        
        Checkings life = new Checkings(-10);    // will trigger infinite loop until valid;
        System.out.printf("Current Balance: $%2.2f\n", life.currentB());
        life.debit(999999999999999999999999999999999999999999999999999999999999999.99); // should exceed bank account unless bank account was created with a bigger number;
        System.out.printf("Current Balance: $%2.2f\n", life.currentB());
        life.credit(13);
        System.out.printf("Current Balance: $%2.2f\n", life.currentB());
        
        // Just for kicks, deposit nothing yet still charged for depositing something;
        // Lesson: deposit more than you're charged ($0.02 in this case);
        life.credit(0);
        System.out.printf("Current Balance: $%2.2f\n", life.currentB());
        
        Savings death = new Savings(32.05);
        System.out.printf("Current Balance: $%2.2f\n", death.currentB());
        death.debit(5.05);
        System.out.printf("Current Balance: $%2.2f\n", death.currentB());
        death.credit(3);
        System.out.printf("Current Balance: $%2.2f\n", death.currentB());
        // Adding Interest
        double check = death.CalcInterest();
        death.credit(check);
        System.out.printf("Current Balance: $%2.2f\n", death.currentB());
    }
}