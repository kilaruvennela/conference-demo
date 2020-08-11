package com.pluralsight.coferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.coferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
