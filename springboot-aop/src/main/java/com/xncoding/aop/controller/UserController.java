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

        //rpc

        //dev
<<<<<<< HEAD

=======
        //commit 1
<<<<<<< HEAD
>>>>>>> 69c6934... 1
=======
        //commit 2
        //commit 3
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> bf96418... 3
=======
>>>>>>> bf96418... 3
=======
>>>>>>> bf96418... 3
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
