package br.com.looplex.logging.formatter;

import br.com.looplex.logging.LogContext;

public interface ILogFormatter {

    LogContext format(LogContext logContext);

}