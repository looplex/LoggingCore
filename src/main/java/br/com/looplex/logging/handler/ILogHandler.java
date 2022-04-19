package br.com.looplex.logging.handler;

import br.com.looplex.logging.LogContext;

public interface ILogHandler {

    void handle(LogContext logContext);

}