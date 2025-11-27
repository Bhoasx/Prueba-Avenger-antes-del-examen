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
                    if(e.getSource() == Ventana.this.buscarIdButton) {
                        int IdAvenger = Integer.parseInt(Ventana.this.txtbin.getText());
                        Avengers busca = Ventana.this.lista.Busquedabinaria(IdAvenger);
                        if (busca == null){
                            JOptionPane.showMessageDialog(null, "No hay ningun heroe con ese Id ");
                        } else {
                            Ventana.this.txtBusquedaBin.setText(busca.toString());
                        }

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
                    if (e.getSource() == Ventana.this.btnSec){
                        int IdAvenger = Integer.parseInt(Ventana.this.txtsec.getText());
                        Avengers b = Ventana.this.lista.BusquedaSecuencial(IdAvenger);
                        Ventana.this.txtSec.setText(b.toString());
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "error, en algo...");
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
