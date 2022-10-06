package hw_1;

import org.springframework.stereotype.Component;

@Component("patient")
public class Patient {


    private final String name;
    private final Integer diseaseCode;

    public Patient(String name, Integer diseaseCode){
        this.diseaseCode = diseaseCode;
        this.name = name;
    }



    void patientWentToTheCabinet(Integer cabinet){
        System.out.println("Patient went to cabinet number " + cabinet);
    }

    public int getDiseaseCode() {
        return diseaseCode;
    }
    public String getName() {
        return name;
    }
}