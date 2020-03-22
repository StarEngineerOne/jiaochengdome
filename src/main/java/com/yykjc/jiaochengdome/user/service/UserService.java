package com.yykjc.jiaochengdome.user.service;

import com.yykjc.jiaochengdome.user.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {


    List<UserEntity> getAll(Map map);


    void delById(Integer id);


    void save(UserEntity userEntity);
}
