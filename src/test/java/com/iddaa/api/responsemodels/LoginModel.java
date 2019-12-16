package com.iddaa.api.responsemodels;

public class LoginModel {

    public class Claims {
    }

    private String accessToken;
    private String refreshToken;
    private float expires;
    private float id;
    private String role;
    Claims ClaimsObject;
    private String email;
    private String phoneNumber;
    private String name;
    private String surname;
    private boolean isInformed;


    // Getter Methods

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public float getExpires() {
        return expires;
    }

    public float getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public Claims getClaims() {
        return ClaimsObject;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getIsInformed() {
        return isInformed;
    }
}

