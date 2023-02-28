package top.rectorlee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee
 * @description
 * @date 2023-02-28  14:08:41
 */
@RestController
public class ProviderController {
    @RequestMapping("/user")
    public String getUser() {
        return "调用的是provider";
    }
}
