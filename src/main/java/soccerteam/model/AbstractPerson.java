/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerteam.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author roman_dolgoter
 */

@Component
public abstract class AbstractPerson {

    @NotNull
    @Size(min=2, max=30)
    @javax.validation.constraints.Pattern(regexp="[a-zA-Z\\-']+")
    protected String firstName;
    @NotNull
    @Size(min=2, max=30)
    @javax.validation.constraints.Pattern(regexp="[a-zA-Z]+")
    protected String secondName;
    protected Salary salary;
    
    protected int age;
    
    abstract public boolean isAgeValid();
    abstract public boolean isCustomValid();
    
       /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    
 
    
    

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
      /**
     * @return the salary
     */
    public Salary getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    
    public boolean isNameValid(){
                
                if((firstName == null || firstName.isEmpty()) || secondName == null || secondName.isEmpty()) {
                    return false;
                }
                
        
		String regex = "\\d";
		
		Pattern instance = Pattern.compile(regex);
		Matcher m = instance.matcher(firstName + secondName);
		if(m.find()) {
			return false;
		}
		return true;
    }
    
    public boolean isSalaryValid() {
        return (this.salary != null && this.salary.getAmount() != null);
    }
    
    public boolean isValid(){
        if(!isNameValid())
            return false;
        if(!isCustomValid()) 
            return false;
        if (!isAgeValid())
            return false;
        if (!isSalaryValid())
            return false;
        return true;
    }

  
}
