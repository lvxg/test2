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




        //rpc

        //rpc1
        //rpc2
=======
<<<<<<< Updated upstream
=======
      //提交1
>>>>>>> Stashed changes
>>>>>>> 946c2c0... 1111
        return "first controller";
    }

    @RequestMapping("/doError")
    public Object error() {

		//dev

		//rpc

        return 1 / 0;
    }

	@RequestMapping("/second")
    @UserAccess(desc = "second")
    public Object second() {
        return "second controller";
    }

}
