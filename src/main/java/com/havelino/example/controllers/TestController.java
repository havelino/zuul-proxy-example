/**
 * 
 */
package com.havelino.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hha0009
 *
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = {"application/json"})
    public String getAllBooks() {
        return "Hello world.";
    }

}
