public class iPhone {
    ReprodutorMusical ipod;
    Navegador safari;

    public iPhone() {
        ipod = new ReprodutorMusical();
        safari = new Navegador();
    }

    public void ligar(){
        System.out.println("Ligando");
    }   public void atender(){
        System.out.println("Atendendo");
    }   public void iniciarCorreioVoz(){
        System.out.println("Escutando correio de voz");
    }
}
