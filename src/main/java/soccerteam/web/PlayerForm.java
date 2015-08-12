package soccerteam.web;

import org.springframework.format.annotation.NumberFormat;
import soccerteam.model.Player;
import soccerteam.model.Salary;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * Created by roman_dolgoter on 07/08/2015.
 */
public class PlayerForm {

    @NotNull
    @Size(min=2, max=30, message = "{firstName.size}")
    @Pattern(regexp="[a-zA-Z-' ]+", message = "{firstName.regex}")
    private String firstName;
    @NotNull
    @Size(min=2, max=30, message = "{secondName.size}")
    @Pattern(regexp="[a-zA-Z-' ]+", message = "{secondName.regex}")
    private String secondName;
    @NotNull
    @Size(min=2, max=30)
    private String country;
    @NotNull
    @Max(value=23, message = "{age.max}")
    @Min(value=21, message = "{age.min}")
    private int age;
    @Min(value = 10000,message = "{salary.size}")
    @NotNull(message = "{salary.notnull}")
    @NumberFormat(style= NumberFormat.Style.CURRENCY)
    private BigDecimal salary;
    @Min(0)
    private int bookings;



    @Min(0)
    private int goals;

    private String position;


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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Player toPlayer(){
        Player player = new Player(firstName, secondName);
        player.setBirthcountry(country);
        player.setPosition(Player.Position.valueOf(this.position));
        player.getStats().setNumberOfBookings(bookings);
        player.getStats().setNumberOfGoals(goals);
        player.setAge(age);
        player.setSalary(new Salary(salary));
                System.out.print(player);
        return player;
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

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getBookings() {
        return bookings;
    }

    public void setBookings(int bookings) {
        this.bookings = bookings;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
