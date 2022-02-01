package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<CompositeBlock> blocks = new ArrayList<>();

    @Override
    public Optional<CompositeBlock> findBlockByColor(String color) {
        for (CompositeBlock block : blocks) {
            if(block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<CompositeBlock> findBlocksByMaterial(String material) {
        List<CompositeBlock> listOfBlockByMaterial = new ArrayList<>();
        for (CompositeBlock block: blocks) {
            if (block.getMaterial().equals(material)) {
                listOfBlockByMaterial.add(block);
            }
        }
        return listOfBlockByMaterial;
    }

    @Override
    public int count() {
        return blocks.size();
    }

    public void add(CompositeBlock compositeBlock) {
        blocks.add(compositeBlock);
    }
}
