package com.example.game.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.game.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
