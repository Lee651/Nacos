package top.rectorlee.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee
 * @description 获取Nacos配置中心的信息
 * @date 2023-02-28  14:32:49
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${info.url}")
    private String url;

    @RequestMapping("/url")
    public String getUrl() {
        return url;
    }
}
