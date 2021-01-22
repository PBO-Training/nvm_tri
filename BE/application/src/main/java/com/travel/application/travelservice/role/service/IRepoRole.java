package com.travel.application.travelservice.role.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.RoleEntity;

@Repository
public interface IRepoRole  extends JpaRepository<RoleEntity, Long>{

}
