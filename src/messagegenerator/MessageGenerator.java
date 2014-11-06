package messagegenerator;

/**
 *
 * @author justinpotts
 * @version 1.00
 */

public class MessageGenerator {
        public static void main(String[] args) {
        RandomMessageGenerator rmg = new RandomMessageGenerator();
                
        rmg.createMessage("Baseball");
        rmg.createMessage("Football");
        rmg.createMessage("Soccer");
        rmg.createMessage("Basketball");
        rmg.createMessage("Tennis");
        rmg.createMessage("Golf");
        rmg.createMessage("Hockey");
        rmg.createMessage("Wrestling");
       
        
        rmg.clearMessage("Tennis");
        rmg.displayList();
        
    }
}
