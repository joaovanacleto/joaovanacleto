package domain;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        
        System.out.println("Código: 1; Produto: Cachorro-Quente; Preço: 4,00;\n Código: 2; Produto: X-salada; Preço: 4,50\n Código: 3; Produto: X-bacon; Preço: 5,00\n Código: 4; produto: Torrada Simples; Preço: 2,00\n Código: 5; Produto: refrigerante; Preço: 1,50\n");
        
        double item;
        double qtd;
        double i1 = 4.00;
        double i2 = 4.50;
        double i3 = 5.00;
        double i4 = 2.00;
        double i5 = 1.50;
        double total;
        
        Scanner comprar = new Scanner(System.in);
        
        System.out.printf("Insira o código do produto: ");
        item = comprar.nextDouble();
        
        comprar.nextLine();
        
        System.out.printf("Insira a quantidade: ");
        qtd = comprar.nextDouble();
        
        if (item == 1){
            total = i1*qtd;
            System.out.println("Total a pagar: " + total);
        }else if (item ==2){
            total = i2*qtd;
            System.out.println("Total a pagar: " + total);
        }else if (item == 3){
            total = i3*qtd;
            System.out.println("Total a pagar: " + total);
        }else if (item == 4){
            total = i4*qtd;
            System.out.println("Total a pagar: " + total);
        }else {
            total = i5*qtd;
            System.out.println("Total a pagar: " + total);
        }
        
        System.out.println("Volte sempre!");
        
    }

}