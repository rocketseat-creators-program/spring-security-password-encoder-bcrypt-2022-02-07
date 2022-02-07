package com.rocketseat.experts.club.passwordencoderbcrypt.repository;

import com.rocketseat.experts.club.passwordencoderbcrypt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);


}