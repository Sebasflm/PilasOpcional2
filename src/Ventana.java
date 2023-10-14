import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Panel;
    private JTextField txtNum;
    private JButton btnIngresar;
    private JTextArea txtBinario;
    public Ventana(){

        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num= txtNum.getText();
                int numero= Integer.parseInt(num);
                DecimalABinario a=new DecimalABinario();
                try {
                    a.transformacion(numero);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                txtBinario.setText("El numero ingresado en binario es: "+a.impresion());
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
