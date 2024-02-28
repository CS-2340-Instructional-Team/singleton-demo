public class BankDemo {
    public static void main(String[] args) {

        // Create customers
        Customer alice = new Customer(3000);
        Customer bob = new Customer(5000);

        // Display initial funds
        System.out.println("SingletonBank initial funds: $" + SingletonBank.getInstance().getFunds());
        System.out.println("Alice's initial wallet: $" + alice.checkWallet());
        System.out.println("Bob's initial wallet: $" + bob.checkWallet());

        // Alice deposits money
        alice.deposit(1000);
        // Bob withdraws money
        bob.withdraw(2000);

        // Display funds after transactions
        System.out.println("SingletonBank funds after transactions: $" + SingletonBank.getInstance().getFunds());
        System.out.println("Alice's wallet after transactions: $" + alice.checkWallet());
        System.out.println("Bob's wallet after transactions: $" + bob.checkWallet());
    }
}
