import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonSystem extends JFrame {
    private JPanel JPanel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel JLabelImage;
    private JButton okButton;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("linux.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("mac.png"));

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth, destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
        RadioButtonSystem RadioButtonSystem = new RadioButtonSystem();
        RadioButtonSystem.setVisible(true);
    }

    public RadioButtonSystem() {
        super("System choise");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,250);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption = "";
                if (linuxRadioButton.isSelected()) selectOption = "Linux";
                if (windowsRadioButton.isSelected()) selectOption = "Windows";
                if (macintoshRadioButton.isSelected()) selectOption = "Macintosh";
                

                JOptionPane.showMessageDialog(RadioButtonSystem.this,
                        "Wygrano system " + selectOption);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected())
                    JLabelImage.setIcon(resize(iconLinux, 120, 120));
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected())
                    JLabelImage.setIcon(resize(iconWindows, 120, 120));
            }
        });
        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macintoshRadioButton.isSelected())
                    JLabelImage.setIcon(resize(iconMac, 120, 120));
            }
        });
    }
}
