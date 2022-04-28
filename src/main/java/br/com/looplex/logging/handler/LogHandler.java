package br.com.looplex.logging.handler;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.filler.ILogContextFiller;
import br.com.looplex.logging.formatter.ILogFormatter;
import br.com.looplex.logging.printer.ILogPrinter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class LogHandler implements ILogHandler, Serializable {

    private ILogFormatter logFormatter;
    private ILogContextFiller logContextFiller;
    private ILogPrinter logPrinter;

    public void handle(LogContext logContext) {
        logContextFiller.fill(logContext);
        logFormatter.format(logContext);
        logPrinter.print(logContext);
    }

}