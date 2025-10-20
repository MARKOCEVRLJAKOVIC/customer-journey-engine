package dev.marko.customer_journey_automation_engine.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    @Autowired
    private EventRepository repository;

    @KafkaListener(topics = "user-events", groupId = "cjae-group")
    public void consume(Event event) {
        repository.save(event);
        System.out.println("Consumed and saved event: " + event.getType());
    }
}