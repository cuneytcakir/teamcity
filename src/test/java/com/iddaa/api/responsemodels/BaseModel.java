package com.iddaa.api.responsemodels;

public class BaseModel<T> {

    private boolean isSuccess;
    public T data;
    private String message = null;
    errors error;
    private String info = null;


    // Getter Methods

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public errors getError() {
        return error;
    }

    public String getInfo() {
        return info;
    }

    public class errors {
        public int code;
        public String eventId;
        public String marketId;
        public String name;
        public String message;


        // Getter Methods

        public int getCode() {
            return code;
        }

        public String getEventId() {
            return eventId;
        }

        public String getMarketId() {
            return marketId;
        }

        public String getName() {
            return name;
        }

        public String getMessage() {
            return message;
        }
    }

}
