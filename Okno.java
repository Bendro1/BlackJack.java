package ucenie.java;

import javax.swing.*;
import java.awt.*;

public class Okno {
    private static Object ActionEvent;

    public static void main(String[] args) {
        JFrame jf=new JFrame("Okno");
        JButton jb=new JButton("Click here");
        jb.setBounds(50,100,90,30);
        jf.add(jb);
        jf.setLayout(new FlowLayout());
        JLabel jl=new JLabel("Text ");
        jf.add(jl);
        jf.setVisible(true);
        jf.setSize(800,800);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
