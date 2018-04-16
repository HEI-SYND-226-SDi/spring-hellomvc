package ch.hevs.sdi.hellomvc;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMvcRestController {
    @PostMapping("miniCalc/calc")
    public double calc(@RequestParam double operandA, @RequestParam double operandB) {
        return operandA + operandB;
    }
}
