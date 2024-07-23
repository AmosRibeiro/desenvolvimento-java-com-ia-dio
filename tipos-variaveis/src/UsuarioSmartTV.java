public class UsuarioSmartTV {
    public static void main (String[] args) throws Exception {
        SmartTV smartTv= new SmartTV();

        System.out.println("Tv Ligada? "+ smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume: "+ smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Desligada "+ smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: "+ smartTv.canal);

    }
}
