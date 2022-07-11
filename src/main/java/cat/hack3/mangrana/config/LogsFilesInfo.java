package cat.hack3.mangrana.config;

public class LogsFilesInfo {

    public enum Action {EDIT, ADD}
    private final String path;
    private final Action whatToDo;

    public LogsFilesInfo(String path, String action) {
        this.path = path;
        this.whatToDo = Action.valueOf(action);
    }

    public String getPath() {
        return path;
    }

    public Action getAction() {
        return whatToDo;
    }
}