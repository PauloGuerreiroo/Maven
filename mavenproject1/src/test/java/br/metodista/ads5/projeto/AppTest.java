package br.metodista.ads5.projeto;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testeSoma() {
        App app = new App();
        assertEquals(1.0, app.soma(0, 1), 0.1);
    }
    public void testeSub() {
        App app = new App();
        assertEquals(1.0, app.menos(0, 1), 0.1);
    }
    public void testeVezes() {
        App app = new App();
        assertEquals(1.0, app.multi(0, 1), 0.1);
    }
}
