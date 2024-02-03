package exam2016;

public class LogMessage {

    private String machineId;
    private String description;

    public LogMessage(String message) {
        int colon = message.indexOf(":");
        machineId = message.substring(0,colon);
        description = message.substring(colon + 1);
    }

    public boolean containsWord(String keyword) {
        int index = description.indexOf(keyword);
        if (description.equals(keyword))
            return true;
        if (description.substring(0, index + 1).equals(keyword+" "))
            return true;
        if (description.indexOf(" " + keyword + " ") != -1)
            return true;
        if (description.length() > keyword.length()) {
            if (description.substring(description.length()-index - 1).equals(" " + keyword))
                return true;
        }
        return false;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getDescription() {
        return description;
    }

}
