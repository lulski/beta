package test;

import java.time.LocalDateTime;
import java.util.Date;

public class Customer {

  private String customerName;
  private int customerRequestLimit;
  private int customerRequestCounter;
  private LocalDateTime customerLastRequestTimeStamp;
  private long customerWaitingPeriodInSecond;

  public Customer( String customerName,  int customerRequestLimit,
                      long customerWaitingPeriod) {
    this.customerName = customerName;
    this.customerRequestLimit = customerRequestLimit;
    this.customerRequestCounter = 0;// at first customer request counter is 0
    this.customerLastRequestTimeStamp = null;
    this.customerWaitingPeriodInSecond = customerWaitingPeriod;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(final String customerName) {
    this.customerName = customerName;
  }

  public int getCustomerRequestLimit() {
    return customerRequestLimit;
  }

  public void setCustomerRequestLimit(final int customerRequestLimit) {
    this.customerRequestLimit = customerRequestLimit;
  }

  public int getCustomerRequestCounter() {
    return customerRequestCounter;
  }

  public void setCustomerRequestCounter(final int customerRequestCounter) {
    this.customerRequestCounter = customerRequestCounter;
  }

  public LocalDateTime getCustomerLastRequestTimeStamp() {
    return customerLastRequestTimeStamp;
  }

  public void setCustomerLastRequestTimeStamp(LocalDateTime customerLastRequestTimeStamp) {
    this.customerLastRequestTimeStamp = customerLastRequestTimeStamp;
  }

  public long getCustomerWaitingPeriodInSeconds() {
    return customerWaitingPeriodInSecond;
  }

  public void setCustomerWaitingPeriodInSeconds(long customerWaitingPeriod) {
    this.customerWaitingPeriodInSecond = customerWaitingPeriod;
  }


}