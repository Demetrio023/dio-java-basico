public class SmartTv {
    
        
        boolean ligada =false;
        int canal = 1;
        int volume = 25;
        
        
    public void ligar (boolean ligaDeliga){
    ligada = ligaDeliga;
    if (ligaDeliga==true){
        System.out.println(" a tv esta ligada ");
    }else if(ligaDeliga==false){
        System.out.println("a tv esta desligada");
    }else{
        System.out.println("lique a tv !");
    }
        
    }  
    //public void desligar (){
    // ligada = false;
        
    //}  
    public void almentarVolume (){
        volume = volume +1;
        //System.out.println(+volume);
        volume++;
    
        
    }
    public void diminuirVolume (){
        volume = volume -1;
         volume--;
    }
    public void mudarCanal(int novoCanal){
      canal  = novoCanal;

    }
    public void aumentarCanal (){
       canal = +1;
    }
    public void diminuirCanal (){
        canal  ++ ;
    }
}
