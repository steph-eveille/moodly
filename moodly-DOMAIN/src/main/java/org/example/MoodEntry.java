package org.example;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class MoodEntry {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    private boolean mood;

    private String description;

    private LocalDate date ;


    public MoodEntry(User user, boolean mood, String description, LocalDate date) {
        this.user = user;
        this.mood = mood;
        this.description = description;
        this.date = date;
    }

    public MoodEntry() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isMood() {
        return mood;
    }

    public void setMood(boolean mood) {
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
