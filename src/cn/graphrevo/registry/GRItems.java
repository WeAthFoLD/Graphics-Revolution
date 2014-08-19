/**
 * Code by Lambda Innovation, 2013.
 */
package cn.graphrevo.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import cn.graphrevo.item.ItemFreezingWand;

/**
 * Mod中所有物品实例的摆放位置。
 * @author WeAthFolD
 */
public class GRItems {

	public static ItemFreezingWand freezingWand;
	
	public static void init() {
		freezingWand = new ItemFreezingWand(7777);
		
		GameRegistry.registerItem(freezingWand, "gr_frozenwand");
	}

}
