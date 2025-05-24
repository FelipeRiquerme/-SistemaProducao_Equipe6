package teste;
import java.util.*;
public class Menu {
	public static void main(String[] args){
		Teste3 Classe = new Teste3();
		Scanner  entrada = new Scanner(System.in);
		int opcao =0;
		do {
		System.out.println("\n ---- MENU ---- ");
		System.out.println("1- Cadastrar Setor e Maquina: ");
		System.out.println("2- Cadastrar Produção: " );
		System.out.println("3- Mostrar Setores e Maquinas cadastrados: ");
		System.out.println("4- Gerar média: ");
		System.out.println("5- SAIR ");
		System.out.println("Escolha uma opção: ");
		
		 opcao = entrada.nextInt();
		 entrada.nextLine();
		 
		switch(opcao) {
		case 1: Classe.cadastro(); break;
		
		case 2:	Classe.regispdc(entrada, 3); break;
		
		case 3: Classe.mostrarMqnSet(); break;
		
		case 4: Classe.imprimirSmns();	break;
		
		case 5: System.out.println("Voce saiu "); break;
		
		default: System.out.println("Escolha uma Opção correta "); break;
		}
	}while(opcao != 5);
		entrada.close();
	}
}
	
