package solingg.solingg.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class OnigiriX extends Item{
    public OnigiriX() {
        super(new Properties().rarity(Rarity.RARE)
                .food(new Food.Builder().hunger(10).saturation(10.2F).setAlwaysEdible().fastToEat()
                        .effect(() -> new EffectInstance(Effects.ABSORPTION,12000,0),1)
                        .effect(() -> new EffectInstance(Effects.REGENERATION,200,1),1).build()));
    }
}
