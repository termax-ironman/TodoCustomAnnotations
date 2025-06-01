package org.example.todospringcustomannotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMonitorAspect {

    @Around("@annotation(TimeMonitor)")
    public void logTime(ProceedingJoinPoint jointPoint) {
        //business logic
        long startTime = System.currentTimeMillis(); //start time of the code

        //execute the join points
        try {
            //execute the join point
            jointPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Something went wrong durin execution");
        } finally {
            long endTime = System.currentTimeMillis();
            long totalExecutionTime = endTime - startTime;
            System.out.println("Total execution time: " + totalExecutionTime);
        }
    }
}
