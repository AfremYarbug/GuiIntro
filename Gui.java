import javax.swing.*;

public class Gui {

    public static void main(String[] args) {
        //Gui is an algorithm for Graphical User Interface

        String firstName = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + firstName);

        String lastName = JOptionPane.showInputDialog("Enter your Last name");
        JOptionPane.showMessageDialog(null, "Hello" + lastName);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}
