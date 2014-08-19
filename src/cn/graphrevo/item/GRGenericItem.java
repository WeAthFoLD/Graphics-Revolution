/**
 * Code by Lambda Innovation, 2013.
 */
package cn.graphrevo.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author WeAthFolD
 */
public class GRGenericItem extends Item {

	public GRGenericItem(int par1) {
		super();
	}
	
	/**
	 * 方便的快速设置函数。
	 * @param str
	 */
	protected void setIAndU(String str) {
		setUnlocalizedName(str);
		setTextureName("graphrevo:" + str);
	}
	
	/**
	 * 为物品添加名字的方便函数。请务必在设置了unlocalizedName后调用。
	 */
	protected final void addLocalization(String str) {
		LanguageRegistry.addName(this, str);
	}
}
