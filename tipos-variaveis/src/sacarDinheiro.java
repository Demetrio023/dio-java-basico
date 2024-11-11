public class sacarDinheiro {
    public static void main(String[] args) {
        conta1 conta1 = new conta1();

      conta1.sacar(125);

      //System.out.println("fiz um saque no valor de 125R$ e meu saldo agora e "+conta1.saldo);

      conta1.depositar(3987);
      //System.out.println("fiz um deposito e meu saldo agora e "+ conta1.saldo);

        System.out.println("saldo atual "+conta1.saldo);
        
   
         
    }
}
