package Controller;

import Model.BankAccount;
import View.BankScreen;
import View.LoginEvent;
import View.LoginListener;

/**
 * Created by Krasimir Stoyanov on 23.1.2017 г..
 */
public class BankController implements LoginListener {

    // Controller has Model and View instances.
    private BankAccount bankAccount;
    private BankScreen bankScreen;

    public BankController(BankAccount bankAccount, BankScreen bankScreen) {
        this.bankAccount = bankAccount;
        this.bankScreen = bankScreen;
    }


    @Override
    public void successfulLogin(LoginEvent event) {
        System.out.println("Login name: " + event.getName());
        System.out.println("Login password: " + event.getPassword());
    }
}
