
import java.util.Scanner;

//santiago caballero 
class bisiesto {
    public static void main(String[] args){
         int a;
            Scanner teclado=new Scanner(System.in);
            System.out.println("ingrese un año");
            a=teclado.nextInt();
            while (a!=-1) { 
               if ( a % 4==0 & a%100!=0){
                  System.out.println( "el año es bisiesto no multiplo de 100");
             }else {
                    System.out.println("el año no es bisiesto");
               }
                System.out.println("ingrese un año");
                 a=teclado.nextInt();
       } 
   }
}