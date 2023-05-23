package ro.unibuc.hello.repositories;

import ro.unibuc.hello.models.Accessories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccessoriesRepository extends JpaRepository<Accessories, Long> {

    @Query("SELECT a FROM Accessories a WHERE a.name = ?1")
    Optional<Accessories> findAccessoriesByName(String name);
}
