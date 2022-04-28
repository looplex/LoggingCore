package br.com.looplex.logging.filler;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.annotations.LogLevel;

import java.io.Serializable;

public class LogContextFiller implements ILogContextFiller, Serializable {

    public LogContext fill(LogContext logContext) {
        logContext.setCaller("LogHandler");
        logContext.setMethodName("handle");
        logContext.setArgs("LogContext");
        logContext.setLogLevel(LogLevel.valueOf(LogLevel.INFO.name()));
        return logContext;
    }

}