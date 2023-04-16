package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.InstrumentService;
import ro.unibuc.hello.dto.Instrument;

import java.util.List;

//import javax.sound.midi.Instrument;

@Controller 
public class InstrumentController{
    @Autowired
    private InstrumentService instrumentService;

    @GetMapping("/instruments")
    @ResponseBody
    public List<Instrument> getAllInstruments(@RequestParam(name="name", required=false, defaultValue="Stranger") String type) {
        return instrumentService.getAll();
    }
    @GetMapping("/addinstrument")
    @ResponseBody
    public Instrument addInstrument(@RequestBody Instrument ins) {
        return instrumentService.addInstrument(ins);
    }
    @GetMapping("/updateinstrument")
    @ResponseBody
    public Instrument updateInstrument(@RequestBody Instrument ins) {
        return instrumentService.updateInstrument(ins);
    }

} 
