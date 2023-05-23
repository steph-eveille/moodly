package org.example.converter;

import org.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MoodlyUserConverter {

    @Autowired
    ActivityConverter activityConverter;

    public MoodlyUser convertToMoodlyUser(MoodlyUserDto moodlyUserDto) {

        if (moodlyUserDto == null) return null;

        MoodlyUser moodlyUser = new MoodlyUser();
        moodlyUser.setId(moodlyUserDto.getId());
        moodlyUser.setName(moodlyUserDto.getName());
        moodlyUser.setEmail(moodlyUserDto.getEmail());

// TODO
//        List<Activity> activities = moodlyUserDto
//                .getActivitiesSummaryDto()
//                .stream()
//                .map(  )
//                .collect(Collectors.toList());
//
//        moodlyUser.setActivities(activities);
//
        /* TODO conversion moods */

        return moodlyUser;
    }

    public MoodlyUserDto convertToMoodlyUserDto(MoodlyUser moodlyUser) {
        if (moodlyUser == null) return null;

        MoodlyUserDto moodlyUserDto = new MoodlyUserDto();

        moodlyUserDto.setId(moodlyUser.getId());
        moodlyUserDto.setName(moodlyUserDto.getName());
        moodlyUserDto.setEmail(moodlyUserDto.getEmail());

        List<ActivitySummaryDto> activitySummaryDtoList = moodlyUser.getActivities()
                .stream()
                .map(activity -> activityConverter.convertToActivitySummaryDto(activity))
                .collect(Collectors.toList());

        moodlyUserDto.setActivitiesSummaryDto(activitySummaryDtoList);

        /* TODO conversion moods */

        return moodlyUserDto;
    }


}
