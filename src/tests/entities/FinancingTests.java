package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
    @Test
    public void financingShouldMakeObjectWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Financing(150000.0, 3000.0, 20);
        });
    }

    @Test
    public void financingShouldMakeObjectWhenValidData() {
        Assertions.assertDoesNotThrow(() -> {
            new Financing(150000.0, 3000.0, 100);
        });
    }

    @Test
    public void totalAmountShouldChangeAmoutWhenValidData() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertDoesNotThrow(() -> {
            financing.setTotalAmount(120000.0);
        });
    }

    @Test
    public void totalAmountShouldChangeAmoutWhenInvalidData() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setTotalAmount(300000.0);
        });
    }

    @Test
    public void incomeShouldChangeIncomeWhenValidData() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertDoesNotThrow(() -> {
            financing.setIncome(4000.0);
        });
    }

    @Test
    public void incomeShouldChangeIncomeWhenInvalidData() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setIncome(2000.0);
        });
    }

    @Test
    public void monthsShouldChangeMonthsWhenValidData() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertDoesNotThrow(() -> {
            financing.setMonths(110);
        });
    }

    @Test
    public void monthsShouldChangeMonthsWhenInvalidData() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            financing.setMonths(60);
        });
    }

    @Test
    public void entryShouldCalculateEntry() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertEquals(30000.0, financing.entry());
    }

    @Test
    public void quotaShouldCalculateQuota() {
        Financing financing = new Financing(150000.0, 3000.0, 100);
        Assertions.assertEquals(1200.0, financing.quota());
    }
}
