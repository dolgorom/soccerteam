package soccerteam;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import soccerteam.data.PlayerRepository;
import soccerteam.web.PlayerController;
import sun.net.www.content.text.PlainTextInputStream;

/**
 * Created by roman_dolgoter on 09/08/2015.
 */
public class PlayerControllerTest  {

    @Test
    public void testPlayerControllerPage() throws Exception {

        PlayerController controller = new PlayerController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/player/register")).andExpect(view().name("registerForm"));


    }

    @Test
    public void testPlayerRegistration() throws Exception {

        PlayerRepository mockRepository = mock(PlayerRepository.class);
        PlayerController controller = new PlayerController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/player/register").param("firstName","Bob").param("secondName","Dilan").param("age","22").param("country","canada").param("salary","100000").param("goals","1")
        .param("booking","2").param("position","FORWARD")).andExpect(redirectedUrl("/player/Bob_Dilan"));


    }

}