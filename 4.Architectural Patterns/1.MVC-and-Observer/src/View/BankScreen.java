package View;

import Model.BankAccount;

import javax.swing.*;

/**
 * Created by Krasimir Stoyanov on 23.1.2017 г..
 */
public class BankScreen extends JFrame {

    // Model instance used for requesting data.
    private BankAccount bankAccount;

    public BankScreen(BankAccount bankAccount) {
        super("MVC practise");
        this.bankAccount = bankAccount;

    }
}
