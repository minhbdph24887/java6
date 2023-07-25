package com.example.du_an_1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "friend_ship")
@Entity
@IdClass(FriendShipId.class)
public class FriendShip implements Serializable {

    @Id
    @ManyToOne()
    @JoinColumn(name = "id_user_request")
    private Users ídUserRequest;
    @Id
    @ManyToOne
    @JoinColumn(name = "id_user_accept")
    private Users idUserAccept;


}
