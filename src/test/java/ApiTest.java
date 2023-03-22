
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ApiTest {
    @Test
    public void getRequest() {
        given().
                when().
                get("http://zippopotam.us/us/90210").
                then().
                log().body();

                //assertThat().contentType(ContentType.JSON);
                //assertThat().statusCode(200);
                //assertThat().body("places[0].'place name'", equalTo("Beverly Hills"));
    }


}
