package org.datasearch.adapters.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * https://quarkus.io/guides/getting-started-testing
 */
@QuarkusTest
class DataSearchResourceTest {

    @Test
    void shouldReturnOk_whenFoundSearchedKeyword() {
        var searchKeyWord = "Anthony";
        given()
          .when().get("/search/" + searchKeyWord)
          .then()
             .statusCode(200)
             .body(is("{\"searchResult\":[\"Anthony\"],\"searchTimeInMilliseconds\":0}"));
    }

    @Test
    public void shouldReturnHttpNotFound_whenSearchedResult_NotFound() {
        var searchKeyWord = "Tom";
        given()
                .when().get("/search/" + searchKeyWord)
                .then()
                .statusCode(404);
    }

}