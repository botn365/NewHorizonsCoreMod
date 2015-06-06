package com.dreammaster.item;

import com.dreammaster.creativetab.ModTabList;
import com.dreammaster.lib.Refstrings;

import eu.usrv.yamcore.items.ModItemManager;
import eu.usrv.yamcore.items.ModSimpleBaseItem;

public enum ItemList {
	AluminiumItemCasing(new ModSimpleBaseItem("AluminiumItemCasing", ModTabList.ModGenericTab)),
	AdvancedProcessorBoard(new ModSimpleBaseItem("AdvancedProcessorBoard", ModTabList.ModCircuitsTab)),
	AsteroidsStoneDust(new ModSimpleBaseItem("AsteroidsStoneDust",  ModTabList.ModGenericTab)),
	CallistoIceDust(new ModSimpleBaseItem("CallistoIceDust",  ModTabList.ModGenericTab)),
	CallistoIceIngot(new ModSimpleBaseItem("CallistoIceIngot",  ModTabList.ModGenericTab)),
	CallistoIceColdIngot(new ModSimpleBaseItem("CallistoIceColdIngot",  ModTabList.ModGenericTab)),
	CallistoIcePlate(new ModSimpleBaseItem("CallistoIcePlate",  ModTabList.ModGenericTab)),
	CallistoIceDensePlate(new ModSimpleBaseItem("CallistoIceDensePlate",  ModTabList.ModGenericTab)),
	CallistoIceCompressedPlate(new ModSimpleBaseItem("CallistoIceCompressedPlate",  ModTabList.ModGenericTab)),
	CarbonPartBoots(new ModSimpleBaseItem("CarbonPartBoots",  ModTabList.ModGenericTab)),
	CarbonPartChestplate(new ModSimpleBaseItem("CarbonPartChestplate",  ModTabList.ModGenericTab)),
	CarbonPartHelmet(new ModSimpleBaseItem("CarbonPartHelmet",  ModTabList.ModGenericTab)),
	CarbonPartHelmetNightVision(new ModSimpleBaseItem("CarbonPartHelmetNightVision",  ModTabList.ModGenericTab)),
	CarbonPartLeggings(new ModSimpleBaseItem("CarbonPartLeggings",  ModTabList.ModGenericTab)),
	ChargedSilverWandCap(new ModSimpleBaseItem("ChargedSilverWandCap",  ModTabList.ModThaumcraftTab)),
	ChargedThaumiumWandCap(new ModSimpleBaseItem("ChargedThaumiumWandCap",  ModTabList.ModThaumcraftTab)),
	ChargedVoidWandCap(new ModSimpleBaseItem("ChargedVoidWandCap",  ModTabList.ModThaumcraftTab)),
	ChromeItemCasing(new ModSimpleBaseItem("ChromeItemCasing", ModTabList.ModGenericTab)),
	CobbleStoneRod(new ModSimpleBaseItem("CobbleStoneRod",  ModTabList.ModGenericTab)),
	CopperWandCap(new ModSimpleBaseItem("CopperWandCap",  ModTabList.ModThaumcraftTab)),
	Display(new ModSimpleBaseItem("Display", ModTabList.ModCircuitsTab)),
	ElectricBoatHull(new ModSimpleBaseItem("ElectricBoatHull",  ModTabList.ModCircuitsTab)),
	EngineCore(new ModSimpleBaseItem("EngineCore",  ModTabList.ModCircuitsTab)),
	EngravedEnergyChip(new ModSimpleBaseItem("EngravedEnergyChip",  ModTabList.ModCircuitsTab)),
	EngravedDiamondCrystalChip(new ModSimpleBaseItem("EngravedDiamondCrystalChip",  ModTabList.ModCircuitsTab)),
	EngravedQuantumChip(new ModSimpleBaseItem("EngravedQuantumChip",  ModTabList.ModCircuitsTab)),
	EtchedInsaneVoltageWiring(new ModSimpleBaseItem("EtchedInsaneVoltageWiring",  ModTabList.ModCircuitsTab)),
	EtchedLudicrousVoltageWiring(new ModSimpleBaseItem("EtchedLudicrousVoltageWiring",  ModTabList.ModCircuitsTab)),
	ExtruderShapeBoat(new ModSimpleBaseItem("ExtruderShapeBoat",  ModTabList.ModShapesTab)),
	GoldWandCap(new ModSimpleBaseItem("GoldWandCap",  ModTabList.ModThaumcraftTab)),
	HeavyDutyAlloyIngotT4(new ModSimpleBaseItem("HeavyDutyAlloyIngotT4",  ModTabList.ModGenericTab)),
	HeavyDutyAlloyIngotT5(new ModSimpleBaseItem("HeavyDutyAlloyIngotT5",  ModTabList.ModGenericTab)),
	HeavyDutyAlloyIngotT6(new ModSimpleBaseItem("HeavyDutyAlloyIngotT6",  ModTabList.ModGenericTab)),
	HighEnergyCircuitParts(new ModSimpleBaseItem("HighEnergyCircuitParts",  ModTabList.ModCircuitsTab)),
	HighEnergyFlowCircuit(new ModSimpleBaseItem("HighEnergyFlowCircuit",  ModTabList.ModCircuitsTab)),
	IridiumItemCasing(new ModSimpleBaseItem("IridiumItemCasing", ModTabList.ModGenericTab)),
	IridiumAlloyItemCasing(new ModSimpleBaseItem("IridiumAlloyItemCasing", ModTabList.ModGenericTab)),
	IronWandCap(new ModSimpleBaseItem("IronWandCap",  ModTabList.ModThaumcraftTab)),
	LaserEmitter(new ModSimpleBaseItem("LaserEmitter", ModTabList.ModCircuitsTab)),
	LedoxDust(new ModSimpleBaseItem("LedoxDust",  ModTabList.ModGenericTab)),
	LedoxIngot(new ModSimpleBaseItem("LedoxIngot",  ModTabList.ModGenericTab)),
	LedoxColdIngot(new ModSimpleBaseItem("LedoxColdIngot",  ModTabList.ModGenericTab)),
	LedoxPlate(new ModSimpleBaseItem("LedoxPlate",  ModTabList.ModGenericTab)),
	LedoxDensePlate(new ModSimpleBaseItem("LedoxDensePlate",  ModTabList.ModGenericTab)),
	LedoxCompressedPlate(new ModSimpleBaseItem("LedoxCompressedPlate",  ModTabList.ModGenericTab)),
	LichBone(new ModSimpleBaseItem("LichBone",  ModTabList.ModThaumcraftTab)),
	LongObsidianRod(new ModSimpleBaseItem("LongObsidianRod",  ModTabList.ModGenericTab)),
	LongStoneRod(new ModSimpleBaseItem("LongStoneRod",  ModTabList.ModGenericTab)),
	MarsStoneDust(new ModSimpleBaseItem("MarsStoneDust",  ModTabList.ModGenericTab)),
	MasterCircuit(new ModSimpleBaseItem("MasterCircuit",  ModTabList.ModCircuitsTab)),
	MeteoricSteelString(new ModSimpleBaseItem("MeteoricSteelString",  ModTabList.ModGenericTab)),

	MoldChestplate(new ModSimpleBaseItem("MoldChestplate", ModTabList.ModMoldsTab)),
	MoldHelmet(new ModSimpleBaseItem("MoldHelmet",  ModTabList.ModMoldsTab)),
	MoldLeggings(new ModSimpleBaseItem("MoldLeggings", ModTabList.ModMoldsTab)),
	MoldFromLeggings(new ModSimpleBaseItem("MoldFormLeggings",  ModTabList.ModMoldsTab)),
	MoldFromHelmet(new ModSimpleBaseItem("MoldFormHelmet",  ModTabList.ModMoldsTab)),
	MoldFromChestplate(new ModSimpleBaseItem("MoldFormChestplate",  ModTabList.ModMoldsTab)),
	MoldFromBoots(new ModSimpleBaseItem("MoldFormBoots",  ModTabList.ModMoldsTab)),
	MoldBoots(new ModSimpleBaseItem("MoldBoots",  ModTabList.ModMoldsTab)),
	
	MoldFormAnvil(new ModSimpleBaseItem("MoldFormAnvil",  ModTabList.ModMoldsTab)),
	MoldFormArrowHead(new ModSimpleBaseItem("MoldFormArrowHead",  ModTabList.ModMoldsTab)),
	MoldFormBaguette(new ModSimpleBaseItem("MoldFormBaguette",  ModTabList.ModMoldsTab)),
	MoldFormBall(new ModSimpleBaseItem("MoldFormBall",  ModTabList.ModMoldsTab)),
	MoldFormBlock(new ModSimpleBaseItem("MoldFormBlock",  ModTabList.ModMoldsTab)),
	MoldFormBottle(new ModSimpleBaseItem("MoldFormBottle",  ModTabList.ModMoldsTab)),
	MoldFormBread(new ModSimpleBaseItem("MoldFormBread",  ModTabList.ModMoldsTab)),
	MoldFormBuns(new ModSimpleBaseItem("MoldFormBuns",  ModTabList.ModMoldsTab)),
	MoldFormCasing(new ModSimpleBaseItem("MoldFormCasing",  ModTabList.ModMoldsTab)),
	MoldFormCoinage(new ModSimpleBaseItem("MoldFormCoinage",  ModTabList.ModMoldsTab)),
	MoldFormCylinder(new ModSimpleBaseItem("MoldFormCylinder",  ModTabList.ModMoldsTab)),
	MoldFormGear(new ModSimpleBaseItem("MoldFormGear",  ModTabList.ModMoldsTab)),
	MoldFormIngot(new ModSimpleBaseItem("MoldFormIngot",  ModTabList.ModMoldsTab)),
	MoldFormName(new ModSimpleBaseItem("MoldFormName",  ModTabList.ModMoldsTab)),
	MoldFormNuggets(new ModSimpleBaseItem("MoldFormNuggets",  ModTabList.ModMoldsTab)),
	MoldFormPlate(new ModSimpleBaseItem("MoldFormPlate",  ModTabList.ModMoldsTab)),
	MoldFormSmallGear(new ModSimpleBaseItem("MoldFormSmallGear",  ModTabList.ModMoldsTab)),

	MoonStoneDust(new ModSimpleBaseItem("MoonStoneDust",  ModTabList.ModGenericTab)),
	MushroomPowder(new ModSimpleBaseItem("MushroomPowder",  ModTabList.ModGenericTab)),
	MysteriousCrystalDust(new ModSimpleBaseItem("MysteriousCrystalDust",  ModTabList.ModGenericTab)),
	MysteriousCrystalIngot(new ModSimpleBaseItem("MysteriousCrystalIngot",  ModTabList.ModGenericTab)),
	MysteriousCrystalColdIngot(new ModSimpleBaseItem("MysteriousCrystalColdIngot",  ModTabList.ModGenericTab)),
	MysteriousCrystalPlate(new ModSimpleBaseItem("MysteriousCrystalPlate",  ModTabList.ModGenericTab)),
	MysteriousCrystalDensePlate(new ModSimpleBaseItem("CallistoIceDensePlate",  ModTabList.ModGenericTab)),
	MysteriousCrystalCompressedPlate(new ModSimpleBaseItem("MysteriousCrystalCompressedPlate",  ModTabList.ModGenericTab)),
	MytrylDust(new ModSimpleBaseItem("MytrylDust",  ModTabList.ModGenericTab)),
	MytrylIngot(new ModSimpleBaseItem("MytrylIngot",  ModTabList.ModGenericTab)),
	MytrylHotIngot(new ModSimpleBaseItem("MytrylHotIngot",  ModTabList.ModGenericTab)),
	MytrylPlate(new ModSimpleBaseItem("MytrylPlate",  ModTabList.ModGenericTab)),
	MytrylDensePlate(new ModSimpleBaseItem("MytrylDensePlate",  ModTabList.ModGenericTab)),
	MytrylCompressedPlate(new ModSimpleBaseItem("MytrylCompressedPlate",  ModTabList.ModGenericTab)),
	NanoCrystal(new ModSimpleBaseItem("NanoCrystal",  ModTabList.ModCircuitsTab)),
	NanoProcessorBoard(new ModSimpleBaseItem("NanoProcessorBoard",  ModTabList.ModCircuitsTab)),
	NanoChestJetPack(new ModSimpleBaseItem("NanoChestJetPack", ModTabList.ModGenericTab)),
	NanoPlatedLeggings(new ModSimpleBaseItem("NanoPlatedLeggings", ModTabList.ModGenericTab)),
	NanoRubberBoots(new ModSimpleBaseItem("NanoRubberBoots",  ModTabList.ModGenericTab)),
	NanoScubaHelmet(new ModSimpleBaseItem("NanoScubaHelmet", ModTabList.ModGenericTab)),
	NeutroniumItemCasing(new ModSimpleBaseItem("NeutroniumItemCasing", ModTabList.ModGenericTab)),
	Nothing(new ModSimpleBaseItem("Nothing",  ModTabList.ModGenericTab)),
	PistonPlate(new ModSimpleBaseItem("PistonPlate", ModTabList.ModGenericTab)),
	OsmiumItemCasing(new ModSimpleBaseItem("OsmiumItemCasing", ModTabList.ModGenericTab)),
	QuantinumDust(new ModSimpleBaseItem("QuantinumDust",  ModTabList.ModGenericTab)),
	QuantinumHotIngot(new ModSimpleBaseItem("QuantinumHotIngot",  ModTabList.ModGenericTab)),
	QuantinumPlate(new ModSimpleBaseItem("QuantinumPlate",  ModTabList.ModGenericTab)),
	QuantinumDensePlate(new ModSimpleBaseItem("QuantinumDensePlate",  ModTabList.ModGenericTab)),
	QuantinumCompressedPlate(new ModSimpleBaseItem("QuantinumCompressedPlate",  ModTabList.ModGenericTab)),
	QuantumCrystal(new ModSimpleBaseItem("QuantumCrystal",  ModTabList.ModCircuitsTab)),
	QuantumPartBoots(new ModSimpleBaseItem("QuantumPartBoots",  ModTabList.ModGenericTab)),
	QuantumPartChestplate(new ModSimpleBaseItem("QuantumPartChestplate",  ModTabList.ModGenericTab)),
	QuantumPartHelmet(new ModSimpleBaseItem("QuantumPartHelmet",  ModTabList.ModGenericTab)),
	QuantumPartHelmetEmpty(new ModSimpleBaseItem("QuantumPartHelmetEmpty",  ModTabList.ModGenericTab)),
	QuantumPartLeggings(new ModSimpleBaseItem("QuantumPartLeggings",  ModTabList.ModGenericTab)),
	QuantumProcessorBoard(new ModSimpleBaseItem("QuantumProcessorBoard",  ModTabList.ModCircuitsTab)),
	ReinforcedGlassPlate(new ModSimpleBaseItem("ReinforcedGlassPlate", ModTabList.ModGenericTab)),
	ReinforcedGlassLense(new ModSimpleBaseItem("ReinforcedGlassLense", ModTabList.ModGenericTab)),
	SandStoneRod(new ModSimpleBaseItem("SandStoneRod",  ModTabList.ModGenericTab)),

	ShapeAxeHead(new ModSimpleBaseItem("ShapeAxeHead",  ModTabList.ModShapesTab)),
	ShapeBlock(new ModSimpleBaseItem("ShapeBlock",  ModTabList.ModShapesTab)),
	ShapeBoat(new ModSimpleBaseItem("ShapeBoat",  ModTabList.ModShapesTab)),
	ShapeBolt(new ModSimpleBaseItem("ShapeBolt",  ModTabList.ModShapesTab)),
	ShapeBottle(new ModSimpleBaseItem("ShapeBottle",  ModTabList.ModShapesTab)),
	ShapeCasing(new ModSimpleBaseItem("ShapeCasing",  ModTabList.ModShapesTab)),
	ShapeCell(new ModSimpleBaseItem("ShapeCell",  ModTabList.ModShapesTab)),
	ShapeFileHead(new ModSimpleBaseItem("ShapeFileHead",  ModTabList.ModShapesTab)),
	ShapeGear(new ModSimpleBaseItem("ShapeGear",  ModTabList.ModShapesTab)),
	ShapeHammerHead(new ModSimpleBaseItem("ShapeHammerHead",  ModTabList.ModShapesTab)),
	ShapeHoeHead(new ModSimpleBaseItem("ShapeHoeHead",  ModTabList.ModShapesTab)),
	ShapeHugePipe(new ModSimpleBaseItem("ShapeHugePipe",  ModTabList.ModShapesTab)),
	ShapeIngot(new ModSimpleBaseItem("ShapeIngot",  ModTabList.ModShapesTab)),
	ShapeLargePipe(new ModSimpleBaseItem("ShapeLargePipe",  ModTabList.ModShapesTab)),
	ShapeNormalPipe(new ModSimpleBaseItem("ShapeNormalPipe",  ModTabList.ModShapesTab)),
	ShapePickaxeHead(new ModSimpleBaseItem("ShapePickaxeHead",  ModTabList.ModShapesTab)),
	ShapePlate(new ModSimpleBaseItem("ShapePlate",  ModTabList.ModShapesTab)),
	ShapeRing(new ModSimpleBaseItem("ShapeRing",  ModTabList.ModShapesTab)),
	ShapeRod(new ModSimpleBaseItem("ShapeRod",  ModTabList.ModShapesTab)),
	ShapeSawBlade(new ModSimpleBaseItem("ShapeSawBlade",  ModTabList.ModShapesTab)),
	ShapeShovelHead(new ModSimpleBaseItem("ShapeShovelHead",  ModTabList.ModShapesTab)),
	ShapeSmallPipe(new ModSimpleBaseItem("ShapeSmallPipe",  ModTabList.ModShapesTab)),
	ShapeSwordBlade(new ModSimpleBaseItem("ShapeSwordBlade",  ModTabList.ModShapesTab)),
	ShapeTinyPipe(new ModSimpleBaseItem("ShapeTinyPipe",  ModTabList.ModShapesTab)),
	ShapeWire(new ModSimpleBaseItem("ShapeWire",  ModTabList.ModShapesTab)),

	SnowQueenBlood(new ModSimpleBaseItem("SnowQueenBlood",  ModTabList.ModThaumcraftTab)),
	StainlessSteelItemCasing(new ModSimpleBaseItem("StainlessSteelItemCasing", ModTabList.ModGenericTab)),
	SteelBars(new ModSimpleBaseItem("SteelBars",  ModTabList.ModGenericTab)),
	StonePlate(new ModSimpleBaseItem("StonePlate",  ModTabList.ModGenericTab)),
	SuperCircuit(new ModSimpleBaseItem("SuperCircuit",  ModTabList.ModCircuitsTab)),
	TitaniumItemCasing(new ModSimpleBaseItem("TitaniumItemCasing", ModTabList.ModGenericTab)),
	TungstenItemCasing(new ModSimpleBaseItem("TungstenItemCasing", ModTabList.ModGenericTab)),
	TungstenSteelItemCasing(new ModSimpleBaseItem("TungstenSteelItemCasing", ModTabList.ModGenericTab)),
	VoidFoil(new ModSimpleBaseItem("VoidFoil",  ModTabList.ModThaumcraftTab)),
	VoidPlate(new ModSimpleBaseItem("VoidPlate",  ModTabList.ModThaumcraftTab)),
	VoidRing(new ModSimpleBaseItem("VoidRing",  ModTabList.ModThaumcraftTab)),
	VoidRod(new ModSimpleBaseItem("VoidRod",  ModTabList.ModThaumcraftTab)),

	// Do not delete this
	EndOfList(null);
	
	// ################################################################################
	public ModSimpleBaseItem Item;
	private ItemList(ModSimpleBaseItem pItem)
	{
		Item = pItem;
		if (Item != null)
			Item.setModIDName(Refstrings.MODID);
	}
	
	public static boolean AddToItemManager(ModItemManager pItemManager)
	{
		boolean tResult = true;
		for (ItemList il : ItemList.values())
		{
			if (il.Item != null)
				if (!pItemManager.AddItemToManagedRegistry(il.Item))
					tResult = false;
		}
		
		return tResult;
	}
}
