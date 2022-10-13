package spring_homework_test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Пациент обратился в регистратуру, регистратура работает с архивом, потом к расписанием врачей, потом с планом здания, потом регистратура
// дает информацию пациенту и он идет в кабинет

public class MainApp {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("spring_homework_test");
        Person person = context.getBean(Person.class);
        Timetable timetable = context.getBean(Timetable.class);
        PatientArchive patientArchive = context.getBean(PatientArchive.class);
        person.setName("valera");
        patientArchive.timeToDoctor(person, 12);
        timetable.referral();
        Person person2 = context.getBean(Person.class);
        person2.setName("ra");
        patientArchive.timeToDoctor(person2, 13);
        timetable.referral();
    }
}