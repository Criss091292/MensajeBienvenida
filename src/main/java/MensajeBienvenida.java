import javax.swing.JOptionPane;

public class MensajeBienvenida {
    public static void main(String[] args) {
            String nombreUsuario = JOptionPane.showInputDialog(null, "¿Bienvenido, cual es tu nombre? \n");
            String celular= JOptionPane.showInputDialog(null,"Perfecto, ¿Cual es tu numero de celular? \n");
            String edad= JOptionPane.showInputDialog(null,"y finalmente, ¿Cuantos años tienes? \n");
            JOptionPane.showMessageDialog(null,MensajeBienvenidaUsuario(nombreUsuario,celular,edad));
    }
    static String MensajeBienvenidaUsuario(String nombreUsuario, String celular, String edad){
        return "Bienvenido señor "+nombreUsuario+", es un placer para nosotros contar con una persona de "+edad+" años.\n" +
                "Próximamente nos comunicaremos con usted al numero "+celular+".\n" +
                "Feliz día";
    }
}
