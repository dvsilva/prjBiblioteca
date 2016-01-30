package dominio;

public class Obra {
	
	private String titulo;
	private String autor;
	private int anoPub;
	private Emprestimo[] meusEmprestimos;
	
	public Obra(String titulo, String autor, int anoPub){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPub = anoPub;
		this.meusEmprestimos = new Emprestimo[100];
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPub() {
		return anoPub;
	}

	public void setAnoPub(int anoPub) {
		this.anoPub = anoPub;
	}

	public Emprestimo[] getMeusEmprestimos() {
		return meusEmprestimos;
	}
	
	

}
