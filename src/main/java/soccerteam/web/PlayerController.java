package soccerteam.web;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import soccerteam.data.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;
import soccerteam.model.Player;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

@Controller
@RequestMapping("/player")
public class PlayerController {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerController() {

    }

    @RequestMapping(value="/register",method = GET)
    public String home(Model model) {

        model.addAttribute(new RegisterForm());
        return "registerForm";
    }

    @RequestMapping(value="/register",method = POST)
    public String processRegistration(
                                          @Valid RegisterForm registerForm,
            Errors errors) {
        if (errors.hasErrors()) {
            System.out.print("Error in form. returning form");
            return "registerForm";
        }
       Player player = registerForm.toPlayer();
        playerRepository.save(player);
        return "redirect:/player/" + player.getFirstName() + "_" + player.getSecondName();

    }

    @RequestMapping(value="/{firstAndSecond}", method=GET)
    public String  showPlayerProfile(@PathVariable String firstAndSecond, Model model) {
        String firstName = firstAndSecond.split("_")[0];
        String secondName = firstAndSecond.split("_")[1];
        Player player = playerRepository.findByFistAndSecondName(firstName,secondName);


        model.addAttribute(player);

        return "playerProfile";
    }



}