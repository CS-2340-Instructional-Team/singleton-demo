public class Customer {
    private double wallet;

    public Customer(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    //deposit amount
    public void deposit(double amount){
        if (wallet >= amount){
            SingletonBank.getInstance().deposit(amount);
        }
    }

    //withdraw amount
    public void withdraw(double amount){
        if (SingletonBank.getInstance().getFunds() >= amount){
            SingletonBank.getInstance().withdraw(amount);
        }
    }

    public double checkWallet(){
        return wallet;
    }

}
