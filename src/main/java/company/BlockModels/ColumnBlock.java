package company.BlockModels;

import company.CompositeBlock;
import java.util.ArrayList;
import java.util.List;

public class ColumnBlock implements CompositeBlock {
    String color;
    String material;
    List<CompositeBlock> columnBlockList = new ArrayList<>();

    public ColumnBlock(String color, String material) {
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
        return columnBlockList;
    }

    public void add(CompositeBlock compositeBlockChild) {
        columnBlockList.add(compositeBlockChild);
    }
}
