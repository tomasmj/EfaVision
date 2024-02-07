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
	public JPanel contentPane,panelVotaciones,panelInicial, panelVotaciones2;
	public JButton btnSimularVotaciones;
	public JLabel lblFondo, lblCantantePortugal3, lblCantanteEspaña1, lblPuntuacionEspaña1, lblBanderaEspaña, lblEspaña, lblTitulo, lblPuntuacionEspaña2, lblPaisEspaña1, lblPaisEspaña2,
	lblCantanteEspaña2, lblPuntuacionEspaña3, lblPaisEspaña3, lblCantanteEspaña3, lblPuntuacionAlemania3, lblPaisAlemania3, lblCantanteAlemania3, lblCantanteAlemania2, lblPaisAlemania2, 
	lblPuntuacionAlemania2, lblPuntuacionAlemania1, lblPaisAlemania1, lblCantanteAlemania1, lblAlemania, lblBanderaAlemania, lblBanderaFrancia, lblFrancia, lblPuntuacionFrancia1, lblPaisFrancia1, 
	lblCantanteFrancia1, lblPuntuacionFrancia2, lblPaisFrancia2, lblCantanteFrancia2, lblPuntuacionFrancia3, lblPaisFrancia3, lblCantanteFrancia3, lblPuntuacionItalia2, lblBanderaItalia, 
	lblItalia, lblPuntuacionItalia1, lblPaisItalia1, lblCantanteItalia1, lblPaisItalia2, lblCantanteItalia2, lblPaisItalia3, lblPuntuacionItalia3, lblCantanteItalia3, lblBanderaPortugal, 
	lblPortugal, lblPuntuacionPortugal1, lblPaisPortugal, lblCantantePortugal1, lblPaisPortugal2, lblCantantePortugal2, lblPuntuacionPortugal2, lblPuntuacionPortugal3, lblPaisPortugal3, 
	lblReinoUnido, lblBanderaReinoUnido, lblTitulo2, lblCantanteReinoUnido1, lblPuntuacionReinoUnido1, lblPuntuacionReinoUnido2, lblPaisReinoUnido1, lblPaisReinoUnido2, lblCantanteReinoUnido2, 
	lblPuntuacionReinoUnido3, lblPaisReinoUnido3, lblCantanteReinoUnido3, lblPuntuacionRumania3, lblPaisRumania3, lblCantanteRumania3, lblCantanteRumania2, lblPaisRumania2, lblPuntuacionRumania2, 
	lblPuntuacionRumania1, lblPaisRumania1, lblCantanteRumania1, lblRumania, lblBanderaRumania, lblBanderaPolonia, lblPolonia, lblPuntuacionPolonia1, lblPaisPolonia1, lblCantantePolonia1, 
	lblPuntuacionPolonia2, lblPaisPolonia2, lblCantantePolonia2, lblPuntuacionPolonia3, lblPaisPolonia3, lblCantantePolonia3, lblPuntuacionGrecia2, lblBanderaGrecia, lblGrecia, lblPuntuacionGrecia1, 
	lblPaisGrecia1, lblCantanteGrecia1, lblPaisGrecia2, lblCantanteGrecia2, lblPaisGrecia3, lblPuntuacionGrecia3, lblCantanteGrecia3, lblBanderaPaisesBajos, lblPasesBajos, lblPuntuacionPaisesBajos1, 
	lblPaisPaisesBajos1, lblCantantePaisesBajos1, lblPaisPaisesBajos2, lblCantantePaisesBajos2, lblPuntuacionPaisesBajos2, lblPuntuacionPaisesBajos3, lblPaisPaisesBajos3, lblCantantePaisesBajos3;
	public JProgressBar progressBar;
	//

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
		setBounds(100, 100, 1121, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		 contentPane.setLayout(null);
		 
		 panelVotaciones = new JPanel();
		 panelVotaciones.setBounds(0, 0, 1171, 845);
		 contentPane.add(panelVotaciones);
		 panelVotaciones.setLayout(null);
		 
		 lblBanderaEspaña = new JLabel("");
		 lblBanderaEspaña.setIcon(new ImageIcon("C:\\Users\\Equipo\\Downloads\\espania.png"));
		 lblBanderaEspaña.setBackground(new Color(128, 0, 128));
		 lblBanderaEspaña.setBounds(36, 73, 117, 62);
		 panelVotaciones.add(lblBanderaEspaña);
		 
		 lblEspaña = new JLabel("España");
		 lblEspaña.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblEspaña.setBounds(163, 105, 129, 30);
		 panelVotaciones.add(lblEspaña);
		 
		 lblTitulo = new JLabel("Clasificación por países");
		 lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		 lblTitulo.setBounds(383, 10, 308, 53);
		 panelVotaciones.add(lblTitulo);
		 
		 lblCantanteEspaña1 = new JLabel("");
		 lblCantanteEspaña1.setBackground(new Color(128, 0, 128));
		 lblCantanteEspaña1.setBounds(216, 152, 76, 62);
		 panelVotaciones.add(lblCantanteEspaña1);
		 
		 lblPuntuacionEspaña1 = new JLabel("1º");
		 lblPuntuacionEspaña1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionEspaña1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionEspaña1.setBounds(36, 182, 30, 32);
		 panelVotaciones.add(lblPuntuacionEspaña1);
		 
		 lblPuntuacionEspaña2 = new JLabel("2º");
		 lblPuntuacionEspaña2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionEspaña2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionEspaña2.setBounds(36, 265, 30, 32);
		 panelVotaciones.add(lblPuntuacionEspaña2);
		 
		 lblPaisEspaña1 = new JLabel("");
		 lblPaisEspaña1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisEspaña1.setBounds(76, 182, 130, 32);
		 panelVotaciones.add(lblPaisEspaña1);
		 
		 lblPaisEspaña2 = new JLabel("");
		 lblPaisEspaña2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisEspaña2.setBounds(76, 265, 130, 32);
		 panelVotaciones.add(lblPaisEspaña2);
		 
		 lblCantanteEspaña2 = new JLabel("");
		 lblCantanteEspaña2.setBackground(new Color(128, 0, 128));
		 lblCantanteEspaña2.setBounds(216, 235, 76, 62);
		 panelVotaciones.add(lblCantanteEspaña2);
		 
		 lblPuntuacionEspaña3 = new JLabel("3º");
		 lblPuntuacionEspaña3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionEspaña3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionEspaña3.setBounds(36, 344, 30, 32);
		 panelVotaciones.add(lblPuntuacionEspaña3);
		 
		 lblPaisEspaña3 = new JLabel("");
		 lblPaisEspaña3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisEspaña3.setBounds(76, 344, 130, 32);
		 panelVotaciones.add(lblPaisEspaña3);
		 
		 lblCantanteEspaña3 = new JLabel("");
		 lblCantanteEspaña3.setBackground(new Color(128, 0, 128));
		 lblCantanteEspaña3.setBounds(216, 317, 76, 62);
		 panelVotaciones.add(lblCantanteEspaña3);
		 
		 lblPuntuacionAlemania3 = new JLabel("3º");
		 lblPuntuacionAlemania3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionAlemania3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionAlemania3.setBounds(36, 672, 30, 32);
		 panelVotaciones.add(lblPuntuacionAlemania3);
		 
		 lblPaisAlemania3 = new JLabel("");
		 lblPaisAlemania3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisAlemania3.setBounds(76, 672, 130, 32);
		 panelVotaciones.add(lblPaisAlemania3);
		 
		 lblCantanteAlemania3 = new JLabel("");
		 lblCantanteAlemania3.setBackground(new Color(128, 0, 128));
		 lblCantanteAlemania3.setBounds(216, 645, 76, 62);
		 panelVotaciones.add(lblCantanteAlemania3);
		 
		 lblCantanteAlemania2 = new JLabel("");
		 lblCantanteAlemania2.setBackground(new Color(128, 0, 128));
		 lblCantanteAlemania2.setBounds(216, 563, 76, 62);
		 panelVotaciones.add(lblCantanteAlemania2);
		 
		 lblPaisAlemania2 = new JLabel("");
		 lblPaisAlemania2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisAlemania2.setBounds(76, 593, 130, 32);
		 panelVotaciones.add(lblPaisAlemania2);
		 
		 lblPuntuacionAlemania2 = new JLabel("2º");
		 lblPuntuacionAlemania2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionAlemania2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionAlemania2.setBounds(36, 593, 30, 32);
		 panelVotaciones.add(lblPuntuacionAlemania2);
		 
		 lblPuntuacionAlemania1 = new JLabel("1º");
		 lblPuntuacionAlemania1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionAlemania1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionAlemania1.setBounds(36, 510, 30, 32);
		 panelVotaciones.add(lblPuntuacionAlemania1);
		 
		 lblPaisAlemania1 = new JLabel("");
		 lblPaisAlemania1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisAlemania1.setBounds(76, 510, 130, 32);
		 panelVotaciones.add(lblPaisAlemania1);
		 
		 lblCantanteAlemania1 = new JLabel("");
		 lblCantanteAlemania1.setBackground(new Color(128, 0, 128));
		 lblCantanteAlemania1.setBounds(216, 480, 76, 62);
		 panelVotaciones.add(lblCantanteAlemania1);
		 
		 lblAlemania = new JLabel("Alemania");
		 lblAlemania.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblAlemania.setBounds(163, 433, 123, 30);
		 panelVotaciones.add(lblAlemania);
		 
		 lblBanderaAlemania = new JLabel("");
		 lblBanderaAlemania.setBackground(new Color(128, 0, 128));
		 lblBanderaAlemania.setBounds(36, 401, 117, 62);
		 panelVotaciones.add(lblBanderaAlemania);
		 
		 lblBanderaFrancia = new JLabel("");
		 lblBanderaFrancia.setBackground(new Color(128, 0, 128));
		 lblBanderaFrancia.setBounds(402, 73, 117, 62);
		 panelVotaciones.add(lblBanderaFrancia);
		 
		 lblFrancia = new JLabel("Francia");
		 lblFrancia.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblFrancia.setBounds(529, 105, 129, 30);
		 panelVotaciones.add(lblFrancia);
		 
		 lblPuntuacionFrancia1 = new JLabel("1º");
		 lblPuntuacionFrancia1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionFrancia1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionFrancia1.setBounds(402, 182, 30, 32);
		 panelVotaciones.add(lblPuntuacionFrancia1);
		 
		 lblPaisFrancia1 = new JLabel("");
		 lblPaisFrancia1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisFrancia1.setBounds(442, 182, 130, 32);
		 panelVotaciones.add(lblPaisFrancia1);
		 
		 lblCantanteFrancia1 = new JLabel("");
		 lblCantanteFrancia1.setBackground(new Color(128, 0, 128));
		 lblCantanteFrancia1.setBounds(582, 152, 76, 62);
		 panelVotaciones.add(lblCantanteFrancia1);
		 
		 lblPuntuacionFrancia2 = new JLabel("2º");
		 lblPuntuacionFrancia2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionFrancia2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionFrancia2.setBounds(402, 265, 30, 32);
		 panelVotaciones.add(lblPuntuacionFrancia2);
		 
		 lblPaisFrancia2 = new JLabel("");
		 lblPaisFrancia2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisFrancia2.setBounds(442, 265, 130, 32);
		 panelVotaciones.add(lblPaisFrancia2);
		 
		 lblCantanteFrancia2 = new JLabel("");
		 lblCantanteFrancia2.setBackground(new Color(128, 0, 128));
		 lblCantanteFrancia2.setBounds(582, 235, 76, 62);
		 panelVotaciones.add(lblCantanteFrancia2);
		 
		 lblPuntuacionFrancia3 = new JLabel("3º");
		 lblPuntuacionFrancia3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionFrancia3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionFrancia3.setBounds(402, 344, 30, 32);
		 panelVotaciones.add(lblPuntuacionFrancia3);
		 
		 lblPaisFrancia3 = new JLabel("");
		 lblPaisFrancia3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisFrancia3.setBounds(442, 344, 130, 32);
		 panelVotaciones.add(lblPaisFrancia3);
		 
		 lblCantanteFrancia3 = new JLabel("");
		 lblCantanteFrancia3.setBackground(new Color(128, 0, 128));
		 lblCantanteFrancia3.setBounds(582, 314, 76, 62);
		 panelVotaciones.add(lblCantanteFrancia3);
		 
		 lblPuntuacionItalia2 = new JLabel("2º");
		 lblPuntuacionItalia2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionItalia2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionItalia2.setBounds(402, 593, 30, 32);
		 panelVotaciones.add(lblPuntuacionItalia2);
		 
		 lblBanderaItalia = new JLabel("");
		 lblBanderaItalia.setBackground(new Color(128, 0, 128));
		 lblBanderaItalia.setBounds(402, 401, 117, 62);
		 panelVotaciones.add(lblBanderaItalia);
		 
		 lblItalia = new JLabel("Italia");
		 lblItalia.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblItalia.setBounds(529, 433, 129, 30);
		 panelVotaciones.add(lblItalia);
		 
		 lblPuntuacionItalia1 = new JLabel("1º");
		 lblPuntuacionItalia1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionItalia1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionItalia1.setBounds(402, 510, 30, 32);
		 panelVotaciones.add(lblPuntuacionItalia1);
		 
		 lblPaisItalia1 = new JLabel("");
		 lblPaisItalia1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisItalia1.setBounds(442, 510, 130, 32);
		 panelVotaciones.add(lblPaisItalia1);
		 
		 lblCantanteItalia1 = new JLabel("");
		 lblCantanteItalia1.setBackground(new Color(128, 0, 128));
		 lblCantanteItalia1.setBounds(582, 480, 76, 62);
		 panelVotaciones.add(lblCantanteItalia1);
		 
		 lblPaisItalia2 = new JLabel("");
		 lblPaisItalia2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisItalia2.setBounds(442, 593, 130, 32);
		 panelVotaciones.add(lblPaisItalia2);
		 
		 lblCantanteItalia2 = new JLabel("");
		 lblCantanteItalia2.setBackground(new Color(128, 0, 128));
		 lblCantanteItalia2.setBounds(582, 563, 76, 62);
		 panelVotaciones.add(lblCantanteItalia2);
		 
		 lblPaisItalia3 = new JLabel("");
		 lblPaisItalia3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisItalia3.setBounds(442, 672, 130, 32);
		 panelVotaciones.add(lblPaisItalia3);
		 
		 lblPuntuacionItalia3 = new JLabel("3º");
		 lblPuntuacionItalia3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionItalia3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionItalia3.setBounds(402, 672, 30, 32);
		 panelVotaciones.add(lblPuntuacionItalia3);
		 
		 lblCantanteItalia3 = new JLabel("");
		 lblCantanteItalia3.setBackground(new Color(128, 0, 128));
		 lblCantanteItalia3.setBounds(582, 642, 76, 62);
		 panelVotaciones.add(lblCantanteItalia3);
		 
		 lblBanderaPortugal = new JLabel("");
		 lblBanderaPortugal.setBackground(new Color(128, 0, 128));
		 lblBanderaPortugal.setBounds(758, 73, 117, 62);
		 panelVotaciones.add(lblBanderaPortugal);
		 
		 lblPortugal = new JLabel("Portugal");
		 lblPortugal.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblPortugal.setBounds(885, 105, 129, 30);
		 panelVotaciones.add(lblPortugal);
		 
		 lblPuntuacionPortugal1 = new JLabel("1º");
		 lblPuntuacionPortugal1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPortugal1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPortugal1.setBounds(758, 182, 30, 32);
		 panelVotaciones.add(lblPuntuacionPortugal1);
		 
		 lblPaisPortugal = new JLabel("");
		 lblPaisPortugal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPortugal.setBounds(798, 182, 130, 32);
		 panelVotaciones.add(lblPaisPortugal);
		 
		 lblCantantePortugal1 = new JLabel("");
		 lblCantantePortugal1.setBackground(new Color(128, 0, 128));
		 lblCantantePortugal1.setBounds(938, 152, 76, 62);
		 panelVotaciones.add(lblCantantePortugal1);
		 
		 lblPaisPortugal2 = new JLabel("");
		 lblPaisPortugal2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPortugal2.setBounds(798, 265, 130, 32);
		 panelVotaciones.add(lblPaisPortugal2);
		 
		 lblCantantePortugal2 = new JLabel("");
		 lblCantantePortugal2.setBackground(new Color(128, 0, 128));
		 lblCantantePortugal2.setBounds(938, 235, 76, 62);
		 panelVotaciones.add(lblCantantePortugal2);
		 
		 lblPuntuacionPortugal2 = new JLabel("2º");
		 lblPuntuacionPortugal2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPortugal2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPortugal2.setBounds(758, 265, 30, 32);
		 panelVotaciones.add(lblPuntuacionPortugal2);
		 
		 lblPuntuacionPortugal3 = new JLabel("3º");
		 lblPuntuacionPortugal3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPortugal3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPortugal3.setBounds(758, 344, 30, 32);
		 panelVotaciones.add(lblPuntuacionPortugal3);
		 
		 lblPaisPortugal3 = new JLabel("");
		 lblPaisPortugal3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPortugal3.setBounds(798, 344, 130, 32);
		 panelVotaciones.add(lblPaisPortugal3);
		 
		 lblCantantePortugal3 = new JLabel("");
		 lblCantantePortugal3.setBackground(new Color(128, 0, 128));
		 lblCantantePortugal3.setBounds(938, 314, 76, 62);
		 panelVotaciones.add(lblCantantePortugal3);
		 
		 panelVotaciones2 = new JPanel();
		 panelVotaciones2.setLayout(null);
		 panelVotaciones2.setBounds(0, 0, 1171, 845);
		 contentPane.add(panelVotaciones2);
		 
		 lblBanderaReinoUnido = new JLabel("");
		 lblBanderaReinoUnido.setBackground(new Color(128, 0, 128));
		 lblBanderaReinoUnido.setBounds(36, 73, 117, 62);
		 panelVotaciones2.add(lblBanderaReinoUnido);
		 
		 lblReinoUnido = new JLabel("Reino Unido");
		 lblReinoUnido.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblReinoUnido.setBounds(163, 105, 129, 30);
		 panelVotaciones2.add(lblReinoUnido);
		 
		 lblTitulo2 = new JLabel("Clasificación por países");
		 lblTitulo2.setFont(new Font("Tahoma", Font.BOLD, 25));
		 lblTitulo2.setBounds(383, 10, 308, 53);
		 panelVotaciones2.add(lblTitulo2);
		 
		 lblCantanteReinoUnido1 = new JLabel("");
		 lblCantanteReinoUnido1.setBackground(new Color(128, 0, 128));
		 lblCantanteReinoUnido1.setBounds(216, 152, 76, 62);
		 panelVotaciones2.add(lblCantanteReinoUnido1);
		 
		 lblPuntuacionReinoUnido1 = new JLabel("1º");
		 lblPuntuacionReinoUnido1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionReinoUnido1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionReinoUnido1.setBounds(36, 182, 30, 32);
		 panelVotaciones2.add(lblPuntuacionReinoUnido1);
		 
		 lblPuntuacionReinoUnido2 = new JLabel("2º");
		 lblPuntuacionReinoUnido2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionReinoUnido2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionReinoUnido2.setBounds(36, 265, 30, 32);
		 panelVotaciones2.add(lblPuntuacionReinoUnido2);
		 
		 lblPaisReinoUnido1 = new JLabel("");
		 lblPaisReinoUnido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisReinoUnido1.setBounds(76, 182, 130, 32);
		 panelVotaciones2.add(lblPaisReinoUnido1);
		 
		 lblPaisReinoUnido2 = new JLabel("");
		 lblPaisReinoUnido2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisReinoUnido2.setBounds(76, 265, 130, 32);
		 panelVotaciones2.add(lblPaisReinoUnido2);
		 
		 lblCantanteReinoUnido2 = new JLabel("");
		 lblCantanteReinoUnido2.setBackground(new Color(128, 0, 128));
		 lblCantanteReinoUnido2.setBounds(216, 235, 76, 62);
		 panelVotaciones2.add(lblCantanteReinoUnido2);
		 
		 lblPuntuacionReinoUnido3 = new JLabel("3º");
		 lblPuntuacionReinoUnido3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionReinoUnido3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionReinoUnido3.setBounds(36, 344, 30, 32);
		 panelVotaciones2.add(lblPuntuacionReinoUnido3);
		 
		 lblPaisReinoUnido3 = new JLabel("");
		 lblPaisReinoUnido3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisReinoUnido3.setBounds(76, 344, 130, 32);
		 panelVotaciones2.add(lblPaisReinoUnido3);
		 
		 lblCantanteReinoUnido3 = new JLabel("");
		 lblCantanteReinoUnido3.setBackground(new Color(128, 0, 128));
		 lblCantanteReinoUnido3.setBounds(216, 317, 76, 62);
		 panelVotaciones2.add(lblCantanteReinoUnido3);
		 
		 lblPuntuacionRumania3 = new JLabel("3º");
		 lblPuntuacionRumania3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionRumania3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionRumania3.setBounds(36, 672, 30, 32);
		 panelVotaciones2.add(lblPuntuacionRumania3);
		 
		 lblPaisRumania3 = new JLabel("");
		 lblPaisRumania3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisRumania3.setBounds(76, 672, 130, 32);
		 panelVotaciones2.add(lblPaisRumania3);
		 
		 lblCantanteRumania3 = new JLabel("");
		 lblCantanteRumania3.setBackground(new Color(128, 0, 128));
		 lblCantanteRumania3.setBounds(216, 645, 76, 62);
		 panelVotaciones2.add(lblCantanteRumania3);
		 
		 lblCantanteRumania2 = new JLabel("");
		 lblCantanteRumania2.setBackground(new Color(128, 0, 128));
		 lblCantanteRumania2.setBounds(216, 563, 76, 62);
		 panelVotaciones2.add(lblCantanteRumania2);
		 
		 lblPaisRumania2 = new JLabel("");
		 lblPaisRumania2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisRumania2.setBounds(76, 593, 130, 32);
		 panelVotaciones2.add(lblPaisRumania2);
		 
		 lblPuntuacionRumania2 = new JLabel("2º");
		 lblPuntuacionRumania2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionRumania2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionRumania2.setBounds(36, 593, 30, 32);
		 panelVotaciones2.add(lblPuntuacionRumania2);
		 
		 lblPuntuacionRumania1 = new JLabel("1º");
		 lblPuntuacionRumania1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionRumania1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionRumania1.setBounds(36, 510, 30, 32);
		 panelVotaciones2.add(lblPuntuacionRumania1);
		 
		 lblPaisRumania1 = new JLabel("");
		 lblPaisRumania1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisRumania1.setBounds(76, 510, 130, 32);
		 panelVotaciones2.add(lblPaisRumania1);
		 
		 lblCantanteRumania1 = new JLabel("");
		 lblCantanteRumania1.setBackground(new Color(128, 0, 128));
		 lblCantanteRumania1.setBounds(216, 480, 76, 62);
		 panelVotaciones2.add(lblCantanteRumania1);
		 
		 lblRumania = new JLabel("Rumania");
		 lblRumania.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblRumania.setBounds(163, 433, 123, 30);
		 panelVotaciones2.add(lblRumania);
		 
		 lblBanderaRumania = new JLabel("");
		 lblBanderaRumania.setBackground(new Color(128, 0, 128));
		 lblBanderaRumania.setBounds(36, 401, 117, 62);
		 panelVotaciones2.add(lblBanderaRumania);
		 
		 lblBanderaPolonia = new JLabel("");
		 lblBanderaPolonia.setBackground(new Color(128, 0, 128));
		 lblBanderaPolonia.setBounds(402, 73, 117, 62);
		 panelVotaciones2.add(lblBanderaPolonia);
		 
		 lblPolonia = new JLabel("Polonia");
		 lblPolonia.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblPolonia.setBounds(529, 105, 129, 30);
		 panelVotaciones2.add(lblPolonia);
		 
		 lblPuntuacionPolonia1 = new JLabel("1º");
		 lblPuntuacionPolonia1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPolonia1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPolonia1.setBounds(402, 182, 30, 32);
		 panelVotaciones2.add(lblPuntuacionPolonia1);
		 
		 lblPaisPolonia1 = new JLabel("");
		 lblPaisPolonia1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPolonia1.setBounds(442, 182, 130, 32);
		 panelVotaciones2.add(lblPaisPolonia1);
		 
		 lblCantantePolonia1 = new JLabel("");
		 lblCantantePolonia1.setBackground(new Color(128, 0, 128));
		 lblCantantePolonia1.setBounds(582, 152, 76, 62);
		 panelVotaciones2.add(lblCantantePolonia1);
		 
		 lblPuntuacionPolonia2 = new JLabel("2º");
		 lblPuntuacionPolonia2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPolonia2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPolonia2.setBounds(402, 265, 30, 32);
		 panelVotaciones2.add(lblPuntuacionPolonia2);
		 
		 lblPaisPolonia2 = new JLabel("");
		 lblPaisPolonia2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPolonia2.setBounds(442, 265, 130, 32);
		 panelVotaciones2.add(lblPaisPolonia2);
		 
		 lblCantantePolonia2 = new JLabel("");
		 lblCantantePolonia2.setBackground(new Color(128, 0, 128));
		 lblCantantePolonia2.setBounds(582, 235, 76, 62);
		 panelVotaciones2.add(lblCantantePolonia2);
		 
		 lblPuntuacionPolonia3 = new JLabel("3º");
		 lblPuntuacionPolonia3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPolonia3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPolonia3.setBounds(402, 344, 30, 32);
		 panelVotaciones2.add(lblPuntuacionPolonia3);
		 
		 lblPaisPolonia3 = new JLabel("");
		 lblPaisPolonia3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPolonia3.setBounds(442, 344, 130, 32);
		 panelVotaciones2.add(lblPaisPolonia3);
		 
		 lblCantantePolonia3 = new JLabel("");
		 lblCantantePolonia3.setBackground(new Color(128, 0, 128));
		 lblCantantePolonia3.setBounds(582, 314, 76, 62);
		 panelVotaciones2.add(lblCantantePolonia3);
		 
		 lblPuntuacionGrecia2 = new JLabel("2º");
		 lblPuntuacionGrecia2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionGrecia2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionGrecia2.setBounds(402, 593, 30, 32);
		 panelVotaciones2.add(lblPuntuacionGrecia2);
		 
		 lblBanderaGrecia = new JLabel("");
		 lblBanderaGrecia.setBackground(new Color(128, 0, 128));
		 lblBanderaGrecia.setBounds(402, 401, 117, 62);
		 panelVotaciones2.add(lblBanderaGrecia);
		 
		 lblGrecia = new JLabel("Grecia");
		 lblGrecia.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblGrecia.setBounds(529, 433, 129, 30);
		 panelVotaciones2.add(lblGrecia);
		 
		 lblPuntuacionGrecia1 = new JLabel("1º");
		 lblPuntuacionGrecia1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionGrecia1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionGrecia1.setBounds(402, 510, 30, 32);
		 panelVotaciones2.add(lblPuntuacionGrecia1);
		 
		 lblPaisGrecia1 = new JLabel("");
		 lblPaisGrecia1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisGrecia1.setBounds(442, 510, 130, 32);
		 panelVotaciones2.add(lblPaisGrecia1);
		 
		 lblCantanteGrecia1 = new JLabel("");
		 lblCantanteGrecia1.setBackground(new Color(128, 0, 128));
		 lblCantanteGrecia1.setBounds(582, 480, 76, 62);
		 panelVotaciones2.add(lblCantanteGrecia1);
		 
		 lblPaisGrecia2 = new JLabel("");
		 lblPaisGrecia2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisGrecia2.setBounds(442, 593, 130, 32);
		 panelVotaciones2.add(lblPaisGrecia2);
		 
		 lblCantanteGrecia2 = new JLabel("");
		 lblCantanteGrecia2.setBackground(new Color(128, 0, 128));
		 lblCantanteGrecia2.setBounds(582, 563, 76, 62);
		 panelVotaciones2.add(lblCantanteGrecia2);
		 
		 lblPaisGrecia3 = new JLabel("");
		 lblPaisGrecia3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisGrecia3.setBounds(442, 672, 130, 32);
		 panelVotaciones2.add(lblPaisGrecia3);
		 
		 lblPuntuacionGrecia3 = new JLabel("3º");
		 lblPuntuacionGrecia3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionGrecia3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionGrecia3.setBounds(402, 672, 30, 32);
		 panelVotaciones2.add(lblPuntuacionGrecia3);
		 
		 lblCantanteGrecia3 = new JLabel("");
		 lblCantanteGrecia3.setBackground(new Color(128, 0, 128));
		 lblCantanteGrecia3.setBounds(582, 642, 76, 62);
		 panelVotaciones2.add(lblCantanteGrecia3);
		 
		 lblBanderaPaisesBajos = new JLabel("");
		 lblBanderaPaisesBajos.setBackground(new Color(128, 0, 128));
		 lblBanderaPaisesBajos.setBounds(758, 73, 117, 62);
		 panelVotaciones2.add(lblBanderaPaisesBajos);
		 
		 lblPasesBajos = new JLabel("Países Bajos");
		 lblPasesBajos.setFont(new Font("Tahoma", Font.BOLD, 20));
		 lblPasesBajos.setBounds(885, 105, 129, 30);
		 panelVotaciones2.add(lblPasesBajos);
		 
		 lblPuntuacionPaisesBajos1 = new JLabel("1º");
		 lblPuntuacionPaisesBajos1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPaisesBajos1.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPaisesBajos1.setBounds(758, 182, 30, 32);
		 panelVotaciones2.add(lblPuntuacionPaisesBajos1);
		 
		 lblPaisPaisesBajos1 = new JLabel("");
		 lblPaisPaisesBajos1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPaisesBajos1.setBounds(798, 182, 130, 32);
		 panelVotaciones2.add(lblPaisPaisesBajos1);
		 
		 lblCantantePaisesBajos1 = new JLabel("");
		 lblCantantePaisesBajos1.setBackground(new Color(128, 0, 128));
		 lblCantantePaisesBajos1.setBounds(938, 152, 76, 62);
		 panelVotaciones2.add(lblCantantePaisesBajos1);
		 
		 lblPaisPaisesBajos2 = new JLabel("");
		 lblPaisPaisesBajos2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPaisesBajos2.setBounds(798, 265, 130, 32);
		 panelVotaciones2.add(lblPaisPaisesBajos2);
		 
		 lblCantantePaisesBajos2 = new JLabel("");
		 lblCantantePaisesBajos2.setBackground(new Color(128, 0, 128));
		 lblCantantePaisesBajos2.setBounds(938, 235, 76, 62);
		 panelVotaciones2.add(lblCantantePaisesBajos2);
		 
		 lblPuntuacionPaisesBajos2 = new JLabel("2º");
		 lblPuntuacionPaisesBajos2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPaisesBajos2.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPaisesBajos2.setBounds(758, 265, 30, 32);
		 panelVotaciones2.add(lblPuntuacionPaisesBajos2);
		 
		 lblPuntuacionPaisesBajos3 = new JLabel("3º");
		 lblPuntuacionPaisesBajos3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 lblPuntuacionPaisesBajos3.setBackground(new Color(128, 0, 128));
		 lblPuntuacionPaisesBajos3.setBounds(758, 344, 30, 32);
		 panelVotaciones2.add(lblPuntuacionPaisesBajos3);
		 
		 lblPaisPaisesBajos3 = new JLabel("");
		 lblPaisPaisesBajos3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblPaisPaisesBajos3.setBounds(798, 344, 130, 32);
		 panelVotaciones2.add(lblPaisPaisesBajos3);
		 
		 lblCantantePaisesBajos3 = new JLabel("");
		 lblCantantePaisesBajos3.setBackground(new Color(128, 0, 128));
		 lblCantantePaisesBajos3.setBounds(938, 314, 76, 62);
		 panelVotaciones2.add(lblCantantePaisesBajos3);
		 
		 panelInicial = new JPanel();
		 panelInicial.setBounds(0, 0, 1171, 845);
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
