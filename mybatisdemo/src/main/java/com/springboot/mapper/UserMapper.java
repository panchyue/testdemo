package com.springboot.mapper;


import com.springboot.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
