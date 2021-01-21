package com.travel.application.travelservice.createrole.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.entity.RoleEntity;
import com.travel.application.travelservice.createrole.dto.CreateRoleRequest;

@Service
public class CreateRoleImplement  implements CreateRoleService{
@Autowired
public IRepoCreateRole repo;
	@Override
	public void save(CreateRoleRequest req) {
		// TODO Auto-generated method stub
		RoleEntity entity = new RoleEntity();
		entity.setCode(req.getCode());
		entity.setName(req.getName());
		entity.setDescription(req.getDescription());
		repo.save(entity);
		
	}

}
