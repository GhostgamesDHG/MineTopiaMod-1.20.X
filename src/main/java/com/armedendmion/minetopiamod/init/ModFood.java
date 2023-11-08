package com.armedendmion.minetopiamod.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
public class ModFood {
    public static final FoodProperties BANANA = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(3).saturationMod(1.2f).build();
    public static final FoodProperties HAMBURGER = new FoodProperties.Builder().nutrition(10).saturationMod(1.2f).build();
    public static final FoodProperties SANDWICH = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties PINEAPPLE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties BACON = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();
    public static final FoodProperties CHICKEN = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties COOKED_CHICKEN = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties HOTDOG = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();
    public static final FoodProperties ICE_CREAM = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties CODFISH = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties FRIES = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties PIZZA = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties CHICKEN_BUCKET = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();
    public static final FoodProperties FRUIT_SKEWER = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties SUSHI = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties SUSHI_PACKAGE = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties MUFFIN = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties VANILLA_MUFFIN = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties CHOCOLATE_MUFFIN = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties JELLYBEANS = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties CANDY_CANE = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties DOUBLE_SUSHI_PACKAGE = new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).build();
    public static final FoodProperties CUPCAKE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties GRAPES = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties RED_GRAPES = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties HOP = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties CHIPS_NATURAL = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();
    public static final FoodProperties DONUT_BLUEBERRIES = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties DONUT_CHOCOLATE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties DONUT_HALLOWEEN = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties DONUT_STRAWBERRY = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties DONUT_CHRISTMAS = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties DONUT_WHITE = new FoodProperties.Builder().nutrition(4).saturationMod(1.2f).build();
    public static final FoodProperties STRAWBERRY_ICECREAM = new FoodProperties.Builder().nutrition(3).saturationMod(1.2f).build();
    public static final FoodProperties CHOCOLATE_LETTER = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties CHOCOLATE_BAR = new FoodProperties.Builder().nutrition(2).saturationMod(1.2f).build();
    public static final FoodProperties APFELSTRUDEL = new FoodProperties.Builder().nutrition(5).saturationMod(1.2f).build();
    public static final FoodProperties BITTERBALLEN = new FoodProperties.Builder().nutrition(6).saturationMod(1.2f).build();

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
