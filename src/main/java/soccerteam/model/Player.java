/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerteam.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author roman_dolgoter
 */

public class Player extends AbstractPerson{


   public  Player(){
       
   }
 
   public Player (String firstname, String secondname){
       this.firstName = firstname;
       this.secondName = secondname;
       
       
   }

   
    public enum Position{
        GOALKEEPER, DEFENDER,MIDFIELDER,FORWARD

    }
    
    private Statistics stats = new Statistics();
    private String birthcountry;
    private Position position;
    
    
    
    /**
     * @return the stats
     */
    public Statistics getStats() {
        return stats;
    }

    /**
     * @param stats the stats to set
     */
    public void setStats(Statistics stats) {
        this.stats = stats;
    }

 
    /**
     * @return the birthcountry
     */
    public String getBirthcountry() {
        return birthcountry;
    }

    /**
     * @param birthcountry the birthcountry to set
     */
    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

 

  
    
     /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    
    public boolean isCountryValid(){
        if((birthcountry == null || birthcountry.isEmpty())) {
                    return false;
                }
                
        
		String regex = "\\d";
		
		Pattern instance = Pattern.compile(regex);
		Matcher m = instance.matcher(birthcountry);
		if(m.find()) {
			return false;
		}
		return true;
    }

    @Override
    public String toString() {
        return "Player{" +
                "stats=" + stats +
                ", birthcountry='" + birthcountry + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean isCustomValid(){
        return (this.position != null && isCountryValid() && this.stats.areValid());
    }
    
    @Override
    public boolean isAgeValid() {
       return (age >= 20 && age <= 23);
    }
}
