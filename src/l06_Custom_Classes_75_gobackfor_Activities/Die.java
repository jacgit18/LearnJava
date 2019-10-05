package l06_Custom_Classes_75_gobackfor_Activities;

import java.util.Random;

public class Die {
	private int _sides;
    private int _value;
    private Random _generator;// line 9 to 11 are the inner workings of the die
       
    // this is the contructor, called when you "new" the class.
    public Die(int sides) {// the constructor is a special method named after
    // a existing class, like on line 8. also int side is a parameter 
        this._sides  = sides;// this._sides equal int side parameter or kust sides
        this._generator = new Random();//this. refers to the class which is helpful when refering to similar vairble names
        this.roll();    // roll it so it gets a value.
    }
    
    // overload, to pass in an existing seed
    public Die(int sides, int seed) {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll();    // roll it so it gets a value.
    }
    
    // get the number of sides on the die
    public int getSides() {
        return _sides;
    }
    
    // change the number of sides on the die
    public int setSides(int sides) {
        this._sides = sides;
        return _sides;
    }
    
    // simulates a dice roll
    public int roll() {
        _value = _generator.nextInt(_sides)+1;
        return _value;
    }
    
    // get value showing on die
    public int getValue()
    {
        return _value;    }
}
