package test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class RateLimiterTest {


  @Test
  public void customer_makeMaxAllocatedLimit() throws InterruptedException {

      RateLimiter server1Limiter = new RateLimiter();
      int x = 100000; // how many requests customer will make
      long y = 10;//how long till customer need to wait until they can start another request (in seconds)
      Customer customerA = new Customer("IAG", 5, y);

      Customer customerB = new Customer("Suncorp", 200, y);


      for(int z=0; z<x; x++){
        server1Limiter.isCustomerRequestPermitted(customerA);
          //assertFalse("customer request limit is reached", server1Limiter.isCustomerRequestPermitted(customerA));
          Thread.sleep(1000);
      }




  }

}