package org.example.repository;

import org.example.MoodlyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodlyUserRepository extends JpaRepository<MoodlyUser, Long> {
}
