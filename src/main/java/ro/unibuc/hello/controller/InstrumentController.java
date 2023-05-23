package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.InstrumentService;
import ro.unibuc.hello.dto.Instrument;

import java.util.List;
import java.util.Optional;

//import javax.sound.midi.Instrument;

@RestController
@RequestMapping(path = "instruments/")
public class InstrumentController{
   
    private InstrumentService instrumentService;
    @Autowired
    InstrumentController(InstrumentService instrumentService){
        this.instrumentService=instrumentService;
    }

    @PostMapping
    public void registerNewInstrument(@RequestBody Instrument instrument){
        instrumentService.addNewInstrument(instrument);
    }
    @GetMapping
    public List<Instrument> getInstruments() {
        return instrumentService.getInstruments();
    }

  

} 
