package ch.hevs.sdi.hellomvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloMvcController {
    private int count = 0;

    @GetMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "stranger") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("count", ++count);
        return "index";
    }
}
