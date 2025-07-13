package com.example.rmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@SpringBootApplication
public class RmiWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(RmiWebApplication.class, args);
    }

    @Bean
    public IRemoteMath rmiClient() throws Exception {
        // Replace with your RMI server’s Render URL
        Registry registry = LocateRegistry.getRegistry("your-rmi-server.onrender.com", 1099);
        return (IRemoteMath) registry.lookup("Compute");
    }
          }
