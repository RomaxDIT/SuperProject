package com.company;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class UnitTestRegister {

    private Logger log = Logger.getLogger(this.getClass());
    @Test
    public void reg(){
        try 
        {
            log.info("Начало выполнения регистрации ");
            String name="";
            String pass="";

            Register register  =new Register();
            register.reg( name ,pass);
            assertTrue(true);

        } 
            catch (Exception exception) {
            log.error("Исключение при выполнении регистрации - " + exception,exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void reg(){
        try {
            log.info("Начало выполнения регистрации ");
            String name="";

            Register register = new Register();
            register.reg( name);
            assertTrue(true);

        } catch (Exception exception) {
            log.error("Исключение при выполнении регистрации - " + exception, exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
    @Test
    public void del(){
        try  
        {
            log.info("Начало выполнения удаления ");
            String name="";
            String pass="";
            Register register  =new Register();
            register.del( name ,pass);
            assertTrue(true);

        } 
            catch (Exception exception) {
            log.error("Исключение при выполнении удаления - " + exception, exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}
