package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void numberOfBrackets() {
        assert(BalancedBrackets.numberOfBrackets("[[]]") == 4);
    }

    @Test
    public void evenNumberOfBrackets() {
        assert(BalancedBrackets.numberOfBrackets("[[]]]]") % 2 == 0);
    }

    @Test
    public void numberOfOpenBrackets() {
        assert(BalancedBrackets.numberOfOpenBrackets("[[[[]]]]]]") == 4);
    }


}
