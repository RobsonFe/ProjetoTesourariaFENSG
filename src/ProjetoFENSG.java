import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

@SuppressWarnings("serial")
public class ProjetoFENSG extends JFrame {

	private JPanel contentPane;
	private JTextField txtDiasAtraso;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjetoFENSG frame = new ProjetoFENSG();
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
	public ProjetoFENSG() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProjetoFENSG.class.getResource("/icons/upe-universidade-de-pernambuco-logo-22AD28A03D-seeklogo.com.png")));
		setTitle("FENSG - UPE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnOVencimentoDas = new JTextPane();
		txtpnOVencimentoDas.setEditable(false);
		txtpnOVencimentoDas.setFont(new Font("SansSerif", Font.BOLD, 15));
		txtpnOVencimentoDas.setText("O vencimento das mensalidades será todo o dia 10 de cada mês. Após o vencimento: multa de 2% e juros de 0,02 por dia de atraso.");
		txtpnOVencimentoDas.setBounds(10, 18, 350, 76);
		contentPane.add(txtpnOVencimentoDas);
		
		JLabel lblNewLabel = new JLabel("QUANTOS DIAS DE ATRASO ?");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel.setBounds(20, 105, 190, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VALOR TOTAL A PAGAR");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(20, 152, 190, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDiasAtraso = new JTextField();
		txtDiasAtraso.setBounds(233, 108, 36, 20);
		contentPane.add(txtDiasAtraso);
		txtDiasAtraso.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double divida = 390;
				double multa = 7.80;
				int DiasAtraso = Integer.parseInt(txtDiasAtraso.getText());
				
				if (DiasAtraso > 0) {
			         double juros = (divida * 0.02) * DiasAtraso;
			         divida += juros + multa;
			      }
				txtTotal.setText(String.valueOf(String.format("%.2f", divida)));


				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton.setBounds(301, 216, 100, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnLimpar.setBackground(new Color(192, 192, 192));
		btnLimpar.setBounds(47, 216, 89, 23);
		contentPane.add(btnLimpar);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(233, 150, 48, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			} // Linkando a classe sobre a Classe Projeto.
		});
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Sobre");
		btnNewButton_2.setIcon(new ImageIcon(ProjetoFENSG.class.getResource("/icons/About.png")));
		btnNewButton_2.setBounds(370, 18, 48, 48);
		contentPane.add(btnNewButton_2);
		
		RestrictedTextField validar = new RestrictedTextField(txtDiasAtraso);
		validar.setOnlyNums(true);
	} // fim do construtor
	
	private void limpar() {
		txtDiasAtraso.setText(null);
		txtTotal.setText(null);
	} //Metodo para limpar caixa de texto.
}
