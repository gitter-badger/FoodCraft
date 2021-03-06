/**
 * FoodCraft Mod for Minecraft.
 * Copyright (C) 2016 Infinity Studio.
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.infinitystudio.foodcraftreloaded.utils.food;

/**
 * A class for the json data.
 */
public class Food {
    private String unlocalizedName;
    private int foodLevel;
    private boolean alwaysEdible = false;
    private float[] modifier;
    private FoodEffect[] effects;
    private String[] oredicts = {""};
    private FoodRecipe[] recipes;

    public boolean isAlwaysEdible() {
        return alwaysEdible;
    }

    public void setAlwaysEdible(boolean alwaysEdible) {
        this.alwaysEdible = alwaysEdible;
    }

    public FoodEffect[] getEffects() {
        return effects;
    }

    public void setEffects(FoodEffect[] effects) {
        this.effects = effects;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    public float[] getModifier() {
        return modifier;
    }

    public void setModifier(float[] modifier) {
        this.modifier = modifier;
    }

    public String[] getOredicts() {
        return oredicts;
    }

    public void setOredicts(String[] oredicts) {
        this.oredicts = oredicts;
    }

    public FoodRecipe[] getRecipes() {
        return recipes;
    }

    public void setRecipes(FoodRecipe[] recipes) {
        this.recipes = recipes;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public void setUnlocalizedName(String unlocalizedName) {
        this.unlocalizedName = unlocalizedName;
    }
}
