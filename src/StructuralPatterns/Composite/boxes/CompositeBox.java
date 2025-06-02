package StructuralPatterns.Composite.boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {
//composite sluzi na robenie so tree strukturami ako s jednym objektom
   private final List<Box> children = new ArrayList<>();

   public CompositeBox(Box... boxes) {
       children.addAll(Arrays.asList(boxes));
   }

    @Override
    public double calculatePrice() {
        double sum = 0.0;
        for (Box box : children) {
            sum += box.calculatePrice();
        }
        return sum;
    }
}
