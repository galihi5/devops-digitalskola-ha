package com.gaw.demo_ha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greetingNewUser() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        return String.format("Hello from hostname: %s and IPv4: %s",  addr.getHostName(), addr.getHostAddress());
    }

    @GetMapping("/kill")
    public String kill() {
        System.exit(0);
        return "killed";
    }
}
