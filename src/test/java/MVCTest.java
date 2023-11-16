import org.example.design_patterns.Student;
import org.example.design_patterns.StudentController;
import org.example.design_patterns.StudentView;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MVCTest {

    private Student model;
    private StudentView view;
    private StudentController controller;

    @BeforeClass
    public static void beforeAll() {
        // Initialization code that runs once before all test methods
        System.out.println("Before all tests");
    }

    @Before
    public void setUp() {
        // Initialization code that runs before each test method
        model = new Student();
        model.setName("FirstName LastName");
        model.setSid("00000001");
        view = new StudentView();
        controller = new StudentController(model, view);
    }

    @Test
    public void testUpdateView() {
        // Test the updateView method
        String expectedOutput = "Student: "+System.lineSeparator()+"Name: FirstName LastName"+System.lineSeparator()+"SID: 00000001" + System.lineSeparator();
        assertEquals(expectedOutput, TestUtils.getConsoleOutput(() -> controller.updateView()));
    }

    @Test
    public void testSetStudentName() {
        // Test the setStudentName method
        controller.setStudentName("newFirstName newLastName");
        assertEquals("newFirstName newLastName", controller.getStudentName());
    }

    @Test
    public void testSetStudentSid() {
        controller.setStudentSid("7643892");
        assertEquals("7643892", controller.getStudentSid());
    }

    @Test(expected = NullPointerException.class)
    public void testSetStudentNameNegative() {
        controller = new StudentController(null, null);
        controller.setStudentName("newFirstName newLastName");
    }

    @After
    public void tearDown() {
        // Cleanup code that runs after each test method
        System.out.println("After each test");
    }

    @AfterClass
    public static void afterAll() {
        // Cleanup code that runs once after all test methods
        System.out.println("After all tests");
    }
}

