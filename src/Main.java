public class Main {

    public static void main(String[] args) {
        Cliente eleonilson = new Cliente();
        eleonilson.setNome("Eleonilson");

        Conta cc = new ContaCorrente(eleonilson);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(eleonilson);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
