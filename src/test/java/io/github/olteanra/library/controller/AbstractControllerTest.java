package io.github.olteanra.library.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author Rares Oltean
 */
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application-test.yml")
abstract class AbstractControllerTest {

    @Autowired
    protected MockMvc mockMvc;

}
