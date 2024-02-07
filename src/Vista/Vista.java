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
import java.awt.Color;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane,panelVotaciones,panelInicial;
	public JButton btnSimularVotaciones;
	public JLabel lblFondo;
	public JProgressBar progressBar;
	private JLabel lblCantante;
	private JLabel lblPuntuacion;
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
		setBounds(100, 100, 1112, 931);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		 contentPane.setLayout(null);
		 
		 panelVotaciones = new JPanel();
		 panelVotaciones.setBounds(0, 0, 943, 682);
		 contentPane.add(panelVotaciones);
		 panelVotaciones.setLayout(null);
		 
		 JLabel lblBanderaEspaña = new JLabel("");
		 lblBanderaEspaña.setIcon(new ImageIcon("C:\\Users\\Equipo\\Downloads\\espania.png"));
		 lblBanderaEspaña.setBackground(new Color(128, 0, 128));
		 lblBanderaEspaña.setBounds(10, 73, 117, 62);
		 panelVotaciones.add(lblBanderaEspaña);
		 
		 JLabel lblEspaña = new JLabel("España");
		 lblEspaña.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblEspaña.setBounds(137, 105, 123, 30);
		 panelVotaciones.add(lblEspaña);
		 
		 JLabel lblTitulo = new JLabel("Clasificación por países");
		 lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		 lblTitulo.setBounds(275, 10, 308, 53);
		 panelVotaciones.add(lblTitulo);
		 
		 lblCantante = new JLabel("");
		 lblCantante.setBackground(new Color(128, 0, 128));
		 lblCantante.setBounds(171, 168, 76, 62);
		 panelVotaciones.add(lblCantante);
		 
		 lblPuntuacion = new JLabel("1º");
		 lblPuntuacion.setBackground(new Color(128, 0, 128));
		 lblPuntuacion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacion.setBounds(10, 168, 30, 32);
		 panelVotaciones.add(lblPuntuacion);
		 
		 JLabel lblPuntuacion2 = new JLabel("2º");
		 lblPuntuacion2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacion2.setBackground(new Color(128, 0, 128));
		 lblPuntuacion2.setBounds(10, 210, 30, 32);
		 panelVotaciones.add(lblPuntuacion2);
		 
		 JLabel lblPuntuacion3 = new JLabel("3º");
		 lblPuntuacion3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacion3.setBackground(new Color(128, 0, 128));
		 lblPuntuacion3.setBounds(10, 252, 30, 32);
		 panelVotaciones.add(lblPuntuacion3);
		 
		 JLabel lblPais1 = new JLabel("");
		 lblPais1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPais1.setBounds(50, 162, 130, 53);
		 panelVotaciones.add(lblPais1);
		 
		 JLabel lblPais2 = new JLabel("");
		 lblPais2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPais2.setBounds(50, 204, 111, 38);
		 panelVotaciones.add(lblPais2);
		 
		 JLabel lblPais3 = new JLabel("");
		 lblPais3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPais3.setBounds(50, 246, 111, 38);
		 panelVotaciones.add(lblPais3);
		 
		 panelInicial = new JPanel();
		 panelInicial.setBounds(0, 0, 943, 682);
		 contentPane.add(panelInicial);
		 panelInicial.setLayout(null);
		 
		  progressBar = new JProgressBar();
		  progressBar.setBackground(Color.BLACK);
		  progressBar.setStringPainted(true);
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
	}
}
