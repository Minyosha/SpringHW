package spring_homework_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timetable {
    private PatientArchive patientArchive;
    private Person person;
    private ReferralToDoctor referral;

    @Autowired
    public Timetable(PatientArchive patientArchive, Person person, ReferralToDoctor referral) {
        this.patientArchive = patientArchive;
        this.person = person;
        this.referral = referral;
    }

    public PatientArchive getPatientArchive() {
        return patientArchive;
    }

    public void setPatientArchive(PatientArchive patientArchive) {
        this.patientArchive = patientArchive;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ReferralToDoctor getReferral() {
        return referral;
    }

    public void setReferral(ReferralToDoctor referral) {
        this.referral = referral;
    }

    public void referral() {
        if (PatientArchive.flag) {
            referral.direct();
            System.out.println(patientArchive.getHashMap());
            person.comingToDoctor(patientArchive.getGoingToDoctorSpecificTime());
        } else {
            System.out.println("please take the queue for another time");
        }
    }
}