/**
 * Code by Lambda Innovation, 2013.
 */
package cn.graphrevo.misc;

import cn.graphrevo.registry.GRItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 自定义CreativeTab。
 * @author WeAthFolD
 */
public class CCTGraphRevo extends CreativeTabs {

	/**
	 * @param label 标签名称
	 */
	public CCTGraphRevo(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return GRItems.freezingWand;
	}

}
