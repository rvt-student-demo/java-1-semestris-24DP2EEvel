package rvt;

public class payment_card {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        System.out.println("Created card with balance: " + this.balance + " euros");
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
            System.out.println("Ate affordably. New balance: " + this.balance);
        } else {
            System.out.println("Not enough money to eat affordably.");
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
            System.out.println("Ate heartily. New balance: " + this.balance);
        } else {
            System.out.println("Not enough money to eat heartily.");
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            System.out.println("Cannot add negative amount.");
            return;
        }

        this.balance += amount;

        if (this.balance > 150) {
            this.balance = 150;
        }

        System.out.println("Added " + amount + " euros. New balance: " + this.balance);
    }
}