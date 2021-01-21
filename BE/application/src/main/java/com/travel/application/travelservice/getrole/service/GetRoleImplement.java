package com.travel.application.travelservice.getrole.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.application.common.base.BaseResponse;
import com.travel.application.entity.RoleEntity;
import com.travel.application.travelservice.getrole.dto.GetRoleRequest;
import com.travel.application.travelservice.getrole.dto.GetRoleResponse;

@Service
public class GetRoleImplement implements GetRoleService {
	@Autowired
	public IRepoGetRole repo;

	@Override
	public BaseResponse getAll() {
		// TODO Auto-generated method stub
		BaseResponse cmRep = new BaseResponse();
		List<RoleEntity> list = repo.findAll();
		if (list.isEmpty()) {
			cmRep.setError("Không tồn tại");
			return cmRep;
		}
		List<GetRoleResponse> rep = list.stream().map(GetRoleResponse::new).collect(Collectors.toList());
		cmRep.setContent(rep);
		return cmRep;
	}

	@Override
	public BaseResponse getByID(GetRoleRequest req) {
		BaseResponse cmRep = new BaseResponse();
		Optional<RoleEntity> rep = repo.findById(req.getRoleID());
		if (rep.isEmpty()) {
			cmRep.setError("Không tồn tại");
			return cmRep;
		}
		GetRoleResponse resp = new GetRoleResponse();
		resp.setRoleID(rep.get().getRoleID());
		resp.setCode(rep.get().getCode());
		resp.setName(rep.get().getName());
		resp.setDescription(rep.get().getDescription());
		cmRep.setContent(resp);
		return cmRep;
	}

}
