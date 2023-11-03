package projeto_lp.git;

class Vendedor extends Pessoa {
    String cargo;  

    public Vendedor(String nome, String cargo) {
        super(nome, cargo);
        this.cargo = cargo;
    }

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
     
}