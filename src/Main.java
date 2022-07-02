
public class Main {
	public static void main(String[] args) {
		Cliente antonio = new Cliente();
		antonio.setNome("Antonio");
		
		IConta cc = new ContaCorrente(antonio);
		IConta pp = new ContaPoupanca(antonio);
		
		cc.depositar(200);
		cc.transferir(100, pp);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
	}

}
