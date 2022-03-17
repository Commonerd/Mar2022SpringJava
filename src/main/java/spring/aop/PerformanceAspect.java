package spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceAspect {

	@Pointcut("execution(public * spring..*.sayHello(..))")
	private void pointCut() {}
	
	@Around("pointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable {
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		long startTime = System.nanoTime();
		System.out.println("[Log]METHOD Before : " + methodName + " time check start");
		Object obj = null;
		try {
			obj = joinPoint.proceed(); //핵심로직 수행하고 돌아와서 나머지 작업 수행
		} catch (Exception e) {
			System.out.println("[Log]METHOD error : " + methodName);
		}
		long endTime = System.nanoTime();
		System.out.println("[Log]METHOD After : " + methodName + " time check end");
		System.out.println("[Log] " + methodName + " Processing time is " + (endTime - startTime) + "ns");
		return obj;
	}
}
