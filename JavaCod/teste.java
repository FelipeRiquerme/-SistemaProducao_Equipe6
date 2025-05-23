package Teste;

import java.util.*;

public class Teste3 {
Scanner entrada = new Scanner (System.in );
	public ArrayList <String> Maquinas = new ArrayList<>();
	public ArrayList <String> Setor = new ArrayList<>();
	public int[][] smn1 = new int[8][3];
	int dia = 1;
	
	public void cadastro() {
		System.out.println("Digite o nome da máquina: ");
		String mqn = entrada.nextLine();
		Maquinas.add(mqn);
		System.out.println("Digite o setor");
		String set = entrada.nextLine();
		Setor.add(set);
		System.out.println("Cadastrado com sucesso!");
	}
	public void mostrarMqnSet() {
		System.out.print("Maquinas: ");
		System.out.println("  " + Maquinas);
		System.out.println("Setores: " + Setor);
	}
	public void regispdc() {
		dia++;
		for(int i = 0; i < smn1.length; i++) {
		System.out.println("Digite a produção do dia " + i);
		smn1[dia][i] = entrada.nextInt();
	}

	}
	public void relatorio() {
		for(int i = 0; i < smn1.length;i++) {
			for(int j = 0; i < smn1.length;i++) {
				System.out.println(smn1);
			}
		}
	}
	public void geral() {
		
	}
	}
	
