package openway;
/**
 * Unit test for simple App.
 */

import java.util.Scanner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    CalculationLogic calcLogic;

     @Test
     public void testingCalculation(){
         calcLogic = new CalculationLogic(3, 1);
         System.out.println("Result : "+calcLogic.Calculating());
     }

}
