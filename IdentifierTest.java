public class IdentifierTest {
    public static void main(String[] args) {
        int Factorial; // valid
        int aRidiculouslyLongIdentifierName; // valid
        int 2ndLevel; // invalid - cannot start with a number
        int level2; // valid
        int MAX_SIZE; // valid
        int reduce#size; // invalid - cannot contain a special character
        int $lowest$; // valid
        int highest$; // valid
        int up and down; // invalid - cannot contain a space
        int coin-quarter; // invalid - cannot contain a dash
        int _pUPPY_; // valid
        int open/close; // invalid - cannot contain a slash
        int var@java; // invalid - cannot contain an @
        int public; // invalid - cannot be a reserved word
        int GRAVITY; // valid
        int top.floor; // invalid - cannot contain a period
        int class; // invalid - cannot be a reserved word
        int seven; // valid

    }// end of main()
}// end of class