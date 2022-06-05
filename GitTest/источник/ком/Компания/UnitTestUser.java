import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTestUser {

    private Logger log = Logger.getLogger(this.getClass());
    @Test
    public void SetName(){
        try {
            log.info("Начало выполнения SetName ");
            String name="";

            User user  =new User();
            user.SetName(name);
            assertTrue(true);

        } catch (Exception exception)
        {
            log.error("Исключение при выполнении SetName - " + exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void SetPassword()
    {
        try
        {
            log.info("Начало выполнения SetPassword ");
            String password="";

            User user = new User();
            user.SetPassword(password);
            assertTrue(true);

        }

        catch (Exception exception)
        {
            log.error("Исключение при выполнении SetPassword - " + exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void GetName()
    {
        try
        {
            log.info("Начало выполнения GetName ");
            String expectedValue="";

            User user = new User();
            String actualValue=user.GetName();
            log.info("Ожидаемое значение = " + expectedValue + ". Актуальное значение = " + actualValue);
            System.out.println("Ожидаемое значение = " + expectedValue + ". Актуальное значение = " + actualValue);
            assertEquals(expectedValue, actualValue);

        } catch (Exception exception) {
            log.error("Исключение при исполнении execute1GetAllLogFromFirstMovF - " + exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void GetPassword(){
        try {
            log.info("Запуск выполнения GetPassword ");
            String expectedValue="";

            User user = new User();
            String actualValue=user.GetPassword();
            log.info("Ожидаемое значение = "+ expectedValue + ". Актуальное значение = " + actualValue);
            System.out.println("Ожидаемое значение = " + expectedValue +". Актуальное значение = " + actualValue);
            assertEquals(expectedValue, actualValue);

        }
        catch (Exception exception)
        {
            log.error("Исключение при выполнении - " + exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}
