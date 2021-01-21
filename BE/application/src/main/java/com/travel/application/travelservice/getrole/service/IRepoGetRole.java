package com.travel.application.travelservice.getrole.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.RoleEntity;

@Repository
public interface IRepoGetRole  extends JpaRepository<RoleEntity, Long>{

}
