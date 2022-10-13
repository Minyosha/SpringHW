package spring_homework_test;

import org.springframework.stereotype.Component;

@Component
public class ReferralToDoctor {
    private final String name = "Jonny";


    public void direct() {
        System.out.println("received a referral to the dentist" + " " + name);
    }
}