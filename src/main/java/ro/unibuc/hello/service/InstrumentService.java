package ro.unibuc.hello.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ro.unibuc.hello.data.InformationEntity;
import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.data.InstrumentRepository;
import ro.unibuc.hello.dto.Instrument;
import ro.unibuc.hello.exception.EntityNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

//import javax.sound.midi.Instrument;

@Component
public class InstrumentService {

    @Autowired
    private InstrumentRepository instrumentsRepository;

    private final AtomicLong counter = new AtomicLong();
    private static final String instrumentTemplate = "This is a %s!";
    private static final String informationTemplate = "%s : %s!";
    private final Map<Long, User> instrumentMap = new HashMap<>();

    public List<Instrument> getAll() {
        List<Instrument> list=instrumentsRepository.getAll();
        if( list==null)
        {
            throw new EntityNotFoundException("No instruments found");
        }
        else
        {
            return list;
        }
    }
    public Instrument getById(long id)
    {
        Instrument instrument=instrumentsRepository.getById(id);
        if( instrument==null)
        {
            throw new EntityNotFoundException("Instrument with id"+ id +" not found");
        }
        else
        {
            return instrument;
        }
    }
    public Instrument addInstrument(Instrument ins)
    {
        Instrument instrument=instrumentsRepository.getById(ins.getId());
        if( instrument==null)
        {
            throw new EntityNotFoundException("Couldn't insert instrument");
        }
        else
        {
            return  instrumentsRepository.addInstrument(instrument);
        }
    }
    public Instrument updateInstrument(Instrument ins)
    {
        Instrument instrument=instrumentsRepository.getById(ins.getId());
        if( instrument==null)
        {
            throw new EntityNotFoundException("Instrument with id"+ins.getId()+" not found");
        }
        else
        {
            return  instrumentsRepository.updateInstrument(instrument);
        }
    }
    public Instrument deleteInstrument(Instrument ins)
    {
        Instrument instrument=instrumentsRepository.getById(ins.getId());
        if( instrument==null)
        {
            throw new EntityNotFoundException("Instrument with id"+ins.getId()+" not found");
        }
        else
        {
            return  instrumentsRepository.deleteInstrument(instrument);
        }
    }


}
