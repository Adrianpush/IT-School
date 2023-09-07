package session12.homework.fitness_center_management.gym.fitness_classes;

import session12.homework.fitness_center_management.gym.FitnessInstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GymWorkout extends FitnessClass {

    public GymWorkout(LocalDateTime startTime, FitnessInstructor instructor) {
        this.setStartTime(startTime);
        this.setInstructor(instructor);
        this.setParticipants(new ArrayList<>());
        this.setFitnessClassType(FitnessClassTypes.GYM_WORKOUT);
        this.setDuration(Duration.ofHours(1));
        this.setLocation("Gym");
        this.setMaximumParticipants(12);
    }
}
