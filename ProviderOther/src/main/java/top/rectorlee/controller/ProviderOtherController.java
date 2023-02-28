package top.rectorlee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee
 * @description
 * @date 2023-02-28  14:06:58
 */
@RestController
public class ProviderOtherController {
    @RequestMapping("/user")
    public String getUser() {
        return "调用的是ProviderOther";
    }
}
