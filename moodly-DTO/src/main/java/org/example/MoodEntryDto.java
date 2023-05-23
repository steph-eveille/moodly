package org.example;

import java.time.LocalDate;

public class MoodEntryDto {
    private Long id;

    private MoodlyUserDto user;

    private boolean mood;

    private String description;

    private LocalDate date ;

    public MoodEntryDto(Long id, MoodlyUserDto user, boolean mood, String description, LocalDate date) {
        this.id = id;
        this.user = user;
        this.mood = mood;
        this.description = description;
        this.date = date;
    }

    public MoodEntryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoodlyUserDto getUser() {
        return user;
    }

    public void setUser(MoodlyUserDto user) {
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
