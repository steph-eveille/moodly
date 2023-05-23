package org.example;

import java.time.LocalDate;

public class ActivitySummaryDto {
    private Long id;


    private String userEmail;

    private String name; // nom de l'activité (ex : course, lecture...)

    private Integer duration; // minutes

    private LocalDate date;

    private boolean mood;


    public ActivitySummaryDto(String userEmail, String name, Integer duration, LocalDate date, boolean mood) {
        this.userEmail = userEmail;
        this.name = name;
        this.duration = duration;
        this.date = date;
        this.mood = mood;
    }

    public ActivitySummaryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
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

    public boolean isMood() {
        return mood;
    }

    public void setMood(boolean mood) {
        this.mood = mood;
    }
}
