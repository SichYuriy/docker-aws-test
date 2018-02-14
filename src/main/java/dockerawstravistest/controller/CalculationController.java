package dockerawstravistest.controller;

import dockerawstravistest.service.calculatoin.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/sum")
    public int getSum(@RequestParam int a,@RequestParam int b) {
        Travis test: compilation error
        return calculationService.getSum(a, b);
    }

}
