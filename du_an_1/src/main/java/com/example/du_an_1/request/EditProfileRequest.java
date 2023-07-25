package com.example.du_an_1.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EditProfileRequest {

    private String id;
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
    private Date ngaySinh;
    @NotEmpty()
    private int gioiTinh;
    private String phoneNumber;
    private String middle_name;
    private int trangThai;
    private String avata;
    private String anhBia;
    private String hocVan;
    private String diaChi;

}
