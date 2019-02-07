package com.github.gorgestar.isn.mapper;

import com.github.gorgestar.isn.model.Pet;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetMapperTest {

    @Autowired
    private PetMapper petMapper;

    @Test
    @Ignore
    public void testQuery() throws Exception {
        List<Pet> pets = petMapper.getAll();
        System.out.println(pets.toString());
    }
}
