package org.example.service;

import org.example.MoodlyUser;
import org.example.repository.MoodlyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoodlyUserServiceImpl implements MoodlyUserService {
    @Autowired
    MoodlyUserRepository moodlyUserRepository;

    @Override
    public MoodlyUser create(MoodlyUser moodlyUser) {
        return moodlyUserRepository.save(moodlyUser);
    }

    @Override
    public MoodlyUser getUser(Long id) {
        return moodlyUserRepository.findById(id).orElse(null);
    }
}
