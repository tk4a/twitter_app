package com.example.letscode.demoletscode.repository;

import com.example.letscode.demoletscode.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivateCode(String code);
}
