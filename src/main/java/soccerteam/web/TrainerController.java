package soccerteam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import soccerteam.data.PlayerRepository;
import soccerteam.data.TrainerRepository;
import soccerteam.model.Player;
import soccerteam.model.Trainer;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public TrainerController() {

    }

    @RequestMapping(value="/register",method = GET)
    public String home(Model model) {

        model.addAttribute(new TrainerForm());
        return "trainerForm";
    }

    @RequestMapping(value="/register",method = POST)
    public String processRegistration(
                                          @Valid TrainerForm trainerForm,
            Errors errors) {
        if (errors.hasErrors()) {
            System.out.print("Error in form. returning form");
            return "trainerForm";
        }
       Trainer trainer = trainerForm.toTrainer();
        trainerRepository.save(trainer);
        return "redirect:/trainer/" + trainer.getFirstName() + "_" + trainer.getSecondName();

    }

    @RequestMapping(value="/{firstAndSecond}", method=GET)
    public String  showPlayerProfile(@PathVariable String firstAndSecond, Model model) {
        String firstName = firstAndSecond.split("_")[0];
        String secondName = firstAndSecond.split("_")[1];
        Trainer trainer = trainerRepository.findByFistAndSecondName(firstName,secondName);
        System.out.print(trainer);


        model.addAttribute(trainer);

        // return mav;
        //model.addAttribute(newPlayer);
        return "/trainerProfile";
    }



}