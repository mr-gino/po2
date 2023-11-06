import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleGUI extends JFrame {
    private JComboBox comboBox1;
    private JLabel LabelShow;
    private JPanel JPanel1;
    private JTable table1;

    public ExampleGUI() {
        super("ds127770");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Element wybrany "
                        + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                LabelShow.setText(text);
            }
        });
        createTable();
    } //konieck konstruktorka

    public static void main(String[] args) {
        ExampleGUI example = new ExampleGUI();
        example.setVisible(true);
    }

    private void createTable() {
        Object[][] data = {
                {"jan", "nowak", "informatyka", 3},
                {"jan", "nowak", "informatyka", 3},
                {"jan", "nowak", "informatyka", 3},
                {"jan", "nowak", "informatyka", 3},
                {"jan", "nowak", "informatyka", 3}
        };
        table1.setModel(new DefaultTableModel(
                data,
                new String[] {"Imię", "Naziwsko", "Kierunek", "Nr semestru"}
        ));
        TableColumnModel columnModel = table1.getColumnModel();
        columnModel.getColumn(0).setMinWidth(200);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        columnModel.getColumn(1).setCellRenderer(cellRenderer);
        columnModel.getColumn(2).setCellRenderer(cellRenderer);
        columnModel.getColumn(3).setCellRenderer(cellRenderer);

    }

}
