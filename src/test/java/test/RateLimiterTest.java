package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RateLimiterTest {


  @Test
  public void customerMadeXRequestsInTheSpanOfYSeconds() throws InterruptedException {

      RateLimiter server1Limiter = new RateLimiter();
      int x = 5;
      long y = 10;
      Customer customerA = new Customer("IAG", x, y);


      for(int z=0; z<x; x++){
          assertTrue("customerRequest",  server1Limiter.isCustomerRequestPermitted(customerA));
          Thread.sleep(1000);
      }

  }

}