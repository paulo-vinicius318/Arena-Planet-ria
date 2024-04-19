package br.com.unicuritiba.arena.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planeta {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String name;
	private String localidade;
	private String governante;
	private String dataDestruicao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getGovernante() {
		return governante;
	}
	public void setGovernante(String governante) {
		this.governante = governante;
	}
	public String getDataDestruicao() {
		return dataDestruicao;
	}
	public void setDataDestruicao(String dataDestruicao) {
		this.dataDestruicao = dataDestruicao;
	}
}
