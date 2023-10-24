import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordSystem extends JFrame {
    private JPanel JPanel1;
    private JTextField textName;
    private JButton loginButton;
    private JPasswordField passwordField1;
    private JLabel JLabelOutput;


    String user = "admin", password = "admin";

    public static void main(String[] args) {
        PasswordSystem password = new PasswordSystem();
        password.setVisible(true);
    }

    public PasswordSystem(){
        super("Login panel");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textName.getText();
                String userPassword = new String(passwordField1.getPassword());

                if (userInput.equals(user) && userPassword.equals(password)){
                    JLabelOutput.setText("Zalogowano do systemu ...");
                    dispose();
                    RadioButtonSystem obj = new RadioButtonSystem();
                    obj.setVisible(true);
                } else {
                    JLabelOutput.setText("Podano błędne dane ... spróbuj ponownie ...");
                    textName.setText("");
                    passwordField1.setText("");
                }
            }
        });
    }

}
