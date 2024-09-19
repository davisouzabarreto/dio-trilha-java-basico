public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal (13);

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Tv ligada? " + smartTv.ligada);
        
        smartTv.Ligar ();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.Desligar ();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

    }
}
