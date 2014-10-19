
package exercíciosk19;
import java.util.Scanner;
public class ExercíciosK19 {

  
    public static void main(String[] args) {
        
        Conta cnt=new Conta();
        Scanner scn= new Scanner(System.in);
        System.out.println("Digite o Valor a ser Sacado");
        int valor= scn.nextInt();
        cnt.saca(valor);
        cnt.consultarsaldo();
        
    }    
}
