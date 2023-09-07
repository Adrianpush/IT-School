package session12.homework.fitness_center_management;

import session12.homework.fitness_center_management.gym.FitnessInstructor;
import session12.homework.fitness_center_management.gym.GymCalendar;
import session12.homework.fitness_center_management.gym.fitness_classes.YogaClass;
import session12.homework.fitness_center_management.members.GymMember;
import session12.homework.fitness_center_management.members.MembershipType;

import java.time.LocalDateTime;

public class FitnessCenterMain {

    public static void main(String[] args) {
        GymCalendar calendar = new GymCalendar();
        FitnessInstructor john = new FitnessInstructor("John", "Doe");
        YogaClass yogaClass = new YogaClass(LocalDateTime.now().plusDays(2), john);
        calendar.addFitnessClass(yogaClass);
        calendar.print();
        yogaClass.printParticipants();

        GymMember jean = new GymMember("Jean", "Gray");
        java.time.Duration duration = java.time.Duration.ofDays(30);
        jean.setMembership(MembershipType.PREMIUM, duration);

        yogaClass.addParticipant(jean);
        calendar.rescheduleFitnessClass(yogaClass, LocalDateTime.now().plusDays(5));
        calendar.print();
        yogaClass.printParticipants();
    }
}
