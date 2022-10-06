package hw_1;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component("archive")
public class Archive {

    private HashMap<String, MedicalRecord> recordsStore;

    public Archive(){
        this.recordsStore = new HashMap<>();
    }

    MedicalRecord getMedicalRecord(String patientName){
        MedicalRecord medicalRecord = new MedicalRecord();
        if (recordsStore.get(patientName)!=null) {
            medicalRecord = recordsStore.get(patientName);
            System.out.println("Medical record found");
        } else {
            recordsStore.put(patientName, medicalRecord);
            System.out.println("New medical record number " + recordsStore.get(patientName).toString() + " created for " + patientName);
        }
        return medicalRecord;
    }
}