import java.util.Scanner;

public class threadUtil {

	public static void main(String[] Args) {

		double premio;
		int opcaoA;
		int opcaoB;

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor do pr�mio:");
		premio = input.nextDouble();
		thread t1 = new thread(premio);

		do {
			System.out.println("*************************************************");
			System.out.println("* Voc� deseja:                                  *");
			System.out.println("* 1- Ver o saldo atual do pr�mio                *");
			System.out.println("* 2- Ver o percentual ainda dipon�vel do pr�mio *");
			System.out.println("* 3- Encerrar                                   *");
			System.out.println("*************************************************");
			opcaoA = input.nextInt();

			switch (opcaoA) {
			case 1:
				System.out.println("Saldo atual do pr�mio:");
				System.out.println(t1.getSaldo());
				System.out.println("");
				break;
			case 2:
				System.out.println("Percentual ainda dispon�vel do pr�mio:");
				System.out.println(t1.getPercentualPremiacao());
				System.out.println("");
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("N�mero inv�lido!\n");
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
					System.out.println("N�mero inv�lido!\n" );
				}
				
			} while(opcaoB != 1 && opcaoB!= 2);
			
		} while(opcaoB == 1);

	}
}
