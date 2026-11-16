package solid;

// L: um tipo deve poder substituir outro sem dar erro inesperado.
public class LSP {
    // ERRADO: nem toda conta permite saque.
    public static class ContaErrada {
        public double sacar(double saldo, double valor) { return saldo - valor; }
    }
    public static class ContaBloqueadaErrada extends ContaErrada {
        @Override
        public double sacar(double saldo, double valor) {
            throw new UnsupportedOperationException("Saque nao permitido");
        }
    }

    // CERTO: a interface so promete o que todas as contas fazem.
    public interface ContaBancaria { double depositar(double saldo, double valor); }

    public static class ContaCorrente implements ContaBancaria {
        public double depositar(double saldo, double valor) { return saldo + valor; }
    }

    public static class ContaInvestimento implements ContaBancaria {
        public double depositar(double saldo, double valor) { return saldo + valor; }
    }
}
