package hw_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Reception {

    public Reception(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Patient patient = context.getBean("patient", Patient.class);
        patientHasCome(patient);
        MedicalRecord patientsMedicalRecord = context.getBean("archive", Archive.class).getMedicalRecord(patient.getName());
        patient.patientWentToTheCabinet(context.getBean("schedule", Schedule.class).findCabinet(patient.getDiseaseCode()));
    }

    private void patientHasCome(Patient patient) {
        System.out.println("Patient " + patient.getName() + " has come");   }


    public static void main(String[] args) {
        new Reception();
    }

}