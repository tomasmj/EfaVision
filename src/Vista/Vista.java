package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane,panelVotaciones,panelInicial;
	public JButton btnSimularVotaciones;
	public JLabel lblFondo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					Controlador controlador = new Controlador(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 719);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		 contentPane.setLayout(null);
		 
		 panelInicial = new JPanel();
		 panelInicial.setBounds(0, 0, 943, 682);
		 contentPane.add(panelInicial);
		 panelInicial.setLayout(null);
		 
		 JProgressBar progressBar = new JProgressBar();
		 progressBar.setBounds(301, 623, 325, 31);
		 panelInicial.add(progressBar);
		 
		 btnSimularVotaciones = new JButton("SIMULAR VOTACIONES");
		 btnSimularVotaciones.setBounds(301, 547, 325, 56);
		 btnSimularVotaciones.setFont(new Font("Tahoma", Font.BOLD, 22));
		 panelInicial.add(btnSimularVotaciones);
		 
		 lblFondo = new JLabel("");
		 lblFondo.setBounds(0, 0, 943, 682);
		 lblFondo.setIcon(new ImageIcon("src/Imagenes/fondo.jpg"));
		 panelInicial.add(lblFondo);
		 
		 panelVotaciones = new JPanel();
		 panelVotaciones.setBounds(0, 0, 943, 682);
		 contentPane.add(panelVotaciones);
		 panelVotaciones.setLayout(null);
	}
}
