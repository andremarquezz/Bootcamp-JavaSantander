import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    public List<String> getMusicas() {
        return musicas;
    }

    private final List<String> musicas;

    public ReprodutorMusical() {
        this.musicas = new ArrayList<>();
    }

    public void tocar(){
        System.out.println("Tocando Musica");
    }
    public void pausar(){
        System.out.println("Pausando Musica");
    }
    public void SelecionarMusica(){
        System.out.println("Selecionando Musica");
    }
}
