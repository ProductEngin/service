package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
//import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.InstrumentService;
import ro.unibuc.hello.dto.Instrument;

import java.util.List;
// import java.util.Optional;
import java.util.Optional;

//import javax.sound.midi.Instrument;

@RestController
@RequestMapping(path = "instruments/")
public class InstrumentController{
     @Autowired
    private InstrumentService instrumentService;
  

    @Autowired
    MeterRegistry metricsRegistry;

    InstrumentController(InstrumentService instrumentService){
        this.instrumentService=instrumentService;
    }

    @PostMapping(value = "/add")
    @ResponseBody
    @Timed(value = "instrument.add.time", description = "Time taken to register a new instrument")
    @Counted(value = "instrument.add.count", description = "Times instrument was registred")
    public void registerNewInstrument(@RequestBody Instrument instrument){
        instrumentService.addNewInstrument(instrument);
    }


    @GetMapping("/info")
    @ResponseBody
    @Timed(value = "instrument.info.time", description = "Time taken to return info")
    @Counted(value = "instrument.info.count", description = "Times info was returned")
    public List<Instrument> getInstruments() {
        return instrumentService.getInstruments();
    }

    @GetMapping("/getinstrument/{id}")
    @ResponseBody
    @Timed(value = "instrument.getinstrument.time", description = "Time taken to return info")
    @Counted(value = "instrument.getinstrument.count", description = "Times info was returned")
    public Instrument getInstrument(String id) {
        return instrumentService.getById(id);
    }



} 
