import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class MainTest {

@BeforeEach
public void setup() {

}
    @Test
    public void testaRaderEfterStop() {

    //simulera input så som användare hade skrivit
        String simulatedInput = "First line.\nstop\nSecond line.";
    //omdirigera System.in att använda simulerad input från ovan
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        Main.runWithScanner(new java.util.Scanner(System.in));

        assertEquals(1,Skriv.printRowsOfList(),"antal rader");
        assertEquals(10, Skriv.printCharsOfList(), "Antal karaktärer");



    //    @Test
//    public void

//    vad är kravet för vad som ska räknas och inte?
//testa nummer
//testa mellanslag
//testa storlek, bits

}}
