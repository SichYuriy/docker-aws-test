package dockerawstravistest.service.calculatoin.impl;

import dockerawstravistest.service.calculatoin.CalculationResult;
import dockerawstravistest.service.calculatoin.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CalculationServiceImpl implements CalculationService {

    private final String serviceVersion;

    @Autowired
    public CalculationServiceImpl(@Value("${calculationServiceVersion}") String serviceVersion) {
        this.serviceVersion = serviceVersion;
    }

    @Override
    public CalculationResult getSum(int a, int b) {
        return new CalculationResult(a + b, serviceVersion);
    }
}
