package solid;

// O: permitir novos tipos sem alterar a calculadora.
public class OCP {
    // ERRADO: sempre que surgir outro cliente, preciso mudar este metodo.
    public static class DescontoErrado {
        public double calcular(double valor, String tipo) {
            if (tipo.equals("VIP")) return valor * 0.85;
            return valor;
        }
    }

    // CERTO: cada tipo de desconto tem seu proprio calculo.
    public interface Desconto { double calcular(double valor); }

    public static class DescontoVip implements Desconto {
        public double calcular(double valor) { return valor * 0.85; }
    }

    public static class DescontoNormal implements Desconto {
        public double calcular(double valor) { return valor; }
    }
}
