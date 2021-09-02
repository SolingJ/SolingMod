package soling.soling.init;

import solingg.solingg.Solingg;
import solingg.solingg.item.Onigiri;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import solingg.solingg.item.OnigiriX;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Solingg.MOD_ID);

    public static final RegistryObject<Item> ONIGIRI = ITEMS.register("onigiri", () -> new Onigiri());
    public static final RegistryObject<Item> ONIGIRIX = ITEMS.register("onigirix", () -> new OnigiriX());

}