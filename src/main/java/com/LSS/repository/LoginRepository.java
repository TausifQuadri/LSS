package com.LSS.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LSS.models.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    List<Login> findByLoginIdAndPassword(String loginId, String password);
}