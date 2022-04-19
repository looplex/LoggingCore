package br.com.looplex.logging.formatter;

import br.com.looplex.logging.LogContext;

public class LogFormatter implements ILogFormatter {

    public LogContext format(LogContext logContext) {
        logContext.setMessage(String.format("%s invoked %s with args %s",
                logContext.getCaller(),
                logContext.getMethodName(),
                logContext.getArgs()));
        return logContext;
    }

}