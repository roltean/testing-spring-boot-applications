package io.github.olteanra.library.controller;

import io.github.olteanra.library.domain.User;
import io.github.olteanra.library.rest.controller.UserController;
import io.github.olteanra.library.service.UserService;
import org.junit.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Rares Oltean
 */
@WebMvcTest(controllers = UserController.class)
public class UserControllerTest extends AbstractControllerTest {

    @MockBean
    private UserService userService;

    @Test
    public void testGetAll() throws Exception {
        given(userService.getUsers())
                .willReturn(Collections.singletonList(new User("John Doe", "john.doe", "test1234")));

        mockMvc.perform(get("/users"))
                .andExpect(status().isOk());
    }

}
