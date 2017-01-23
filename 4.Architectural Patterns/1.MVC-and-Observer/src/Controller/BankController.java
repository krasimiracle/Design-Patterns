package Controller;

import Model.BankAccount;
import View.BankScreen;

/**
 * Created by Krasimir Stoyanov on 23.1.2017 г..
 */
public class BankController {

    // Controller has Model and View instances.
    private BankAccount bankAccount;
    private BankScreen bankScreen;

    public BankController(BankAccount bankAccount, BankScreen bankScreen) {
        this.bankAccount = bankAccount;
        this.bankScreen = bankScreen;
    }
}
