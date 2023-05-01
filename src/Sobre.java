import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		getContentPane().setForeground(SystemColor.control);
		getContentPane().setBackground(SystemColor.control);
		setResizable(false);
		setTitle("FENSG - UPE");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/icons/upe-universidade-de-pernambuco-logo-22AD28A03D-seeklogo.com.png")));
		getContentPane().setFont(new Font("SansSerif", Font.BOLD, 11));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULADOR DE MULTA - VERSÃO 1.0");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 276, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dev. Robson Ferreira");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(30, 120, 179, 27);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contato: ");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 158, 276, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/RobsonFe");
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setForeground(SystemColor.control);
		btnGitHub.setToolTipText("GitHub");
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/icons/Github.png")));
		btnGitHub.setBounds(316, 158, 48, 48);
		getContentPane().add(btnGitHub);
		
		JLabel lblNewLabel_3 = new JLabel("Ger. Vera Vasconcelos");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(30, 78, 207, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Equipe de TI - FENSG");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_4.setBounds(20, 53, 266, 14);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tec. André Conceição");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(30, 103, 207, 14);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ti.fensg@upe.br");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(31, 183, 154, 14);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("robson-ferreiradasilva@hotmail.com");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(30, 203, 207, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblFENSG = new JLabel("http://www.upe.br/fensg");
		lblFENSG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("http://www.upe.br/fensg/");
			}
		});
		lblFENSG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFENSG.setForeground(SystemColor.textHighlight);
		lblFENSG.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblFENSG.setBounds(30, 228, 197, 14);
		getContentPane().add(lblFENSG);

	} // Fim do construtor 
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try{
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch (Exception e) {
			System.out.println(e);
		}
	}// Metodo para habilitar abertura de sites no Java.

}
