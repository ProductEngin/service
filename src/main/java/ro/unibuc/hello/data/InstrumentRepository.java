package ro.unibuc.hello.data;

import java.util.List;
import ro.unibuc.hello.dto.Instrument;
//import javax.sound.midi.Instrument;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * No need to implement this interface.
 * Spring Data MongoDB automatically creates a class it implementing the interface when you run the application.
 */
@Repository
public interface InstrumentRepository extends MongoRepository<Instrument, String> {

    InformationEntity findById(int Id);
    List<Instrument> findByType(String type);
    List<Instrument> getAll();
    Instrument getById(long id);
    Instrument updateInstrument(Instrument instrument);
    Instrument deleteInstrument(Instrument instrument);
    Instrument addInstrument(Instrument instrument);
    

}