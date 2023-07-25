package com.example.du_an_1.service;

import com.example.du_an_1.model.Users;
import com.example.du_an_1.request.CreateUser;
import com.example.du_an_1.request.EditAnhBiaRequest;
import com.example.du_an_1.request.EditAvataRequest;
import com.example.du_an_1.request.EditMoTaRequest;
import com.example.du_an_1.request.EditProfileRequest;
import com.example.du_an_1.request.FindUserLogin;
import com.example.du_an_1.respon.UserRespon;


/**
 * @author thangdt
 */
public interface UserService {

    UserRespon signIn(final FindUserLogin req);

    Users SignUp( final CreateUser users);

    Users editProfile( final EditProfileRequest request);

    Users editAvatar( final EditAvataRequest request);

    Users editAnhBia( final EditAnhBiaRequest request);

    Users editMoTa( final EditMoTaRequest request);
}
