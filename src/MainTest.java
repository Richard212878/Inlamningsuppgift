import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    public void testaTomLista() {
        Skriv.inputs.clear();
        assertEquals("Du har inte matat in något.", Skriv.printLongestWord());
    }



    @Test
    public void testaLangstaOrdet() {
        Skriv.inputs.clear();
        Skriv.addToList("Första raden.");
        Skriv.addToList("ajeag      32r23r23 12 11");
        Skriv.addToList("Tredje raden.");

        assertEquals("ajeag32r23r231211", Skriv.printLongestWord());
    }



    @Test
    public void testaMellanslag() {
        Skriv.inputs.clear();
        Skriv.addToList("Test med mellanslag");
        Skriv.addToList("En annan rad");
        assertEquals("Testmedmellanslag", Skriv.inputs.get(0));
        assertEquals("Enannanrad", Skriv.inputs.get(1));
    }
}


