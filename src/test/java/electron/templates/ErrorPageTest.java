package electron.templates;


import electron.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.*;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebIntegrationTest("server.port=0")
public class ErrorPageTest {

    @Value("${local.server.port}")
    private int port;

    @Test
    public void testFreeMarkerErrorTemplate() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.TEXT_HTML));
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        ResponseEntity<String> responseEntity = new TestRestTemplate().exchange(
                "http://localhost:" + port + "/does-not-exist", HttpMethod.GET,
                requestEntity, String.class);

        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        assertTrue("Wrong body:\n" + responseEntity.getBody(), responseEntity.getBody()
                .contains("Not Found"));
    }


}
