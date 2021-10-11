package com.example.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class StudentController {
    //http://localhost:5000/hello/home
    @RequestMapping(value = {"", "/home", "/"})
	public ResponseEntity<String> hello(){
		System.out.println("erererere");// print in console
		return new ResponseEntity<String>("Something", HttpStatus.OK);//in web
	} 

    //localhost:5000/hello/query/?name=jojo
    @RequestMapping(value = "/query")
    public String hello(String name){
        return "Hello"+name;
    }

    //http://localhost:5000/hello/param/hoho
    @GetMapping("/param/{name}")
    public String helloboy(@PathVariable String name, @RequestBody String fnam ){
        return "Hello "+name +" + " +fnam;
    }

    //, @RequestParam(value = "lastName") String last
    //http://localhost:5000/hello/put/kiki/?lastName=koko
    @PostMapping("/post")
    public String hellogirl(@RequestBody String firstName ){
        return "Hello "+firstName+" ! ";
    }

    @PutMapping("/put")
    public String hellogirlm(@RequestBody String firstName){
        return "Hello "+firstName+" !! ";
    }
}
