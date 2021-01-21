package com.travel.application.travelservice.createrole.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.RoleEntity;
@Repository
public interface IRepoCreateRole  extends JpaRepository<RoleEntity, Long>{

}
