package domain.ports.output;

import application.dto.NotaProcessadaEvent;

public interface IEventoNotaPublisher {
    void publicar(NotaProcessadaEvent evento);
}