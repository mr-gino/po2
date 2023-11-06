import javax.swing.*;

public class contactApp extends JFrame{
    private JPanel JPanel1;
    private JList list1;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JTextField nameField;
    private JTextField mailField;
    private JTextField phoneField;
    private JTextField adresField;
    private JTextField birthField;

    public static void main(String[] args) {
        contactApp cApp = new contactApp();
        cApp.setVisible(true);
    }

    public contactApp(){
        super("App");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);
    }
}
