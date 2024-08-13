package Entity;

public class ContaPoupanca extends Conta {
   
    private static int SEQUENCIAL = 1;

    public ContaPoupanca(Cliente cliente){
        super.agencia = AGENCIA_PADRAO;
        super.conta = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta Poupança ");
        System.out.printf("Cliente: %s \n Conta: %d \n Agencia: %d \n Saldo: %.2f \n",cliente,conta,agencia,saldo);
    }
    
}
