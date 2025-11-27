import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Ventana;
    private JTabbedPane tabbedPane1;
    private JTextField txtNombre;
    private JTextField txtnivel;
    private JTextField txtMision;
    private JButton btnIngresar;
    private JTextArea txtMostrar;
    private JTextField txtbin;
    private JButton buscarIdButton;
    private JTextArea txtBusquedaBin;
    private JTextField txtsec;
    private JButton btnSec;
    private JTextArea txtSec;

    private Lista lista = new Lista();

    public Ventana(){

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(e.getSource() == btnIngresar) {
                        String nombre = txtNombre.getText();
                        int nivel = Integer.parseInt(txtnivel.getText());
                        String Mision = txtMision.getText();

                        lista.addAvenger(nombre, nivel, Mision);
                        SetearDatos();
                        txtMostrar.setText(lista.mostrarAvengers());
                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null , "Error al ingresar el dato");
                }
            }
        });
        buscarIdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(e.getSource() == buscarIdButton) {
                        int IdAvenger = Integer.parseInt(txtbin.getText());
                        lista.Busquedabinaria(IdAvenger);
                        SetearDatos();
                    }

                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "El Id debe ser un numero");
                }
            }
        });
        btnSec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    //Nunca te olvides poner condicion tomando la accion y comparando el boton seleccionado
                    //Despues da Error cuando hay mas botones '


                    //si porq cuando hay muchos botones da error haz esa buena practica y no tendras nunca error con los botones
                    //Que no funciona?
                    // ohhhh aqui, cual es ese de getSource?, que hace
                    //Toma la accion y la compara con el boton con esta accion nuca se te va a buguear por si precionas otros botones similares
                    //pero se me volvio a buguear, mira ws
                    //esq eso no es bug tienes un error sintactico algo no esta funcionando como deberia
                    //simon, creo q es prb los busqueda, algo los ha de mandar a bucle, o se van contra el null de la lista, algo esta mal, pero nidea la plena

                    // vuelvo a probar?
                    if(e.getSource() == btnSec) {
                        int IdAvenger = Integer.parseInt(txtsec.getText());
                        lista.BusquedaSecuencial(IdAvenger);
                        SetearDatos();
                    }
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "El Id debe ser un numero");
                }
            }
        });
    }

    public void SetearDatos(){
        txtNombre.setText("");
        txtnivel.setText("");
        txtMision.setText("");
        txtbin.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Esto es para editar las dimesiones por eso se ve asi
        //Pero el cuadro negro ya desaparecio

        //simon le cambie los tamaños ahorita pq se veia raro, ahorita voy ando viendo en tus repositorios como es

        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
