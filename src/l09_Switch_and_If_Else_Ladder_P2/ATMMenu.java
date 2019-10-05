package l09_Switch_and_If_Else_Ladder_P2;

/**
 * For selecting items from the ATM menu.
 * @author mafudge
 */
public enum  ATMMenu {
    
    Deposit("d"), Withdrawl("w"), Balance("b"),Quit("q");
     
    private final String choice;
    
    ATMMenu(String choice) {
        this.choice = choice;
    }
    
    /**
     * Get the ATM menu value. 
     * @return 
     */
    public String Value() { return this.choice; }    
    
}
