package session12_polymorphism.homework.fitness_center_management.gym.fitness_classes;

import session12_polymorphism.homework.fitness_center_management.gym.FitnessInstructor;
import session12_polymorphism.homework.fitness_center_management.members.GymMember;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public abstract class FitnessClass implements Comparable<FitnessClass> {

    private LocalDateTime startTime;
    private Duration duration;
    private String location;
    private FitnessClassTypes fitnessClassType;
    private int maximumParticipants;
    private FitnessInstructor instructor;
    private List<GymMember> participants;


    @Override
    public int compareTo(FitnessClass o) {
        if (this.getStartTime().isBefore(o.getStartTime())) {
            return -1;
        } else if (this.getStartTime().isAfter(o.getStartTime())) {
            return 1;
        } else {
            return 0;
        }
    }

    public void addParticipant(GymMember gymMember){
        if (participants.size() < maximumParticipants) {
            participants.add(gymMember);
        }
    }

    public List<GymMember> getParticipants() {
        return participants;
    }

    public void setParticipants(List<GymMember> participants) {
        this.participants = participants;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FitnessClassTypes getFitnessClassType() {
        return fitnessClassType;
    }

    public void setFitnessClassType(FitnessClassTypes fitnessClassType) {
        this.fitnessClassType = fitnessClassType;
    }

    public int getMaximumParticipants() {
        return maximumParticipants;
    }

    public void setMaximumParticipants(int maximumParticipants) {
        this.maximumParticipants = maximumParticipants;
    }

    public FitnessInstructor getInstructor() {
        return instructor;
    }

    public void setInstructor(FitnessInstructor instructor) {
        this.instructor = instructor;
    }

    public void printParticipants(){
        StringBuilder stringBuilder = new StringBuilder();
        for (GymMember gymMember: participants
             ) {
            stringBuilder.append(gymMember.getFirstName() + " " + gymMember.getLastName() + "\n");
        }
        System.out.println(stringBuilder);
    }
}
