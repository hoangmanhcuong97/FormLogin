package com.example.formlogin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FormLoginApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void assertionWorked() {
        int actual = 1 + 1;
        int expected = 2;
        assertEquals(expected, actual);
    }
}
