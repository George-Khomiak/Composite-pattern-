package company.BlockModels;

import company.CompositeBlock;
import java.util.ArrayList;
import java.util.List;

public class CornerBlock implements CompositeBlock {
    String color;
    String material;
    List<CompositeBlock> cornerBlockList = new ArrayList<>();

    public CornerBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List getBlocks() {
        return cornerBlockList;
    }

    public void add(CompositeBlock compositeBlockChild) {
        cornerBlockList.add(compositeBlockChild);
    }
}
