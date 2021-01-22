package com.travel.application.travelservice.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.application.entity.UserEntity;
@Repository
public interface IRepoUser extends JpaRepository<UserEntity, Long>{

}
