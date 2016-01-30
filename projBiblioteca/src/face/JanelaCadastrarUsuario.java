package face;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ManterUsuario;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastrarUsuario extends JFrame {

	private JPanel contentPane;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblTelefone;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfTelefone;
	private JButton btnOk;
	private ManterUsuario ctrlU;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	
	public void limpar(){
		tfNome.setText("");
		tfCPF.setText("");
		tfTelefone.setText("");
	}
	
	public JanelaCadastrarUsuario(ManterUsuario ctrlU) {
		this.ctrlU = ctrlU;
		setTitle("Cadastro de Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNome());
		contentPane.add(getLblCpf());
		contentPane.add(getLblTelefone());
		contentPane.add(getTfNome());
		contentPane.add(getTfCPF());
		contentPane.add(getTfTelefone());
		contentPane.add(getBtnOk());
	}
	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome: ");
			lblNome.setBounds(10, 11, 46, 14);
		}
		return lblNome;
	}
	private JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("CPF:");
			lblCpf.setBounds(10, 48, 46, 14);
		}
		return lblCpf;
	}
	private JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone:");
			lblTelefone.setBounds(10, 90, 46, 14);
		}
		return lblTelefone;
	}
	private JTextField getTfNome() {
		if (tfNome == null) {
			tfNome = new JTextField();
			tfNome.setBounds(48, 8, 209, 20);
			tfNome.setColumns(10);
		}
		return tfNome;
	}
	private JTextField getTfCPF() {
		if (tfCPF == null) {
			tfCPF = new JTextField();
			tfCPF.setBounds(48, 45, 104, 20);
			tfCPF.setColumns(10);
		}
		return tfCPF;
	}
	private JTextField getTfTelefone() {
		if (tfTelefone == null) {
			tfTelefone = new JTextField();
			tfTelefone.setBounds(66, 87, 125, 20);
			tfTelefone.setColumns(10);
		}
		return tfTelefone;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nome = tfNome.getText();
					String cpf = tfCPF.getText();
					long tel = Long.parseLong(tfTelefone.getText());
					ctrlU.inserirUsuario(nome, cpf, tel);
				}
			});
			btnOk.setBounds(184, 116, 89, 23);
		}
		return btnOk;
	}
}
