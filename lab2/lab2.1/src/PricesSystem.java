import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PricesSystem extends JFrame {
    private JPanel JPanel1;
    private JCheckBox javaCheckBox;
    private JCheckBox csharpCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox pythonCheckBox;
    private JButton OKButton;
    private JPanel JPanel;

    public PricesSystem() {
        super("Chceckbox");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float priceOut = 0;
                String msg = "";

                if (javaCheckBox.isSelected()) {
                    priceOut += 3500;
                    msg += "Java #price 3500,00 PLN\n";
                }

                if (csharpCheckBox.isSelected()) {
                    priceOut += 3000;
                    msg += "C# #price 3000,00 PLN\n";
                }

                if (cppCheckBox.isSelected()) {
                    priceOut += 4000;
                    msg += "C++ #price 4000,00 PLN\n";
                }
                if (pythonCheckBox.isSelected()) {
                    priceOut += 5000;
                    msg += "Python #price 5000,00 PLN\n";
                }

                msg += "=============================\n";

                JOptionPane.showMessageDialog(null, msg + "Razem: " + priceOut);
            }
        });
    }

    public static void main(String[] args) {
        PricesSystem PricesSystem = new PricesSystem();
        PricesSystem.setVisible(true);
    }
}
