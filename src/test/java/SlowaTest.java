import org.example.Slowa;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SlowaTest {

    Slowa s = new Slowa();

    @Test
    public void testPol1() {
        assertEquals("vJrwpWtwJgWr", s.pol1("vJrwpWtwJgWrhcsFMMfFFhFp"));
        assertEquals("test", s.pol1("testtest"));
    }

    @Test
    public void testPol2() {
        assertEquals("hcsFMMfFFhFp", s.pol2("vJrwpWtwJgWrhcsFMMfFFhFp"));
        assertEquals("test", s.pol2("testtest"));
    }

    @Test
    public void testWspolny() {
        assertEquals('p', s.wspolny("vJrwpWtwJgWrhcsFMMfFFhFp"));
        assertEquals('L', s.wspolny("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"));
        assertEquals('P', s.wspolny("PmmdzqPrVvPwwTWBwg"));
        assertEquals('v', s.wspolny("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"));
        assertEquals('t', s.wspolny("ttgJtRGJQctTZtZT"));
        assertEquals('s', s.wspolny("CrZsJsPPZsGzwwsLwLmpwMDw"));
    }

    @Test
    public void testPrio() {
        assertEquals(1, s.prio('a'));
        assertEquals(16, s.prio('p'));
        assertEquals(26, s.prio('z'));
        assertEquals(27, s.prio('A'));
        assertEquals(38, s.prio('L'));
        assertEquals(52, s.prio('Z'));
    }

    @Test
    public void testSuma() {
        List<String> plecaki = Arrays.asList(
                "vJrwpWtwJgWrhcsFMMfFFhFp",
                "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                "PmmdzqPrVvPwwTWBwg",
                "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                "ttgJtRGJQctTZtZT",
                "CrZsJsPPZsGzwwsLwLmpwMDw"
        );

        assertEquals(157, s.suma(plecaki));
    }
}
