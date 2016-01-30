package face;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ManterEmprestimo;

public class JanelaRegistrarEmprestimo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2152232857753882448L;
	private JPanel contentPane;
	private ManterEmprestimo ctrlE;
	private JLabel lblUsurio;
	private JComboBox cbUsuario;
	private JButton btnOk;
	private JLabel lblObra;
	private JComboBox cbObra;
	private JLabel lblDataEmprestimo;
	private JTextField tfDataEmp;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	public void limpar(){
		tfDataEmp.setText("");
	}
	
	public JanelaRegistrarEmprestimo(ManterEmprestimo ctrlE) {
		this.ctrlE = ctrlE;
		setTitle("Registrar Empr\u00E9stimo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsurio());
		contentPane.add(getCbUsuario());
		contentPane.add(getBtnOk());
		contentPane.add(getLblObra());
		contentPane.add(getCbObra());
		contentPane.add(getLblDataEmprestimo());
		contentPane.add(getTfDataEmp());
	}
	private JLabel getLblUsurio() {
		if (lblUsurio == null) {
			lblUsurio = new JLabel("Usu\u00E1rio:");
			lblUsurio.setBounds(10, 11, 46, 14);
		}
		return lblUsurio;
	}
	private JComboBox getCbUsuario() {
		if (cbUsuario == null) {
			cbUsuario = new JComboBox(this.ctrlE.preencherBoxUsuario());
			cbUsuario.setBounds(72, 8, 280, 20);
		}
		return cbUsuario;
	}
	private JButton getBtnOk() {
		if (btnOk == null) {
			btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int posU = cbUsuario.getSelectedIndex();
					int posO = cbObra.getSelectedIndex();
					String dataE = tfDataEmp.getText();
					ctrlE.inserirEmprestimo(posU,posO,dataE);
				}
			});
			btnOk.setBounds(263, 91, 89, 23);
		}
		return btnOk;
	}
	private JLabel getLblObra() {
		if (lblObra == null) {
			lblObra = new JLabel("Obra: ");
			lblObra.setBounds(10, 39, 46, 14);
		}
		return lblObra;
	}
	private JComboBox getCbObra() {
		if (cbObra == null) {
			cbObra = new JComboBox(this.ctrlE.preencherBoxObra());
			cbObra.setBounds(70, 39, 282, 20);
		}
		return cbObra;
	}
	private JLabel getLblDataEmprestimo() {
		if (lblDataEmprestimo == null) {
			lblDataEmprestimo = new JLabel("Data Emprestimo:");
			lblDataEmprestimo.setBounds(10, 73, 104, 14);
		}
		return lblDataEmprestimo;
	}
	private JTextField getTfDataEmp() {
		if (tfDataEmp == null) {
			tfDataEmp = new JTextField();
			tfDataEmp.setBounds(124, 70, 127, 20);
			tfDataEmp.setColumns(10);
		}
		return tfDataEmp;
	}
	
}
