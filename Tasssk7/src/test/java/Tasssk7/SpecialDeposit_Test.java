package Tasssk7;

import static org.junit.Assert.*;
import com.company.Tasssk7.SpecialDeposit;
import org.junit.Test;

public class SpecialDeposit_Test {
@Test
    public void income(){
    SpecialDeposit deposit = new SpecialDeposit(1000.0, 12);
    double income = deposit.income();
    assertEquals(1115.7, income, 1);
}
}
