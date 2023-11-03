package projeto_lp.git;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

 public class SistemaAutomovel {
    ArrayList<Carro> inventario = new ArrayList<>();
    ArrayList<Vendedor> vendedores = new ArrayList<>();

    // Método para adicionar um novo carro ao inventário
    public void adicionarCarro(int indice,String marca, String modelo, int ano, String tipo, int cavalos, int autonomia, String descricao, double precoVenda, Pessoa vendedor) {
        Carro novoCarro = new Carro( indice, marca,  modelo,  ano,  tipo,  cavalos,  autonomia,  descricao,  precoVenda, vendedor);
        inventario.add(novoCarro);
        System.out.println("Carro adicionado com sucesso!");
    }
    
    //Método para adicionar vendedro
    public void adicionarVendedor(String nome, String cargo) {
        Vendedor novoVendedor = new Vendedor(nome, cargo);
        vendedores.add(novoVendedor);
        System.out.println("Vendedor adicionado com sucesso!");
    }
    
    // Método para exibir todos os carros no inventário
    public void exibirInventario() {
        System.out.println("Inventário de Carros:");
        for (Carro carro : inventario) {
            carro.exibirDetalhes();
        }
    }
    
    // Método para exibir todos os vendedores no stand
    public void exibirVendedores() {
        System.out.println("Vendedores no Stand:");
        for (Vendedor vendedor : vendedores) {
        	System.out.println("Nome: " + vendedor.getNome() + ", Cargo: " + vendedor.getCargo());
        }
    }
    // Método para editar informações de um carro no inventário
    public void editarCarro(int indice,String novaMarca, String novoModelo, int novoAno, String novoTipo, int novoCavalos, int novaAutonomia, String novaDescricao, double novoPreco) {
        try {
        	Carro carro = inventario.get(indice);
            carro.setMarca(novaMarca);
            carro.setModelo(novoModelo);
            carro.setAno(novoAno);
            carro.setTipo(novoTipo);
            carro.setCavalos(novoCavalos);
            carro.setAutonomia(novaAutonomia);
            carro.setDescricao(novaDescricao);
            carro.setPrecoVenda(novoPreco);
            System.out.println("Informações do carro editadas com sucesso!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice inválido. O carro não foi encontrado.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir valores numéricos corretos.");
        }
    }

    // Método para excluir um carro do inventário
    public void excluirCarro(int indice) {
        try {
            inventario.remove(indice);
            System.out.println("Carro removido do inventário!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice inválido. O carro não foi encontrado.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor numérico válido.");
        }
    }
} 

