import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean result;
    public AccountTest (String name, boolean result) {
        this.name = name;
        this.result = result;
    }
    @Parameterized.Parameters(name = "{0} - {1}")
    public static Object[][] testData() {
        return new Object[][] {
                {"ROMAN KOSTYUK SERGEEVICH", false},
                {" ROMAN KOSTYUK", false},
                {"ROMAN KOSTYUK ", false},
                {"ROMANKOSTYUK", false},
                {"RO", false},
                {"", false},
                {"ROMAN KOSTYUK", true},
        };
    }
    @Test
    public void accountTest (){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(result, actual);
    }
}
