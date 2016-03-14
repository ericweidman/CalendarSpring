package com.theironyard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by ericweidman on 3/14/16.
 */
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String description;

    @Column(nullable = false)
    LocalDateTime dateTime;

    public Event() {
    }

    public Event(String description, LocalDateTime dateTime) {
        this.description = description;
        this.dateTime = dateTime;
    }
}
