/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourseason;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

public class Course {
	
    private String cardName;
    
    public Course (String cardName){
    	this.cardName = cardName ;
    }

    /**
     * @return the Question
     */
    public String getcardName() {
        return cardName;
    }

    /**
     * @param Question the question to set
     */
    public void setcardName(String cardName) {
        this.cardName = cardName;
    }

    
    @Override
    public String toString(){
        String result="Question :"+cardName;
     
        return result;
    }
    
}