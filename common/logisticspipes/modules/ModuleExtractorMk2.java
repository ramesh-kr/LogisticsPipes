package logisticspipes.modules;

import javax.swing.Icon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ModuleExtractorMk2 extends ModuleExtractor{
	
	public ModuleExtractorMk2() {
		super();
	}
	
	@Override
	protected int ticksToAction() {
		return 20;
	}

	@Override
	protected int neededEnergy() {
		return 7;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconTexture(IIconRegister register) {
		return register.registerIcon("logisticspipes:itemModule/ModuleExtractorMk2");
	}
}
