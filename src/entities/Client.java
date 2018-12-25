package entities;

import java.util.Date;

public class Client {
	String nome;
	String email;
	Date birthdate;
	
	public Client(String nome, String email, Date birthdate) {
		this.nome = nome;
		this.email = email;
		this.birthdate = birthdate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
}
