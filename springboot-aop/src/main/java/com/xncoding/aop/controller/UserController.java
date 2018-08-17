package com.xncoding.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xncoding.aop.aspect.UserAccess;

/**
 * Description:
 */
@RestController
public class UserController {
    @RequestMapping("/first")
    public Object first() {
<<<<<<< HEAD
<<<<<<< Updated upstream
=======
      //提交1
>>>>>>> Stashed changes
=======
        //dev
        //commit 1
        //commit 2
        //commit 3
>>>>>>> bf964189d900b9f05e88439eab0e4f9e26d71aca
        return "first controller";
    }

    @RequestMapping("/doError")
    public Object error() {
		//dev
        return 1 / 0;
    }

	@RequestMapping("/second")
    @UserAccess(desc = "second")
    public Object second() {
        return "second controller";
    }

}
