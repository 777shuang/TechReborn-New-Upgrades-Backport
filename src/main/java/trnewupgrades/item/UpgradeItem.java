package trnewupgrades.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import reborncore.api.blockentity.IUpgrade;
import reborncore.common.blockentity.MachineBaseBlockEntity;
import reborncore.common.recipes.IUpgradeHandler;

public class UpgradeItem extends Item implements IUpgrade {
    public final IUpgrade behavior;

    public UpgradeItem(String name, IUpgrade process) {
        super(new Item.Properties().stacksTo(16));
        this.behavior = process;
    }

    @Override
    public void process(MachineBaseBlockEntity blockEntity, IUpgradeHandler handler, ItemStack stack) {
        behavior.process(blockEntity, handler, stack);
    }
}
