import java.util.Scanner;

public class AppArray {

	static ContaBancaria[] vetorContas = new ContaBancaria[3];

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
				
		
		for (int i = 0; i < vetorContas.length; i++) {
	
			int numero;
			do {
				System.out.printf("Número da %dª conta: ", i+1);
				numero = lerTeclado.nextInt();
				if (numero <=0) {
					System.out.println("Número da conta inválido. Tem de ser positivo");
					continue;
				}
				break;
			} while (true);

			lerTeclado.nextLine();
			System.out.printf("Tipo da conta: ");
			String tipo = lerTeclado.nextLine();
			
			double limite;
			do {
				System.out.printf("Limite: ");
				limite = lerTeclado.nextInt();
				if (limite<=0) {
					System.out.println("O valor do limite deve ser positivo");
					continue;
				}
				break;
			} while (true);


			vetorContas[i] = new ContaBancaria(numero, tipo, limite);
		
		}
		
		lerTeclado.close();

	}


}