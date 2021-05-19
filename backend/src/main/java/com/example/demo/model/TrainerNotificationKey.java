package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TrainerNotificationKey implements Serializable {


    @Column(name = "training_session_id")
    Long training_session_id;

    @Column(name = "trainer_id")
    Long trainer_id;


    public Long getTraining_session_id() {
        return training_session_id;
    }

    public void setTraining_session_id(Long training_session_id) {
        this.training_session_id = training_session_id;
    }

    public Long getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(Long trainer_id) {
        this.trainer_id = trainer_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerNotificationKey that = (TrainerNotificationKey) o;
        return Objects.equals(training_session_id, that.training_session_id) && Objects.equals(trainer_id, that.trainer_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(training_session_id, trainer_id);
    }
}
