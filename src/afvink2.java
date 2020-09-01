import java.util.Scanner;
import javax.swing.*;

public class afvink2 {

    public static void main(String[] args) {
        opdracht1();
        opdracht2();
    }

    public static void opdracht1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Voer naam in: ");
        String naam = input.next();
        System.out.println("Hallo " + naam);
    }

    public static void opdracht2(){
        String naam = JOptionPane.showInputDialog(null, "Voer naam in: ");
        JOptionPane.showMessageDialog(null, "Hallo " + naam);
    }
}
