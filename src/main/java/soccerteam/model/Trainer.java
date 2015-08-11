/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerteam.model;

import java.util.List;

/**
 *
 * @author roman_dolgoter
 */
public class Trainer extends AbstractPerson{
    
    private List<Team> listOfPreviousTeams;
    
    
    public Trainer(){
        
    }
    
    
    public Trainer(String firstname, String secondname, int age, List <Team> previousTeams){
        this.firstName = firstname;
        this.secondName = secondname;
        this.age = age;
        this.listOfPreviousTeams = previousTeams;
    }
     

     public Trainer(String firstname, String secondname, int age){
        this.firstName = firstname;
        this.secondName = secondname;
        this.age = age;
    }

    public Trainer(String firstName, String secondName, int age, Salary salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.salary = salary;
    }

    /**
     * @return the listOfPreviousTeams
     */
    public List<Team> getListOfPreviousTeams() {
        return listOfPreviousTeams;
    }

    /**
     * @param listOfPreviousTeams the listOfPreviousTeams to set
     */
    public void setListOfPreviousTeams(List<Team> listOfPreviousTeams) {
        this.listOfPreviousTeams = listOfPreviousTeams;
    }

    @Override
    public boolean isAgeValid() {
       return (age > 40);
    }

    @Override
    public boolean isCustomValid() {
        return (listOfPreviousTeams != null);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firsName=" + firstName +
                "secondName=" + secondName +
                "age=" + age +
                "salary=" + salary +
                "listOfPreviousTeams=" + listOfPreviousTeams +
                '}';
    }
}
