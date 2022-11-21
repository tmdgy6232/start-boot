package boot.startboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

    @GetMapping("start")
    public String start(Model model){
        model.addAttribute("data", "dstart!!!!");
        return "start";
    }

    @GetMapping("mvc")
    public String mvc(@RequestParam(required = false, value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "start";
    }
}
