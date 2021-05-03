package com.example.demo.controller;

import com.example.demo.model.Location;
import com.example.demo.model.TrainingCordinator;
import com.example.demo.model.TrainingRoom;
import com.example.demo.repository.LocationRepository;
import com.example.demo.repository.TrainerCordinatorRepository;
import com.example.demo.repository.TrainingRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/generalapi")

// this is used retrieve location, trainer cordinator and training room
public class GeneralController {

    @Autowired
    private TrainerCordinatorRepository trainerCordinatorRepository;


    @Autowired
    private LocationRepository locationRepository;


    @Autowired
    private TrainingRoomRepository trainingRoomRepository;


    //get all trainerCordinators
    @GetMapping("/trainerCordinators")
    public List<TrainingCordinator> getAlltrainerCordinators() {
        return trainerCordinatorRepository.findAll();
    }

    //get all locations
    @GetMapping("/locations")
    public List<Location> getAlllocations() {
        return locationRepository.findAll();
    }


    //get all trainingRooms
    @GetMapping("/trainingRooms")
    public List<TrainingRoom> getAlltrainingRooms() {
        return trainingRoomRepository.findAll();
    }


}
