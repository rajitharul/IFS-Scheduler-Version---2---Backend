package com.example.demo.repository;

import com.example.demo.model.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainingSessionRepository extends JpaRepository<TrainingSession,Long> {
}

