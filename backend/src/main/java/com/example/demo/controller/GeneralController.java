package com.example.demo.controller;

import com.example.demo.model.*;
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


    @PostMapping("/trainerCordinators")
    public TrainingCordinator addTrainingCordinator(@RequestBody TrainingCordinator trainingCordinator) {

        return trainerCordinatorRepository.save(trainingCordinator);
    }




    //get all locations
    @GetMapping("/locations")
    public List<Location> getAlllocations() {
        return locationRepository.findAll();
    }


    @PostMapping("/locations")
    public Location addLocation(@RequestBody Location location) {

        return locationRepository.save(location);
    }

    //get all trainingRooms
    @GetMapping("/trainingRooms")
    public List<TrainingRoom> getAlltrainingRooms() {
        return trainingRoomRepository.findAll();
    }


    @PostMapping("/trainingRooms")
    public TrainingRoom addTrainingCordinator(@RequestBody TrainingRoom trainingRoom) {

        return trainingRoomRepository.save(trainingRoom);
    }




}
