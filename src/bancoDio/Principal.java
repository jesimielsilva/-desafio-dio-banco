package bancoDio;

public class Principal {

	public static void main(String[] args) {
		Cliente pedro	= new Cliente();
		pedro.setNome("Pedro");
		
		Conta cc		= new ContaCorrente(pedro);
		cc.depositar(100);
		
		Conta cPoupanca	= new ContaPoupanca(pedro);
		cc.transferir(100, cPoupanca);
		
		cc.imprimirExtrato();
		cPoupanca.imprimirExtrato();
	}

}
