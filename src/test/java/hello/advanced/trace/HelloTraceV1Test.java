package hello.advanced.trace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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