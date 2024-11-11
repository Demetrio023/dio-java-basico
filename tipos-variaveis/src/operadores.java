import java.util.Date;

public class operadores {

    public static void main(String[] args) {
        //exercicio de cadatro de  candidato  //
       /// informaçoes do candidato ///
        int numeroDeIncriçao = 2411987;
        String nome = "Demetrio";
        int   idade = 37;
        double peso = 69.5;
        char sexo = 'M';
        boolean doadorDeOrgao = false;
        Date dataDeIncriçao  = new Date();

        
        System.out.println("CANDIDATO " + "INCRIÇÂO: "+ numeroDeIncriçao);

        System.out.println("NOME: "+ nome); 
        System.out.println("IDADE: "+ idade); 
        System.out.println("PESO: "+ peso); 
        System.out.println("SEXO: "+ sexo); 
        System.out.println("DOADOR DE ORGÃOS : "+ doadorDeOrgao); 
        System.out.println("DATA DE INCRIÇÂO: "+ dataDeIncriçao); 

    }
}