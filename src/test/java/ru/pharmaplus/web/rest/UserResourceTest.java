package ru.pharmaplus.web.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.pharmaplus.config.AppConfig;
import ru.pharmaplus.config.WebMvcConfig;

import static org.junit.Assert.*;

/**
 * @author ibraim
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppConfig.class, WebMvcConfig.class}, loader = AnnotationConfigWebContextLoader.class)
public class UserResourceTest {

    @Test
    public void should_be_true() {
        assertEquals(2+2, 4);
    }
}