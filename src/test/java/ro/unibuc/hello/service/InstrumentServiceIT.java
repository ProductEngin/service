package ro.unibuc.hello.service;




import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.data.InstrumentRepository;
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

}
