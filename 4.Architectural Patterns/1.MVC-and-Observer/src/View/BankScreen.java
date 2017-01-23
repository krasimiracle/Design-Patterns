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

    private JButton depositMoneyButton;
    private JButton withdrawMoneyButton;

    private JTextField typeNameField;
    private JPasswordField typePasswordField;

    public BankScreen(BankAccount bankAccount) {
        super("MVC practise");
        this.bankAccount = bankAccount;

        depositMoneyButton = new JButton("Deposit 50 leva.");
        withdrawMoneyButton = new JButton("Withdraw 50 leva.");

        setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;

        add(depositMoneyButton, gridBagConstraints);

        // Mutate for second button
        gridBagConstraints.gridy = 2;

        add(withdrawMoneyButton, gridBagConstraints);

        depositMoneyButton.addActionListener(this);
        withdrawMoneyButton.addActionListener(this);

        withdrawMoneyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Withdrew 50 leva.");
            }
        });

        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton eventSource = (JButton) e.getSource();

        // Depending on the Button event you can invoke adequate command.
        if (eventSource == depositMoneyButton) {
            System.out.println("Added 50 leva.");
        } else if (eventSource == withdrawMoneyButton){
            System.out.println("This is an another way of invoking withdrawButton");
        }
    }
}
