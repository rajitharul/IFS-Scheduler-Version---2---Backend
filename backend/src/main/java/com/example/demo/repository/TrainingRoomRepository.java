package com.example.demo.repository;

import com.example.demo.model.TrainingCordinator;
import com.example.demo.model.TrainingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRoomRepository extends JpaRepository<TrainingRoom,Long> {

}

