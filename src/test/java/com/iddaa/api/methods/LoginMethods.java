package com.iddaa.api.methods;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iddaa.api.responsemodels.BaseModel;
import com.iddaa.api.responsemodels.LoginModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import java.lang.reflect.Type;


public class LoginMethods {

    public BaseModel<LoginModel> LoginTest(String phoneNumber , String password)
    {
        RestAssured.baseURI ="https://api.iddaa.com.tr";
        RequestSpecification request = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("phoneNumber", phoneNumber);
        requestParams.put("password", password);

        request.contentType(ContentType.JSON);
        request.body(requestParams.toJSONString());

        Response response = request.post("/identity/auth/sign-in");

        Gson gson = new Gson();

        Type responseBody = new TypeToken<BaseModel<LoginModel>>() {}.getType();
        BaseModel<LoginModel> model = gson.fromJson(response.body().asString() , BaseModel.class);
        System.out.println(response.body().asString());

        return model;
    }
}
