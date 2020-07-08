package cn.toj.template.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dyzhang
 */
@Slf4j
@RestController
public class HelloWorld {
    @RequestMapping("/")
    String home() {
        log.debug("Dyzhang!");
        return "Hello from Dyzhang!";
    }
}
