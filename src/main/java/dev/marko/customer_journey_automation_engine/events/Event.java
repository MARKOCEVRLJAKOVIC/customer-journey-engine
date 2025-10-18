package dev.marko.customer_journey_automation_engine.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document("/events")
public class Event {

    @Id
    private String id;
    private String userId;
    private String type;
    private Instant timestamp;

}
