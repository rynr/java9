package org.javacasts.java9.money;

import java.util.Currency;

import org.junit.Test;

public class MoneyExampleTest {

  @Test
  public void findMultipleCurrencies() {
    System.out.println(Currency.getAvailableCurrencies());
  }

  @Test
  public void exampleEuro() {
    Currency EUR = Currency.getInstance("EUR");
    System.out.println(EUR.getCurrencyCode());
    System.out.println(EUR.getDefaultFractionDigits());
    System.out.println(EUR.getDisplayName());
    System.out.println(EUR.getNumericCode());
    System.out.println(EUR.getNumericCodeAsString());
    System.out.println(EUR.getSymbol());
  }
}
