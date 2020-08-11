package com.pluralsight.coferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.coferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
