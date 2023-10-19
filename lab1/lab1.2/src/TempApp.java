import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempApp extends JFrame{
    private JTextField textFieldIn;
    private JButton konwertujButton;
    private javax.swing.JPanel JPanel;
    private JLabel JLabelOut;

    double valueIn, valueOut;

    public static void main(String[] args) {
        TempApp tempapp = new TempApp();
        tempapp.setVisible(true);

    }

    public TempApp(){
        super("Konwerter temperatury");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        konwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueIn = Double.parseDouble(textFieldIn.getText());
                valueOut = valueIn * 1.8 + 32;
                JLabelOut.setText(valueIn + "°C = " + valueOut + "°F");
            }
        });
    }
}
