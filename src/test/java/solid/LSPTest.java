package solid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LSPTest {
    @Test
    void deveFuncionar() {
        LSP.ContaBancaria conta = new LSP.ContaInvestimento();
        assertEquals(100.0, conta.depositar(0, 100), 0.001);
    }
}
