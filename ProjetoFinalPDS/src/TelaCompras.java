import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCompras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCompras frame = new TelaCompras();
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
	public TelaCompras() {
		setTitle("TelaDeVendasCompraListar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vender Storage:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(135, 202, 105, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaProdutos().setVisible(true);
	            dispose();
			}
		});
		btnVender.setBounds(328, 203, 89, 23);
		contentPane.add(btnVender);
		
		
		JLabel lblNewLabel_1 = new JLabel("Comprar Storage:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(124, 294, 113, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaVendas().setVisible(true);
	            dispose();
			}
		});
		btnComprar.setBounds(328, 295, 89, 23);
		contentPane.add(btnComprar);
		
		JLabel lblNewLabel_3 = new JLabel("Escolha a opção que deseja Realizar:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 39));
		lblNewLabel_3.setBounds(42, 88, 603, 73);
		contentPane.add(lblNewLabel_3);

	}
}
