
package exercíciosk19;


public class Conta {
   double saldo=2000;
   double limite=3000;
   int numero;
   double conssaldo;
    public void depositar(int valor){
        
        saldo += valor;
    }
    public void saca(int valor){
        
        if(saldo >= valor ){
          saldo -= valor;
          System.out.println("Seu saldo é : "+saldo);
        }
       
       else{
           System.out.println("Saldo Insuficiente");
        }
            
    }
    public void consultarsaldo(){
       
        if(conssaldo >= 0){
        
        conssaldo= saldo + limite;
       }
      System.out.println("Seu Saldo Geral é : "+conssaldo);
    }
}
