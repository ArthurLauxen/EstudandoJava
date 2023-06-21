public class Usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ?" + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume da TV: "+ smartTv.volume);

        smartTv.Ligar();
        System.out.println("Novo status: -> TV ligada? " + smartTv.ligada);
        
    }
}
