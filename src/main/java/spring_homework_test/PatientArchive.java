package spring_homework_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class PatientArchive {
    private Person person;
    public Integer getGoingToDoctorSpecificTime() {
        return goingToDoctorSpecificTime;
    }



    private Integer goingToDoctorSpecificTime;
    public static boolean flag = true;
    private ConcurrentHashMap<Person, Integer> hashMap = new ConcurrentHashMap<>();

    public ConcurrentHashMap<Person, Integer> getHashMap() {
        return hashMap;
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public void setHashMap(ConcurrentHashMap<Person, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Autowired

    public PatientArchive(Person person) {
        this.person = person;
    }

    public PatientArchive() {
    }

    public PatientArchive(Person person, ConcurrentHashMap<Person, Integer> hashMap) {
        this.person = person;
        this.hashMap = hashMap;

    }

    public void timeToDoctor(Person person, Integer timeToDoctor) {
        this.goingToDoctorSpecificTime = timeToDoctor;
        if (hashMap.size() != 0) {
            if (hashMap.containsValue(timeToDoctor)) {
                flag = false;
            } else if (timeToDoctor < 0) {
                flag = false;
            } else {
                flag = true;
                hashMap.put(person, timeToDoctor);
                System.out.println("referral to a doctor in " + timeToDoctor + "o'clock");
            }
        } else {
            flag = true;
            hashMap.put(person, timeToDoctor);
            System.out.println("referral to a doctor in " + timeToDoctor + "o'clock");
        }
    }
}