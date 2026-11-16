package solid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OCPTest {
    @Test
    void deveFuncionar() {
        OCP.Desconto desconto = new OCP.DescontoVip();
        assertEquals(85.0, desconto.calcular(100), 0.001);
    }
}
