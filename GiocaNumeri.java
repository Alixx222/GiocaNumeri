package giocanumeri;

/**
 * @see UdA n. 1 Esercitazione n. 1 GiocaNumeri
 * @author alice carletti
 */
public class GiocaNumeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INIZIO GIOCO");

        Giocatore g1 = new Giocatore("Alice", 0);
        g1.start();

        Giocatore g2 = new Giocatore("Greta", 0);
        g2.start();

        try {
            g1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /* Thread.currentThread().sleep();

        */

        System.out.println("FINE GIOCO");
    }
}
