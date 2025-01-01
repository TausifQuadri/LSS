package com.LSS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.LSS.models.*;
@Repository
public interface StaffRepository extends JpaRepository<Staff,Long>{
       

}
