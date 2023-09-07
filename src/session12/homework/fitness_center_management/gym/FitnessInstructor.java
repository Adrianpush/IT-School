package session12.homework.fitness_center_management.gym;

import java.util.UUID;

public class FitnessInstructor {

    private String firstName;
    private String lastName;
    private UUID personalID;

    public FitnessInstructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getPersonalID() {
        return personalID;
    }
}
