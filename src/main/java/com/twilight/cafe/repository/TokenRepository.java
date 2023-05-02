package com.twilight.cafe.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twilight.cafe.entity.Token;

public interface TokenRepository extends JpaRepository<Token, UUID>{ 

}
