/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randommessagegenarator;

/**
 *
 * @author mbrester1
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomMessageGenarator messages = new RandomMessageGenarator();
        
        messages.addMessage("Hello");
        messages.addMessage("Hello");
        messages.addMessage("Welcome");
        messages.addMessage("This is a message");
        messages.addMessage("More messages");
        messages.showAllMessages();
        System.out.println(messages.getRandomMessage());
    }
}