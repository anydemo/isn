package com.github.gorgestar.isn.mapper;

import com.github.gorgestar.isn.model.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM users")
    List<Users> getAll();

}
