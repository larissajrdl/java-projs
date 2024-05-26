//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente larissa = new Cliente();
        larissa.setNome("Larissa");

        Conta cc = new ContaCorrente(larissa);
        Conta poupanca = new ContaPoupanca(larissa);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}