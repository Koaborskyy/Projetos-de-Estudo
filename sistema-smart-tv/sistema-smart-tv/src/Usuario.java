public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
            smartTv.ligar();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.diminuirVolume();
            smartTv.mudarCanal(18);
            smartTv.aumentarCanal();
            smartTv.diminuirCanal();
            smartTv.diminuirCanal();
        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);
    }
}
