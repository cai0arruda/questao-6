package application.service;

import application.dto.NotaProcessadaEvent;
import domain.model.Nota;
import domain.ports.output.IEventoNotaPublisher;

public class GerenciadorAvaliacoes {

    private final IEventoNotaPublisher eventoPublisher;

    public GerenciadorAvaliacoes(
            IEventoNotaPublisher eventoPublisher) {

        this.eventoPublisher = eventoPublisher;
    }

    public void processarNota(Nota nota) {

        // regras de negócio

        NotaProcessadaEvent evento =
            new NotaProcessadaEvent(
                nota.getAluno().getNome(),
                nota.getTrabalho().getTitulo(),
                nota.getValor(),
                7.5,
                "APROVADO"
            );

        eventoPublisher.publicar(evento);
    }
}