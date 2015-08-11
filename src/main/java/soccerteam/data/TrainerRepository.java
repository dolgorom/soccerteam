package soccerteam.data;

import soccerteam.model.Trainer;

public interface TrainerRepository {

  Trainer save(Trainer person);

  Trainer findByFistAndSecondName(String firstName, String secondName);

}
