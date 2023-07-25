package com.example.du_an_1.request.blog;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseBlogRequest {

    private String image;
    private String title;
    private String video;
    private Date ngayTao;
    private int trangThai;
    private String idUser;

}
