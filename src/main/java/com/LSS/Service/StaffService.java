package com.LSS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.LSS.models.Staff;

import com.LSS.repository.StaffRepository;
@Service
public class StaffService {
    private final StaffRepository Staffrepository;
	@Autowired
	public StaffService (StaffRepository Staffrepository) {
		this.Staffrepository=Staffrepository;
	}
	public  Staff getStaffDetailByID(Long ID) {
		
		  Staff StaffDetail = Staffrepository.getById(ID);
		  return StaffDetail;
		
		
		
		
	}

}
