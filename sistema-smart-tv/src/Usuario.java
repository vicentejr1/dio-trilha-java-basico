public class Usuario {

    public static void main(String[] args) throws Exception {
           
         SmarTv smarTv = new SmarTv();

         System.out.println("TV está ligada? " + smarTv.ligada);
         System.out.println("Volume Atual? : " + smarTv.volume);
         System.out.println("Canal Atual? : " + smarTv.canal);

         smarTv.ligar();
         System.out.println("Novo Status -> TV está ligada? " + smarTv.ligada);

         smarTv.desligar();
         System.out.println("Novo Status -> TV está ligada? " + smarTv.ligada);

         smarTv.aumentarVolume();

         smarTv.diminuirVolumee();

         smarTv.aumentarCanal();
         System.out.println("Canal Atual? : " + smarTv.canal);

         smarTv.diminuirCanal();
         System.out.println("Canal Atual? : " + smarTv.canal);

         smarTv.mudarCanal(20);
         System.out.println("Canal Atual? : " + smarTv.canal);



         

    }
}
