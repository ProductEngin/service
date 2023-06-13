package ro.unibuc.hello.repositories;

import ro.unibuc.hello.dto.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccessoriesRepository extends MongoRepository<Accessories, Long> {

    @Query("SELECT a FROM Accessories a WHERE a.name = ?1")
    Optional<Accessories> findAccessoriesByName(String name);
}
