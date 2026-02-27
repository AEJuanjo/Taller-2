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
            double z = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el valor de z:"));
            double y = 0;
        if (opcion == 1) {

            y = (((3*x/(1+((3*z*z+2)/(3*x)))))/1) / ((1/(1+z)) + 3*x*x + 2*z + 3);

        } else if (opcion == 2) {

            y = ((x*x+3*z+2)/(2+(1/(1+2*z)))) + (2/(1+3*x*x*x+3*z+2)) / (1/(1/(1+3*x)+(3*x+1)/(2*z+(3/(1+5/z)))));

        }
    }
}





