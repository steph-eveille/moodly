package org.example.converter;

import org.example.Activity;
import org.example.ActivityDto;
import org.example.ActivitySummaryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivityConverter {
    /*
    @Autowired
    MoodlyUserConverter moodlyUserConverter;

    public Activity convertToActivity(ActivityDto activityDto) {
        Activity activity = new Activity();

        activity.setId(activityDto.getId());
        activity.setUser(moodlyUserConverter.convertToMoodlyUser(activityDto.getUserDto()));

        activity.setName(activityDto.getName());
        activity.setDuration(activityDto.getDuration());
        activity.setDate(activityDto.getDate());

        return activity;
    }*/

    public ActivitySummaryDto convertToActivitySummaryDto(Activity activity) {
        ActivitySummaryDto activitySummaryDto = new ActivitySummaryDto();

        activitySummaryDto.setId(activity.getId());
        activitySummaryDto.setUserEmail(activity.getUser().getEmail());
        activitySummaryDto.setName(activity.getName());
        activitySummaryDto.setDuration(activity.getDuration());
        activitySummaryDto.setDate(activity.getDate());
        activitySummaryDto.setMood(activity.getMoodEntry().getMood());

        return activitySummaryDto;
    }

    /* TODO : convertToActivityDto */

}
