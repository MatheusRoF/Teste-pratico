import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        
        // 3.1 - Inserir todos os funcionários
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

        // 3.2 - Remover o funcionário “João” da lista
        funcionarios.removeIf(func -> func.getNome().equals("João"));

        // 3.3 - Imprimir todos os funcionários com todas suas informações
        for (Funcionario func : funcionarios) {
            System.out.println("Nome: " + func.getNome() + ", Data de Nascimento: " + func.getDataNascimentoFormatada() +
                    ", Salário: R$ " + func.getSalarioFormatado() + ", Função: " + func.getFuncao());
        }

        // 3.4 - Aumentar o salário dos funcionários em 10%
        for (Funcionario func : funcionarios) {
            func.setSalario(func.getSalario().multiply(new BigDecimal("1.10")));
        }

        // 3.5 - Agrupar os funcionários por função em um MAP
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream().collect(Collectors.groupingBy(Funcionario::getFuncao));

        // 3.6 - Imprimir os funcionários agrupados por função
        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {
            System.out.println("Função: " + entry.getKey());
            for (Funcionario func : entry.getValue()) {
                System.out.println("  Nome: " + func.getNome() + ", Data de Nascimento: " + func.getDataNascimentoFormatada() +
                        ", Salário: R$ " + func.getSalarioFormatado());
            }
        }

        // 3.8 - Imprimir os funcionários que fazem aniversário no mês 10 e 12
        System.out.println("Funcionários que fazem aniversário em Outubro e Dezembro:");
        for (Funcionario func : funcionarios) {
            int month = func.getDataNascimento().getMonthValue();
            if (month == 10 || month == 12) {
                System.out.println("  Nome: " + func.getNome() + ", Data de Nascimento: " + func.getDataNascimentoFormatada());
            }
        }

        // 3.9 - Imprimir o funcionário com a maior idade
        Funcionario maisVelho = Collections.max(funcionarios, Comparator.comparing(func -> Period.between(func.getDataNascimento(), LocalDate.now()).getYears()));
        int idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println("Funcionário com maior idade: Nome: " + maisVelho.getNome() + ", Idade: " + idade);

        // 3.10 - Imprimir a lista de funcionários por ordem alfabética
        List<Funcionario> funcionariosOrdenados = new ArrayList<>(funcionarios);
        funcionariosOrdenados.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("Funcionários em ordem alfabética:");
        for (Funcionario func : funcionariosOrdenados) {
            System.out.println("  Nome: " + func.getNome() + ", Data de Nascimento: " + func.getDataNascimentoFormatada() +
                    ", Salário: R$ " + func.getSalarioFormatado());
        }

        // 3.11 - Imprimir o total dos salários dos funcionários
        BigDecimal totalSalarios = funcionarios.stream().map(Funcionario::getSalario).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total dos salários: R$ " + String.format("%,.2f", totalSalarios));

        // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("Salários em relação ao salário mínimo:");
        for (Funcionario func : funcionarios) {
            BigDecimal salariosMinimos = func.getSalario().divide(salarioMinimo, 2, BigDecimal.ROUND_HALF_UP);
            System.out.println("  Nome: " + func.getNome() + ", Salários mínimos: " + salariosMinimos);
        }
    }
}