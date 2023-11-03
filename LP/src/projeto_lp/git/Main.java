package projeto_lp.git;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaAutomovel sistema = new SistemaAutomovel();
        Scanner scanner = new Scanner(System.in);

        // Simulação de login
        System.out.println("Login como (1) Administrador ou (2) Utilizador:");
        try {
            int tipoUsuario = scanner.nextInt();

            if (tipoUsuario == 1) {  // Administrador
                // Adicionando carros ao inventário
                sistema.adicionarCarro(1, "Toyota", "Corolla", 2022, "Sedan, 4 portas", 220, 527, "Um carro fabuloso", 35000.0);
          
                sistema.adicionarCarro(2,"Honda", "Civic", 2021, "Sedan, 4 portas", 420, 600, "Carro top", 32000.0);

                // Exibindo inventário
                sistema.exibirInventario();
                
                // Editando informações do primeiro carro no inventário
                try {
                    System.out.println("Digite o índice do carro que deseja editar:");
                    int indiceEdicao = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Digite a nova marca:");
                    String novaMarca = scanner.nextLine();
                    
                    System.out.println("Digite o novo modelo:");
                    String novoModelo = scanner.nextLine();
                    
                    System.out.println("Digite o novo ano:");
                    int novoAno = scanner.nextInt();
                    
                    System.out.println("Digite novo tipo:");
                    String novoTipo = scanner.nextLine();
                    
                    System.out.println("Digite novos cavalos:");
                    int novoCavalos = scanner.nextInt();
                    
                    System.out.println("Digite nova autonomia:");
                    int novaAutonomia = scanner.nextInt();
                    
                    System.out.println("Digite nova descrição:");
                    String novaDescricao = scanner.nextLine();                             
                    
                    System.out.println("Digite o novo preço de venda:");
                    double novoPreco = scanner.nextDouble();

                    sistema.editarCarro(indiceEdicao, novaMarca, novoModelo, novoAno, novoTipo, novoCavalos, novaAutonomia, novaDescricao, novoPreco);
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Certifique-se de inserir valores numéricos corretos.");
                }

                // Exibindo inventário atualizado
                sistema.exibirInventario();

                // Excluindo o segundo carro do inventário
                try {
                    System.out.println("Digite o índice do carro que deseja excluir:");
                    int indiceExclusao = scanner.nextInt();
                    sistema.excluirCarro(indiceExclusao);
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Certifique-se de inserir um valor numérico válido.");
                }

                // Exibindo inventário final
                sistema.exibirInventario();
            } else if (tipoUsuario == 2) {  // Utilizador
                // Exibindo inventário para o utilizador
                sistema.exibirInventario();
            } else {
                System.out.println("Tipo de usuário inválido!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um valor numérico válido para o tipo de usuário.");
        }

        scanner.close();
    }
}

