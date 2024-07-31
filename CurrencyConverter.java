import java.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
public class CurrencyConverter{
    public static void convertor()
    {
        JFrame f = new JFrame("Curreny Convertor");
        
        //creating the lables which is the name of text field

        JLabel l1,l2;

        //creating the textfields where the input will be taken

        JTextField t1,t2;

        //creating button to perfom action

        JButton b1,b2,b3;

        //code to fill the textfield and button and labels

        l1 = new JLabel("India");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("America");
        l2.setBounds(140, 40, 60, 30);


        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(230, 40, 50, 30);


        b1 = new JButton("dol");
        b1.setBounds(50, 80, 60, 15);
        b2 = new JButton("Rs");
        b2.setBounds(190, 80, 60, 15);
        b3 = new JButton("Close");
        b3.setBounds(150, 150, 60, 30);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double d = Double.parseDouble(t1.getText());

                double d1 = (d / 83.69);
                String str = String.valueOf(d1);
                t2.setText(str);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double d2 = Double.parseDouble(t2.getText());

                double d3 = (d2 * 83.69);
                String str2 = String.valueOf(d3);
                t1.setText(str2);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        f.addWindowFocusListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });


        //add the created button ,label and textfields

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        convertor();
    }
}
