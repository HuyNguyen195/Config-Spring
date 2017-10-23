package com.fsoft.sam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsoft.sam.model.User;

interface UserRepository extends JpaRepository<User, Long>{
}