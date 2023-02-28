package top.rectorlee.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @author Lee
 * @description
 * @date 2023-02-28  14:00:15
 */
@RestController
public class UserController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    private int currentServer;

    @RequestMapping("/user")
    public String getUser() {
        List<ServiceInstance> list = discoveryClient.getInstances("provider");

        URI uri = list.get(currentServer++ % list.size()).getUri();

        return restTemplate.getForObject(uri + "/user", String.class);
    }
}
