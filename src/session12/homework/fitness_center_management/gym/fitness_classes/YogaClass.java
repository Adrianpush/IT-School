package session12.homework.fitness_center_management.gym.fitness_classes;

import session12.homework.fitness_center_management.gym.FitnessInstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class YogaClass extends FitnessClass {

    public YogaClass(LocalDateTime startTime, FitnessInstructor instructor) {
        this.setStartTime(startTime);
        this.setInstructor(instructor);
        this.setParticipants(new ArrayList<>());
        this.setFitnessClassType(FitnessClassTypes.YOGA_CLASS);
        this.setLocation("Yoga Room");
        this.setMaximumParticipants(30);
        this.setDuration(Duration.ofHours(2));
    }
}
