public class Usuario {
    public static void main(String[] args) throws Exception {
        Tv tv = new Tv();

        System.out.println(tv.ligada);
        System.out.println(tv.canal);
        System.out.println(tv.volume);

        tv.ligar();
        System.out.println("Tv ligada.");

        tv.selecionarCanal(5);
        System.out.println("Canal " + tv.canal);

        tv.avancarCanal();
        System.out.println("Canal " + tv.canal);

        tv.retrocederCanal();
        System.out.println("Canal " + tv.canal);

        tv.aumentarVolume();
        System.out.println("Volume " + tv.volume);

        tv.diminuirVolume();
        System.out.println("Volume " + tv.volume);
    }
}
