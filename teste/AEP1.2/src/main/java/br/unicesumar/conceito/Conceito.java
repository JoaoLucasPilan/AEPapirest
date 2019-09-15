package br.unicesumar.conceito;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.unicesumar.aluno.Aluno;
import br.unicesumar.avaliacao.Avaliacao;


@Entity
public class Conceito {

	@Id
	private String id;
	private String avaliacao;
	private String aluno;
	
	private double nota;
	
	public Conceito() {
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	
	public String getAluno() {
		return aluno;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
}
