package controle;

import dominio.Obra;
import dominio.Usuario;
import face.JanelaPrincipal;

public class Programa {
	
	private ManterUsuario ctrlMU;
	private ManterObra ctrlMO;
	private ManterEmprestimo ctrlME;

	public Programa(){
		JanelaPrincipal janelaP = new JanelaPrincipal(this);
		janelaP.setVisible(true);
		 this.ctrlMU = new ManterUsuario(this);
		 this.ctrlMO = new ManterObra(this);
		 this.ctrlME = new ManterEmprestimo(this);
	}
	
	public static void main(String[] args) {
		new Programa();

	}
	
	public void iniciarCadastroUsuario(){
		this.ctrlMU.iniciarCadastroUsuario();
	}
	
	public void iniciarCadastroObra(){
		this.ctrlMO.iniciarCadastroObra();
	}
	
	public void iniciarRegistroEmprestimo(){
		this.ctrlME.iniciarRegistroEmprestimo();
	}
	
	public String[] preencherBoxUsuario(){
		return this.ctrlMU.preencherBoxUsuario();
	}
	
	public String[] preencherBoxObra(){
		return this.ctrlMO.preencherBoxObra();
	}
	
	public Usuario buscarUsuario(int pos){
		return this.ctrlMU.buscarUsuario(pos);
	}

	public Obra buscarObra(int pos){
		return this.ctrlMO.buscarObra(pos);
	}
}
