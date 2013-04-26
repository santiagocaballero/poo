//Santiago Caballero
import java.util.Scanner;
class histograma{
    public static void main(String[] args){
       int[] num = new int[20]; 
            for (int i = 0; i <=19; i++) {
                Scanner teclado=new Scanner(System.in);
                System.out.println("Digite un numero");
                num[i]=teclado.nextInt();
            }
                   double x=1000;
                   double y=0;
                      for (int i = 0; i <=19; i++) {
                           if(x>=num[i]){    
                              x=num[i]; //numero menos
                           }if (y<=num[i]){
                               y=num[i];  //numero mayor
                          }
                      }
                              double z;
                              double s;
                              z=y-x;  //cuantos numeros hay entre el mayor y el menor
                              s=z/10; 
                               double[] rango = new double[10];
                               rango[0]=x+s;  
                              for (int i = 1; i <=9; i++) {
                                rango[i]=rango[i-1]+s;
         
                               }
                             int[] lista = new int[10];
                             for (int i = 0; i <= 19; i++) {
                                if (num[i]>=x & num[i]<rango[0]){
                                  lista[0]=lista[0]+1;
                                }else if(num[i]>=rango[0] & num[i]<rango[1]){
                                  lista[1]=lista[1]+1;
                                } else if(num[i]>=rango[1] & num[i]<rango[2]){
                                  lista[2]=lista[2]+1;
                                }else if(num[i]>=rango[2] & num[i]<rango[3]){
                                  lista[3]=lista[3]+1;
                                }else if(num[i]>=rango[3] & num[i]<rango[4]){
                                  lista[4]=lista[4]+1;
                                }else if(num[i]>=rango[4] & num[i]<rango[5]){
                                  lista[5]=lista[5]+1;
                                }else if(num[i]>=rango[5] & num[i]<rango[6]){
                                  lista[6]=lista[6]+1;
                                }else if(num[i]>=rango[6] & num[i]<rango[7]){
                                  lista[7]=lista[7]+1;
                                }else if(num[i]>=rango[7] & num[i]<rango[8]){
                                  lista[8]=lista[8]+1;
                                }else{
                                  lista[9]=lista[9]+1;
                                }
                             }
                                   System.out.println("el histograma es: ");
                                   System.out.println("entre "+x+" y "+rango[0]+"= "+lista[0]);
                                   for (int i = 1; i <=9; i++) {
                                      System.out.println("entre "+rango[i-1]+" y "+rango[i]+"= "+lista[i]);
                                    }
      }
  }

