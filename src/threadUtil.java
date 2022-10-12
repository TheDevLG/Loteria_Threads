import java.util.Scanner;

public class threadUtil {

	public static void main(String[] Args) {

		double premio;
		int opcaoA;
		int opcaoB;

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor do prêmio:");
		premio = input.nextDouble();
		thread t1 = new thread(premio);

		do {
			System.out.println("*************************************************");
			System.out.println("* Você deseja:                                  *");
			System.out.println("* 1- Ver o saldo atual do prêmio                *");
			System.out.println("* 2- Ver o percentual ainda diponível do prêmio *");
			System.out.println("* 3- Encerrar                                   *");
			System.out.println("*************************************************");
			opcaoA = input.nextInt();

			switch (opcaoA) {
			case 1:
				System.out.println("Saldo atual do prêmio:");
				System.out.println(t1.getSaldo());
				System.out.println("");
				break;
			case 2:
				System.out.println("Percentual ainda disponível do prêmio:");
				System.out.println(t1.getPercentualPremiacao());
				System.out.println("");
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Número inválido!\n");
			}

			do {
				System.out.println("*************************************************");
				System.out.println("* Deseja:                                       *");
				System.out.println("* 1- Fazer uma nova consulta                    *");
				System.out.println("* 2- Encerrar                                   *");
				System.out.println("*************************************************");
				opcaoB = input.nextInt();

				switch(opcaoB) {
				case 1:
					break;
				case 2:
					System.exit(0);
					break;
				default:
					System.out.println("Número inválido!\n" );
				}
				
			} while(opcaoB != 1 && opcaoB!= 2);
			
		} while(opcaoB == 1);

	}
}
