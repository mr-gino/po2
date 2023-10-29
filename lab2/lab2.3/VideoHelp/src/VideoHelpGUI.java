import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VideoHelpGUI extends JFrame{
    private JPanel JPanel1;
    private JButton komediaButton;
    private JButton horrorButton;
    private JButton romansButton;
    private JLabel JLabelProp;

    private ImageIcon hor = new ImageIcon(getClass().getResource("hor.jpg"));
    private ImageIcon kom = new ImageIcon(getClass().getResource("kom.jpg"));
    private ImageIcon rom = new ImageIcon(getClass().getResource("rom.jpg"));

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public static void main(String[] args) {
        VideoHelpGUI vidhelp = new VideoHelpGUI();
        vidhelp.setVisible(true);
    }

    public VideoHelpGUI(){
        super("VideoHelp");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);

        komediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabelProp.setIcon(resize(kom, 120,170));
            }
        });

        horrorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabelProp.setIcon(resize(hor, 120,170));
            }
        });
        romansButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabelProp.setIcon(resize(rom, 120,170));
            }
        });
    }
}
