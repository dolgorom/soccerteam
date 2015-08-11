/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerteam.model;

import org.springframework.stereotype.Component;

/**
 *
 * @author roman_dolgoter
 */

public class Statistics {
    
    
    private int numberOfGoals;
    private int numberOfBookings;

    
    /**
     * @return the numberOfGoals
     */
    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    /**
     * @param numberOfGoals the numberOfGoals to set
     */
    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    /**
     * @return the numberOfBookings
     */
    public int getNumberOfBookings() {
        return numberOfBookings;
    }

    /**
     * @param numberOfBookings the numberOfBookings to set
     */
    public void setNumberOfBookings(int numberOfBookings) {
        this.numberOfBookings = numberOfBookings;
    }
    
    public boolean areValid(){
        return (this.numberOfBookings >= 0 && this.numberOfGoals >= 0);
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "numberOfGoals=" + numberOfGoals +
                ", numberOfBookings=" + numberOfBookings +
                '}';
    }
}
