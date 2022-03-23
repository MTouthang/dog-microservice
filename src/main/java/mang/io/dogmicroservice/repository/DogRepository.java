package mang.io.dogmicroservice.repository;

import mang.io.dogmicroservice.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
