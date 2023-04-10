package br.ufca.serie;

public class Serie {
	private String nome;
	private int numero_temporadas;
	private int ano;
	
	public Serie(String nome, int numero_temporadas, int ano) {
		this.nome = nome;
		this.numero_temporadas = numero_temporadas;
		this.ano = ano;
	}
	
	//Métodos específicos:
	
	//sobrescrita método toString:
	@Override
	public String toString() {
		String informacoes = String.format("%s (%d) %d",nome,ano,numero_temporadas);
		return informacoes;
	}
	
	
	//getters and setters:
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero_temporadas() {
		return numero_temporadas;
	}

	public void setNumero_temporadas(int numero_temporadas) {
		this.numero_temporadas = numero_temporadas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Modificador sem acesso -> Final
	// Não permite a sobrescrita de métodos
	// ex: public final void classificacao()
}
