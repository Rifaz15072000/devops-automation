package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){
		return "welcome to My first k8s Project -- RIFAZ";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}

// package com.javatechie;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @RestController
// public class DevopsIntegrationApplication {

//     @GetMapping("/")
//     public String message() {
//         return "<html>" +
//                "<head>" +
//                "<style>" +
//                "body { " +
//                "   font-family: Arial, sans-serif; " +
//                "   text-align: center; " +
//                "   margin-top: 100px; " +
//                "   background: linear-gradient(135deg, #74ebd5 0%, #ACB6E5 100%);" +
//                "   color: #333;" +
//                "}" +
//                "h1 { color: #2e8b57; font-size: 40px; }" +
//                "h3 { color: #1e90ff; font-size: 24px; }" +
//                "p  { color: #555; font-size: 18px; }" +
//                "div.card {" +
//                "   background: #fff;" +
//                "   padding: 30px;" +
//                "   margin: auto;" +
//                "   width: 60%;" +
//                "   border-radius: 15px;" +
//                "   box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.2);" +
//                "}" +
//                "</style>" +
//                "</head>" +
//                "<body>" +
//                "<div class='card'>" +
//                "<h1>🚀 Welcome to My First Kubernetes Project 🚀</h1>" +
//                "<h3>Spring Boot + Docker + Kubernetes</h3>" +
//                "<p>✅ Application is running successfully inside your K8s cluster</p>" +
//                "</div>" +
//                "</body>" +
//                "</html>";
//     }

//     public static void main(String[] args) {
//         SpringApplication.run(DevopsIntegrationApplication.class, args);
//     }
// }

