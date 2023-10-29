import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PassSystem extends JFrame {
    String password = "codejava";
    private JPanel JPanel1;
    private JButton OKButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;

    public PassSystem() {
        super("Swing JPasswordField Demo Program");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 150);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass1 = passwordField1.getText();
                String pass2 = passwordField2.getText();

                if (pass1.equals(pass2) && pass2.equals(pass1)) {
                    if (pass2.equals(password)) {
                        JOptionPane.showMessageDialog(PassSystem.this, "Congratulations! You entered correct password.");
                    } else {
                        JOptionPane.showMessageDialog(PassSystem.this, "Wrong password!");
                    }
                } else {
                    JOptionPane.showMessageDialog(PassSystem.this, "Password do not match!");
                }
            }
        });
    }

    public static void main(String[] args) {
        PassSystem pass = new PassSystem();
        pass.setVisible(true);
    }
}
