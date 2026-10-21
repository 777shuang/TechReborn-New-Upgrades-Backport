package trnewupgrades.init;

import java.util.HashMap;
import java.util.Objects;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import trnewupgrades.TechRebornNewUpgrades;

public final class InitUtil {
    private static final HashMap<Object, ResourceLocation> objIdentMap = new HashMap<>();

    private InitUtil() {
    }

    public static <I extends Item> I setup(I item, String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(TechRebornNewUpgrades.MOD_ID, name);
        registerIdent(item, id);
        if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
            String expected = Util.makeDescriptionId("item", id);
            String actual = item.getDescriptionId();
            if (!expected.equals(actual) && item.getClass().getName().startsWith("trnewupgrades.")) {
                throw new IllegalStateException("Item translation key mismatch: expected " + expected + ", got " + actual);
            }
        }
        return item;
    }

    public static void registerIdent(Object object, ResourceLocation id) {
        objIdentMap.put(object, id);
    }

    public static void registerItem(Item item) {
        ResourceLocation id = Objects.requireNonNull(objIdentMap.get(item), "Missing identifier for item: " + item);
        registerItem(item, id);
    }

    public static void registerItem(Item item, ResourceLocation id) {
        Registry.register(BuiltInRegistries.ITEM, id, item);
    }
}
