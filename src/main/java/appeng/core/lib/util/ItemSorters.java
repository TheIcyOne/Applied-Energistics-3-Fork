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

package appeng.core.lib.util;


import java.util.Comparator;

import appeng.core.api.config.SortDir;
import appeng.core.lib.util.item.AEItemStack;
import appeng.core.me.api.storage.data.IAEItemStack;


public class ItemSorters
{

	private static SortDir Direction = SortDir.ASCENDING;

	public static final Comparator<IAEItemStack> CONFIG_BASED_SORT_BY_NAME = new Comparator<IAEItemStack>(){

		@Override
		public int compare( final IAEItemStack o1, final IAEItemStack o2 )
		{
			if( getDirection() == SortDir.ASCENDING )
			{
				return Platform.getItemDisplayName( o1 ).compareToIgnoreCase( Platform.getItemDisplayName( o2 ) );
			}
			return Platform.getItemDisplayName( o2 ).compareToIgnoreCase( Platform.getItemDisplayName( o1 ) );
		}
	};
	public static final Comparator<IAEItemStack> CONFIG_BASED_SORT_BY_MOD = new Comparator<IAEItemStack>(){

		@Override
		public int compare( final IAEItemStack o1, final IAEItemStack o2 )
		{
			final AEItemStack op1 = (AEItemStack) o1;
			final AEItemStack op2 = (AEItemStack) o2;

			if( getDirection() == SortDir.ASCENDING )
			{
				return this.secondarySort( op2.getModID().compareToIgnoreCase( op1.getModID() ), o1, o2 );
			}
			return this.secondarySort( op1.getModID().compareToIgnoreCase( op2.getModID() ), o2, o1 );
		}

		private int secondarySort( final int compareToIgnoreCase, final IAEItemStack o1, final IAEItemStack o2 )
		{
			if( compareToIgnoreCase == 0 )
			{
				return Platform.getItemDisplayName( o2 ).compareToIgnoreCase( Platform.getItemDisplayName( o1 ) );
			}

			return compareToIgnoreCase;
		}
	};
	public static final Comparator<IAEItemStack> CONFIG_BASED_SORT_BY_SIZE = new Comparator<IAEItemStack>(){

		@Override
		public int compare( final IAEItemStack o1, final IAEItemStack o2 )
		{
			if( getDirection() == SortDir.ASCENDING )
			{
				return compareLong( o2.getCount(), o1.getCount() );
			}
			return compareLong( o1.getCount(), o2.getCount() );
		}
	};

	public static void init()
	{

	}

	public static int compareInt( final int a, final int b )
	{
		if( a == b )
		{
			return 0;
		}
		if( a < b )
		{
			return -1;
		}
		return 1;
	}

	public static int compareLong( final long a, final long b )
	{
		if( a == b )
		{
			return 0;
		}
		if( a < b )
		{
			return -1;
		}
		return 1;
	}

	public static int compareDouble( final double a, final double b )
	{
		if( a == b )
		{
			return 0;
		}
		if( a < b )
		{
			return -1;
		}
		return 1;
	}

	private static SortDir getDirection()
	{
		return Direction;
	}

	public static void setDirection( final SortDir direction )
	{
		Direction = direction;
	}
}
