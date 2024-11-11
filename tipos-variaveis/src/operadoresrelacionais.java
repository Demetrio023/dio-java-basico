public class operadoresrelacionais {
    public static void main(String[] args) {
        int nunero1 =3;
        int nunero2 =2;

        boolean simNao = nunero1==nunero2;
        System.out.println( "numero1 e iqual ao numero2: "+simNao);

        simNao = nunero1!= nunero2;
        System.out.println("numero1 e diferente de numero2: "+simNao);

        simNao = nunero1 < nunero2;
        System.out.println("numero1 e maior que numero2: "+simNao);
        
        if(nunero1 < nunero2 ){
            System.out.println("verdadeiro");

        }else if (nunero1==nunero2) {System.out.println("sao iquais ");
            
        }else{
            System.out.println("e maior ");
        }

    }
}
