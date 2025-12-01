import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaProdutos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNomeStorage;
	private JTextField tfNomePortador;
	private JTextField tfCpf;
	private JTextField txtR;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProdutos frame = new TelaProdutos();
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
	public TelaProdutos() {
		setTitle("TelaDeVenda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Storage:");
		lblNewLabel.setBounds(58, 168, 120, 14);
		contentPane.add(lblNewLabel);
		
		tfNomeStorage = new JTextField();
		tfNomeStorage.setBounds(147, 165, 259, 20);
		contentPane.add(tfNomeStorage);
		tfNomeStorage.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Itens que contem em seu storage:");
		lblNewLabel_1.setBounds(58, 207, 199, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxUtencilios = new JCheckBox("Utencilios Domesticos");
		chckbxUtencilios.setBounds(251, 203, 159, 23);
		contentPane.add(chckbxUtencilios);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Do Portador Do Storage:");
		lblNewLabel_2.setBounds(58, 143, 199, 14);
		contentPane.add(lblNewLabel_2);
		
		tfNomePortador = new JTextField();
		tfNomePortador.setBounds(240, 140, 193, 20);
		contentPane.add(tfNomePortador);
		tfNomePortador.setColumns(10);
		
		JCheckBox chckbxEletronicos = new JCheckBox("Eletronicos");
		chckbxEletronicos.setBounds(428, 203, 97, 23);
		contentPane.add(chckbxEletronicos);
		
		JCheckBox chckbxDiversos = new JCheckBox("ItensDiversos");
		chckbxDiversos.setBounds(563, 203, 139, 23);
		contentPane.add(chckbxDiversos);
		
		JLabel lblNewLabel_3 = new JLabel("Digite Seu Cpf:");
		lblNewLabel_3.setBounds(58, 247, 97, 14);
		contentPane.add(lblNewLabel_3);
		
		tfCpf = new JTextField();
		tfCpf.setBounds(165, 244, 165, 20);
		contentPane.add(tfCpf);
		tfCpf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Venda Storagens");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.ITALIC, 45));
		lblNewLabel_4.setBounds(177, 40, 336, 61);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("De onde vem o Storagem:");
		lblNewLabel_5.setBounds(58, 299, 170, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnAmerica = new JRadioButton("America");
		rdbtnAmerica.setBounds(272, 295, 109, 23);
		contentPane.add(rdbtnAmerica);
		
		JRadioButton rdbtnEuropa = new JRadioButton("Europa");
		rdbtnEuropa.setBounds(416, 295, 109, 23);
		contentPane.add(rdbtnEuropa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Pequeno (1m²)", "Médio (3m²)", "Grande (5m²)", "Extra Grande (10m²)"}));
		comboBox.setBounds(221, 347, 132, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_6 = new JLabel("Tamanho Do Storagem:");
		lblNewLabel_6.setBounds(58, 351, 153, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Periodo Da Compra:");
		lblNewLabel_7.setBounds(58, 403, 135, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "1 mês", " 3 meses", "6 meses", "1 ano", "Definitivo"}));
		comboBox_1.setBounds(223, 398, 132, 22);
		contentPane.add(comboBox_1);
		
		txtR = new JTextField();
		txtR.setText("R$");
		txtR.setBounds(515, 481, 139, 35);
		contentPane.add(txtR);
		txtR.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Preço do Storagem");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(498, 456, 165, 20);
		contentPane.add(lblNewLabel_8);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new TelaCompras().setVisible(true);
			        dispose();  
			}
		});
		btnVoltar.setBounds(609, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomeStorage = tfNomeStorage.getText();
		        String nomePortador = tfNomePortador.getText();
		        String cpf = tfCpf.getText();

		        String itens = "";
		        if (chckbxUtencilios.isSelected()) itens += "Utensílios ";
		        if (chckbxEletronicos.isSelected()) itens += "Eletrônicos ";
		        if (chckbxDiversos.isSelected()) itens += "Diversos ";

		        String origem = "";
		        if (rdbtnAmerica.isSelected()) origem = "América";
		        if (rdbtnEuropa.isSelected()) origem = "Europa";

		        String tamanho = comboBox.getSelectedItem().toString();
		        String periodo = comboBox_1.getSelectedItem().toString();
		        String preco = txtR.getText();
		        
		        TelaVendas tela = new TelaVendas();
		        tela.setVisible(true);
		        
		        tela.adicionarLinha(new Object[]{
		                nomeStorage,
		                nomePortador,
		                cpf,
		                itens,
		                origem,
		                tamanho,
		                periodo,
		                preco
		        });

		        dispose();
			}
		});
		btnCadastrar.setBounds(251, 487, 89, 23);
		contentPane.add(btnCadastrar);

	}
}
