public class TesteSmartphone {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.reproduzirMusica();
        smartphone.fazerLigacao("123456789");
        smartphone.encerrarChamada();
        smartphone.fazerBusca("Moisés Hastenraiter Da Silva");
    }
}
