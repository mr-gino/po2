import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeltaWindow extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JButton obliczButton;
    private javax.swing.JPanel JPanel;
    private JLabel JLabelOut;
    private JButton wyjscieButton;

    double valueA, valueB, valueC, valueOut;

    public static void main(String[] args) {
        DeltaWindow deltaWindow = new DeltaWindow();
        deltaWindow.setVisible(true);
    }

    public DeltaWindow(){
        super("Kalkulator delty");
        this.setContentPane(this.JPanel);
        this.pack();

        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textFieldA.getText());
                valueB = Double.parseDouble(textFieldB.getText());
                valueC = Double.parseDouble(textFieldC.getText());

                valueOut = Math.pow(valueB,2) - 4 * valueA *valueC;

                JLabelOut.setText("Delta wynosi " + String.valueOf(valueOut));
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

}
