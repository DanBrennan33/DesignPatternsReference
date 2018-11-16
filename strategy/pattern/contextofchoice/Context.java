package strategy.pattern.contextofchoice;

import strategy.pattern.choices.IChoice;

public class Context {
    IChoice myC;

    public void setChoice(IChoice ic) {
        myC = ic;
    }

    public void showChoice(String s1, String s2) {
        myC.myChoice(s1,s2);
    }
}
