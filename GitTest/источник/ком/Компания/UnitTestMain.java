package com.company;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTestMain {

    private Logger log = Logger.getLogger(this.getClass());
    @Test
    public void isRequest(){
        try {
            log.info("Запуск выполнения ");
            boolean expectedValue=false;

            int i=0;
            ManageBean managebean = new ManageBean();
            boolean actualValue = managebean.isRequest(i);
            log.info("Ожидаемое значение= "+ expectedValue +". Актуальное значение= "+actualValue);
            System.out.println("Ожидаемое значение="+ expectedValue +" . Актуальное значение="+actualValue);
            assertEquals(expectedValue, actualValue);

        }
        catch (Exception exception)
        {
            log.error("Исключение при исполнении - "+exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}
