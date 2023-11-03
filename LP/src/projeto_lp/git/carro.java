package projeto_lp.git;

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String descricao;
    private String tipo;
    private int cavalos;
    private int numeroPortas;
    private int autonomia;
    private double precoVenda;
    private int indice;
    Pessoa vendedor;
   
    public Carro(int indice,String marca, String modelo, int ano, String tipo, int cavalos, int autonomia, String descricao, double precoVenda, Pessoa vendedor) {
        this.indice= indice;
    	this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.autonomia = autonomia;
        this.cavalos = cavalos;
        this.tipo = tipo;
        this.vendedor= vendedor;
    }

    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Pessoa getVendedor() {
		return vendedor;
	}

	public void setVendedor(Pessoa vendedor) {
		this.vendedor = vendedor;
	}

	// Método para exibir detalhes do carro
    public void exibirDetalhes() {
    	System.out.println("           Indice: " + indice);
        System.out.println("            Marca: " + marca);
        System.out.println("           Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("             Tipo: " + tipo);
        System.out.println("          Cavalos: " + cavalos);
        System.out.println("        Autonomia: " + autonomia);
        System.out.println("        Descricao: " + descricao);
        System.out.println("   Preço de Venda: " + precoVenda);
        System.out.println("         Vendedor: " + vendedor);
        System.out.println("---------------------------------");
    }
}
