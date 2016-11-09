import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
/**
 * Created by t910587 on 10/23/2016.
 */
public class TCF {


@Test
    public void testCase_1(){

   Response resp = when().
            get("https://echo.getpostman.com/get?test=123");

    System.out.println(resp.getStatusCode());
}

}
