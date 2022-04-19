package br.com.looplex.logging.handler;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.filler.LogContextFiller;
import br.com.looplex.logging.formatter.LogFormatter;
import br.com.looplex.logging.printer.LogPrinter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LogHandlerTest {

    private static ILogHandler logHandler;

    @BeforeAll
    static void initializer() {
        logHandler = new LogHandler(
                new LogFormatter(),
                new LogContextFiller("[String, String, String]", "LogContextFiller", "fill()"),
                new LogPrinter()
        );
    }

    @Test
    public void shouldPrint() {
        LogContext logContext = new LogContext();
        logHandler.handle(logContext);
        assertThat(logContext.getMessage()).asString().isEqualTo("LogContextFiller invoked fill() with args [String, String, String]");
    }

}