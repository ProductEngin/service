// package ro.unibuc.hello.test;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.context.ContextConfiguration;

// import java.time.LocalDate;

// @SpringBootTest
// public class AccessoriesTest {

//     Accessories accessoriesDummy = new Accessories();
//     Accessories accessories = new Accessories(1, "Accessory1", 9.99, "Red", "Leather");

//     @Test
//     void testId() {
//         accessoriesDummy.setId(1);
//         Assertions.assertEquals(1, accessoriesDummy.getId());
//     }

//     @Test
//     void testName() {
//         Assertions.assertEquals("Accessory1", accessories.getName());
//         accessoriesDummy.setName("Accessory2");
//         Assertions.assertEquals("Accessory2", accessoriesDummy.getName());
//     }

//     @Test
//     void testPrice() {
//         Assertions.assertEquals(9.99, accessories.getPrice());
//         accessoriesDummy.setPrice(19.99);
//         Assertions.assertEquals(19.99, accessoriesDummy.getPrice());
//     }

//     @Test
//     void testColor() {
//         Assertions.assertEquals("Red", accessories.getColor());
//         accessoriesDummy.setColor("Blue");
//         Assertions.assertEquals("Blue", accessoriesDummy.getColor());
//     }

//     @Test
//     void testMaterial() {
//         Assertions.assertEquals("Leather", accessories.getMaterial());
//         accessoriesDummy.setMaterial("Metal");
//         Assertions.assertEquals("Metal", accessoriesDummy.getMaterial());
//     }

//     @Test
//     void testToString() {
//         accessoriesDummy.toString();
//     }
// }