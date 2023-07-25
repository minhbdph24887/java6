package com.example.du_an_1.repository;

import com.example.du_an_1.model.FriendShip;
import com.example.du_an_1.model.FriendShipId;
import com.example.du_an_1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FriendShipRepository extends JpaRepository<FriendShip, FriendShipId> {

    @Query(value = """
            Select * from FriendShip
            """, nativeQuery = true)
    List<Users> findByAllIdAccept();

    @Query(value = """
            Select * from FriendShip
            """, nativeQuery = true)
    List<Users> findByAllNotIdAccept();
}
