public interface ATM {
    //verifies a user's pin
    boolean verifyPin(String pin);

    //allows the user to select an account
    //returns a String representing the account selected
    String selectAccount();

    //withdraws a specified amount of money
    //returns whether or not the operation is successful
    boolean withdraw(String account, double amount);

    //displays the result of an operation
    void display (String account, double amount, boolean success);

    //displays the result of a PIN verification
    void display (String pin, boolean success);

    //displays an account balance
    void showBalance(String account);
}
