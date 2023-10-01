package session12_polymorphism.homework.fitness_center_management.members;

import java.time.Duration;
import java.util.UUID;

public class GymMember {

    String firstName;
    String lastName;
    UUID memberID;
    MembershipType membershipType;
    Duration membershipDaysLeft;
    MemberProfile memberProfile;

    public GymMember(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        memberID = UUID.randomUUID();
        this.membershipType = MembershipType.NO_MEMBERSHIP;
        this.memberProfile = new MemberProfile();
    }

    public void setMembership(MembershipType membershipType, Duration duration) {
        if (this.membershipType == MembershipType.NO_MEMBERSHIP) {
            this.membershipType = membershipType;
            this.membershipDaysLeft = duration;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getMemberID() {
        return memberID;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public Duration getMembershipDaysLeft() {
        return membershipDaysLeft;
    }
}
