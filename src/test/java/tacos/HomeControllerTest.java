package tacos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(HomeController.class)  //Web test for HomeController
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc; //inject MockMvc

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))  //perform GET
                .andExpect(status().isOk())  //expect HTTP 200
                .andExpect(view().name("home")) //Expect home view
                .andExpect(content().string(
                        containsString("Welcome to home bakers application..."))); //expect Welcome
    }
}
