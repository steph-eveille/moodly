package org.example;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MoodlyUser user;

    private String name; // nom de l'activité (ex : course, lecture...)

    private Integer duration; // minutes

    private LocalDate date;

    @OneToOne
    private MoodEntry moodEntry; // 1 seule humeur (synthétique) par activité

    public Activity(MoodlyUser user, String name, Integer duration, LocalDate date, MoodEntry moodEntry) {
        this.user = user;
        this.name = name;
        this.duration = duration;
        this.date = date;
        this.moodEntry = moodEntry;
    }

    public Activity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoodlyUser getUser() {
        return user;
    }

    public void setUser(MoodlyUser user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MoodEntry getMoodEntry() {
        return moodEntry;
    }

    public void setMoodEntry(MoodEntry moodEntry) {
        this.moodEntry = moodEntry;
    }
}
