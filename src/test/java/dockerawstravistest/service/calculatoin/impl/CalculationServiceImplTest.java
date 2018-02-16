package dockerawstravistest.service.calculatoin.impl;

import dockerawstravistest.service.calculatoin.CalculationResult;
import dockerawstravistest.service.calculatoin.CalculationService;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationServiceImplTest {

    private CalculationService calculationService = new CalculationServiceImpl("1");

    @Test
    public void getSum() {
        CalculationResult expected = new CalculationResult(5, "1");
        assertEquals(expected, calculationService.getSum(2, 3));
    }
}