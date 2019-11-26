package se.lexicon.skovde.models;

public class Flask extends LiquidContainer {

    private boolean lidOn;

    @Override
    public boolean addLiquid(double liquid) {
        if (lidOn)
        {
            return false;
        }
        else
        {
            return setVolume(liquid);
        }
    }

    @Override
    public boolean removeLiquid(double liquid) {
        return false;
    }


}
