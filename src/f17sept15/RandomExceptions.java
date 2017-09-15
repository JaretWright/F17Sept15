package f17sept15;

import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Formatter;

/**
 *
 * @author JWright
 */
public class RandomExceptions {
    public static void main(String[] args) throws FileNotFoundException
    {
        SecureRandom random = new SecureRandom();
        Formatter errorLog = new Formatter("exceptions.csv");
        
        for (int i=1; i <= 100000; i++)
        {
            try
            {
                generateException(random.nextInt(100));
            }
            catch (Exception e)
            {
                errorLog.format("Time %s, Exception: %s%n", LocalDateTime.now(),
                                                            e.getMessage());
            }
        }
        errorLog.close();
    }   //end of the main method
    
    /**
     * This method will generate random exceptions based on the argument
     */
    public static void generateException(int exceptionNum) throws Exception
    {
        if (exceptionNum == 0)
            throw new Exception("Wrong password");
        
        else if (exceptionNum == 1)
            throw new Exception("Long API response time");
        
        else if (exceptionNum % 3 == 0)
            throw new Exception("Invalid input");
        
        else if (exceptionNum >= 2)
            throw new Exception("Programming on a sunny day causes exceptions");
    }
}
