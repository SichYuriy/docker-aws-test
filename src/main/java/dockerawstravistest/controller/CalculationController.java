package dockerawstravistest.controller;

import dockerawstravistest.service.calculatoin.CalculationResult;
import dockerawstravistest.service.calculatoin.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private final CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping(value = "/sum", produces = MediaType.APPLICATION_JSON_VALUE)
    public CalculationResult getSum(@RequestParam int a, @RequestParam int b) {
        return calculationService.getSum(a, b);
    }

}
