
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        //3.1 Inserir todos os funcionarios
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));
    
        //3.2 Remover o funcionario Joao
        funcionarios.removeIf(func -> func.getNome().equals("João"));
            //Voltar no codigo e criar getName

        //3.3 Imprimir funcionarios e informações
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Cargo: " + funcionario.getfuncao());

            // Voltar no codigo pessoa e funcionario para criar getSalario, getCargo e getDataNascimento
        }
        
        // 3.4 - Aumentar o salário dos funcionários em 10%
        for(Funcionario funcionario : funcionarios){
            funcionario.setSalario(funcionario.getSalario().multiply(new BigDecimal("1.1")));
        }
        // 3.5 - Agrupar os funcionários por função em um MAP
        
        // 3.6 - Imprimir os funcionários agrupados por função
            // 3.7 - 
            // 3.8 - Imprimir os funcionários que fazem aniversário no mês 10 e 12
            // 3.9 - Imprimir o funcionário com a maior idade
            // 3.10 - Imprimir a lista de funcionários por ordem alfabética
            // 3.11 - Imprimir o total dos salários dos funcionários
            // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário
    
    
    
    
    
    
    
    
    
    }
}       
            
            