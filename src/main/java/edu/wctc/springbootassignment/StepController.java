package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepController {

    @RequestMapping("/stepOne")
    public String showStepOne(){
        return "steps/stepOne";
    }

    @RequestMapping("/stepTwo")
    public String showStepTwo(){
        return "steps/stepTwo";
    }

    @RequestMapping("/stepThree")
    public String showStepThree(){
        return "steps/stepThree";
    }
}
