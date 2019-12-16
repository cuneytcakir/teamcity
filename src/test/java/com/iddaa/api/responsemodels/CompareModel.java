package com.iddaa.api.responsemodels;

import java.util.ArrayList;

public class CompareModel {

    private boolean isSuccess;
    Data data;
    private String message;
    private String error;
    private String info;

    // Getter Methods

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public Data getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public String getInfo() {
        return info;
    }

    public class Data {

        private int sportId;

        ArrayList < Object > events = new ArrayList< Object >();


        // Getter Methods

        public int getSportId() {
            return sportId;
        }

    }
}