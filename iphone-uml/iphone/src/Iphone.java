public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet{
    public static void main(String[] args) {
        System.out.println("Iniciando iPhone...");

        ReprodutorMusical spotify = new Iphone();
        spotify.selecionarMusica();
        spotify.tocar();
        spotify.pausar();

        NavegadorInternet chrome = new Iphone();
        chrome.adiconarNovaAba();
        chrome.exibirPagina();
        chrome.atualizarPagina();

        AparelhoTelefonico vivoChip = new Iphone();
        vivoChip.atender();
        vivoChip.ligar();
        vivoChip.iniciarCorreioVoz();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música foi pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música foi selecionada");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void adiconarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}