package bmi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.text.NumberFormat;

public class BMICalculator extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    private JTextField txtname = new JTextField();
    private JTextField txtage = new JTextField();
    private JTextField txtweight = new JTextField();
    private JTextField txtheight = new JTextField();
    private JTextField showname = new JTextField();
    private JTextField showbmi = new JTextField();
    private JTextField showr = new JTextField();
    private JLabel name = new JLabel("Name:");
    private JLabel age = new JLabel("age:");
    private JLabel weight = new JLabel("Weight(kg):");
    private JLabel height = new JLabel("Height(cm):");
    private JButton btn = new JButton("compute BMI");
    private JButton clear = new JButton("clear");

    public static void main(String[] args) {
        BMICalculator bmirun = new BMICalculator();

    }

    public BMICalculator() {
        frame.setSize(300, 200);
        frame.setTitle("BMICalculator");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        JPanel p1 = new JPanel(null);
        frame.add(p1);
        p1.add(name);
        p1.add(txtname);
        p1.add(showname);
        p1.add(age);
        p1.add(txtage);
        p1.add(weight);
        p1.add(txtweight);
        p1.add(height);
        p1.add(txtheight);
        p1.add(showname);
        p1.add(showbmi);
        p1.add(showr);
        p1.add(btn);
        p1.add(clear);
        name.setSize(60, 20);
        age.setSize(60, 20);
        weight.setSize(80, 20);
        height.setSize(80, 20);
        txtname.setSize(60, 20);
        txtage.setSize(60, 20);
        txtweight.setSize(60, 20);
        txtheight.setSize(60, 20);
        showname.setSize(100, 20);
        showbmi.setSize(100, 35);
        showr.setSize(100, 25);
        name.setLocation(10, 10);
        age.setLocation(10, 30);
        weight.setLocation(10, 50);
        height.setLocation(10, 70);
        txtname.setLocation(90, 10);
        txtage.setLocation(90, 30);
        txtweight.setLocation(90, 50);
        txtheight.setLocation(90, 70);
        showname.setLocation(180, 10);
        showbmi.setLocation(180, 30);
        showr.setLocation(180, 65);
        showname.setEditable(false);
        showbmi.setEditable(false);
        showr.setEditable(false);
        btn.setSize(150, 20);
        btn.setLocation(10, 100);
        clear.setSize(70, 20);
        clear.setLocation(170, 100);
        btn.addActionListener(this);
        clear.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            showname.setText(txtname.getText());
            double w = Double.parseDouble(txtweight.getText());
            double h = Double.parseDouble(txtheight.getText());
            double bmitest = w * 100 * 100 / h / h;
            NumberFormat bmichange = NumberFormat.getInstance();
            bmichange.setMaximumFractionDigits(2);
            showbmi.setText(String.valueOf(bmichange.format(bmitest)));
            if (bmitest < 18.5) {
                showr.setText("Underweight");
            } else if (bmitest >= 18.5 && bmitest < 25) {
                showr.setText("Normal");
            } else if (bmitest >= 25 && bmitest < 30) {
                showr.setText("Overweight");
            } else {
                showr.setText("Obese");
            }
        } else if (e.getSource() == clear) {
            txtname.setText("");
            txtage.setText("");
            txtheight.setText("");
            txtweight.setText("");
            showname.setText("");
            showbmi.setText("");
            showr.setText("");
        }

    }
}
