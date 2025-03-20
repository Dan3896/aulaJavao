import java.time.LocalDate;

public class exercicio{
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.name = "joao";
        conta1.numero = 123;
        conta1.agencia = 9999;
        conta1.saldo = 0.0;
        conta1.data = LocalDate.now();

        conta2.name = "joao";
        conta2.numero = 123;
        conta2.agencia = 9999;
        conta2.saldo = 0.0;
        conta2.data = LocalDate.now();

        

        conta1.depositar( 100.0);
        conta1.sacar(110.0);

        Conta conta3 = conta1;
        conta1.name = "ana";
        System.out.println(conta1.imprimir());
        System.out.println(conta3.imprimir());

        if(conta1 == conta3){
            System.out.println("sim sao iguais");
        }else{
            System.out.println("nao nao sao iguais");
        }

        if(conta1.equals(conta2)){
            System.out.println("sim sao iguais");
        }else{
            System.out.println("nao nao sao iguais");
        }


    }
}