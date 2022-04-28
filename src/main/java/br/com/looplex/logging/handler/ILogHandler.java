package br.com.looplex.logging.handler;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.filler.ILogContextFiller;
import br.com.looplex.logging.formatter.ILogFormatter;
import br.com.looplex.logging.printer.ILogPrinter;

public interface ILogHandler {

    void handle(LogContext logContext);
    void setLogFormatter(ILogFormatter logFormatter);
    void setLogContextFiller(ILogContextFiller logContextFiller);
    void setLogPrinter(ILogPrinter logPrinter);

}