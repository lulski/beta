package test;

import java.time.LocalDateTime;

public class RateLimiter {

  LocalDateTime serverTime;

  Boolean isCustomerRequestPermitted(Customer customer) {

    this.serverTime = LocalDateTime.now();

    // meaning it's the first ever request, let's allow it
    if (customer.getCustomerLastRequestTimeStamp() == null) {
      return requestPermitted(customer);

    }

    // compare current serverTime and the last timestamp of customer request,
    // if serverTime after custWaitPeriod + wait period
    LocalDateTime custLastRequestPlusWaitPeriod = customer.getCustomerLastRequestTimeStamp()
        .plusSeconds(customer.getCustomerWaitingPeriodInSeconds());


    // compare request made vs max permitted requests
    if (customer.getCustomerRequestCounter() < customer.getCustomerRequestLimit()) {
      return requestPermitted(customer);

    } else {

      if (custLastRequestPlusWaitPeriod.isBefore(serverTime)) {

        return requestPermittedCustomerWaitPeriodHasPassed(customer);

      }


      return requestDenied(customer);
    }

  }

  boolean requestPermitted(Customer customer) {
    int increment = customer.getCustomerRequestCounter() + 1;
    customer.setCustomerRequestCounter(increment);
    customer.setCustomerLastRequestTimeStamp(LocalDateTime.now());
    System.out.println(customer.getCustomerName() + " is Allowed, req count: " + customer.getCustomerRequestCounter()
        + "req timestamp: " + customer.getCustomerLastRequestTimeStamp());
    return true;
  }

  boolean requestPermittedCustomerWaitPeriodHasPassed(Customer customer) {
    customer.setCustomerRequestCounter(0);
    customer.setCustomerLastRequestTimeStamp(LocalDateTime.now());
    System.out.println(customer.getCustomerName() + " is Allowed, req count: " + customer.getCustomerRequestCounter()
        + "req timestamp: " + customer.getCustomerLastRequestTimeStamp());
    return true;
  }

  boolean requestDenied(Customer customer) {
    System.out.println(customer.getCustomerName() + " is Rejected, req count: " + customer.getCustomerRequestCounter()
        + "req timestamp: " + customer.getCustomerLastRequestTimeStamp());
    return false;
  }
}