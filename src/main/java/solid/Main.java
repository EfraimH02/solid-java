package solid;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salario: " + new SRP.CalculadoraSalario().calcular(5000));
        System.out.println("Desconto VIP: " + new OCP.DescontoVip().calcular(100));
        LSP.ContaBancaria conta = new LSP.ContaCorrente();
        System.out.println("Saldo: " + conta.depositar(0, 100));
        new ISP.Robo().trabalhar();
        System.out.println(new DIP.Pedido(new DIP.NotificadorEmail()).finalizar());
    }
}
