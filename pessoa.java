import java.time.LocalDate;

public class pessoa{
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa (String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
    
    

//     public String getNome() {
//         return nome;
//     }

//     public LocalDate getDataNascimento() {
//         return dataNascimento;
//     }

//     public String getDataNascimentoFormatada() {
//         return dataNascimento.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//     }
// }




