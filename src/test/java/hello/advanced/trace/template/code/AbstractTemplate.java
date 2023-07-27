package hello.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractTemplate {
    /**
     * 변하지 않는 부분은 execute()에 작성
     */
    public void execute() {
        long startTime = System.currentTimeMillis();
        //비즈니스 로직 실행
//        log.info("비즈니스 로직1 실행");
        call();
        //비즈니스 로직 종료
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

    /**
     * 변하는 부분은 call()를 자식클래스에서 오버라이딩해서 구현하도록 함
     */
    protected abstract void call();
}
