package ro.unibuc.hello.data;

// import java.util.List;
import ro.unibuc.hello.dto.Instrument;
//import javax.sound.midi.Instrument;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

/**
 * No need to implement this interface.
 * Spring Data MongoDB automatically creates a class it implementing the interface when you run the application.
 */
@Repository
public interface InstrumentRepository extends MongoRepository<Instrument, String> {
    public Instrument findbyId(String Id);
    
}