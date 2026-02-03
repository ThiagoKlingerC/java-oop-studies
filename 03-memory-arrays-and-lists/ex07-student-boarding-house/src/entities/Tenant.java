package entities;

public class Tenant {
	private String name;
	private String email;
	
	public Tenant() {
	}
	
	public Tenant(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
