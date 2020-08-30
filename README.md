# ITEC442 ECommerce Project

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

This project is for education purpose, not all functions have been implemented.

# Development tool suggestion
- Eclipse (Free)
- NetBean (Free)
- Intellij (Commercial software, Free for student)
# Software/Framework 
- Java 8+
- Springboot 2.3.3
- Thymeleaf
- MySql
- Maven

# Project Initilization
The easiest way to initial project is via IntelliJ dev tool, you also can download the zip file from https://start.spring.io

# Configuration
Configuration file can be application.properties or application.yml, looks like as following (yml format):
```sh
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/fsu-itec442-ecommerce?characterEncoding=UTF-8&serverTimezone=UTC
    username: [username of your DB]
    password: [password of your DB]
  jpa:
    hibernate:
      ddl-auto: update
```

# Controller
Springboot controller are the core of the framework, it controller all business logic and the work flow, following is the controller 
for helloworld webpage display:
```sh 
@Controller
public class WebController {

    @GetMapping("/")
    public String helloworld(){
        return "helloworld";
    }
}
```

# Template
Template make website easy to maintain, save development time.

layout_main.html
```sh 
<!DOCTYPE html>
<html th:lang="${#locale.language}"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
</head>

<body>

    <div>
        Head
    </div>
    <div layout:fragment="main-content">
        Hello FSU
    </div>
    <div>
        Footer
    </div>
</body>
</html>
```

helloworld.html with layout
```sh 
<!DOCTYPE html>
<html th:lang="${#locale.language}"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
      layout:decorate="~{/layouts/layout_main}">
<head>
<body>

<div layout:fragment="main-content">
    Hello, ITEC 442
</div>
</body>
</html>
```

### Developer
| Name | EMAIL |
| ------ | ------ |
| Dr. Zhijiang Chen | zchen@frostburg.edu|