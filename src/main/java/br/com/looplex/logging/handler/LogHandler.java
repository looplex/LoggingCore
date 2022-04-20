package br.com.looplex.logging.handler;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.annotations.LogLevel;
import br.com.looplex.logging.filler.ILogContextFiller;
import br.com.looplex.logging.formatter.ILogFormatter;
import br.com.looplex.logging.printer.ILogPrinter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LogHandler implements ILogHandler {

    private ILogFormatter logFormatter;
    private ILogContextFiller logContextFiller;
    private ILogPrinter logPrinter;

    public void handle(LogContext logContext) {
        saveData(logContext);
        logContextFiller.fill(logContext);
        logFormatter.format(logContext);
        logPrinter.print(logContext);
    }

    private LogContext saveData(LogContext logContext) {
        logContext.getBody().put("caller", "LogHandler");
        logContext.getBody().put("methodName", "handle");
        logContext.getBody().put("args", "LogContext");
        logContext.getBody().put("logLevel", LogLevel.INFO.name());
        return logContext;
    }

}