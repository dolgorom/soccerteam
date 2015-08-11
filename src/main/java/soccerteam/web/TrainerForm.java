package soccerteam.web;

import org.springframework.format.annotation.NumberFormat;
import soccerteam.model.Player;
import soccerteam.model.Salary;
import soccerteam.model.Trainer;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * Created by roman_dolgoter on 07/08/2015.
 */
public class TrainerForm {

    @NotNull
    @Size(min=2, max=30, message = "{firstName.size}")
    @Pattern(regexp="[a-zA-Z]+")
    private String firstName;
    @NotNull
    @Size(min=2, max=30)
    @Pattern(regexp="[a-zA-Z]+")
    private String secondName;

    @NotNull
    @Min(40)
    private int age;
    @Min(value = 10,message = "{salary.size}")
    @NotNull(message = "{salary.notnull}")
    @NumberFormat(style= NumberFormat.Style.CURRENCY)
    private BigDecimal salary;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {

        this.secondName = secondName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Trainer toTrainer() {
        return new Trainer(firstName,secondName,age, new Salary(salary));
    }
}
