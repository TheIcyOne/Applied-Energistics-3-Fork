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

package appeng.core.me.client.gui;


import net.minecraft.entity.player.InventoryPlayer;

import appeng.core.lib.client.gui.AEBaseGui;
import appeng.core.lib.localization.GuiText;
import appeng.core.me.container.ContainerQNB;
import appeng.core.me.tile.TileQuantumBridge;


public class GuiQNB extends AEBaseGui
{

	public GuiQNB( final InventoryPlayer inventoryPlayer, final TileQuantumBridge te )
	{
		super( new ContainerQNB( inventoryPlayer, te ) );
		this.ySize = 166;
	}

	@Override
	public void drawFG( final int offsetX, final int offsetY, final int mouseX, final int mouseY )
	{
		this.fontRenderer.drawString( this.getGuiDisplayName( GuiText.QuantumLinkChamber.getLocal() ), 8, 6, 4210752 );
		this.fontRenderer.drawString( GuiText.inventory.getLocal(), 8, this.ySize - 96 + 3, 4210752 );
	}

	@Override
	public void drawBG( final int offsetX, final int offsetY, final int mouseX, final int mouseY )
	{
		this.bindTexture( "guis/chest.png" );
		this.drawTexturedModalRect( offsetX, offsetY, 0, 0, this.xSize, this.ySize );
	}
}
