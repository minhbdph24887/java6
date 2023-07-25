package com.example.demo.bai4.bai4_5_SU_DUNG_RESTTEMPLATE_LAM_VIEC_VOI_RESTFUL_API.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Student {
    private String email;
    private String fullname;
    private Double marks;
    private Boolean gender;
    private String country;
}
