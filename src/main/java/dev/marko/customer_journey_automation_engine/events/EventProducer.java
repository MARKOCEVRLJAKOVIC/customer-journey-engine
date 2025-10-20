package dev.marko.customer_journey_automation_engine.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class EventProducer {

    private static final String TOPIC = "user-events";

    @Autowired
    private KafkaTemplate<String, Event> kafkaTemplate;

    public void sendEvent(Event event) {
        kafkaTemplate.send(TOPIC, event);
        System.out.println("Sent event: " + event.getType());
    }
}
