package org.example;

import java.util.List;

public class MoodlyUserDto {

    private Long id;

    private String name;
    private String email;

    List<ActivitySummaryDto> activitiesSummaryDto;
    List<MoodEntryDto> moodsDto;

    public MoodlyUserDto(Long id, String name, String email, List<ActivitySummaryDto> activitiesSummaryDto, List<MoodEntryDto> moodsDto) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.activitiesSummaryDto = activitiesSummaryDto;
        this.moodsDto = moodsDto;
    }

    public MoodlyUserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ActivitySummaryDto> getActivitiesSummaryDto() {
        return activitiesSummaryDto;
    }

    public void setActivitiesSummaryDto(List<ActivitySummaryDto> activitiesSummaryDto) {
        this.activitiesSummaryDto = activitiesSummaryDto;
    }

    public List<MoodEntryDto> getMoodsDto() {
        return moodsDto;
    }

    public void setMoodsDto(List<MoodEntryDto> moodsDto) {
        this.moodsDto = moodsDto;
    }
}
