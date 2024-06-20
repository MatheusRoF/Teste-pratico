import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    // 1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).
    
    // Criando getNome para 3.2
    public String getNome(){
        return nome;
}
    //Criando getDataNascimento para 3.3
    public String getDataNascimento(){
        return dataNascimento.toString();
    }
}
