import javax.swing.*;
import java.awt.*;

public class afvink_bonus {
    public static void main(String[] args) {
        opdracht1();
    }

    public static void opdracht1() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Bonus Opdracht");
        JPanel panel = new JPanel();
        ImageIcon img = new ImageIcon("icon.jpg");
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("HELLO", SwingConstants.CENTER);
        frame.add(label);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLUE);
        label.setForeground(Color.red);
        frame.setIconImage(img.getImage());
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
