package br.com.imperial_flix_cinema;

public class Cinema {

	int idcinema;
	int sala;
	double valor;
	String nome;
	String horario;

	public Cinema(int idcinema, int sala, double valor, String nome, String horario) {
		this.idcinema = idcinema;
		this.sala = sala;
		this.valor = valor;
		this.nome = nome;
		this.horario = horario;
	}

	public Cinema() {
		super();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getIdcinema() {
		return idcinema;
	}

	public int getSala() {
		return sala;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
	    return nome + " -> Sala: " + sala + " -> Valor: " + valor + " -> Horário: " + horario;
	}

}
