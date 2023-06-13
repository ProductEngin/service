package ro.unibuc.hello.service;


import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.messages.internal.com.google.common.base.Optional;
import ro.unibuc.hello.data.InformationEntity;
//import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.data.InstrumentRepository;
import ro.unibuc.hello.dto.Greeting;
import ro.unibuc.hello.dto.Instrument;

@SpringBootTest
@Tag("IT")
public class InstrumentServiceIT {
    @Autowired
    InstrumentRepository instrumentRepository;

    @Autowired
    InstrumentService instrumentService;

  
    @Test
    void test() {
        // Arrange
        long testId = 1;

        // Act
        List<Instrument> instruments = instrumentService.getInstruments();

        // Assert
        Assertions.assertEquals(null, instrumentService.getInstruments());
        Assertions.assertEquals("Overview : This is an example of using a data storage engine running separately from our applications server!", instrumentService.getInstruments());
    }

     @Test
    void test_buildGreetingFromInfo_returnsGreetingWithInformation() {
        // Arrange
        String Id = "2";

        Instrument informationEntity = new Instrument(2,"Piano","Fender");

        when(instrumentRepository.findById(Id)).thenReturn(null);

        // Act
        Instrument ins = instrumentService.getById(Id);

        // Assert
        Assertions.assertEquals(1, ins.getId());
        Assertions.assertEquals("Piano", ins.getType());
    }

}
