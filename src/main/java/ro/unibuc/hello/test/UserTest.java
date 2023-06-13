// package ro.unibuc.hello.test;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.ContextConfiguration;

// import java.time.LocalDate;

// @SpringBootTest
// public class UserTest {
//     LocalDate dob = LocalDate.of(2001, 7, 16);
//     User UserDummy = new User();
//     User User = new User("andrei", "lascae", "lascaea@yahoo.com", dob);

//     @Test
//     void testId(){
//         UserDummy.setId(1L);
//         Assertions.assertEquals(1L, UserDummy.getId());
//     }
//     @Test
//     void testNume(){
//         Assertions.assertEquals("andrei", User.getNume());
//         UserDummy.setNume("andrei1");
//         Assertions.assertEquals("andrei1", UserDummy.getNume());
//     }
//     @Test
//     void testPrenume(){
//         Assertions.assertEquals("lascae", User.getPrenume());
//         UserDummy.setPrenume("lascae1");
//         Assertions.assertEquals("lascae1", UserDummy.getPrenume());
//     }
//     @Test
//     void testEmail(){
//         Assertions.assertEquals("lascaea@yahoo.com", User.getEmail());
//         UserDummy.setEmail("lascaea1@yahoo.com");
//         Assertions.assertEquals("lascaea1@yahoo.com", UserDummy.getEmail());
//     }
//     @Test
//     void testData(){
//         Assertions.assertEquals(dob, User.getDob());
//         UserDummy.setDob(dob);
//         Assertions.assertEquals(dob, UserDummy.getDob());
//         Assertions.assertEquals(21, UserDummy.getAge());
//     }

//     @Test
//     void testToString(){
//         UserDummy.toString();
//     }
// }
