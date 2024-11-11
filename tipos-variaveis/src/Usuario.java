public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar(true);
        //System.out.println("a tv esta ligada " + smartTv.ligada);

         System.out.println("a tv ligou no canal  "+smartTv.canal);

         smartTv.mudarCanal(13);
         System.out.println("o canal agora e  "+smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        
        
        smartTv.almentarVolume();
        System.out.println("o volume esta no  "+smartTv.volume);

        smartTv.ligar(false);
        

       
        
        
    
        
    }
}
