/**
 * Code by Lambda Innovation, 2013.
 */
package cn.graphrevo.proxy;

import cn.graphrevo.client.render.RenderFreezing;
import cn.graphrevo.entity.EntityFreezing;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * 客户端的加载代理。
 */
public class GRClientProxy extends GRCommonProxy {

	public void preInit() {
		super.preInit();
	}
	
	public void init() {
		RenderingRegistry.registerEntityRenderingHandler(EntityFreezing.class, new RenderFreezing());
		super.init();
	}
	
	public void postInit() {
		super.postInit();
	}

}
