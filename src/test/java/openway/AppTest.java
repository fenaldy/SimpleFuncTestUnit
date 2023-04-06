package openway;
/**
 * Unit test for simple App.
 */

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
   CalculationLogic calcLogic;

   @DataProvider (name = "data-provider")
   public Object[][] dataProvider(){
      return new Object[][] {{-2, -0.5},
                              {-8, -0.125},
                              {4, 0.25}, 
                              {10, 0.1},
                              {0, 1.0 / 0.0},
                              {+4, 0.25},
                              {+100, 0.01},
                              {1000, 0.001},
                              {10000, +0.0001}};           
   }

   @Test(priority = 1, dataProvider = "data-provider")
   public void testingValidCalculation(int inputParameter, double expectedResult){
      calcLogic = new CalculationLogic(inputParameter, 1);
      Assert.assertEquals(calcLogic.Calculating(), expectedResult);
   }

   @Test(priority = 2)
   public void testingInvalidCalculationGivenString(){
      try{
         String input = "test";
         calcLogic = new CalculationLogic(Integer.parseInt(input), 1);
         System.out.println(calcLogic.Calculating());
      }catch (Exception e){
         Assert.assertEquals(e.toString(), "java.lang.NumberFormatException: For input string: \"test\"");
      }
   }

}
