import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HolaMundo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JButton btnMostrar;
	private JButton btnSumar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundo frame = new HolaMundo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HolaMundo() { //Constructor porque se llama igual que la clase y se ejecutan cuando se hace la instancia
		setTitle("Hola Mundo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 485); //posx, posy, ancho, alto
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Texto:");
		lblNewLabel.setBounds(46, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(141, 37, 114, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1:");
		lblNewLabel_1.setBounds(46, 65, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Número 2:");
		lblNewLabel_2.setBounds(46, 90, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(141, 62, 114, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(141, 87, 114, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(265, 373, 89, 23);
		contentPane.add(btnSalir);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(265, 36, 89, 23);
		contentPane.add(btnMostrar);
		
		btnSumar = new JButton("Sumar");
		btnSumar.setBounds(265, 81, 89, 23);
		contentPane.add(btnSumar);

		registrarEventos();
	}
	
	public void registrarEventos() {
		//Evento del boton salir
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(HolaMundo.this, "¿Estas seguro que quieres salir?", "Aviso", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
					
					System.exit(0);
				}
			}
		});
		
		//Evento del boton mostrar
		btnMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtTexto.setText("Hola Mundo");
				
			}
		});
		
		btnSumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
			        int num1 = Integer.parseInt(txtNum1.getText());
			        int	num2 = Integer.valueOf(txtNum2.getText());
			        int res = num1+num2;
			        txtTexto.setText(String.valueOf(res));
			        //txtTexto.setText(""+res);
			    } catch (NumberFormatException x) {
			        //System.out.println("El valor introducido no es un número");
			    	JOptionPane.showMessageDialog(HolaMundo.this, "Tienes que introducir dos números enteros."); //this hace referencia a la clase
			    }
			}
		});
	}
}
