package com.example.du_an_1.infrastructure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseObject {
    private boolean isSuccess = false;
    private Object data;
    private String message;

    public <T> ResponseObject(T obj) {
        processReponseObject(obj);
    }

    public void processReponseObject(Object obj) {
            this.data = obj;
            this.isSuccess = true;
    }
}
