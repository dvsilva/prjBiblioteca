package dominio;

import java.util.Arrays;

public class Usuario {
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", cpf=" + cpf + ", tel=" + tel
				+ ", meusEmprestimos=" + Arrays.toString(meusEmprestimos) + "]";
	}

	private String nome;
	private String cpf;
	private long tel;
	

	private Emprestimo[] meusEmprestimos;
	
	public Usuario(String nome, String cpf, long tel){
		this.nome = nome;
		this.cpf = cpf;
		this.tel =tel;
		this.meusEmprestimos = new Emprestimo[100];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public Emprestimo[] getMeusEmprestimos() {
		return meusEmprestimos;
	}
	
}
