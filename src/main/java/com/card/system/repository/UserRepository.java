package com.card.system.repository;

import com.card.system.entity.Site;
import com.card.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User Repository
 *
 *
 * @author NG
 * @version 0.0.1
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User fingByEmail(String email);


}
