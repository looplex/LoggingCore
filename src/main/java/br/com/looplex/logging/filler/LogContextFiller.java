package br.com.looplex.logging.filler;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.annotations.LogLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LogContextFiller implements ILogContextFiller {

    private String args;
    private String caller;
    private String methodName;

    public LogContext fill(LogContext logContext) {
        logContext.setArgs(args);
        logContext.setCaller(caller);
        logContext.setMethodName(methodName);
        logContext.setLogLevel(LogLevel.INFO);
        return logContext;
    }

}