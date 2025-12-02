import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
			
		tableModel = new DefaultTableModel(colunas, 0) {
		    @Override
		    public boolean isCellEditable(int row, int column) {//isCellEditable ele faz que sua tabela não seja editavel com isso travando o usuario(se for true vc consegue edital e for
		    													// false vc não consegue editar).
		        return false; // trava todas as células
		    }
		};
        table.setModel(tableModel);
        
        JButton btnComprar = new JButton("Comprar");
        btnComprar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int linha = table.getSelectedRow();
        		
        		if (linha == -1) {
                    JOptionPane.showMessageDialog(null,
                        "Selecione um storage antes de comprar.");
                    
                    return; // sai do método, Ele simplesmente não roda nada que está abaixo dele.
        		}
        		
                String nomeStorage = table.getValueAt(linha, 0).toString();
             // pega a linha selecionada
                
                javax.swing.JOptionPane.showMessageDialog(null,
                    "Você comprou o storage: " + nomeStorage);
            }
        });
        btnComprar.setBounds(395, 473, 89, 23);
        contentPane.add(btnComprar);
        
        //carrega os dados da lista
        //Isso preenche a tabela com tudo que estava guardado na lista estática.
        for (Object[] linha : ListaStoragem.lista) {
            tableModel.addRow(linha);
        }
    }

    public void adicionarLinha(Object[] dados) {
        tableModel.addRow(dados);

	}
}
