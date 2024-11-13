import java.util.ArrayList;
import java.util.List;

public enum Logger {
    INSTANCE;
    private List<String> logs = new ArrayList<>();

    public void log(String message) {
        logs.add(message);
    }

    public void printLogs(){
        System.out.println("Логи:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
