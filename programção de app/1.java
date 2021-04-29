1
package domain;

public class HelloWorld {

    public static void main(String[] args) {
        double p1 = 10, p2 = 7;
        
        double média = (p1 + p2)/2;
        
        System.out.println("Média " + média);
        
        if(média >= 6){
            System.out.println("aprovado");
        }else{
            System.out.println("exame");
            
            double novap = 7, novamedia = (média + novap)/2;
        System.out.println("nova média" + novamedia);
        
        if(novamedia >= 6){
            System.out.println("aprovado em exame");
        }else{
            System.out.println("repovado");
        }
        }
        
        
        
    }
}


