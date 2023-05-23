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

//import java.util.List;

import ro.unibuc.hello.dto.Instrument;



// @ExtendWith(SpringExtension.class)
// public class InstrumentServiceTest {
//     @Mock
//     InstrumentRepository mockInstrumentRepository;

//     @InjectMocks
//     InstrumentService instrumentService = new InstrumentService();

//     @Test
//     void test1_Instruments(){
//         // Arrange
      

//         // Act
//         Instrument instrument = instrumentService.getById(1);

//         // Assert
//         Assertions.assertEquals(1, instrument.getId());
//         Assertions.assertEquals("Hello, John!", instrument.getType());
//         Assertions.assertEquals("Hello, John!", instrument.getBrand());
//     }
//     @Test
//     void test_buildGreetingFromInfo_throwsEntityNotFoundException_whenInformationNull() {
//         // Arrange
//         long testId=-1;
//         when(mockInstrumentRepository.getById(testId)).thenReturn(null);

//         try {
//             // Act
//             Instrument instrument = instrumentService.getById(testId);
//         } catch (Exception ex) {
//             // Assert
//             Assertions.assertEquals(ex.getClass(), EntityNotFoundException.class);
//             Assertions.assertEquals(ex.getMessage(), "Instrument with id"+ testId +" not found");
//         }
//     }

// }



 