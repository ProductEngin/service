// package ro.unibuc.hello.servicetestit;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

// import java.util.Optional;

// @SpringBootTest
// public class UserServiceTestIT {

//     @MockBean
//     UserRepository mockUserRepository;

//     @Autowired
//     UserService UserService;

//     @Test
//     void test_FindEmail_Update() {
//         // Arrange
//         String email = "andrei";
//         Optional<User> User = mockUserRepository.findUserByEmail(email);

//         // Act
//         if(User.isPresent()) {
//             UserService.updateUser(User.get().getId(), "andrei", "lascae");
//         }


//         // Assert
//         if(User.isPresent()) {
//             Assertions.assertEquals("lascae", User.get().getPrenume());
//             Assertions.assertEquals("andrei", User.get().getNume());
//         }

//     }

// }
