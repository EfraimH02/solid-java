package solid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DIPTest {
    @Test
    void deveFuncionar() {
        DIP.Notificador teste = () -> "Pedido confirmado";
        DIP.Pedido pedido = new DIP.Pedido(teste);
        assertEquals("Pedido confirmado", pedido.finalizar());
    }
}
