
public class thread extends Thread {

	private double premio;
	private double saldoAtual;
	private double calculoPercentual;		//vari�vel para ajudar no c�lculo do percentual dispon�vel

	public thread(double premio) {
		this.premio = premio;
		this.calculoPercentual = premio; 	//mantendo o valor prim�rio do pr�mio para c�lculo do percentual
		
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {

		do {
			try {

				premio -= premio * (Math.floor(Math.random()*100)) / 100; 	//c�lculo para desconto de pr�mio (usei math floor por capricho)
				saldoAtual = premio;									  	//Aqui eu utilizei a l�gica de que o saldo atual deve se tornar o novo valor m�ximo para a base da dedu��o	
																			//logo, as dedu��es ser�o feitas atrav�s do valor de saldo atual
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
