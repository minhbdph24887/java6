package com.example.du_an_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FriendShipId implements Serializable {

    private UUID ídUserRequest;
    private UUID idUserAccept;

}
