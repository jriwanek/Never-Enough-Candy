package net.darkhax.nec.client.gui;

import java.util.Set;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class GuiFactoryNEC implements IModGuiFactory {
    
    @Override
    public void initialize (Minecraft minecraftInstance) {
    
    }
    
    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass () {
        
        return GuiConfigNEC.class;
    }
    
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories () {
        
        return null;
    }
    
    @Override
    public RuntimeOptionGuiHandler getHandlerFor (RuntimeOptionCategoryElement element) {
        
        return null;
    }
}