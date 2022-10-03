package net.ryan.toontown.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ryan.toontown.Toontown;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Toontown.MOD_ID);

    public static final RegistryObject<Item> CUPCAKE = ITEMS.register("cupcake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TOONTOWN_TAB)));

    public static final RegistryObject<Item> SQUIRTING_FLOWER = ITEMS.register("squirting_flower",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TOONTOWN_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
