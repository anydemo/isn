package com.github.gorgestar.isn.mapper;

import com.github.gorgestar.isn.model.Pet;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PetMapper {

    @Select("SELECT * FROM pet")
    List<Pet> getAll();

}
