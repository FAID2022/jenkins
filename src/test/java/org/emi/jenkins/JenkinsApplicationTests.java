package org.emi.jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class JenkinsApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/api/hello"))
                .andExpect(content().string("Hello World"))
                .andExpect(status().isOk());

    }
    @Test
    public void testJenkins() throws Exception {
        mockMvc.perform(post("/api/hello").param("name","yassine"))
                .andExpect(content().string("Hello yassine"))
                .andExpect(status().isOk());

    }

}
