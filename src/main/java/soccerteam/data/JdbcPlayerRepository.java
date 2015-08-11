package soccerteam.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import soccerteam.model.Player;
import soccerteam.model.Salary;


import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcPlayerRepository implements PlayerRepository {

  private JdbcOperations jdbc;

  @Autowired
  public JdbcPlayerRepository(JdbcOperations jdbc) {
    this.jdbc = jdbc;
  }

  public Player save(Player person) {
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
            "insert into Player (first_name, last_name,country,age,position,goals, bookings,salary )" +
                    " values (?, ?, ?,?, ?, ?,?,?)",

            person.getFirstName(),
            person.getSecondName(),
            person.getBirthcountry(),
            person.getAge(),
            person.getPosition().toString(),
            person.getStats().getNumberOfGoals(),
            person.getStats().getNumberOfBookings(),
              person.getSalary().getAmount().doubleValue());
    return person;
  }



  public Player findByFistAndSecondName(String firstName, String secondName) {
    return jdbc.queryForObject(
        "select  first_name, last_name, country,age,position,goals, bookings,salary from Player where first_name=? and last_name=?",
        new PlayerRowMapperPlayerRowMapper(), firstName,
            secondName);
  }

    public Player findById(Long id) {
        return jdbc.queryForObject(
                "select first_name, last_name, country,age,position,goals, bookings,salary Player where id=?",
                new PlayerRowMapperPlayerRowMapper(), id);
    }
  
  private static class PlayerRowMapperPlayerRowMapper implements RowMapper<Player> {
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
      Player player = new Player(

          rs.getString("first_name"),
          rs.getString("last_name"));
        player.setBirthcountry(rs.getString("country"));
        player.setAge(rs.getInt("age"));
        player.setPosition(Player.Position.valueOf(rs.getString("position")));
        player.getStats().setNumberOfGoals(rs.getInt("goals"));
        player.getStats().setNumberOfBookings(rs.getInt("bookings"));
        player.setSalary(new Salary(new BigDecimal(rs.getDouble("salary"))));
        return player;
    }


  }

}
