package exam2016;

import java.util.*;

public class SystemLog {

    private List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword) {

        List<LogMessage> removeList = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).containsWord(keyword)) {
                removeList.add(messageList.remove(i));
                i--;
            }
        }
        return removeList;

    }

}
