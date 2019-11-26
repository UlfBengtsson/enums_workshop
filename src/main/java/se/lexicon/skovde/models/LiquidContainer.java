package se.lexicon.skovde.models;

public abstract class LiquidContainer {

    private double volume;
    private double maxVolume;
    private String nameOfLiquidInside;

    public abstract boolean addLiquid(double liquid);

    public abstract boolean removeLiquid(double liquid);

    public double getVolume() {
        return volume;
    }

    protected boolean setVolume(double volume) {
        if (this.volume + volume <= maxVolume)
        {
            this.volume += volume;
            return true;
        }
        return false;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public String getNameOfLiquidInside() {
        if (volume == 0)
        {
            return "No Liquid";
        }
        return nameOfLiquidInside;
    }

    public void setNameOfLiquidInside(String nameOfLiquidInside) {
        this.nameOfLiquidInside = nameOfLiquidInside;
    }
}
