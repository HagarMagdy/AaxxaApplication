package com.example.hagar.aaxxa.first_screen.pojos;

/**
 * Created by Hagar on 18/07/2018.
 */

public class ResponseMessage {
    String Message;
    Boolean Status;
    String Error;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }
}
