package org.example;

import java.time.LocalDate;

public class ActivityDto {
    private Long id;


    private MoodlyUserDto userDto;

    private String name; // nom de l'activité (ex : course, lecture...)

    private Integer duration; // minutes

    private LocalDate date;

    private boolean mood;


    public ActivityDto(Long id, MoodlyUserDto userDto, String name, Integer duration, LocalDate date, boolean mood) {
        this.id = id;
        this.userDto = userDto;
        this.name = name;
        this.duration = duration;
        this.date = date;
        this.mood = mood;
    }

    public ActivityDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoodlyUserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(MoodlyUserDto userDto) {
        this.userDto = userDto;
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
