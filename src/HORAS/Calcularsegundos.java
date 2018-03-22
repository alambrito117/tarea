package HORAS;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcularsegundos extends JFrame{

    private JButton btncalcular;
    private JTextField DATO;




    public Calcularsegundos(String titulo, Color colorfondo) {
        this.setTitle(titulo);
        Container panelPrincipal = this.getContentPane();

        panelPrincipal.setBackground(colorfondo);
        panelPrincipal.setLayout(null);

        JLabel lbl = new JLabel("# SEGUNDOS: ");
        lbl.setBounds(10,20,100,30);
        panelPrincipal.add(lbl);
        DATO = new JTextField();
        DATO.setBounds(120, 20, 150, 30);
        panelPrincipal.add(DATO);

      

        btncalcular = new JButton("Calcular");
        btncalcular.setBounds(40, 100, 100, 30);
        panelPrincipal.add(btncalcular);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(150, 100, 100, 30);
        panelPrincipal.add(btnCancelar);

        AccionBoton oyenteBtnAceptar = new AccionBoton();
        AccionBoton oyenteBtnCancelar = new AccionBoton();

        btncalcular.addActionListener(oyenteBtnAceptar);
        btnCancelar.addActionListener(oyenteBtnCancelar);
    }

    public static void main(String[] args)
    {
        Calcularsegundos f = new Calcularsegundos("CONVERTIR SEGUNDOS", Color.BLUE);
        f.setSize(300,180);
        f.setLocation(200,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);

    }

    class AccionBoton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            

            if ((JButton) e.getSource() == btncalcular) {
                int var=Integer.parseInt(DATO.getText());
                String str =Calcular(var);
                JOptionPane.showMessageDialog(null, str , "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else {
                
                System.exit(0); 
            }
        }
    } 
    
    public static String Calcular (int s){
    	
    	int ss=s;
    			int m=0;
    			int h=0;
    			int d=0;
    			
    			for (;!(ss<60);m++){
    				ss=ss-60;
    			}
    			for (;!(m<60);h++){
    				m=m-60;

    			}
    			for (;!(h<24);d++){
    				m=m-60;
    	
    	
    	
    	
    }
    			String res= d+" DIA/S "+h+" Hora/s " +m+" Minuto/s "+ss+" Segundo/s ";
    			return res;
    
    
    }
} 