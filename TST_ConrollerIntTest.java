package my.ref.bt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class RefControllerIntTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void Ref() throws Exception {
//        RequestBuilder request = get("/ref");
//        MvcResult result = mvc.perform(request).andReturn();
//        assertEquals("Ref, ", result.getResponse().getContentAsString());

        mvc.perform(get("/ref"))
                .andExpect(content().string("Ref name"));

    }

    @Test
    public void testRefWithName() throws Exception {
        mvc.perform(get("/ref?name=Dan2"))
                .andExpect(content().string("Ref, Dan"));
    }
}

