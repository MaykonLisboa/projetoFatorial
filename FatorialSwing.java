package projetoFatorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FatorialSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FatorialSwing frame = new FatorialSwing();
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
	public FatorialSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFormula = new JLabel("");
		lblFormula.setForeground(new Color(0, 0, 255));
		lblFormula.setFont(new Font("Arial", Font.BOLD, 12));
		lblFormula.setBounds(70, 122, 196, 29);
		contentPane.add(lblFormula);
		
		JLabel lblResultado = new JLabel("0");
		lblResultado.setForeground(new Color(255, 0, 0));
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultado.setBounds(347, 122, 104, 23);
		contentPane.add(lblResultado);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(109, 65, 49, 32);
		contentPane.add(txtNum);
		
		JButton btnFatorial = new JButton("!");
		btnFatorial.setForeground(new Color(255, 0, 0));
		btnFatorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getValue().toString());
				Controles f = new Controles();
				f.setValor(n);
				lblFormula.setText(f.getFormula());
				lblResultado.setText(Integer.toString(f.getFatorial()));
			
			}
		});
		btnFatorial.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFatorial.setBounds(168, 69, 49, 23);
		contentPane.add(btnFatorial);
		
		JLabel lblNewLabel = new JLabel("Resultado:");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(266, 126, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Calculador de Fatorial");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(54, 11, 297, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Formula :");
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 126, 63, 19);
		contentPane.add(lblNewLabel_2);
	}
}
