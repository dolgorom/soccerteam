package soccerteam.data;

import soccerteam.model.Player;

public interface PlayerRepository {

  Player save(Player person);

  Player findByFistAndSecondName(String firstName, String secondName);

}
