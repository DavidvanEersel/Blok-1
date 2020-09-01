import javax.swing.*;
import java.awt.*;

public class afvink3 {

    public static void main(String[] args) {
        opdracht1();
    }

    public static void opdracht1(){
        JFrame frame = new JFrame("Opdracht 3");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Vul hier onder wat in:", SwingConstants.CENTER);
        JTextField textfield = new JTextField();
        textfield.setBounds(50,150,200,30);
        frame.add(label);
        frame.add(panel);
        frame.add(textfield);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
