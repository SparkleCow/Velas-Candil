package com.velascandil.velas.repositories;

import com.velascandil.velas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Integer, User> {
}
