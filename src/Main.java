
public class Main {

	public static void main(String[] args) {
		Cliente gemaque = new Cliente();
		gemaque.setNome("Gemaque");
		
		Conta cc = new ContaCorrente(gemaque);
		Conta poupanca = new ContaPoupanca(gemaque);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}