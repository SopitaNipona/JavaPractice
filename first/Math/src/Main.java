//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
import java.util.Scanner;

//Returns the hypotenuse

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Enter side x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Enter side y: "));

        z = Math.sqrt((x*x)+(y*y));

        JOptionPane.showMessageDialog(null, "Answer is "+z);

    }
}