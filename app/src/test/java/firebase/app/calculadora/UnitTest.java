package firebase.app.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTest {

    @Test
    public void addition_isCorrect1() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void addition_isCorrect2() {
        assertEquals(20, 10+ 10);
    }
    @Test
    public void addition_isCorrect3() {
        assertEquals(525, 500 + 25);
    }
    @Test
    public void addition_isCorrect4() {
        assertEquals(3, 5 - 2);
    }
    @Test
    public void addition_isCorrect5() {
        assertEquals(5, 10 - 5);
    }
    @Test
    public void addition_isCorrect6() {
        assertEquals( 475, 500 - 25);
    }

    @Test
    public void addition_isCorrect7() {
        assertEquals(7300, 50 * 146);
    }
    @Test
    public void addition_isCorrect8() {
        assertEquals(7290, 486 * 15);
    }
    @Test
    public void addition_isCorrect9() {
        assertEquals( 25, 5 * 5);
    }
    @Test
    public void addition_isCorrect10() {
        assertEquals(5, 30 / 6);
    }
    @Test
    public void addition_isCorrect11() {
        assertEquals(99, 297 / 3);
    }
    @Test
    public void addition_isCorrect12() {
        assertEquals( 34, 68 / 2);
    }

}
