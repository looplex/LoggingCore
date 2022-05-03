package br.com.looplex.logging;

import br.com.looplex.logging.annotations.LogLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class LogContext {

    private String args;
    private String caller;
    private String methodName;
    private String timestamp = String.valueOf(Instant.now());
    private String message;
    private LogLevel logLevel;
    private Throwable throwable;
    private Map<String, String> body = new HashMap<>();

}