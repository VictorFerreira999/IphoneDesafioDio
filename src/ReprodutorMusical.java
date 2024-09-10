public class ReprodutorMusical implements Dispositivo {
    @Override
    public void executar() {
        // Comportamento padrão ou menu
        System.out.println("Reprodutor Musical:");
        tocar();
    }

    public void tocar() {
        System.out.println("Música está tocando.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
