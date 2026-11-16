package solid;

// S: cada classe deve ter uma responsabilidade.
public class SRP {
    // ERRADO: esta classe faz contas e também imprime.
    public static class FuncionarioErrado {
        public double calcularSalario(double bruto) { return bruto * 0.8; }
        public void imprimirSalario(double bruto) {
            System.out.println(calcularSalario(bruto));
        }
    }

    // CERTO: uma classe calcula, outra mostra.
    public static class CalculadoraSalario {
        public double calcular(double bruto) { return bruto * 0.8; }
    }

    public static class ImpressoraSalario {
        public void imprimir(double liquido) { System.out.println(liquido); }
    }
}
