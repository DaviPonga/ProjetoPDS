import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVendas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTable table;
	private DefaultTableModel tableModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
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
	public TelaVendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Compra De Storagens");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 41));
		lblNewLabel.setBounds(199, 43, 384, 43);
		contentPane.add(lblNewLabel);
		
		JButton btnVoltar1 = new JButton("Voltar");
		btnVoltar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new TelaCompras().setVisible(true);
			        dispose();  
			}
		});
		btnVoltar1.setBounds(765, 11, 89, 23);
		contentPane.add(btnVoltar1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 97, 788, 376);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		String[] colunas = {
				"Nome Storage",
				"Portador",
				"CPF",
				"Itens",
				"Origem",
				"Tamanho",
				"Período",
				"Preço"
			};
			
		tableModel = new DefaultTableModel(colunas, 0);
        table.setModel(tableModel);
        
        JButton btnComprar = new JButton("Comprar");
        btnComprar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		// pega a linha selecionada
        		
        		int linha = table.getSelectedRow();

                String nomeStorage = table.getValueAt(linha, 0).toString();

                javax.swing.JOptionPane.showMessageDialog(null,
                    "Você comprou o storage: " + nomeStorage);
            }
        });
        btnComprar.setBounds(395, 473, 89, 23);
        contentPane.add(btnComprar);
        
        //carrega os dados da lista
        for (Object[] linha : ListaStoragem.lista) {
            tableModel.addRow(linha);
        }
    }

    public void adicionarLinha(Object[] dados) {
        tableModel.addRow(dados);

	}
}
