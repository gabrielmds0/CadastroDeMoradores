package Cadastro;

import java.util.Scanner;

public class MoradoresV {
	public static String[] nomeV = new String[20];
	public static String[] cpfV = new String[20];
	public static int[] celularV = new int[20];
	public static String[] sexoV = new String[20];
	public static int[] blocoV = new int[20];
	public static int[] aptV = new int[20];
	public static int[] codigoV = new int[20];
	public static String[] birthdateV = new String[20];
	public static int count;
	public static int j;
	public static int i = 0;
	
 void CadastroMoradorV() {
		
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.println("Digite 1 para cadastrar um morador e 2 para fechar o programa;");
		option = sc.nextInt();
			if(option == 1) {
			Scanner leitura = new Scanner(System.in);
			System.out.println("Quantos moradores você deseja cadastrar?");
			count = sc.nextInt();
			
			for(j = 0 ; j < count; j++) {
				
				System.out.println("Digite o seu nome:");
				
				nomeV[i] = leitura.nextLine();
				
				System.out.println("Digite o seu celular:");
				celularV[i] = leitura.nextInt();
				
				System.out.println("Digite sua data de nascimento:");
				leitura.nextLine();
				birthdateV[i] = leitura.nextLine();
				
				System.out.println("Digite o seu cpf:");
			
				cpfV[i] = leitura.nextLine();
				
				System.out.println("Digite o seu sexo:");
				sexoV[i]= leitura.nextLine();
				
				System.out.println("Digite o seu bloco:");
				blocoV[i] = leitura.nextInt();
				
				System.out.println("Digite o seu apartamento:");
				aptV[i] = leitura.nextInt();
				
				
				System.out.println("Digite o seu código:");
				codigoV[i] = leitura.nextInt();
				leitura.nextLine();
				i++;
				
				
			
			
			
			
				}
			System.out.println("-----------------------------------------------------------------------------");
			i = 0;
			System.out.println("DADOS DOS MORADORES CADASTRADOS: ");
			for(int k = 0; k < count; k++ ) {
				System.out.println("Morador " + i + ": " + nomeV[i] + " ;" + celularV[i] + " ;" + birthdateV[i] + " ;" + cpfV[i] + " ;" + sexoV[i] + " ;" + blocoV[i] + " ;" + aptV[i] + " ;" + codigoV[i] + "." );
				i++;
				
				}
			System.out.println("-----------------------------------------------------------------------------");
			}
			
		
		else if (option == 2){
			System.out.println("Programa encerrado");
		}
		
		
		
	}
}
