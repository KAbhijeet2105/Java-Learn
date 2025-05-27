package creationalPatterns.singletonExample;

public class LoggerSingleton {

    private static volatile LoggerSingleton instance = null;

    private LoggerSingleton()
    {
        if(instance != null)
            throw new RuntimeException("Instance is already created!");
    }

    public static LoggerSingleton getInstance()
    {
        if(instance == null)
        {
         synchronized (LoggerSingleton.class){
          if(instance == null){
              instance = new LoggerSingleton();
          }
         }
        }
        return instance;
    }
}