package org.example.controller;

import org.example.ActivitySummaryDto;
import org.example.MoodlyUserDto;
import org.example.converter.MoodlyUserConverter;
import org.example.service.MoodlyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class MoodlyUserController {


    @Autowired
    MoodlyUserService moodlyUserService;

    @Autowired
    MoodlyUserConverter moodlyUserConverter;


    @PostMapping
    void createUser(@RequestBody MoodlyUserDto moodlyUserDto) {
        moodlyUserService.create(moodlyUserConverter.convertToMoodlyUser(moodlyUserDto));
    }

    @GetMapping("/{id}")
    MoodlyUserDto getUserById(@PathVariable("id") Long id) {
        return moodlyUserConverter.convertToMoodlyUserDto(moodlyUserService.getUser(id));
    }

    @GetMapping("/{id}/happy-activities")
    List<ActivitySummaryDto> getHappyActivities(@PathVariable("id") Long userId) {
        return null;
    }

    @GetMapping("/{id}/sad-activities")
    List<ActivitySummaryDto> getSadActivities(@PathVariable("id") Long userId) {
        return null;
    }


}
