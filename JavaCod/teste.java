package teste1;
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // MENU
        System.out.println("---- MENU ----");
        System.out.println("1 - Cadastrar Máquina");
        System.out.println("2 - Cadastrar Setor");
        System.out.println("3 - Cadastrar Produtos");
        System.out.println("4 - Listar Cadastros");
        System.out.println("5 - SAIR");

        int opcao = entrada.nextInt();
        entrada.nextLine(); 

        switch (opcao) {
            case 1:
                System.out.println("Cadastrando máquina");
                break;
            case 2:
                System.out.println("Cadastrando setor");
                break;
            case 3:
                System.out.println("Cadastrando produtos");
                break;
            case 4:
                System.out.println("Listando cadastros");
                break;
            case 5:
                System.out.println("Você saiu");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        entrada.close(); 
    }
}
