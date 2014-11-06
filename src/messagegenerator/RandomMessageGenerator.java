package messagegenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author justinpotts
 * @version 1.00
 */

public class RandomMessageGenerator {

    private List<String> messageSet;

    public RandomMessageGenerator() {
        messageSet = new ArrayList<>();
    }

    public void displayList() {
        for (String m : messageSet) {
            System.out.println(m);
        }
    }

    public String getRandomMessage() {
        Random rnd = new Random(System.nanoTime());
        int num = rnd.nextInt(messageSet.size());
        return messageSet.get(num);
    }

    public void removeDupes() {
        Set<String> dupes = new HashSet<>(messageSet);
        messageSet = new ArrayList<>(dupes);
    }

    public void createMessage(String message) {
        messageSet.add(message);
        removeDupes();
    }

    public void clearMessage(String message) {
        messageSet.remove(message);
    }

    public List<String> getMessageList() {
        return messageSet;
    }

    public void setMessageList(List<String> messageList) {
        this.messageSet = messageList;
    }

    
}
