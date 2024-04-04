package com.armedendmion.minetopiamod.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
public class ModFood {
    public static final FoodProperties ONEHUNGER = new FoodProperties.Builder().nutrition(1).saturationMod(1.2f).build();
    public static final FoodProperties TWOHUNGER = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties THREEHUNGER = new FoodProperties.Builder().nutrition(3).saturationMod(1.2f).build();
    public static final FoodProperties FOURHUNGER = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties FIVEHUNGER = new FoodProperties.Builder().nutrition(5).saturationMod(1.2f).build();
    public static final FoodProperties SIXHUNGER = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties SEVENHUNGER = new FoodProperties.Builder().nutrition(7).saturationMod(1.2f).build();
    public static final FoodProperties EIGHTHUNGER = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();
    public static final FoodProperties NINEHUNGER = new FoodProperties.Builder().nutrition(9).saturationMod(1.2f).build();
    public static final FoodProperties TENHUNGER = new FoodProperties.Builder().nutrition(10).saturationMod(1.2f).build();

    public static final FoodProperties PEPPER = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200, 2),1f).build();

    public static final FoodProperties BROODJE_GEZOND = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,5*20, 1),0.5f).build();

    public static final FoodProperties GELUKSKOEKJE = new FoodProperties.Builder().nutrition(5).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK,40*20, 1),1f)
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE,20*20, 1),0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,30*20, 1),0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,30*20, 1),0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,15*20, 1),0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER,10*20, 1),0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP,15*20, 1),0.05f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,15*20, 1),0.05f).build();

    //DRUG
    public static final FoodProperties WEED = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1f).build();

    public static final FoodProperties PURPLE_WEED = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1f).build();

    public static final FoodProperties COCAINE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1f).build();

    public static final FoodProperties DRAGONFLESH = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1f).build();

    public static final FoodProperties UNICORNFLESH = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.2f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1f).build();
}
