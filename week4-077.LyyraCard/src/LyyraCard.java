/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zsolt
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }

    public String toString() {
        return "The card has " + this.balance + " euros";

    }

    public void payEconomical() {

        if (this.balance - 2.5 >= 0) {
            this.balance = this.balance - 2.5;
        } else {

        }

    }

    public void payGourmet() {
        if (this.balance - 4 >= 0) {
            this.balance = this.balance - 4;

        }
    }

    public void loadMoney(double amount) {

        if (amount < 0) {

        } else {

            if (amount + this.balance > 150) {

                this.balance = 150;

            } else {
                this.balance = this.balance + amount;
            }

        }
    }

}
