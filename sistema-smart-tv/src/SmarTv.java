public class SmarTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
       ligada=true;
    }
    public void desligar(){
        ligada=false;
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume para: " + volume);
    }
    public void diminuirVolumee(){
        volume--;
        System.out.println("Diminuindo Volume para: " + volume);
    }

    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

}