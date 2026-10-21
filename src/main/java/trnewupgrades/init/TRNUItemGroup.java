package trnewupgrades.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import trnewupgrades.TechRebornNewUpgrades;

public final class TRNUItemGroup {
    private static final ResourceKey<CreativeModeTab> ITEM_GROUP =
        ResourceKey.create(Registries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(TechRebornNewUpgrades.MOD_ID, "item_group"));

    private TRNUItemGroup() {
    }

    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ITEM_GROUP,
            FabricItemGroup.builder()
                .title(Component.translatable("itemGroup.trnewupgrades.item_group"))
                .icon(() -> new ItemStack(TRNUContent.Upgrades.OVERCLOCKERMK3))
                .displayItems((context, entries) -> {
                    for (ItemLike item : TRNUContent.Upgrades.values()) {
                        entries.accept(item);
                    }
                })
                .build());
    }
}
