package View;

import Model.BankAccount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krasimir Stoyanov on 23.1.2017 г..
 */
public class BankScreen extends JFrame implements ActionListener {

    // Model instance used for requesting data.
    private BankAccount bankAccount;

    private JButton depositMoney;
    private JButton withdrawMoney;

    public BankScreen(BankAccount bankAccount) {
        super("MVC practise");
        this.bankAccount = bankAccount;

        depositMoney = new JButton("Deposit 50 leva.");
        withdrawMoney = new JButton("Withdraw 50 leva.");

        setLayout(new GridBagLayout());


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
