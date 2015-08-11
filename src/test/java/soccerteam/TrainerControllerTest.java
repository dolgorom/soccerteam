package soccerteam;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import soccerteam.web.PlayerController;
import soccerteam.web.TrainerController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by roman_dolgoter on 09/08/2015.
 */
public class TrainerControllerTest {

    @Test
    public void testPlayerControllerPage() throws Exception {

        TrainerController controller = new TrainerController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/trainer/register")).andExpect(view().name("trainerForm"));


    }

}