package com.example.formlogin.controller;

import com.example.formlogin.service.ServiceLogin;
import com.example.formlogin.service.ServiceLoginImplWithSpringData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringJUnitJupiterConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebAppConfiguration
@SpringJUnitJupiterConfig(LoginControllerTestConfig.class)
public class LoginControllerTest {
    private ServiceLogin serviceLogin = Mockito.mock(ServiceLoginImplWithSpringData.class);
    private MockMvc mockMvc;

    @InjectMocks
    private Login loginController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
    }

    @Test
    void LoginListPageIsExists() throws Exception {
        mockMvc
                .perform(get("/home"))
                .andExpect(status().is(200));
    }
}
