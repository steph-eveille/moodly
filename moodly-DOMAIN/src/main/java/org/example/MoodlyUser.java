package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class MoodlyUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    public MoodlyUser(String name, String email, List<Activity> activities, List<MoodEntry> moods) {
        this.name = name;
        this.email = email;
        this.activities = activities;
        this.moods = moods;
    }

    @OneToMany(fetch = FetchType.LAZY)
    List<Activity> activities;

    @OneToMany(fetch = FetchType.LAZY)
    List<MoodEntry> moods;

    public MoodlyUser() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<MoodEntry> getMoods() {
        return moods;
    }

    public void setMoods(List<MoodEntry> moods) {
        this.moods = moods;
    }



}
