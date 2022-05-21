import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {
    CoffeeMachine coff =new CoffeeMachine();
    @org.junit.jupiter.api.Test
    public void start() {
    }

    @org.junit.jupiter.api.Test
    public void select() {

        assertEquals(null, coff.Select(1));
        assertEquals(null, coff.Select(3));
        assertEquals(null, coff.Select(5));
    }

}