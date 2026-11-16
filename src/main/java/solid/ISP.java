package solid;

// I: uma classe nao deve ser obrigada a implementar metodos que nao usa.
public class ISP {
    // ERRADO: robo nao come, mas a interface obriga esse metodo.
    public interface FuncionarioErrado {
        void trabalhar();
        void comer();
    }
    public static class RoboErrado implements FuncionarioErrado {
        public void trabalhar() { System.out.println("Trabalhando"); }
        public void comer() { throw new UnsupportedOperationException("Robo nao come"); }
    }

    // CERTO: duas interfaces pequenas.
    public interface Trabalhador { void trabalhar(); }
    public interface Alimentavel { void comer(); }

    public static class Robo implements Trabalhador {
        public void trabalhar() { System.out.println("Trabalhando"); }
    }
}
