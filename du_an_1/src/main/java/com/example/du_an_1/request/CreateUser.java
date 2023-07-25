package com.example.du_an_1.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@Data
public final class CreateUser {

    @NotEmpty()
    @NotBlank()
    private String first_name;
    @NotEmpty()
    @NotBlank()
    private String last_name;
    @NotEmpty()
    @NotBlank()
    private String email;
    @NotEmpty()
    @NotBlank()
    private String password;
    @NotEmpty()
    private Date ngaySinh;
    @NotEmpty()
    private int gioiTinh;

}
