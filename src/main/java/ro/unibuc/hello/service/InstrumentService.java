package ro.unibuc.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//import ro.unibuc.hello.data.InformationEntity;
//import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.data.InstrumentRepository;
import ro.unibuc.hello.dto.Instrument;
import ro.unibuc.hello.exception.EntityNotFoundException;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
//import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

//import javax.sound.midi.Instrument;

@Service
public class InstrumentService {

    
    private final InstrumentRepository instrumentsRepository;
    @Autowired
    public InstrumentService(InstrumentRepository instrumentRepository){
            this.instrumentsRepository=instrumentRepository;
    }

//    private final AtomicLong counter = new AtomicLong();
//    private static final String instrumentTemplate = "This is a %s!";
//   private static final String informationTemplate = "%s : %s!";
//   private final Map<Long, User> instrumentMap = new HashMap<>();

   
    public List<Instrument> getInstruments()
    {

        List<Instrument> instruments=instrumentsRepository.findAll();
        if( instruments==null)
        {
            throw new EntityNotFoundException("No instruments");
        }
        else
        {
            return instruments;
        }
    }
    public void addNewInstrument(Instrument instrument) {

        System.out.println(instrument);
        instrumentsRepository.save(instrument);
    }
    


}
