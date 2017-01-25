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

    private JButton loginButton;
    private JTextField typeNameField;
    private JPasswordField typePasswordField;

    private LoginListener loginListener;

    public BankScreen(BankAccount bankAccount) {
        super("MVC practise");
        this.bankAccount = bankAccount;

        loginButton = new JButton("Login.");
        typeNameField = new JTextField(12);
        typePasswordField = new JPasswordField(12);

        setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.insets = new Insets(50, 0, 0, 10);

        add(new JLabel("Type your name: "), gridBagConstraints);

        // Mutate for second button
        gridBagConstraints.gridx = 2;
        gridBagConstraints.insets = new Insets(50, 0, 0, 0);

        add(typeNameField, gridBagConstraints);

        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(0, 0, 0, 10);

        add(new JLabel("Enter password: "), gridBagConstraints);

        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(0, 0, 0, 0);

        add(typePasswordField, gridBagConstraints);

        gridBagConstraints.gridy = 3;
        gridBagConstraints.weighty = 5;

        add(loginButton, gridBagConstraints);

        loginButton.addActionListener(this);

        setSize(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton eventSource = (JButton) e.getSource();

        String name = typeNameField.getText();
        String password = new String(typePasswordField.getPassword());

        // Depending on the Button event you can invoke adequate command.
        if (eventSource == loginButton) {
            performLogin(new LoginEvent(name, password));
        } else {
            System.out.println("Bing bong, error");
        }
    }

    public void setLoginListener(LoginListener loginListener) {
        this.loginListener = loginListener;
    }

    private void performLogin(LoginEvent loginEvent) {
        if (loginListener != null) {
            loginListener.successfulLogin(loginEvent);
        }
    }
}
