1.
class Main {

 public static void main(String[] args) {

   int c = produto(5,3);
   System.out.println("produto: " + c);
 }
  public static int produto(int a, int b){
   return a*b;
 }
 }

2. 
import java.util.Scanner;

class Main{
public static void main (String[] args){
 Scanner reader = new Scanner(System.in);
System.out.println("Vamos dividir!");
System.out.println("informe aqui o primeiro número");
double grade1 = reader.nextDouble();
System.out.println("Informe aqui o segundo número");
double grade2 = reader.nextDouble();

double finalGrade = grade1/grade2;
System.out.println("O resultado é: " + finalGrade);
}
}

3.
class Main {

  public static void main(String[] args) {
     
     imprimir1_100();
     imprimir101_200();
     imprimir201_300();
    
   }
  
   public static void imprimir1_100(){
     for(int i=1; i<=100; i++)
       System.out.print(i + " "); 
   }

public static void imprimir101_200(){
 for(int i=101; i<=200; i++)
   System.out.print(i + " ");
}

public static void imprimir201_300(){
 for(int i=201; i<=300; i++)
   System.out.print(i + " ");
}

}

4. 
class Main {
 public static void main(String[] args) {
  int [] vetor1 = new int[5];
      
 vetor1[0] = 0;
 vetor1[1] = 2;
 vetor1[2] = 8;
 vetor1[3] = 10;
 vetor1[4] = 30;
    
 for(int i=0; i<5; i++)
   System.out.println(vetor1[i]);

 int [] vetor2 = new int[5];

 vetor2[0] = 4;
 vetor2[1] = 8;
 vetor2[2] = 4;   
 vetor2[3] = 6;
 vetor2[4] = 12;

 for (int i=0; i<5; i++)
   System.out.println(vetor2[i]);

 int [] vetor3 = new int[5];

 vetor3[0] = vetor1[0] + vetor2[0]; 
 vetor3[1] = vetor1[1] + vetor2[1];
 vetor3[2] = vetor1[2] + vetor2[2];
 vetor3[3] = vetor1[3] + vetor2[3];
 vetor3[4] = vetor1[4] + vetor2[4];
  
for (int i=0; i<5; i++)
  System.out.println(vetor3[i]);
  }
}

