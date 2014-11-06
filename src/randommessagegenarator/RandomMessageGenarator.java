/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randommessagegenarator;

import java.util.*;

/**
 *
 * @author mbrester1
 */
public class RandomMessageGenarator {
    private List<String> messages;
    private String tempMessage;

    public RandomMessageGenarator() {
        messages = new ArrayList<>();
    }
    
    
    public void addMessage(String message){
        tempMessage = message;
        messages.add(tempMessage);
        removeDubs(messages);
    }
    
    public void removeDubs(List messages){
        Set<String> dubs = new HashSet<>(messages);
        this.messages = new ArrayList(dubs);
        
    }
    public String getRandomMessage(){
        if(messages.size() == 0 ){
            throw new IllegalArgumentException("List is empty, Please put a message in to the list");
        }
        Random rnd = new Random();
        int random = rnd.nextInt(messages.size()-1);
        return messages.get(random);
    }
    
    public void removeMessage(String message){
        for (String message1 : messages) {
            if(message1.equals(message)){
                messages.remove(message1);
            }
        }
    }

    public void showAllMessages(){
        for (String message : messages) {
            System.out.println(message);
        }
            
    }

   

   

   

    
}
    
 