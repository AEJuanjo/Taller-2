import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Ecuaciones {

    public static void main(String[] args) {

        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Seleccione la ecuación:\n"
                        + "1. Ecuación 1\n"
                        + "2. Ecuación 2"));
                double x = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el valor de x:"));

    }
}

