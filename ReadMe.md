### Between Two Application Communication => API => Data:XML/JSON

Client => Browser

### TomCat Server => Application => Java


# Rest Service

Client => Request => REST Interface => Application Logic => JSON Converted JSON => Response => (Sending Back Data) Tomcat Server => (through) HTTP

Terminal: Tomcat started on port(s): 8080 (http) with context path ''

# Spring Boot Container
### 1. Starter-json => converting array to Json response
### 2. Apache tomcat => Autoconfiguration with localhost:8080
### 3. Spring-boot-autoconfigured
```
@SpringBootApplication
    => SpringBootRestAPI => Class
        => @ComponentScan
            => @RestController
                => Recommendation Controller => Class => return an array back => Converted into a Json response => start - json
                                => getMapping("/movies")

                Tomcat Server is autoconfigured => Servlet Container Configurations Default
```
![This is an image](/asserts/1.PNG)

## ----------------------------------------
# Application Layering
## WEB LAYER
```
    => @SpringBootApplication
        => @ComponentScan, @Configuration
    
    => @RestController => bean(class in spring)
        => @GetMapping
               => getAllMovies()
                    => return ArrayList
                        => toJson()
    => Client(Web Browser) => Tomcat Server(Server by this server) => localhost:8080
```

## SERVICE LAYER

## DAO(DATA ACCESS OBJECT) LAYER

## DATABASE


# DEVELOPER TOOLS


# STARTER PROJECTS
## => Spring Web

# ACTUATOR
