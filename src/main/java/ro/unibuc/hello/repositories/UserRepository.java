package ro.unibuc.hello.repositories;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    @Query("SELECT s FROM User s WHERE s.email = ?1")
        Optional<User> findUserByEmail(String email);

}
