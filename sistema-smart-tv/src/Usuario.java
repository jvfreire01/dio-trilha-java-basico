public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligarTv();

        System.out.println( "A tv está ligada? " + smartTv.ligada);

        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println(smartTv.volume);

        smartTv.aumentarCanal();

        smartTv.selecionarCanal(11);

        System.out.println(smartTv.canal);

        smartTv.desligarTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);

    }
}
