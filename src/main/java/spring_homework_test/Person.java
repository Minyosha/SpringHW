package spring_homework_test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
    private String name;
    private Integer conTime;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getConTime() {
        return conTime;
    }

    public void setConTime(Integer conTime) {
        this.conTime = conTime;
    }

    public void comingToDoctor(Integer convenientTime) {
        System.out.println("coming to the doctor in  = " + convenientTime + "o'clock");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", queue to the doctor'";
    }
}