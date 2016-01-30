package controle;

import javax.swing.JOptionPane;

import dominio.Obra;
import dominio.Usuario;
import face.JanelaCadastrarObra;

public class ManterObra {
	
	private Programa ctrl;
	private JanelaCadastrarObra janelaO;
	
	private Obra[] vetObras = new Obra[100];
	private static int ultimaPosicao = 0;
	
	public ManterObra(Programa ctrl){
		this.ctrl = ctrl;
	}
	
	 public void iniciarCadastroObra(){
		  this.janelaO = new JanelaCadastrarObra(this);
			this.janelaO.setVisible(true);
	 }
	 
	 public void inserirObra(String titulo, String autor, int ano){
		 Obra nova = new Obra(titulo,autor,ano);
		 this.vetObras[this.ultimaPosicao++] = nova;
		 int op = JOptionPane.showConfirmDialog(null, "Obra cadastrada com sucesso! Deseja inserir outra obra?", null, JOptionPane.YES_NO_OPTION);
		 if (op == JOptionPane.NO_OPTION)
			 this.janelaO.dispose();
		 else
			 this.janelaO.limpar();
	 }
	 
	 public String[] preencherBoxObra(){
		 String[] listaObras = new String[this.ultimaPosicao];
		 
		 for (int i=0;i<this.ultimaPosicao;i++)
			 listaObras[i] = vetObras[i].getTitulo();
		 
		 return  listaObras;
	 }
	 
	 public Obra buscarObra(int pos){
		 return vetObras[pos];
	 }

}
