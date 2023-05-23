package org.example.service;

import org.example.MoodlyUser;

public interface MoodlyUserService {
    MoodlyUser create(MoodlyUser user) ;

    MoodlyUser getUser(Long id);


}
