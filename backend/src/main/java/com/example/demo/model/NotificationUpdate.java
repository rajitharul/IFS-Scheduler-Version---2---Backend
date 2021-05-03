package com.example.demo.model;

import javax.persistence.*;

@Entity
public class NotificationUpdate {


    @EmbeddedId
    TrainerNotificationKey id;

    @ManyToOne
    @MapsId("training_session_id")
    @JoinColumn(name = "training_session_id")
    TrainingSession trainingSession;

    public NotificationUpdate() {
    }

    public NotificationUpdate(TrainerNotificationKey id, TrainingSession trainingSession, Trainer trainer, int rating) {
        this.id = id;
        this.trainingSession = trainingSession;
        this.trainer = trainer;
        this.rating = rating;
    }

    public TrainerNotificationKey getId() {
        return id;
    }

    public void setId(TrainerNotificationKey id) {
        this.id = id;
    }

    public TrainingSession getTrainingSession() {
        return trainingSession;
    }

    public void setTrainingSession(TrainingSession trainingSession) {
        this.trainingSession = trainingSession;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @ManyToOne
    @MapsId("trainer_id")
    @JoinColumn(name = "trainer_id")
    Trainer trainer;

    int rating;

}
