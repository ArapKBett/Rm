package com.example.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RmiController {
    @Autowired
    private IRemoteMath remoteMath;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") double num1,
                           @RequestParam("num2") double num2,
                           @RequestParam("operation") String operation,
                           Model model) {
        try {
            double result;
            if ("add".equals(operation)) {
                result = remoteMath.add(num1, num2);
            } else {
                result = remoteMath.subtract(num1, num2);
            }
            model.addAttribute("result", result);
        } catch (Exception e) {
            model.addAttribute("error", "Error: " + e.getMessage());
        }
        return "index";
    }
}
