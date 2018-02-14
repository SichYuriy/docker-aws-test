package dockerawstravistest.service.calculatoin.impl;

import dockerawstravistest.service.calculatoin.CalculationService;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationServiceImplTest {

    private CalculationService calculationService = new CalculationServiceImpl();

    @Test
    public void getSum() {
        assertEquals(5, calculationService.getSum(2, 3));
    }
}