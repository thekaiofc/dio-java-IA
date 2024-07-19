public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(15);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(17);

        System.out.println("canal atual: " + smartTv.canal);
        
        smartTv.ligar();
        System.out.println("'Novo Status'-> TV ligada? " + smartTv.ligada);
    }
}
