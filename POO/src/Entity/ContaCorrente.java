package Entity;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente){
        super.agencia = AGENCIA_PADRAO;
        super.conta = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.printf("Cliente: %s \n Conta: %d \n Agencia: %d \n Saldo: %.2f \n",cliente,conta,agencia,saldo);
    }

    
}
