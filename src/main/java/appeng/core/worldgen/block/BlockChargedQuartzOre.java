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

package appeng.core.worldgen.block;


import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appeng.core.AppEngCore;
import appeng.core.api.exceptions.MissingDefinition;
import appeng.core.definitions.CoreMaterialDefinitions;
import appeng.core.lib.AEConfig;
import appeng.core.lib.CommonHelper;
import appeng.core.lib.client.render.effects.ChargedOreFX;


public final class BlockChargedQuartzOre extends BlockQuartzOre
{

	public BlockChargedQuartzOre()
	{
		this.setBoostBrightnessLow( 2 );
		this.setBoostBrightnessHigh( 5 );
	}

	@Override
	public ItemStack getItemStackDropped( final IBlockState state )
	{
		return AppEngCore.INSTANCE.<appeng.core.api.material.Material, CoreMaterialDefinitions>definitions( appeng.core.api.material.Material.class ).certusQuartzCrystalCharged().maybeStack( 1 ).orElseThrow( () -> new MissingDefinition( "Tried to access certus quartz crystal, even though they are disabled" ) );
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void randomDisplayTick( final IBlockState state, final World w, final BlockPos pos, final Random r )
	{
		if( !AEConfig.instance.enableEffects )
		{
			return;
		}

		double xOff = ( r.nextFloat() );
		double yOff = ( r.nextFloat() );
		double zOff = ( r.nextFloat() );

		switch( r.nextInt( 6 ) )
		{
			case 0:
				xOff = -0.01;
				break;
			case 1:
				yOff = -0.01;
				break;
			case 2:
				xOff = -0.01;
				break;
			case 3:
				zOff = -0.01;
				break;
			case 4:
				xOff = 1.01;
				break;
			case 5:
				yOff = 1.01;
				break;
			case 6:
				zOff = 1.01;
				break;
		}

		if( CommonHelper.proxy.shouldAddParticles( r ) )
		{
			final ChargedOreFX fx = new ChargedOreFX( w, pos.getX() + xOff, pos.getY() + yOff, pos.getZ() + zOff, 0.0f, 0.0f, 0.0f );
			Minecraft.getMinecraft().effectRenderer.addEffect( fx );
		}
	}
}
