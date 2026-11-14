package nnnnarisa.narisafoundation.util.enums;

import net.minecraft.util.IStringSerializable;

public enum EnumMetal implements IStringSerializable {
    COPPER(0, "copper", "Copper", true),
    TIN(1, "tin", "Tin", true),
    ALUMINUM(2, "aluminum", "Aluminum", true),
    SILVER(3, "silver", "Silver", true),
    LEAD(4, "lead", "Lead", true),
    STEEL(5, "steel", "Steel", false),
    ALUBRASS(6, "alubrass", "AluBrass", false),
    ELECTRUM(7, "electrum", "Electrum", false),
    BRONZE(8, "bronze", "Bronze", false);

    private static final EnumMetal[] META_LOOKUP = new EnumMetal[values().length];

    private final int meta;
    private final String name, unlocalizedName;
    private final boolean simple;

    EnumMetal(int meta, String name, String unlocalizedName, boolean simple) {
        this.meta = meta;
        this.name = name;
        this.unlocalizedName = unlocalizedName;
        this.simple = simple;
    }

    public int getMeta() {
        return meta;
    }

    public String getName() {
        return name;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public boolean isSimple() {
        return simple;
    }

    @Override
    public String toString() {
        return name;
    }

    public static EnumMetal byMeta(int meta) {
        return META_LOOKUP[meta];
    }

    static {
        for (EnumMetal metal : EnumMetal.values()) {
            META_LOOKUP[metal.getMeta()] = metal;
        }
    }
}
