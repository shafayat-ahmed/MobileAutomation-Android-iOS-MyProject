import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class CheckNYP {
    @Test
    public void callAllEmployeeResources() {
        Response response = given().when().get("https://newsapi.org/v2/everything?sources=new-york-magazine&apiKey=3a953102a1d7462f80e0e8572592afdd").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().print();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void badCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("https://newsapi.org/v2/everything?sources=new-york-magazine&apiKey=3a953102a1d7462f80e0e8572592afdd");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 404);
    }
    @Test
    public void serverErrorCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("https://newsapi.org/v2/everything?sources=new-york-magazine&apiKey=3a953102a1d7462f80e0e8572592afdd").then().statusCode(200).extract().response();
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void serverErrorbadCallAllEmployee(){
    Response response = null;
    int statusCode = 0;
        try {
        response = given().when().get("https://newsapi.org/v2/everything?sources=new-york-magazine&apiKey=3a953102a1d7462f80e0e8572592afdd");
        statusCode = response.getStatusCode();
    } catch (Exception ex) {
    }
        Assert.assertEquals(statusCode, 200);
    }
}