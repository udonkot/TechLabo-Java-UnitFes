package jp.co.iglobe.dxservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DxserviceController {

    @GetMapping("/")
    public String home(Model model) {
        // model.addAttribute("message", "Spring Bootアプリケーションへようこそ！");
        return "index";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "ゲスト") String name, Model model) {
        // model.addAttribute("name", name);
        return "hello";
    }

}
