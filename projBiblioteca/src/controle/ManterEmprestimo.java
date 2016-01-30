package controle;

import javax.swing.JOptionPane;

import dominio.Emprestimo;
import dominio.Obra;
import dominio.Usuario;
import face.JanelaRegistrarEmprestimo;

public class ManterEmprestimo {
	
	private Programa ctrl;
	private JanelaRegistrarEmprestimo janelaE;
	
	private Emprestimo[] vetEmprestimos = new Emprestimo[100];
	private static int ultimaPosicao = 0;
	
	public ManterEmprestimo(Programa ctrl){
		this.ctrl = ctrl;
	}
	
	 public void iniciarRegistroEmprestimo(){
		  this.janelaE = new JanelaRegistrarEmprestimo(this);
			this.janelaE.setVisible(true);
	 }
	 
	 public String[] preencherBoxUsuario(){
		 return this.ctrl.preencherBoxUsuario();
	 }
	 
	 public String[] preencherBoxObra(){
		 return this.ctrl.preencherBoxObra();
	 }
	 
	 public void inserirEmprestimo(int posU,int posO, String dataE){
		 Usuario usu = this.ctrl.buscarUsuario(posU);
		 Obra obr = this.ctrl.buscarObra(posO);
		 Emprestimo novo  = new Emprestimo(dataE,null,usu,obr);
		 this.vetEmprestimos[this.ultimaPosicao++] = novo;
		 
		 int op = JOptionPane.showConfirmDialog(null, "Empréstimo registrado com sucesso! Deseja registrar outro empréstimo?", null, JOptionPane.YES_NO_OPTION);
		 if (op == JOptionPane.NO_OPTION)
			 this.janelaE.dispose();
		 else
			 this.janelaE.limpar();
		 
		 
	 }
	 

}
