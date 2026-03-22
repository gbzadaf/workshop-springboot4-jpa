package com.gabrielf.webproject.repositories;

import com.gabrielf.webproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
