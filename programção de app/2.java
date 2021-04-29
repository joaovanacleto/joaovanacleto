package domain;

public class HelloWorld {

    public static void main(String[] args) {
        
        int idade = 15;
        
        if(idade <= 10){
            System.out.println("nadador na categoria infantil");
        }else if(idade <=13){
            System.out.println("nadador na categoria inafanto juvenil");
        }else if(idade <=17){
            System.out.println("nadador na categoria juvenil");
        }else if(idade >=18){
            System.out.println("nadador na categoria inafanto adulto");
        }
        
    }
}
