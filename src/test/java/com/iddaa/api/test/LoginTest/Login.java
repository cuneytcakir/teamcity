package com.iddaa.api.test.LoginTest;

import com.iddaa.api.methods.LoginMethods;
import com.iddaa.api.responsemodels.BaseModel;
import com.iddaa.api.responsemodels.LoginModel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Login extends LoginMethods {

    @Test(dataProvider = "LoginProvider")
    public void SuccessLoginTest(String phonenumber, String password)
    {
        BaseModel<LoginModel> response = LoginTest(phonenumber,password);

        Assert.assertEquals(response.getData().getPhoneNumber(),phonenumber);

    }

    @Test(dataProvider = "LoginProvider")
    public void NegatifLoginTest(String phonenumber, String password)
    {
        BaseModel<LoginModel> negatifresponse = LoginTest(phonenumber,password);

        System.out.println(negatifresponse.getIsSuccess());
        System.out.println(negatifresponse.getError().getCode());

    }

    @DataProvider(name="LoginProvider")
    public Object[][] getDataFromDataprovider(Method m){
        if(m.getName().equalsIgnoreCase("SuccessLoginTest")){
            return new Object[][] {
                    { "05388185661", "1234qqqQ" }
            };}
        else{
            return new Object[][] {
                    { "05388185664", "1234qqqQ2" },
            };}
    }
}

