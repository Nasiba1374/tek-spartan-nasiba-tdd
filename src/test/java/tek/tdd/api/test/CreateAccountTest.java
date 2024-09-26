package tek.tdd.api.test;

import com.aventstack.extentreports.service.ExtentTestManager;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import tek.tdd.api.models.AddAccountRequest;
import tek.tdd.api.models.EndPoints;
import tek.tdd.base.ApiTestsBase;
import tek.tdd.utility.DataGenerator;

public class CreateAccountTest extends ApiTestsBase {

    //Activity create valid  Account /add-primary-account
    //Verify status code 201
    //Use POJO to Request Body
    @Test
    public void createNewAccountTest() {
        String randomEmail = DataGenerator.generateRandomEmail("instructor");
        AddAccountRequest request = AddAccountRequest.builder()
                .email(randomEmail)
                .firstName("Mohammad")
                .lastName("Shokriyan")
                .title("Mr.")
                .gender("MALE")
                .maritalStatus("SINGLE")
                .employmentStatus("Software Developer")
                .dateOfBirth("1986-10-25")
                .build();

        Response response = getDefaultRequest()
                .body(request)
                .when()
                .post(EndPoints.ADD_PRIMARY_ACCOUNT.getValue())
                .then()
                .statusCode(201)
                .extract()
                .response();

        response.prettyPrint();
        ExtentTestManager.getTest().info(response.asPrettyString());

//        AccountResponse accountResponse =response.body().jsonPath().getObject("", AccountResponse.class);
//
//        Assert.assertNotNull(accountResponse);
    }

}