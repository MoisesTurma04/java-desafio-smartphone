import java.util.List;

public class ReprodutorMusical {
    public List<String> listarMusicas() {

        return List.of("Música 1", "Música 2", "Música 3");
    }

    public void tocarMusica(String musica) {
        System.out.println("Reproduzindo a música: " + musica);
    }
}
