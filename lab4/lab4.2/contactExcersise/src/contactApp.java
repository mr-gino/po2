import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
        list1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        createTable();
    }

    private void createTable() {
        Object[][] data = {
                {"Jan", "Kowalski", "jkowalski@ur.pl", "323 212 323", 2000-11-10},
                {"Marian", "Nowak", "mnowak@ur.pl", "323 212 323", 2010-11-10},
                {"Janina", "Urban", "jurban@ur.pl", "322 123 544", 1996-11-10},
                {"Ewelina", "Nowak Maciag", "enowakmaciag@ur.pl", "123 767 5656", 2007-11-10},
        };
}
