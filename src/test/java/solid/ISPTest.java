package solid;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ISPTest {
    @Test
    void deveFuncionar() {
        ISP.Trabalhador robo = new ISP.Robo();
        assertDoesNotThrow(robo::trabalhar);
    }
}
