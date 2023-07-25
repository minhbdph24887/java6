package com.example.du_an_1.repository;

import com.example.du_an_1.model.Users;
import com.example.du_an_1.request.FindUserLogin;
import com.example.du_an_1.respon.UserRespon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author thangdt
 */
public interface UserRepository extends JpaRepository<Users, String> {

    @Query(value = """
                SELECT id,
                       email,
                       first_name,
                        last_name,
                        password,
                        phone,
                        preferences
                      FROM users
                      WHERE email like :#{#req.email}
                      AND password LIKE :#{#req.password}
            """, nativeQuery = true)
    UserRespon signIn(final FindUserLogin req);

    @Query(value = """
                SELECT id,
                       email,
                       first_name,
                        last_name,
                        password,
                        phone,
                        preferences
                      FROM users
                      WHERE email like email
            """, nativeQuery = true)
    Users findByEmail(String email);

}
