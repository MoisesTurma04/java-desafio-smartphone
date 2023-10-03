public class Smartphone {
    private ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    private AparelhoTelefone aparelhoTelefone = new AparelhoTelefone();
    private NavegadorInternet navegadorInternet = new NavegadorInternet();

    public void reproduzirMusica() {
        reprodutorMusical.tocarMusica(reprodutorMusical.listarMusicas().get(0));
    }

    public void fazerLigacao(String numero) {
        aparelhoTelefone.iniciarLigacao(numero);
    }

    public void encerrarChamada() {
        aparelhoTelefone.encerrarChamada();
    }

    public void fazerBusca(String termo) {
        navegadorInternet.fazerBusca(termo);
    }
}
