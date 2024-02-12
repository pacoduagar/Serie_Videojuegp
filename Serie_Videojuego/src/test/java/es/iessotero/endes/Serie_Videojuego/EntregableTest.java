package es.iessotero.endes.Serie_Videojuego;

import org.junit.Test;
import static org.junit.Assert.*;

public class EntregableTest {

    // Pruebas para la clase Videojuego

    @Test
    public void testVideojuegoEntregar() {
        Videojuego videojuego = new Videojuego("Super Mario", 50, "Plataforma", "Nintendo");
        videojuego.entregar();
        assertTrue(videojuego.isEntregado());
    }

    @Test
    public void testVideojuegoDevolver() {
        Videojuego videojuego = new Videojuego("The Legend of Zelda", 80, "Aventura", "Nintendo");
        videojuego.entregar();
        videojuego.devolver();
        assertFalse(videojuego.isEntregado());
    }

    @Test
    public void testVideojuegoCompareTo() {
        Videojuego videojuego1 = new Videojuego("Call of Duty", 200, "Disparos", "Activision");
        Videojuego videojuego2 = new Videojuego("Assassin's Creed", 150, "Aventura", "Ubisoft");
        assertEquals(1, videojuego1.compareTo(videojuego2));
    }

    @Test
    public void testVideojuegoEquals() {
        Videojuego videojuego1 = new Videojuego("FIFA 22", 60, "Deportes", "EA Sports");
        Videojuego videojuego2 = new Videojuego("FIFA 22", 60, "Deportes", "EA Sports");
        assertTrue(videojuego1.equals(videojuego2));
    }

    // Pruebas para la clase Serie

    @Test
    public void testSerieEntregar() {
        Serie serie = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        serie.entregar();
        assertTrue(serie.isEntregado());
    }

    @Test
    public void testSerieDevolver() {
        Serie serie = new Serie("Friends", 10, "Comedia", "David Crane");
        serie.entregar();
        serie.devolver();
        assertFalse(serie.isEntregado());
    }

    @Test
    public void testSerieCompareTo() {
        Serie serie1 = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff");
        Serie serie2 = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        assertEquals(-1, serie1.compareTo(serie2));
    }

    @Test
    public void testSerieEquals() {
        Serie serie1 = new Serie("The Big Bang Theory", 12, "Comedia", "Chuck Lorre");
        Serie serie2 = new Serie("The Big Bang Theory", 12, "Comedia", "Chuck Lorre");
        assertTrue(serie1.equals(serie2));
    }
}
