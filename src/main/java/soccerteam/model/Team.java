/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerteam.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author roman_dolgoter
 */
public class Team {
    
    private String name;
    private Trainer trainer;
    private List <Player> players;
    private int foundationYear;
    
    

    public Team() {
     
    }
    
    
    public Team(Trainer trainer) {
        this.trainer = trainer; 
    }
//    
//   
//    public Team(List <Player> players, Trainer coach, int foundationYear){
//        this.players = players;
//        this.trainer = coach;
//        this.foundationYear = foundationYear;
//    }

    /**
     * @return the trainer
     */
    public Trainer getTrainer() {
        return trainer;
    }

    /**
     * @param coach the trainer to set
     */

    @Autowired
    public void setTrainer(Trainer coach) {
        this.trainer = coach;
    }

    /**
     * @return the players
     */
    @Autowired
    public List <Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    
    public void setPlayers(List <Player> players) {
        this.players = players;
    }

    /**
     * @return the foundationYear
     */
    public int getFoundationYear() {
        return foundationYear;
    }

    /**
     * @param foundationYear the foundationYear to set
     */
    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isValid(){
        if(name == null || name.isEmpty()) {
                    return false;
                }
        
        if(this.trainer == null) {
            return false;
        }
        if(this.foundationYear < 1950) {
            return false;
        }
        
        return (this.players.size() == 22);
    }
    
    
}
