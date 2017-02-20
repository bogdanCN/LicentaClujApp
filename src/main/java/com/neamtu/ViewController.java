package com.neamtu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Neamtu on 1/17/17.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(Model model) {return "index";}
}
