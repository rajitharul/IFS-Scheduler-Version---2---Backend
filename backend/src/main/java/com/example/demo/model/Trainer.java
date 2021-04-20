package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainer" )
public class Trainer {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long trainerId;

    @Column(name = "name" , unique=true,nullable = false)
    private  String name;

    @Column(name = "Type")
    private  String type;

    @ElementCollection
    @CollectionTable(
            name = "Qualification",
            joinColumns = @JoinColumn(name = "trainerId")
    )
    private List<String> qualifications;

    public List<String> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<String> qualifications) {
        this.qualifications = qualifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Trainer() {
    }

    @ManyToMany(fetch = FetchType.LAZY , cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "training_session_trainer",
            joinColumns = @JoinColumn(name = "trainer_id"),
            inverseJoinColumns = @JoinColumn(name = "training_session_id")
    )

    @JsonIgnoreProperties("trainers")
    private List<TrainingSession> trainingSessions;


    public Trainer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public void setTrainingSessions(List<TrainingSession> trainingSessions) {
        this.trainingSessions = trainingSessions;
    }



    public long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(long trainerId) {
        this.trainerId = trainerId;
    }


    public void add(TrainingSession tempSession) {

        if(trainingSessions ==null) {

            trainingSessions = new ArrayList<TrainingSession>();

        }

        trainingSessions.add(tempSession);


    }


    public void addQualification(String qualification) {

        if(qualifications ==null) {

            qualifications = new ArrayList<String>();

        }

        qualifications.add(qualification);

    }





    @OneToMany(fetch = FetchType.LAZY,mappedBy = "trainer" ,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}
    )
    @JsonIgnore
   private List<Leave> leaveApplications;


    public List<Leave> getLeaveApplications() {
        return leaveApplications;
    }

    public void setLeaveApplications(List<Leave> leaveApplications) {
        this.leaveApplications = leaveApplications;
    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;




}
