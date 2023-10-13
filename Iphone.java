public class Iphone implements ReprodutorMusical, AparelhoTelefonico,
 NavegadorNaInternet {

    private String estado;
    public Iphone() {
        estado = "Ligado";
        
        if (estado.equals("Desligado")) {
            ligar();
        }
    }

    @Override
    public void tocar(){
      System.out.println("Reproduzir música");
    }
    @Override
    public void pausar(){
        System.out.println("Pausar Música");
    }
    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando Música");   
    }
    @Override
    public void ligar(){
        estado = "Ligado";
        System.out.println("Ligando o Telefone"); 
    }
    @Override
    public void atender(){
       System.out.println("Atendendo nova chamada Telefônica"); 
    }
    @Override
    public void iniciarCorreioVoz(){
      System.out.println("Iniciando Correio de voz");  
    }
    @Override
    public void exibirPagina(){
       System.out.println("Exibindo página web"); 
    }
    @Override
    public void adicionarNovaAba(){
       System.out.println("Adicionando aba de navegador"); 
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página web");
    }
    public void verificarEstado(){
        System.out.println("O Telefone está: " + estado);
        atender();
        
    }
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.verificarEstado();
      
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        
        
    }
}
