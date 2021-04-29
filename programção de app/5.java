package domain; 

public class HelloWorld { public static void main(String[] args) { 
int n = 5, aux = 0, resSoma = 0;
        for(int i=1; i<=20; i++, n+=5){
           
           if(i%2 == 1){//se é impar
               aux = n;
           }else{//se é par
               aux = (-1)*n;
           }
           resSoma += aux;
           System.out.println(aux);
        }
        System.out.println("Resultado da Soma é "+resSoma);
}


6-

public class Qst6 {

    public static void main(String[] args) {

        int t = 480;
        int b = 10;

        System.out.println(t);
        System.out.println("---");
        System.out.println(b + "\n");

        for (int i = 1; i <= 30; i++) {
            if (t > 0) {
                t = -t + 5;
            } else {
                t = -t - 5;
            }
            b = b + 1;

            System.out.println(t);
            System.out.println("---");
            System.out.println(b + "\n");
        }
    }
}




7-

class Main {
  public static void main(String[] args) {

    int i = 0;
    int num1 = 0;
    int num2 = 0;
    int total1 = 0;
    int total2 = 0;

    while(i < 10){
      i++;
      num1 = num1 + 2;
      num2 = num2 + 1;

      if(num2%2 != 0){
          System.out.println(num1 + "/" + num2);
          total1 = total1 + num1;
          total2 = total2 + num2;
      }
      else{
        System.out.println("-" + num1 + "/" + num2);
        total1 = total1 - num1;
        total2 = total2 + num2;
      }
    }
    System.out.println("O valor de S é: " + total1 + "/" + total2 + "!");
  }
}