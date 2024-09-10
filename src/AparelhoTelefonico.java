public class AparelhoTelefonico implements Dispositivo {
   @Override
   public void executar() {
       // Comportamento padrão ou menu
       System.out.println("Aparelho Telefônico:");
       ligar("123456789"); // Exemplo
   }

   public void ligar(String numero) {
       System.out.println("Ligando para o número: " + numero);
   }

   public void atender() {
       System.out.println("Chamada atendida.");
   }

   public void iniciarCorreioVoz() {
       System.out.println("Correio de voz iniciado.");
   }
}
