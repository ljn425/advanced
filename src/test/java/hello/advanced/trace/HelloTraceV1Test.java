package hello.advanced.trace;

import hello.advanced.trace.helloTraceV1.HelloTraceV1;
import org.junit.jupiter.api.Test;

class HelloTraceV1Test {
    @Test
    public void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus hello = trace.begin("hello");
        trace.end(hello);
    }
    
    @Test
    public void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus hello = trace.begin("hello");
        trace.exception(hello, new IllegalStateException());
    }


}