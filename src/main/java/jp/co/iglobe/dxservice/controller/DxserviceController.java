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

    @GetMapping("/iglobe")
    public String iglobe(Model model) {
        return "iglobe";
    }

    @GetMapping("/20250532")
    public String keyword(Model model) {
        return "20250532";
    }

    @GetMapping("/unitfes/mokumoku")
    public String mokumoku(Model model) {
        model.addAttribute("title", "もくもく会");
        model.addAttribute("description", "DXサービスユニットのもくもく会は、毎週水曜日に開催されています。自分の好きな技術をもくもくと学習する場です。");
        return "mokumoku";
    }
}
