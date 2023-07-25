package com.example.du_an_1.respon;

import com.example.du_an_1.model.Users;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author thangdt
 */
@Projection(types = Users.class)
public interface  UserRespon {

    @Value("#{target.id}")
    Integer getId();

    @Value("#{target.email}")
    String getEmail();

    @Value("#{target.first_name}")
    String getFirstName();

    @Value("#{target.last_name}")
    String getLastName();

    @Value("#{target.password}")
    String getPassword();

    @Value("#{target.phone}")
    String getPhone();

    @Value("#{target.preferences}")
    String getPreferences();
}
