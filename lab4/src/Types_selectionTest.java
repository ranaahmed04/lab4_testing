import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Types_selectionTest {
    Types_selection coffee = new Types_selection();

    @Test
    public void milk() {
        assertEquals(150, coffee.milk(200));
    }

    @Test
    public void blackcoffee() {
        assertEquals(200, coffee.blackcoffee(250));
    }

    @Test
    public void cappccino() {
        assertEquals(250, coffee.Cappccino(300));
    }

    @Test
    public void nespresso() {
        assertEquals(0, coffee.nespresso(50));
    }

    @Test
    public void nescafe() {
        assertEquals(50, coffee.nescafe(100));
    }

    @Test
    public void stop() {
        assertEquals(null, coffee.stop());
    }


}