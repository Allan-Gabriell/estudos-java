package entities;

public class aluno {
    private String nome;
    private Number matricula;
    private Double nota1, nota2, trabalho;
    private Double media;

    public aluno(String nome, Number matricula, Double nota1, Double nota2, Double trabalho, Double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
        this.media = media();
    }

    public double media() {
        Double soma = (this.nota1 * 2.5) + (this.nota2 * 2.5) + (this.trabalho * 2);
        this.media = soma/7;
        return this.media;
    }

    
}
