package dominio;

public class Emprestimo {
	
	private String dataEmprestimo;
	private String dataDevolucao;
	private Usuario meuUsuario;
	private Obra minhaObra;
	
	public Emprestimo(String dataEmprestimo, String dataDevolucao, Usuario meuUsuario, Obra minhaObra){
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.meuUsuario = meuUsuario;
		this.minhaObra = minhaObra;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Usuario getMeuUsuario() {
		return meuUsuario;
	}

	public void setMeuUsuario(Usuario meuUsuario) {
		this.meuUsuario = meuUsuario;
	}

	public Obra getMinhaObra() {
		return minhaObra;
	}

	public void setMinhaObra(Obra minhaObra) {
		this.minhaObra = minhaObra;
	}

		
	

}
