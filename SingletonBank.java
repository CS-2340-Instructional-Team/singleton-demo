public class SingletonBank {

    //Create a private static variable to store the unique instance
    private static SingletonBank instance;

    //Step 2: Make a private constructor
    private SingletonBank(){}

    //Step 3: public static method

    public static SingletonBank getInstance() {
        if (instance == null) {
            instance = new SingletonBank();//unique instance
        }
        return instance;
    }

    private double funds = 1000000;

    public double getFunds(){
        return funds;

    }

    public void deposit(double amount){
        funds+= amount;
    }

   public void withdraw(double amount){
        funds-= amount;
   }

}
