 package ro.unibuc.hello.servicetestit;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

import com.mongodb.assertions.Assertions;

import ro.unibuc.hello.dto.Accessories;
import ro.unibuc.hello.repositories.AccessoriesRepository;
import ro.unibuc.hello.service.AccessoriesService;
import ro.unibuc.hello.servicetestIT.MockBean;
import ro.unibuc.hello.servicetestIT.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class AccessoriesServiceTestIT {

    @MockBean
    AccessoriesRepository mockAccessoriesRepository;

    @Autowired
    AccessoriesService accessoriesService;

    // @Test
    // void test_FindName_Update() {
    //     // Arrange
    //     String name = "example";
    //     Optional<Accessories> accessories = mockAccessoriesRepository.findAccessoriesByName(name);

    //     // Act
    //     if (accessories.isPresent()) {
    //         accessoriesService.updateAccessory(accessories.get().getId(), "example", 9.99, "blue", "leather");
    //     }

    //     // Assert
    //     if (accessories.isPresent()) {
    //         Assertions.assertEquals(9.99, accessories.get().getPrice());
    //         Assertions.assertEquals("blue", accessories.get().getColor());
    //         Assertions.assertEquals("leather", accessories.get().getMaterial());
    //     }
    // }
}
