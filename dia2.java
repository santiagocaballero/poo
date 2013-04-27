
import java.util.Scanner;





//Santiago Caballero
class dia {
    public static void main(String[] args){
       double h,m,s,t,p,a=0;
         Scanner teclado=new Scanner(System.in);
         System.out.println("Digite el numero de horas");
         h=teclado.nextInt();
         System.out.println("Digite el numero de minutos");
         m=teclado.nextInt();
         System.out.println("Digite el numero de segundos");
        s=teclado.nextInt();
        
        while (a!=-1) { 
        if(h==-1 & m==-1 & s==-1){
            a=-1;
        }if(h<=23 & h>=0 & s<=59 & s>=0 & s<=59 & m>=0 & m<=59 ){ 
         h=h*60*60;
           m=m*60;
           t=h+m+s;
           p=t/86400*100;
           System.out.println("el porcentaje de la hora digitada es:"+p+"%");
         }else{
             System.out.println("la hora digitada no es correcta");
         }
        System.out.println("Digite el numero de horas");
         h=teclado.nextInt();
         System.out.println("Digite el numero de minutos");
         m=teclado.nextInt();
         System.out.println("Digite el numero de segundos");
        s=teclado.nextInt();
        if(h==-1 & m==-1 & s==-1){
            a=-1;
        }
        }
  }
}
