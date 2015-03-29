package br.com.test.endpoints;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

/**
 * @author Gabriel Francisco - gabfssilva@gmail.com
 */
public class EndpointSampleITest {

    @Test
    public void test() throws InterruptedException {
        RestAssured
                .when()
                .get("http://localhost:8080/web/rs/test")
                .then().log().everything(true)
                .assertThat()
                .statusCode(200);
    }
}
