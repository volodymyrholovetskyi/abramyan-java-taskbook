package abramyan.begin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Begin1Test {

    @Test
    void shouldCalculateSquarePerimeter() {
        int side = 5;

        int result = Begin1.calculatePerimeter(side);

        assertEquals(20, result);
    }

    @Test
    void shouldHandleZero() {
        assertEquals(0, Begin1.calculatePerimeter(0));
    }

}