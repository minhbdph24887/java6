package com.example.du_an_1.service;

import com.example.du_an_1.model.FriendShip;
import com.example.du_an_1.model.Users;

import java.util.List;

public interface FriendShipService {

    List<Users> getListBanBeThanThiet();

    List<Users> getListbanBe();

    FriendShip insert();

    FriendShip update();
}
