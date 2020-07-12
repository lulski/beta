package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RateLimiterTest {


  @Test
  public void customer_makeMaxAllocatedLimit() throws InterruptedException {

      RateLimiter server1Limiter = new RateLimiter();
      int x = 5; // how many requests customer will make
      long y = 60;//how long till customer need to wait until they can start another request (in seconds)
      Customer customerA = new Customer("IAG", x, y);


      for(int z=0; z<x; x++){
          assertTrue("customerRequest",  server1Limiter.isCustomerRequestPermitted(customerA));
          Thread.sleep(2000);
      }


  }

}