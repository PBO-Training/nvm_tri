package com.travel.application.travelservice.getuser.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.UserEntity;
@Repository
public interface IRepoGetUser extends JpaRepository<UserEntity, Long>{

}
