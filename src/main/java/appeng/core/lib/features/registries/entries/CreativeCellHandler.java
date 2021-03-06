/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2015, AlgorithmX2, All rights reserved.
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

package appeng.core.lib.features.registries.entries;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

import appeng.core.api.implementations.tiles.IChestOrDrive;
import appeng.core.api.util.AEPartLocation;
import appeng.core.lib.sync.GuiBridge;
import appeng.core.lib.util.Platform;
import appeng.core.me.api.storage.ICellHandler;
import appeng.core.me.api.storage.IMEInventory;
import appeng.core.me.api.storage.IMEInventoryHandler;
import appeng.core.me.api.storage.ISaveProvider;
import appeng.core.me.api.storage.StorageChannel;
import appeng.core.me.grid.storage.CreativeCellInventory;
import appeng.core.me.item.ItemCreativeStorageCell;


public class CreativeCellHandler implements ICellHandler
{

	@Override
	public boolean isCell( final ItemStack is )
	{
		return is != null && is.getItem() instanceof ItemCreativeStorageCell;
	}

	@Override
	public IMEInventoryHandler getCellInventory( final ItemStack is, final ISaveProvider container, final StorageChannel channel )
	{
		if( channel == StorageChannel.ITEMS && is != null && is.getItem() instanceof ItemCreativeStorageCell )
		{
			return CreativeCellInventory.getCell( is );
		}
		return null;
	}

	@Override
	public void openChestGui( final EntityPlayer player, final IChestOrDrive chest, final ICellHandler cellHandler, final IMEInventoryHandler inv, final ItemStack is, final StorageChannel chan )
	{
		Platform.openGUI( player, (TileEntity) chest, AEPartLocation.fromFacing( chest.getUp() ), GuiBridge.GUI_ME );
	}

	@Override
	public int getStatusForCell( final ItemStack is, final IMEInventory handler )
	{
		return 2;
	}

	@Override
	public double cellIdleDrain( final ItemStack is, final IMEInventory handler )
	{
		return 0;
	}
}
