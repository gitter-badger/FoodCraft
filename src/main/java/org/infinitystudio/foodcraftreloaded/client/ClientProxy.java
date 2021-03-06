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
 *
 * @license GPLv3
 */
package org.infinitystudio.foodcraftreloaded.client;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.infinitystudio.foodcraftreloaded.common.CommonProxy;

public class ClientProxy extends CommonProxy {
    public void preInitClient(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    public void initClient(FMLInitializationEvent event) {
        super.init(event);
    }

    public void postInitClient(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    public void loadCompleteClient(FMLLoadCompleteEvent event) {
        super.loadComplete(event);
    }
}
