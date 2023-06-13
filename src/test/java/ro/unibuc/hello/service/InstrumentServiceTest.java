package ro.unibuc.hello.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
//import ro.unibuc.hello.data.InformationEntity;
//import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.data.InstrumentRepository;
//import ro.unibuc.hello.dto.Greeting;
import ro.unibuc.hello.exception.EntityNotFoundException;

import static org.mockito.Mockito.when;

import java.util.List;

//import java.util.List;

import ro.unibuc.hello.dto.Instrument;



@ExtendWith(SpringExtension.class)
public class InstrumentServiceTest {
    @Mock
    InstrumentRepository mockInstrumentRepository;

    @InjectMocks
    InstrumentService instrumentService = new InstrumentService(mockInstrumentRepository);

    Instrument instrumentDummy = new Instrument();
    Instrument instrument = new Instrument(1,"Guitar","Fender");

    @Test
    void testType() {
        Assertions.assertEquals("Guitar", instrument.getType());
        instrumentDummy.setType("Guitar");
        Assertions.assertEquals("Guitar", instrumentDummy.getType());
    }
    @Test
    void testBrand() {
        Assertions.assertEquals("Fender", instrument.getBrand());
        instrumentDummy.setBrand("Fender");
        Assertions.assertEquals("Fender", instrument.getBrand());
    }
    // @Test
    // void test1_Instruments(){
    //     // Arrange
      

    //     // Act
    //      List<Instrument> instruments =  instrumentService.getInstruments();
    //      Instrument instrument=instruments.get(0);

    //     // Assert
    //     Assertions.assertEquals(0, instrument.getId());
    //     Assertions.assertEquals(null, instrument.getType());
    //     Assertions.assertEquals(null, instrument.getBrand());
    // }
    @Test
    void test_throwsEntityNotFoundException_whenInformationNull() {
        // Arrange
        long testId=-1;
        when( mockInstrumentRepository.findAll()).thenReturn(null);
        

        try {
            // Act
            List<Instrument> instrument =  instrumentService.getInstruments();
        } catch (Exception ex) {
            // Assert
            Assertions.assertEquals(ex.getClass(), NullPointerException.class);
            Assertions.assertEquals(ex.getMessage(), null);
        }
    }

}



 