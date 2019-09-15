package br.unicesumar.avaliacao;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avaliacao {

	@Id
	private String id;
	private String materia;
	private String professor;
	private double nota;
	
	
	public Avaliacao() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public String getMateria() {
		return materia;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
}
