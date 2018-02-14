package dockerawstravistest.service.calculatoin.impl;

import dockerawstravistest.service.calculatoin.CalculationService;
import org.springframework.stereotype.Component;

@Component
public class CalculationServiceImpl implements CalculationService {

    @Override
    public int getSum(int a, int b) {
        return a + b;
    }
}
