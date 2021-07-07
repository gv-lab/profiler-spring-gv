package com.gvlab.profiles;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Autowired
private DBConfiguration dbConfig;

@SpringBootApplication
public class ProfilesApplication {
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProfilesApplication.class);
        app.run();
	}

	public void run(String... args) throws Exception {
        System.out.println("driverClassName: " + dbConfig.getDriverClassName);
        System.out.println("url: " + dbConfig.getUrl);
    }

}
