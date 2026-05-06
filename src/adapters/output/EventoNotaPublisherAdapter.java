package adapters.output;

import application.dto.NotaProcessadaEvent;
import domain.ports.output.IEventoNotaPublisher;

public class EventoNotaPublisherAdapter
        implements IEventoNotaPublisher {

    @Override
    public void publicar(NotaProcessadaEvent evento) {

        System.out.println(
            "Enviando evento para o EDA: "
            + evento.getAluno()
        );

        // futura integração:
        // RabbitMQ
        // Kafka
        // REST
    }
}