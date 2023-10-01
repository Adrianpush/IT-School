package session12_polymorphism.homework.fitness_center_management.gym;

import session12_polymorphism.homework.fitness_center_management.gym.fitness_classes.FitnessClass;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GymCalendar {

    private List<FitnessClass> calendar;

    public GymCalendar() {
        this.calendar = new ArrayList<>();
    }

    public void addFitnessClass(FitnessClass fitnessClass) {
        calendar.add(fitnessClass);
    }

    public void rescheduleFitnessClass(FitnessClass fitnessClass, LocalDateTime updatedStartTime) {
        fitnessClass.setStartTime(updatedStartTime);
    }

    public void cancelFitnessClass(FitnessClass fitnessClass) {
        calendar.remove(fitnessClass);
    }

    public void changeInstructor(FitnessClass fitnessClass, FitnessInstructor replacementInstructor) {
        fitnessClass.setInstructor(replacementInstructor);
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        for (FitnessClass fitnesclass : calendar
        ) {
            stringBuilder.append(fitnesclass.getFitnessClassType() + "\n" +
                    fitnesclass.getInstructor().getFirstName() + " " + fitnesclass.getInstructor().getLastName() + "\n"
                    + fitnesclass.getStartTime().toString() + "\n"
            );
        }
        System.out.println(stringBuilder);
    }
}
