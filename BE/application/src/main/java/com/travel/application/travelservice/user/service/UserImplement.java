package com.travel.application.travelservice.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.RoleEntity;
import com.travel.application.entity.UserEntity;
import com.travel.application.travelservice.role.service.IRepoRole;
import com.travel.application.travelservice.user.dto.UserRequest;
import com.travel.application.travelservice.user.dto.UserResponse;
@Service
public class UserImplement implements UserService {
@Autowired
public IRepoUser repo;
@Autowired
public IRepoRole repoRole;
	@Override
	public BaseResponse getAll() {
		BaseResponse cmRep = new BaseResponse();
		List<UserEntity> list = repo.findAll();
		if(list.isEmpty())
		{
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		List<UserResponse> rep = list.stream().map(UserResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(UserRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<UserEntity> rep = repo.findById(req.getUserID());
		if(rep.isEmpty())
		{
			cmRep.setError("khong ton tai");
			return cmRep;
		}
		UserResponse resp = new UserResponse();
		resp.setUserID(rep.get().getUserID());
		resp.setUserName(rep.get().getUserName());
		resp.setPassword(rep.get().getPassword());
		resp.setCreateTime(rep.get().getCreateTime());
		resp.setModifyTime(rep.get().getModifyTime());
		Optional<RoleEntity> roleID = repoRole.findById(rep.get().getRoleID().getRoleID());
		resp.setRoleID(roleID.get().getRoleID());
		cmRep.setContent(resp);
		return cmRep;
	}

}
