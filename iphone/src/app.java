package Iphone;

public class app {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.selecionarMusica("Música 1");
        iPhone.fazerChamada("111111111");
        iPhone.abrirSite("www.example.com");
        iPhone.pause();
        iPhone.fecharSite();
        iPhone.play();
        iPhone.receberChamada("111111111");

    }
}