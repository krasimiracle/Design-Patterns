import Controller.BankController;
import Model.BankAccount;
import View.BankScreen;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                compileApp();
            }
        });

    }

    public static void compileApp() {
        BankAccount bankAccount = new BankAccount();
        BankScreen bankScreen = new BankScreen(bankAccount);

        BankController bankController = new BankController(bankAccount,bankScreen);
    }
}
