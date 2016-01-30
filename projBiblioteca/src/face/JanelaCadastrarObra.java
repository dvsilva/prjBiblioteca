package face;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ManterObra;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastrarObra extends JFrame {

	private JPanel contentPane;
	private ManterObra ctrlO;
	private JLabel lblAutor;
	private JLabel lblTtulo;
	private JLabel lblAnoPublicao;
	private JTextField tfAutor;
	private JTextField tfTitulo;
	private JTextField tfAno;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	public void limpar(){
		tfAutor.setText("");
		tfTitulo.setText("");
		tfAno.setText("");
	}
	
	public JanelaCadastrarObra(ManterObra ctrlO) {
		this.ctrlO = ctrlO;
		setTitle("Cadastro de Obra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblAutor());
		contentPane.add(getLblTtulo());
		contentPane.add(getLblAnoPublicao());
		contentPane.add(getTfAutor());
		contentPane.add(getTfTitulo());
		contentPane.add(getTfAno());
		contentPane.add(getBtnOk());
	}
	private JLabel getLblAutor() {
		if (lblAutor == null) {
			lblAutor = new JLabel("Autor:");
			lblAutor.setBounds(10, 11, 46, 14);
		}
		return lblAutor;
	}
	private JLabel getLblTtulo() {
		if (lblTtulo == null) {
			lblTtulo = new JLabel("T\u00EDtulo:");
			lblTtulo.setBounds(10, 52, 46, 14);
		}
		return lblTtulo;
	}
	private JLabel getLblAnoPublicao() {
		if (lblAnoPublicao == null) {
			lblAnoPublicao = new JLabel("Ano Publica\u00E7\u00E3o: ");
			lblAnoPublicao.setBounds(10, 95, 103, 14);
		}
		return lblAnoPublicao;
	}
	private JTextField getTfAutor() {
		if (tfAutor == null) {
			tfAutor = new JTextField();
			tfAutor.setBounds(51, 8, 256, 20);
			tfAutor.setColumns(10);
		}
		return tfAutor;
	}
	private JTextField getTfTitulo() {
		if (tfTitulo == null) {
			tfTitulo = new JTextField();
			tfTitulo.setBounds(51, 49, 256, 20);
			tfTitulo.setColumns(10);
		}
		return tfTitulo;
	}
	private JTextField getTfAno() {
		if (tfAno == null) {
			tfAno = new JTextField();
			tfAno.setBounds(96, 92, 86, 20);
			tfAno.setColumns(10);
		}
		return tfAno;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String autor = tfAutor.getText();
					String titulo = tfTitulo.getText();
					int ano = Integer.parseInt(tfAno.getText());
					ctrlO.inserirObra(titulo,autor,ano);
				}
			});
			btnOk.setBounds(207, 123, 89, 23);
		}
		return btnOk;
	}
}
