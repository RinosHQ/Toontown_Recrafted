package net.ryan.toontown.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TOONTOWN_TAB = new CreativeModeTab("toontowntab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CUPCAKE.get());
        }
    };
}
