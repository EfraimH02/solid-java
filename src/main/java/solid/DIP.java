package solid;

// D: usar uma interface em vez de depender de uma classe fixa.
public class DIP {
    // ERRADO: o pedido depende diretamente do email.
    public static class Email {
        public String enviar() { return "Email enviado"; }
    }
    public static class PedidoErrado {
        private final Email email = new Email();
        public String finalizar() { return email.enviar(); }
    }

    // CERTO: podemos trocar email por outra forma de aviso.
    public interface Notificador { String enviar(); }

    public static class NotificadorEmail implements Notificador {
        public String enviar() { return "Email enviado"; }
    }

    public static class Pedido {
        private final Notificador notificador;
        public Pedido(Notificador notificador) { this.notificador = notificador; }
        public String finalizar() { return notificador.enviar(); }
    }
}
