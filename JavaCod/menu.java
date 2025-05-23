package Teste;
import java.util.*;
public class Menu {
	public static void main(String[] args){
		Teste3 classe = new Teste3();
		Scanner  entrada = new Scanner(System.in);
		int opcao =0;
		//MENU
		do {
			System.out.println(classe.smn1);
		System.out.println("\n ---- MENU ---- ");
		System.out.println("1- Cadastrar Setor e Maquina: ");
		System.out.println("2- Cadastrar Produtos: " );
		System.out.println("3- Gerar relatório semanal: ");
		System.out.println("4- Gerar média: ");
		System.out.println("5- SAIR ");
		System.out.println("Escolha uma opção: ");
		
		 opcao = entrada.nextInt();
		 entrada.nextLine();
		 
		
	
		switch(opcao) {
		
		case 1:
			//classe.cadastro();
		break;
		case 2:	
			classe.regispdc();
		break;
		case 3:
		System.out.println("Gerando relatório....");
		break;
		case 4:
		System.out.println("listando cadastros");	break;
		case 5:
		System.out.println("Voce saiu ");	break;
		default:
		System.out.println("Escolha uma Opção correta "); break;
		
		}
	}while(opcao != 5);
		entrada.close();
	}
}
	
