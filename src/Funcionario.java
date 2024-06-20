import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao){
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }
    
    //2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).
    public BigDecimal getSalario(){
        return salario;
    }    
    public String getfuncao(){
        return funcao;
    }  
}
