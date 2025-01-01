package com.LSS.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LSS.models.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {
	

	public List<Login> findPassByUsernameAndPass(String username,String password);
	

}
