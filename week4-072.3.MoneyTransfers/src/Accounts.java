
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {

        Account a = new Account("A account", 100.00);
        Account b = new Account("B account", 0);
        Account c = new Account("C account", 0);

        transfer(a, b, 50);
        transfer(b, c, 25);

    }

}
