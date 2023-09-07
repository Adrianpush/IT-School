package session12.homework.fitness_center_management.gym.fitness_classes;

import session12.homework.fitness_center_management.gym.FitnessInstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class PersonalTraining extends FitnessClass{

    public PersonalTraining(LocalDateTime startTime, FitnessInstructor instructor, String location) {
        this.setStartTime(startTime);
        this.setInstructor(instructor);
        this.setParticipants(new ArrayList<>());
        this.setLocation(location);
        this.setFitnessClassType(FitnessClassTypes.PERSONAL_TRAINING);
        this.setDuration(Duration.ofHours(2));
        this.setMaximumParticipants(1);
    }
}
