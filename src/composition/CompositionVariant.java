package composition;

/**
 * Created by Женя on 08.06.2016.
 */
public class CompositionVariant {
    public static void main(String[] args) {
        VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
    }
}


interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}

class RasterGraphics{
    void drawRasterLine(){
        System.out.println("Draw line");
    }
    void drawRasterSquare(){
        System.out.println("Draw square");
    }
}

class VectorAdapterFromRaster implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
