/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2014, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.core.lib.api;


import java.io.IOException;

import io.netty.buffer.ByteBuf;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

import appeng.core.crafting.me.CraftingLink;
import appeng.core.lib.util.Platform;
import appeng.core.lib.util.item.AEFluidStack;
import appeng.core.lib.util.item.AEItemStack;
import appeng.core.lib.util.item.FluidList;
import appeng.core.lib.util.item.ItemList;
import appeng.core.me.api.networking.crafting.ICraftingLink;
import appeng.core.me.api.networking.crafting.ICraftingRequester;
import appeng.core.me.api.networking.energy.IEnergySource;
import appeng.core.me.api.networking.security.BaseActionSource;
import appeng.core.me.api.storage.IMEInventory;
import appeng.core.me.api.storage.IStorageHelper;
import appeng.core.me.api.storage.data.IAEFluidStack;
import appeng.core.me.api.storage.data.IAEItemStack;
import appeng.core.me.api.storage.data.IItemList;


public class ApiStorage implements IStorageHelper
{

	@Override
	public ICraftingLink loadCraftingLink( final NBTTagCompound data, final ICraftingRequester req )
	{
		return new CraftingLink( data, req );
	}

	@Override
	public IAEItemStack createItemStack( final ItemStack is )
	{
		return AEItemStack.create( is );
	}

	@Override
	public IAEFluidStack createFluidStack( final FluidStack is )
	{
		return AEFluidStack.create( is );
	}

	@Override
	public IItemList<IAEItemStack> createItemList()
	{
		return new ItemList();
	}

	@Override
	public IItemList<IAEFluidStack> createFluidList()
	{
		return new FluidList();
	}

	@Override
	public IAEItemStack readItemFromPacket( final ByteBuf input ) throws IOException
	{
		return AEItemStack.loadItemStackFromPacket( input );
	}

	@Override
	public IAEFluidStack readFluidFromPacket( final ByteBuf input ) throws IOException
	{
		return AEFluidStack.loadFluidStackFromPacket( input );
	}

	@Override
	public IAEItemStack poweredExtraction( final IEnergySource energy, final IMEInventory<IAEItemStack> cell, final IAEItemStack request, final BaseActionSource src )
	{
		return Platform.poweredExtraction( energy, cell, request, src );
	}

	@Override
	public IAEItemStack poweredInsert( final IEnergySource energy, final IMEInventory<IAEItemStack> cell, final IAEItemStack input, final BaseActionSource src )
	{
		return Platform.poweredInsert( energy, cell, input, src );
	}
}
