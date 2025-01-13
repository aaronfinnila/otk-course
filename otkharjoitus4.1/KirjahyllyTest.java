import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class KirjahyllyTest {

    @Test
    void testLisaaKirja() {
        Kirjahylly kirjahylly = new Kirjahylly();
        String kirja1 = "kissa";
        kirjahylly.lisaaKirja(kirja1);
        assertNotNull(kirjahylly);
    }

    @Test
    void testViimeksiLisatty() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("miumau");
        kirjahylly.lisaaKirja("miukumauku");
        assertSame("miukumauku",kirjahylly.viimeksiLisatty());
    }

    @Test
    void testOnkoKirjaHyllyssa() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("Wautsi wau");
        kirjahylly.lisaaKirja("Koirien kävely");
        kirjahylly.lisaaKirja("Kissojen kiipeily");
        kirjahylly.lisaaKirja("Krokotiilien kriketti");
        assertTrue(kirjahylly.onkoKirjaHyllyssa("Wautsi wau"));
        assertFalse(kirjahylly.onkoKirjaHyllyssa("Koirien kiipeily"));
    }

    @Test
    void testGetKirjojaHyllyssa() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("asdfsadf");
        kirjahylly.lisaaKirja("aagajtijgaot");
        kirjahylly.lisaaKirja("adajfjgaojgaoj");
        assertEquals(3, kirjahylly.getKirjojaHyllyssa());
    }
}