import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eample01 extends JFrame {

    private JPanel JPanel;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton iloczynButton;
    private JButton ilorazButton;
    private JButton wyjscieButton;
    private JLabel JLabelScore;

    double valueA, valueB, score;

    public static void main(String[] args) {
        Eample01 example01 = new Eample01();
        example01.setVisible(true);

    }

    public Eample01(){
        super("Kalkulator dwóch liczb ...");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 300, height = 250;
        this.setSize(width,height);
        //this.pack();

        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textFieldA.getText());
                valueB = Double.parseDouble(textFieldB.getText());
                score = valueA + valueB;
                JLabelScore.setText("Suma " + String.valueOf(valueA) + " + " + String.valueOf(valueB) +
                        " = " + score);
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textFieldA.getText());
                valueB = Double.parseDouble(textFieldB.getText());
                score = valueA - valueB;
                JLabelScore.setText("Różnica " + String.valueOf(valueA) + " - " + String.valueOf(valueB) +
                        " = " + score);
            }
        });
        ilorazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textFieldA.getText());
                valueB = Double.parseDouble(textFieldB.getText());
                if (valueB == 0)
                    score = 0;
                else score = valueA / valueB;
                JLabelScore.setText("Iloraz " + String.valueOf(valueA) + " / " + String.valueOf(valueB) +
                        " = " + score);
            }
        });
        iloczynButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textFieldA.getText());
                valueB = Double.parseDouble(textFieldB.getText());
                score = valueA * valueB;
                JLabelScore.setText("Iloczyn " + String.valueOf(valueA) + " * " + String.valueOf(valueB) +
                        " = " + score);
            }
        });
    }
}
