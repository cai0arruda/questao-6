package application.dto;

public class NotaProcessadaEvent {

    private String aluno;
    private String trabalho;
    private Double nota;
    private Double media;
    private String status;

    public NotaProcessadaEvent(String aluno,
                               String trabalho,
                               Double nota,
                               Double media,
                               String status) {
        this.aluno = aluno;
        this.trabalho = trabalho;
        this.nota = nota;
        this.media = media;
        this.status = status;
    }

}  