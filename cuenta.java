
import java.util.Scanner;

//Santiago Caballero
class cuenta {
    public static void main(String[] args){
         double s,g,c,n,z,h = 0;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Digite su salario");
            s=teclado.nextInt();
            System.out.println("Digite sus gastos");
            g=teclado.nextInt();
            System.out.println("Digite su cuota de manejo");
            c=teclado.nextInt();
            System.out.println("Digite el numero de meses");
            n=teclado.nextInt();
            for (int i = 1; i <=n; i++) {
                
             z = s-g-c;
             z = z*1.1;
             h = h+z;
             
            
        }
            System.out.println("su cuenta de ahorros es:"+h);
    }
}
