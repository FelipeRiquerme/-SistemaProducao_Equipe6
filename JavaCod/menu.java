package teste1;

import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    static Scanner entrada = new Scanner(System.in);
    
    public ArrayList<String> nome = new ArrayList<>();
    public ArrayList<String> setor = new ArrayList<>();
    public ArrayList<Integer> produtos = new ArrayList<>();
    public ArrayList<String> tipoTecido = new ArrayList<>();

   
    public static void maquinas(String nome, String setor) {
        System.out.println("Máquina cadastrada: " + nome + " | Setor: " + setor);
    }
    public static void main(String[] args) {
        System.out.print("Digite o nome da máquina: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o setor da máquina: ");
        String setor = entrada.nextLine();

        maquinas(nome, setor);
    }
}
