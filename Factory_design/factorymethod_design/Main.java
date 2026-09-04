interface ILogger {
    void log(String msg);
}

class DebugLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("DEBUG : " + msg);
    }
}

class ErrorLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("ERROR : " + msg);
    }
}

class InfoLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println("INFO : " + msg);
    }
}

interface LoggerFactory {
    ILogger createLogger();
}

class DebugLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new DebugLogger();
    }
}

class ErrorLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }
}

class InfoLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }
}

public class Main {
    public static void main(String[] args) {
        LoggerFactory infoFactory = new InfoLoggerFactory();
        LoggerFactory debugfactory = new DebugLoggerFactory();
        ILogger debuglogger = debugfactory.createLogger();
        ILogger infologger= infoFactory.createLogger();

        debuglogger.log("This is an debug log message");
        infologger.log("this is a info log msg");
    }
}