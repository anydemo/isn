package com.github.gorgestar.isn.api;

import com.github.gorgestar.isn.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/api}")
public class PetsApiController implements PetsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<Pet>> petsGet() {
        List<Pet> pets = new LinkedList<>();
        pets.add(new Pet());
        pets.add(new Pet());
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }
}
