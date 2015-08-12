package soccerteam;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import soccerteam.data.PlayerRepository;
import soccerteam.data.TrainerRepository;
import soccerteam.web.PlayerController;
import soccerteam.web.TrainerController;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by roman_dolgoter on 09/08/2015.
 */
public class TrainerControllerTest {

    @Test
    public void testTrainerControllerPage() throws Exception {

        TrainerController controller = new TrainerController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/trainer/register")).andExpect(view().name("trainerForm"));


    }

    @Test
    public void testTrainerProfile() throws Exception {

        TrainerRepository mockRepository = mock(TrainerRepository.class);
        TrainerController controller = new TrainerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/trainer/register").param("firstName","Bob").param("secondName","Dilan").param("age", "49").param("salary","100000")).andExpect(redirectedUrl("/trainer/Bob_Dilan"));


    }
}