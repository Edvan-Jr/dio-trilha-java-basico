public class Tv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void selecionarCanal(int numero) {
         canal = numero;
    }

    public void avancarCanal() {
        canal++;
    }

    public void retrocederCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

}