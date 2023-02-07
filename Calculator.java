import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Calculator extends JFrame implements ActionListener {

    private static JFrame frame;
    private static JTextField field;

    private String s0;
    private String s1;
    private String s2;

    public Calculator()
    {
        s0 = "";
        s1 = "";
        s2 = "";
    }
    public void buildCalculator() {
        frame = new JFrame("Calculator");

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        field = new JTextField(16);
        field.setEditable(false);
        Calculator c = new Calculator();


        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bDiv, bMult, bE, bC, bEq;
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bEq = new JButton("=");
        bAdd = new JButton("+");
        bAdd.setFont(field.getFont().deriveFont(Font.BOLD));
        bAdd.setForeground(Color.RED);
        bSub = new JButton("-");
        bSub.setFont(field.getFont().deriveFont(Font.BOLD));
        bSub.setForeground(Color.RED);
        bDiv = new JButton("/");
        bDiv.setFont(field.getFont().deriveFont(Font.BOLD));
        bDiv.setForeground(Color.RED);
        bMult = new JButton("*");
        bMult.setFont(field.getFont().deriveFont(Font.BOLD));
        bMult.setForeground(Color.RED);
        bC = new JButton("C");
        bC.setFont(field.getFont().deriveFont(Font.BOLD));
        bC.setForeground(Color.RED);
        bE = new JButton(".");
        JPanel p = new JPanel();
        
        
        
        bMult.addActionListener(c);
        bDiv.addActionListener(c);
        bSub.addActionListener(c);
        bAdd.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        bE.addActionListener(c);
        bC.addActionListener(c);
        bEq.addActionListener(c);
        
        // add elements to panel
        p.add(field);
        p.add(bAdd);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bSub);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bMult);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bDiv);
        p.add(bE);
        p.add(b0);
        p.add(bC);
        p.add(bEq);

        p.setBackground(Color.BLACK);
        frame.add(p);
        frame.setSize(200, 220);
        frame.show();
    }


    public void actionPerformed(ActionEvent e)
    {
        String key = e.getActionCommand();

        if ((key.charAt(0) >= '0' && key.charAt(0) <= '9') || key.charAt(0) == '.') {

            if (!s1.equals(""))
                s2 = s2 + key;
            else
                s0 = s0 + key;
            field.setText(s0 + s1 + s2);
        }
        else if (key.charAt(0) == 'C') {
            s0 = s1 = s2 = "";
            field.setText(s0 + s1 + s2);
        }
        else if (key.charAt(0) == '=') {

            double x;

            if (s1.equals("-"))
                x = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                x = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else if (s1.equals("+"))
                x = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else
                x = (Double.parseDouble(s0) * Double.parseDouble(s2));
            field.setText(s0 + s1 + s2 + "=" + x);
            s0 = Double.toString(x);
            s1 = s2 = "";
        }
        else {

            if (s1.equals("") || s2.equals(""))
                s1 = key;
            else {
                double x;
                if (s1.equals("-"))
                    x = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    x = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else if (s1.equals("+"))
                    x = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else
                    x = (Double.parseDouble(s0) * Double.parseDouble(s2));
                s0 = Double.toString(x);
                s1 = key;
                s2 = "";
            }
            field.setText(s0 + s1 + s2);
        }
    }
}
