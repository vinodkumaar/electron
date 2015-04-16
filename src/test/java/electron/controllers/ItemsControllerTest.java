package electron.controllers;


import electron.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebIntegrationTest("server.port=0")
public class ItemsControllerTest {

    @Value("${local.server.port}")
    private int port;

    @Test
    public void shouldListItemsInHomePage() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.TEXT_HTML));
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        ResponseEntity<String> responseEntity = new TestRestTemplate().exchange(
                "http://localhost:" + port + "/", HttpMethod.GET,
                requestEntity, String.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertTrue(responseEntity.getBody(), responseEntity.getBody()
                .contains("Electron"));

    }


}
