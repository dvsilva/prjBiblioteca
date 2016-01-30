package controle;

import javax.swing.JOptionPane;

import dominio.Usuario;
import face.JanelaCadastrarUsuario;

public class ManterUsuario {
	
	private Programa ctrl;
	private JanelaCadastrarUsuario janelaU;
	
	private Usuario[] vetUsuarios = new Usuario[100];
	private static int ultimaPosicao = 0;

	public ManterUsuario(Programa ctrl){
		this.ctrl = ctrl;
	}
	
	 public void iniciarCadastroUsuario(){
		  this.janelaU = new JanelaCadastrarUsuario(this);
			this.janelaU.setVisible(true);
	 }
	 
	 public void inserirUsuario(String nome, String cpf, long tel){
		 Usuario novo = new Usuario(nome,cpf,tel);
		 this.vetUsuarios[this.ultimaPosicao++] = novo;
		 int op = JOptionPane.showConfirmDialog(null, "Usuário cadastrado com sucesso! Deseja inserir outro usuário?", null, JOptionPane.YES_NO_OPTION);
		 if (op == JOptionPane.NO_OPTION)
			 this.janelaU.dispose();
		 else
			 this.janelaU.limpar();
	 }
	 
	 public String[] preencherBoxUsuario(){
		 String[] listaUsuarios = new String[this.ultimaPosicao];
		 
		 for (int i=0;i<this.ultimaPosicao;i++)
			 listaUsuarios[i] = vetUsuarios[i].getNome();
		 
		 return  listaUsuarios;
	 }
	 
	 public Usuario buscarUsuario(int pos){
		 return vetUsuarios[pos];
	 }
}
