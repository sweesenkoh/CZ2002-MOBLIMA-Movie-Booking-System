package Model;

import java.io.Serializable;


public enum MovieType implements Serializable {

    NORMAL("Normal"),
    THREED("3D"),
    BLOCKBUSTER("Blockbuster");

    private String typeName;

    MovieType(String typeName) {
        this.typeName = typeName;
    }

    public String typeName() { return typeName; }

    public double getPriceIncrement(){
        switch (this){
            case NORMAL:
                return 0;
            case THREED:
                return PriceConfiguration.getInstance().getThreeDMovieIncrement();
            case BLOCKBUSTER:
                return PriceConfiguration.getInstance().getBlockbusterMovieIncrement();
            default:
                return 0;
        }
    }
}

