package giocanumeri;

public class Giocatore extends Thread {

    String nome;
    int punteggio;
    String parola;

    public Giocatore(String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = punteggio;
    }

    void gioca() {
        int numero = 19;
        String parola = "Buongiorno";

        for (int i = 0; i < numero; i++) {
            System.out.println("Giocatore " + nome + ": " + i);

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Errore nella transizione running-sleeping");
            }
        }

        Thread.currentThread().yield();

        punteggio = 10;
    }

    void comunica() {
        System.out.println("Giocatore " + nome + " " + punteggio
                + " ha scelto la parola: " + parola);
    }

    @Override
    public void run() {
    }
}
