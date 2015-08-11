package soccerteam.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import soccerteam.model.Player;
import soccerteam.model.Salary;
import soccerteam.model.Trainer;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcTrainerRepository implements TrainerRepository {

  private JdbcOperations jdbc;

  @Autowired
  public JdbcTrainerRepository(JdbcOperations jdbc) {
    this.jdbc = jdbc;
  }

  public Trainer save(Trainer person) {
    /*
    id identity,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	country varchar(30) not null,
	age int not null,
	position varchar(30) not null,
	goals int not null,
  bookings int not null,
  salary DECIMAL not null
     */
    jdbc.update(
            "insert into Trainer (first_name, last_name,age,salary )" +
                    " values (?, ?, ?,?)",

            person.getFirstName(),
            person.getSecondName(),
            person.getAge(),
            person.getSalary().getAmount().doubleValue());
    return person;
  }



  public Trainer findByFistAndSecondName(String firstName, String secondName) {
    return jdbc.queryForObject(
        "select  first_name, last_name, age,salary from Trainer where first_name=? and last_name=?",
        new TrainerRowMapperTrainerRowMapper(), firstName,
            secondName);
  }

  
  private static class TrainerRowMapperTrainerRowMapper implements RowMapper<Trainer> {
    public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Trainer trainer = new Trainer(

          rs.getString("first_name"),
          rs.getString("last_name"),
                rs.getInt("age"));

        return trainer;
    }


  }

}
