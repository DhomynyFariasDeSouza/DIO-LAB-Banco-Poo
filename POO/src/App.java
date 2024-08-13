import Entity.Cliente;
import Entity.ContaCorrente;
import Entity.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente(new Cliente("João"));
        ContaPoupanca cp = new ContaPoupanca(new Cliente("Maria"));
        ContaCorrente cc1 = new ContaCorrente(new Cliente("Marcos"));

        cc.depositar(200);

        cc.transferir(100, cp);

        cc.imprimirExtrato();

        cp.imprimirExtrato();

        cc1.imprimirExtrato();
    }
}
