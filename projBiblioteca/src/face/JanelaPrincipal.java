package face;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.Programa;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btUsuario;
	private JButton btObra;
	private JButton btEmprestimo;
	private Programa ctrl;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public JanelaPrincipal(Programa ctrl) {
		this.ctrl = ctrl;
		setTitle("Biblioteca Saraiva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtUsuario());
		contentPane.add(getBtObra());
		contentPane.add(getBtEmprestimo());
	}
	private JButton getBtUsuario() {
		if (btUsuario == null) {
			btUsuario = new JButton("Cadastrar Usuario");
			btUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				      ctrl.iniciarCadastroUsuario();
				
				}
			});
			btUsuario.setBounds(10, 11, 159, 23);
		}
		return btUsuario;
	}
	private JButton getBtObra() {
		if (btObra == null) {
			btObra = new JButton("Cadastrar Obra");
			btObra.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ctrl.iniciarCadastroObra();
				}
			});
			btObra.setBounds(10, 45, 159, 23);
		}
		return btObra;
	}
	private JButton getBtEmprestimo() {
		if (btEmprestimo == null) {
			btEmprestimo = new JButton("Registrar Emprestimo");
			btEmprestimo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ctrl.iniciarRegistroEmprestimo();
				}
			});
			btEmprestimo.setBounds(10, 79, 159, 23);
		}
		return btEmprestimo;
	}
}
