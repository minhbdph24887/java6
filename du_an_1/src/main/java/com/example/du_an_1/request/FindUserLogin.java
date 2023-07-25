package com.example.du_an_1.request;

import lombok.Data;

/**
 * @author thangdt
 */
@Data
public final class FindUserLogin {

    private String email;
    private String password;

}
