import java.time.LocalDate;

public class Conta {
    public String name;
    public int numero;
    public int agencia;
    public double saldo;
    public LocalDate data;

    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
            return true;
        }
        return false;
        
    }
    public void calcula(){
        this.saldo = this.saldo *= 1.1;
    }

    public String imprimir(){
        return String.format("[agencia: %d, numero: %d, name: %s, data criacao: %s, saldo: %f]",
            agencia, numero, name, data.toString(), saldo);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        result = prime * result + agencia;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conta other = (Conta) obj;
        if (numero != other.numero)
            return false;
        if (agencia != other.agencia)
            return false;
        return true;
    }

    

}
