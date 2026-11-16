package solid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SRPTest {
    @Test
    void deveFuncionar() {
        assertEquals(4000.0, new SRP.CalculadoraSalario().calcular(5000), 0.001);
    }
}
