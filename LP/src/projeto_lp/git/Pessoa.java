package projeto_lp.git;

public class Pessoa {
    private String nome;
    private String cargo;  

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Pessoa(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
}