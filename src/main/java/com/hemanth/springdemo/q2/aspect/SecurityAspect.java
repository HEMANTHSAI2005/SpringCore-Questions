package com.hemanth.springdemo.q2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    @Before(
      "execution(* com.hemanth.springdemo.q2.component.Payment.payment(..))"
    )
    public void beforeAdvice() {

        System.out.println(
                "Before Payment Advice"
        );
    }

    @After(
      "execution(* com.hemanth.springdemo.q2.component.Payment.validateCC(..))"
    )
    public void afterAdvice() {

        System.out.println(
                "After ValidateCC Advice"
        );
    }

    @Around(
      "execution(* com.hemanth.springdemo.q2.component.Payment.process(..))"
    )
    public Object aroundAdvice(
            ProceedingJoinPoint pjp)
            throws Throwable {

        System.out.println(
                "Before Process"
        );

        Object result =
                pjp.proceed();

        System.out.println(
                "After Process"
        );

        return result;
    }
}