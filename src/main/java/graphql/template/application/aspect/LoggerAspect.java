package graphql.template.application.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class LoggerAspect {

    /**
     * invokeExecTimeLogger 各メソッドの処理時間計測用メソッド
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(* graphql.template..*.*(..))")
    public Object invokeExecTimeLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();

        Object result;

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            result = joinPoint.proceed();
        } finally {
            stopWatch.stop();

            log.info("[Class]{} [Method] {} [Time] {} ms", signature.getDeclaringTypeName(), signature.getName(), stopWatch.getTotalTimeMillis());
        }

        return result;
    }
}
