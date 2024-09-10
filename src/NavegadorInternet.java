public class NavegadorInternet implements Dispositivo {
   @Override
   public void executar() {
       // Comportamento padrão ou menu
       System.out.println("Navegador de Internet:");
       exibirPagina("http://exemplo.com"); // Exemplo
   }

   public void exibirPagina(String url) {
       System.out.println("Exibindo a página: " + url);
   }

   public void adicionarNovaAba() {
       System.out.println("Nova aba adicionada.");
   }

   public void atualizarPagina() {
       System.out.println("Página atualizada.");
   }
}
