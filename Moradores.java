package Cadastro;

import java.util.Scanner;

public class Moradores {
	public static String nome;
	public static String cpf;
	public static int celular;
	public static String sexo;
	public static int bloco;
	public static int apt;
	public static int codigo;
	public int count;
	public static String birthdate;
	
 void CadastroMorador() {
		
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.println("Digite 1 para acessar os dados e 2 para cadastrar um morador");
		option = sc.nextInt();
		if(option == 1) {
			
		}
		else if(option == 2) {
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("Digite o seu nome:");
			nome = leitura.nextLine();
			
			System.out.println("Digite o seu celular:");
			celular = leitura.nextInt();
			
			System.out.println("Digite sua data de nascimento:");
			leitura.nextLine();
			birthdate = leitura.nextLine();
			
			System.out.println("Digite o seu cpf:");
		
			cpf = leitura.nextLine();
			
			System.out.println("Digite o seu sexo:");
			sexo = leitura.nextLine();
			
			System.out.println("Digite o seu bloco:");
			bloco = leitura.nextInt();
			
			System.out.println("Digite o seu apartamento:");
			apt = leitura.nextInt();
			
			System.out.println("Digite o seu codigo:");
			codigo = leitura.nextInt();
			
			leitura.close();
			System.out.println("Nome: " + nome + "\n" + "Celular: " + celular + "\n" + "CPF: " + cpf +"\n" + "Sexo: " + sexo +"\n" + "Bloco: " + bloco + "\n" + "Apartamento: " + apt + "\n" + "Código: " + codigo);
			
			
			
			
			
			
		}
		else {
			System.out.println("Por favor digite 1 ou 2");
		}
		
		sc.close();
		
	}
}
