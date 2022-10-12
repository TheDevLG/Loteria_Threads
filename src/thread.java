
public class thread extends Thread {

	private double premio;
	private double saldoAtual;
	private double calculoPercentual;		//variável para ajudar no cálculo do percentual disponível

	public thread(double premio) {
		this.premio = premio;
		this.calculoPercentual = premio; 	//mantendo o valor primário do prêmio para cálculo do percentual
		
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {

		do {
			try {

				premio -= premio * (Math.floor(Math.random()*100)) / 100; 	//cálculo para desconto de prêmio (usei math floor por capricho)
				saldoAtual = premio;									  	//Aqui eu utilizei a lógica de que o saldo atual deve se tornar o novo valor máximo para a base da dedução	
																			//logo, as deduções serão feitas através do valor de saldo atual
				thread.sleep(10000);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}while(saldoAtual > 0.01);	
		
	}

	public double getSaldo() {

		return saldoAtual;
	}
	public double getPercentualPremiacao() {

		return saldoAtual/calculoPercentual * 100;
	}

}
