package ucenie.java;

import javax.swing.*;
import java.awt.*;

public class MainClass extends Canvas {
    public static void main(String[] args) {
        MainClass game=new MainClass();
        JFrame frame=new JFrame("Java Game");
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.add(game);
        frame.setVisible(true);
    }
}
