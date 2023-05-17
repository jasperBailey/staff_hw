import management.Director;
import org.junit.Before;
import staff.Employee;

public class DirectorTest {
    private Employee director;
    @Before
    public void before() {
        director = new Director("Wenjing", "EC254532", 50_000, "QA", 300_000);
    }
}
