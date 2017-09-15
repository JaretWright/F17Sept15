package f17sept15;

/**
 *
 * @author JWright
 */
public class ShowingFinally {
    public static void main(String[] args)
    {
        try{
            throwsException();
        }
        catch (Exception exception)
        {
            System.err.println("Exception handled in main method");
        }
        doesNotThrowException();
    }
    
    public static void throwsException() throws Exception
    {
        try{
           System.out.println("Method throwsException");
           throw new Exception();
        }
        catch (Exception exception){
            System.err.println("Exception hanlded in method throwException");
            throw exception;
        }
        finally {
            System.err.println("Finally executed in throwException");
        }
    } ///end of method throwsException
    
    public static void doesNotThrowException()
    {
        try{
            System.out.println("Method does not throw exception");
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        finally{
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
