package muriplz.basicqueue.messages;

import muriplz.basicqueue.BasicQueue;
import muriplz.basicqueue.queue.Queue;

public class Messages {
    public static String get(String path, String uuid){
        if(path.equals("default")){
            return BasicQueue.getMessage("default").replace("%POSITION%", Queue.getPos(uuid)+"").replace("%COOLDOWNMINUTES%",Queue.cooldownOnMinutes+"");
        }else if(path.equals("added")){
            return BasicQueue.getMessage("added").replace("%POSITION%", Queue.getPos(uuid)+"").replace("%COOLDOWNMINUTES%",Queue.cooldownOnMinutes+"");
        }
        return "Error 32AE7Y";
    }
}
