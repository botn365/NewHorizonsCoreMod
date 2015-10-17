package com.dreammaster.gthandler;

import gregtech.api.GregTech_API;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OreDictNames;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_BasicMachine_GT_Recipe;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Recipe;
import gregtech.common.tileentities.generators.GT_MetaTileEntity_PlasmaGenerator;
import gregtech.common.tileentities.machines.basic.GT_MetaTileEntity_Massfabricator;
import gregtech.common.tileentities.machines.basic.GT_MetaTileEntity_Replicator;
import gregtech.common.tileentities.machines.basic.GT_MetaTileEntity_Scanner;

import com.dreammaster.gthandler.GT_CustomLoader.AdvancedGTMaterials;

public class GT_Loader_Machines 
{
	public void run()
	{
		registerMachines();
	}

	private void registerMachines()
	{
		CustomItemList.Generator_Plasma_ZPMV.set(new GT_MetaTileEntity_PlasmaGenerator(10000, "basicgenerator.plasmagenerator.tier.08", "Plasma Generator Mark IV",7).getStackForm(1L));
		CustomItemList.Generator_Plasma_UV.set(new GT_MetaTileEntity_PlasmaGenerator(10001, "basicgenerator.plasmagenerator.tier.09", "Pocket Sun",8).getStackForm(1L));

		// ===================================================================================================
		// Alloy Smelter
		// ===================================================================================================
		CustomItemList.AlloySmelterLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10010, "basicmachine.alloysmelter.tier.06", "Elite Alloy Smelter", 6, "HighTech combination Smelter", 
				GT_Recipe.GT_Recipe_Map.sAlloySmelterRecipes, 2, 1, 0, 0, 1, "AlloySmelter.png", 
				(String)GregTech_API.sSoundList.get(208), false, false, 0, "ALLOY_SMELTER", 
				new Object[] { "ECE", "CMC", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', AdvancedGTMaterials.LuV.getCircuit(), 
					'W', AdvancedGTMaterials.LuV.getCable(), 
					'C', AdvancedGTMaterials.LuV.getHCoil() }).getStackForm(1L));

		CustomItemList.AlloySmelterZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10011, "basicmachine.alloysmelter.tier.07", "Elite Alloy Smelter II", 7, "HighTech combination Smelter", 
				GT_Recipe.GT_Recipe_Map.sAlloySmelterRecipes, 2, 1, 0, 0, 1, "AlloySmelter.png", 
				(String)GregTech_API.sSoundList.get(208), false, false, 0, "ALLOY_SMELTER", 
				new Object[] { "ECE", "CMC", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', AdvancedGTMaterials.ZPM.getCircuit(), 
					'W', AdvancedGTMaterials.ZPM.getCable(), 
					'C', AdvancedGTMaterials.ZPM.getHCoil() }).getStackForm(1L));

		CustomItemList.AlloySmelterUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10012, "basicmachine.alloysmelter.tier.08", "Instant Alloy Smelter", 8, "HighTech combination Smelter", 
				GT_Recipe.GT_Recipe_Map.sAlloySmelterRecipes, 2, 1, 0, 0, 1, "AlloySmelter.png", 
				(String)GregTech_API.sSoundList.get(208), false, false, 0, "ALLOY_SMELTER", 
				new Object[] { "ECE", "CMC", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', AdvancedGTMaterials.UV.getCircuit(), 
					'W', AdvancedGTMaterials.UV.getCable(), 
					'C', AdvancedGTMaterials.UV.getHCoil() }).getStackForm(1L));
		// ===================================================================================================

		// ===================================================================================================
		// AmplifabricatorLuV
		// ===================================================================================================
		CustomItemList.AmplifabricatorLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10020, "basicmachine.amplifab.tier.06", "Elite Amplifabricator I", 6, "Extracting UU Amplifier", 
				GT_Recipe.GT_Recipe_Map.sAmplifiers, 1, 1, 1000, 0, 1, "Amplifabricator.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "AMPLIFAB", 
				new Object[] { "WPW", "PMP", "CPC", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP,
					'C', AdvancedGTMaterials.LuV.getCircuit(),
					'W', AdvancedGTMaterials.LuV.getCable4(), }).getStackForm(1L));
	    
		CustomItemList.AmplifabricatorZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10021, "basicmachine.amplifab.tier.07", "Elite Amplifabricator II", 7, "Extracting UU Amplifier", 
				GT_Recipe.GT_Recipe_Map.sAmplifiers, 1, 1, 1000, 0, 1, "Amplifabricator.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "AMPLIFAB", 
				new Object[] { "WPW", "PMP", "CPC", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP,
					'C', AdvancedGTMaterials.ZPM.getCircuit(),
					'W', AdvancedGTMaterials.ZPM.getCable4(), }).getStackForm(1L));
	    
		CustomItemList.AmplifabricatorUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10022, "basicmachine.amplifab.tier.08", "Elite Amplifabricator III", 8, "Extracting UU Amplifier", 
				GT_Recipe.GT_Recipe_Map.sAmplifiers, 1, 1, 1000, 0, 1, "Amplifabricator.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "AMPLIFAB", 
				new Object[] { "WPW", "PMP", "CPC", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP,
					'C', AdvancedGTMaterials.UV.getCircuit(),
					'W', AdvancedGTMaterials.UV.getCable4(), }).getStackForm(1L));
	    
		//AmplifabricatorLuV
		//AmplifabricatorZPM
		//AmplifabricatorUV

		// ===================================================================================================
		// AssemblingMachineLuV
		// ===================================================================================================
		CustomItemList.AssemblingMachineLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10030, "basicmachine.assembler.tier.06", "Elite Assembling Machine I", 6, "Avengers, Assemble!",
				GT_Recipe.GT_Recipe_Map.sAssemblerRecipes, 2, 1, 16000, 0, 1, "Assembler.png", 
				"", false, false, 0, "ASSEMBLER", 
				new Object[] { "ACA", "VMV", "WCW", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						'A', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.ROBOT_ARM, 
						'C', AdvancedGTMaterials.LuV.getCircuit(), 
						'W', AdvancedGTMaterials.LuV.getCable() }).getStackForm(1L));
		    
		CustomItemList.AssemblingMachineZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10031, "basicmachine.assembler.tier.07", "Elite Assembling Machine I", 7, "Avengers, Assemble!",
				GT_Recipe.GT_Recipe_Map.sAssemblerRecipes, 2, 1, 16000, 0, 1, "Assembler.png", 
				"", false, false, 0, "ASSEMBLER", 
				new Object[] { "ACA", "VMV", "WCW", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						'A', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.ROBOT_ARM, 
						'C', AdvancedGTMaterials.ZPM.getCircuit(), 
						'W', AdvancedGTMaterials.ZPM.getCable() }).getStackForm(1L));
		    
		CustomItemList.AssemblingMachineUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10032, "basicmachine.assembler.tier.08", "Elite Assembling Machine I", 8, "Avengers, Assemble!",
				GT_Recipe.GT_Recipe_Map.sAssemblerRecipes, 2, 1, 16000, 0, 1, "Assembler.png", 
				"", false, false, 0, "ASSEMBLER", 
				new Object[] { "ACA", "VMV", "WCW", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						'A', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.ROBOT_ARM, 
						'C', AdvancedGTMaterials.UV.getCircuit(), 
						'W', AdvancedGTMaterials.UV.getCable() }).getStackForm(1L));
		    
		//AssemblingMachineLuV
		//AssemblingMachineZPM
		//AssemblingMachineUV
		// ===================================================================================================

		// ===================================================================================================
		// AutoclaveLuV
		// ===================================================================================================
		CustomItemList.AutoclaveLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10040, "basicmachine.autoclave.tier.06", "Elite Autoclave I", 6, "Crystallizing your Dusts",
				GT_Recipe.GT_Recipe_Map.sAutoclaveRecipes, 1, 1, 8000, 0, 1, "Autoclave.png",
				"", false, false, 0, "AUTOCLAVE", 
				new Object[] { "IGI", "IMI", "CPC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
						'C', AdvancedGTMaterials.LuV.getCircuit(),
						'W', AdvancedGTMaterials.LuV.getCable(),
						'I', AdvancedGTMaterials.LuV.getPlate(), 
						'G', AdvancedGTMaterials.LuV.getGlass() }).getStackForm(1L));
		    
		CustomItemList.AutoclaveZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10041, "basicmachine.autoclave.tier.07", "Elite Autoclave II", 7, "Crystallizing your Dusts",
				GT_Recipe.GT_Recipe_Map.sAutoclaveRecipes, 1, 1, 8000, 0, 1, "Autoclave.png",
				"", false, false, 0, "AUTOCLAVE", 
				new Object[] { "IGI", "IMI", "CPC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
						'C', AdvancedGTMaterials.ZPM.getCircuit(),
						'W', AdvancedGTMaterials.ZPM.getCable(),
						'I', AdvancedGTMaterials.ZPM.getPlate(), 
						'G', AdvancedGTMaterials.ZPM.getGlass() }).getStackForm(1L));
		    
		CustomItemList.AutoclaveUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10042, "basicmachine.autoclave.tier.08", "Elite Autoclave III", 8, "Crystallizing your Dusts",
				GT_Recipe.GT_Recipe_Map.sAutoclaveRecipes, 1, 1, 8000, 0, 1, "Autoclave.png",
				"", false, false, 0, "AUTOCLAVE", 
				new Object[] { "IGI", "IMI", "CPC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
						'C', AdvancedGTMaterials.UV.getCircuit(),
						'W', AdvancedGTMaterials.UV.getCable(),
						'I', AdvancedGTMaterials.UV.getPlate(), 
						'G', AdvancedGTMaterials.UV.getGlass(), }).getStackForm(1L));
		    
		//AutoclaveLuV
		//AutoclaveZPM
		//AutoclaveUV
		// ===================================================================================================

		// ===================================================================================================
		// BendingMachineLuV
		// ===================================================================================================
		CustomItemList.BendingMachineLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10050, "basicmachine.bender.tier.06", "Elite Bending Machine I", 6, "Boo, he's bad! We want BENDER!!!",
				GT_Recipe.GT_Recipe_Map.sBenderRecipes, 2, 1, 0, 0, 1, "Bender.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "BENDER",
				new Object[] { "PWP", "CMC", "EWE", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.LuV.getCircuit(), 
					'W', AdvancedGTMaterials.LuV.getCable() }).getStackForm(1L));
		
		CustomItemList.BendingMachineZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10051, "basicmachine.bender.tier.07", "Elite Bending Machine II", 7, "Boo, he's bad! We want BENDER!!!",
				GT_Recipe.GT_Recipe_Map.sBenderRecipes, 2, 1, 0, 0, 1, "Bender.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "BENDER",
				new Object[] { "PWP", "CMC", "EWE", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.ZPM.getCircuit(), 
					'W', AdvancedGTMaterials.ZPM.getCable() }).getStackForm(1L));
		
		CustomItemList.BendingMachineUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10052, "basicmachine.bender.tier.08", "Elite Bending Machine III", 8, "Boo, he's bad! We want BENDER!!!",
				GT_Recipe.GT_Recipe_Map.sBenderRecipes, 2, 1, 0, 0, 1, "Bender.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "BENDER",
				new Object[] { "PWP", "CMC", "EWE", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.UV.getCircuit(), 
					'W', AdvancedGTMaterials.UV.getCable() }).getStackForm(1L));
		    
		//BendingMachineLuV
		//BendingMachineZPM
		//BendingMachineUV
		// ===================================================================================================

		// ===================================================================================================
		// CompressorLuV
		// ===================================================================================================
		CustomItemList.CompressorLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10060, "basicmachine.compressor.tier.06", "Elite Compressor I", 6, "Compress-O-Matic C77",
				GT_Recipe.GT_Recipe_Map.sCompressorRecipes, 1, 1, 0, 0, 1, "Compressor.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "COMPRESSOR",
				new Object[] { " C ", "PMP", "WCW",
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON,
					'C', AdvancedGTMaterials.LuV.getCircuit(), 
					'W', AdvancedGTMaterials.LuV.getCable() }).getStackForm(1L));
		    
		CustomItemList.CompressorZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10061, "basicmachine.compressor.tier.07", "Elite Compressor II", 7, "Compress-O-Matic C77",
				GT_Recipe.GT_Recipe_Map.sCompressorRecipes, 1, 1, 0, 0, 1, "Compressor.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "COMPRESSOR",
				new Object[] { " C ", "PMP", "WCW",
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON,
					'C', AdvancedGTMaterials.ZPM.getCircuit(), 
					'W', AdvancedGTMaterials.ZPM.getCable() }).getStackForm(1L));
		    
		CustomItemList.CompressorUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10062, "basicmachine.compressor.tier.08", "Elite Compressor III", 8, "Compress-O-Matic C77",
				GT_Recipe.GT_Recipe_Map.sCompressorRecipes, 1, 1, 0, 0, 1, "Compressor.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "COMPRESSOR",
				new Object[] { " C ", "PMP", "WCW",
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON,
					'C', AdvancedGTMaterials.UV.getCircuit(), 
					'W', AdvancedGTMaterials.UV.getCable() }).getStackForm(1L));
		    
		//CompressorLuV
		//CompressorZPM
		//CompressorUV
		// ===================================================================================================

		// ===================================================================================================
		// CuttingMachineLuV
		// ===================================================================================================
		CustomItemList.CuttingMachineLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10070, "basicmachine.cutter.tier.06", "Elite Cutting Machine I", 6, "Slice'N Dice", 
				GT_Recipe.GT_Recipe_Map.sCutterRecipes, 1, 2, 1000, 0, 1, "Cutter.png", 
				"", false, false, 0, "CUTTER", 
				new Object[] { "WCG", "VMB", "CWE", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						'C', AdvancedGTMaterials.LuV.getCircuit(), 
						'W', AdvancedGTMaterials.LuV.getCable(),
						'G', AdvancedGTMaterials.LuV.getGlass(),
						'B', OreDictNames.craftingDiamondBlade }).getStackForm(1L));
		    
		CustomItemList.CuttingMachineZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10071, "basicmachine.cutter.tier.07", "Elite Cutting Machine II", 7, "Slice'N Dice", 
				GT_Recipe.GT_Recipe_Map.sCutterRecipes, 1, 2, 1000, 0, 1, "Cutter.png", 
				"", false, false, 0, "CUTTER", 
				new Object[] { "WCG", "VMB", "CWE", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						'C', AdvancedGTMaterials.ZPM.getCircuit(), 
						'W', AdvancedGTMaterials.ZPM.getCable(),
						'G', AdvancedGTMaterials.ZPM.getGlass(),
						'B', OreDictNames.craftingDiamondBlade }).getStackForm(1L));
		    
		CustomItemList.CuttingMachineUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10072, "basicmachine.cutter.tier.08", "Elite Cutting Machine III", 8, "Slice'N Dice", 
				GT_Recipe.GT_Recipe_Map.sCutterRecipes, 1, 2, 1000, 0, 1, "Cutter.png", 
				"", false, false, 0, "CUTTER", 
				new Object[] { "WCG", "VMB", "CWE", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						'C', AdvancedGTMaterials.UV.getCircuit(), 
						'W', AdvancedGTMaterials.UV.getCable(),
						'G', AdvancedGTMaterials.UV.getGlass(), 
						'B', OreDictNames.craftingDiamondBlade }).getStackForm(1L));
		    
		//CuttingMachineLuV
		//CuttingMachineZPM
		//CuttingMachineUV
		// ===================================================================================================

		// ===================================================================================================
		// DistilleryLuV
		// ===================================================================================================
		CustomItemList.DistilleryLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10080, "basicmachine.distillery.tier.06", "Elite Distillery I", 6, "Extracting the most relevant Parts of Fluids",
				GT_Recipe.GT_Recipe_Map.sDistilleryRecipes, 1, 0, 1000, 0, 1, "Distillery.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "DISTILLERY",
				new Object[] { "GBG", "CMC", "WPW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP,
					'B', OrePrefixes.stick.get(Materials.NetherStar), 
					'C', AdvancedGTMaterials.LuV.getCircuit(), 
					'W', AdvancedGTMaterials.LuV.getCable(), 
					'G', AdvancedGTMaterials.LuV.getGlass() }).getStackForm(1L));
		
		CustomItemList.DistilleryZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10081, "basicmachine.distillery.tier.07", "Elite Distillery II", 7, "Extracting the most relevant Parts of Fluids",
				GT_Recipe.GT_Recipe_Map.sDistilleryRecipes, 1, 0, 1000, 0, 1, "Distillery.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "DISTILLERY",
				new Object[] { "GBG", "CMC", "WPW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP,
					'B', OrePrefixes.stick.get(Materials.NetherStar), 
					'C', AdvancedGTMaterials.ZPM.getCircuit(), 
					'W', AdvancedGTMaterials.ZPM.getCable(), 
					'G', AdvancedGTMaterials.ZPM.getGlass() }).getStackForm(1L));
		
		CustomItemList.DistilleryUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10082, "basicmachine.distillery.tier.08", "Elite Distillery III", 8, "Extracting the most relevant Parts of Fluids",
				GT_Recipe.GT_Recipe_Map.sDistilleryRecipes, 1, 0, 1000, 0, 1, "Distillery.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "DISTILLERY",
				new Object[] { "GBG", "CMC", "WPW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP,
					'B', OrePrefixes.stick.get(Materials.NetherStar), 
					'C', AdvancedGTMaterials.UV.getCircuit(), 
					'W', AdvancedGTMaterials.UV.getCable(), 
					'G', AdvancedGTMaterials.UV.getGlass() }).getStackForm(1L));
		    
		//DistilleryLuV
		//DistilleryZPM
		//DistilleryUV
		// ===================================================================================================

		// ===================================================================================================
		// ElectricFurnaceLuV
		// ===================================================================================================
		CustomItemList.ElectricFurnaceLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10090, "basicmachine.e_furnace.tier.06", "Elite Electric Furnace I", 6, "Not like using a Commodore 64",
				GT_Recipe.GT_Recipe_Map.sFurnaceRecipes, 1, 1, 0, 0, 1, "E_Furnace.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(207)), false, false, 0, "ELECTRIC_FURNACE", 
				new Object[] { "ECE", "CMC", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', AdvancedGTMaterials.LuV.getCircuit(), 
					'W', AdvancedGTMaterials.LuV.getCable(), 
					'C', AdvancedGTMaterials.LuV.getHCoil() }).getStackForm(1L));
		    
		CustomItemList.ElectricFurnaceZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10091, "basicmachine.e_furnace.tier.07", "Elite Electric Furnace II", 7, "Not like using a Commodore 64",
				GT_Recipe.GT_Recipe_Map.sFurnaceRecipes, 1, 1, 0, 0, 1, "E_Furnace.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(207)), false, false, 0, "ELECTRIC_FURNACE", 
				new Object[] { "ECE", "CMC", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', AdvancedGTMaterials.ZPM.getCircuit(), 
					'W', AdvancedGTMaterials.ZPM.getCable(), 
					'C', AdvancedGTMaterials.ZPM.getHCoil() }).getStackForm(1L));
		    
		CustomItemList.ElectricFurnaceUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10092, "basicmachine.e_furnace.tier.08", "Elite Electric Furnace III", 8, "Not like using a Commodore 64",
				GT_Recipe.GT_Recipe_Map.sFurnaceRecipes, 1, 1, 0, 0, 1, "E_Furnace.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(207)), false, false, 0, "ELECTRIC_FURNACE", 
				new Object[] { "ECE", "CMC", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', AdvancedGTMaterials.UV.getCircuit(), 
					'W', AdvancedGTMaterials.UV.getCable(), 
					'C', AdvancedGTMaterials.UV.getHCoil() }).getStackForm(1L));
		    
		//ElectricFurnaceLuV
		//ElectricFurnaceZPM
		//ElectricFurnaceUV
		// ===================================================================================================

		// ===================================================================================================
		// ElectrolyzerLuV
		// ===================================================================================================
		CustomItemList.ElectrolyzerLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10100, "basicmachine.electrolyzer.tier.06", "Elite Electrolyzer I", 6, "Electrolyzing Molecules", 
				GT_Recipe.GT_Recipe_Map.sElectrolyzerRecipes, 2, 6, 64000, 0, 1, "Electrolyzer.png", 
				"", false, false, 0, "ELECTROLYZER", 
				new Object[] { "IGI", "IMI", "CWC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						'C', AdvancedGTMaterials.LuV.getCircuit(), 
						'W', AdvancedGTMaterials.LuV.getCable(),
						'I', OrePrefixes.wireGt02.get(Materials.Osmium),
						'G', AdvancedGTMaterials.LuV.getGlass() }).getStackForm(1L));
		
		CustomItemList.ElectrolyzerZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10101, "basicmachine.electrolyzer.tier.07", "Elite Electrolyzer II", 7, "Electrolyzing Molecules", 
				GT_Recipe.GT_Recipe_Map.sElectrolyzerRecipes, 2, 6, 64000, 0, 1, "Electrolyzer.png", 
				"", false, false, 0, "ELECTROLYZER", 
				new Object[] { "IGI", "IMI", "CWC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						'C', AdvancedGTMaterials.ZPM.getCircuit(), 
						'W', AdvancedGTMaterials.ZPM.getCable(),
						'I', OrePrefixes.wireGt02.get(Materials.NiobiumTitanium), 
						'G', AdvancedGTMaterials.ZPM.getGlass() }).getStackForm(1L));
		
		CustomItemList.ElectrolyzerUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10102, "basicmachine.electrolyzer.tier.08", "Elite Electrolyzer III", 8, "Electrolyzing Molecules", 
				GT_Recipe.GT_Recipe_Map.sElectrolyzerRecipes, 2, 6, 64000, 0, 1, "Electrolyzer.png", 
				"", false, false, 0, "ELECTROLYZER", 
				new Object[] { "IGI", "IMI", "CWC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						'C', AdvancedGTMaterials.UV.getCircuit(), 
						'W', AdvancedGTMaterials.UV.getCable(),
						'I', OrePrefixes.wireGt04.get(Materials.VanadiumGallium), 
						'G', AdvancedGTMaterials.UV.getGlass() }).getStackForm(1L));
		    
		//ElectrolyzerLuV
		//ElectrolyzerZPM
		//ElectrolyzerUV
		// ===================================================================================================

		// ===================================================================================================
		// ElectromagneticSeparatorLuV
		// ===================================================================================================
		CustomItemList.ElectromagneticSeparatorLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10110, "basicmachine.electromagneticseparator.tier.06", "Elite Electromagnetic Separator I", 6, "Separating the magnetic Ores from the rest", 
				GT_Recipe.GT_Recipe_Map.sElectroMagneticSeparatorRecipes, 1, 3, 0, 0, 1, "ElectromagneticSeparator.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(212)), false, false, 0, "ELECTROMAGNETIC_SEPARATOR", 
				new Object[] { "VWZ", "WMS", "CWZ", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'S', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.STICK_ELECTROMAGNETIC, 
					'Z', AdvancedGTMaterials.LuV.getWire(), 
					'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
					'C', AdvancedGTMaterials.LuV.getCircuit(),
					'W', AdvancedGTMaterials.LuV.getCable() }).getStackForm(1L));
		    
		CustomItemList.ElectromagneticSeparatorZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10111, "basicmachine.electromagneticseparator.tier.07", "Elite Electromagnetic Separator II", 7, "Separating the magnetic Ores from the rest", 
				GT_Recipe.GT_Recipe_Map.sElectroMagneticSeparatorRecipes, 1, 3, 0, 0, 1, "ElectromagneticSeparator.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(212)), false, false, 0, "ELECTROMAGNETIC_SEPARATOR", 
				new Object[] { "VWZ", "WMS", "CWZ", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'S', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.STICK_ELECTROMAGNETIC, 
					'Z', AdvancedGTMaterials.ZPM.getWire(), 
					'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
					'C', AdvancedGTMaterials.ZPM.getCircuit(),
					'W', AdvancedGTMaterials.ZPM.getCable() }).getStackForm(1L));
		    
		CustomItemList.ElectromagneticSeparatorUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10112, "basicmachine.electromagneticseparator.tier.08", "Elite Electromagnetic Separator III", 8, "Separating the magnetic Ores from the rest", 
				GT_Recipe.GT_Recipe_Map.sElectroMagneticSeparatorRecipes, 1, 3, 0, 0, 1, "ElectromagneticSeparator.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(212)), false, false, 0, "ELECTROMAGNETIC_SEPARATOR", 
				new Object[] { "VWZ", "WMS", "CWZ", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'S', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.STICK_ELECTROMAGNETIC, 
					'Z', AdvancedGTMaterials.UV.getWire(), 
					'V', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
					'C', AdvancedGTMaterials.UV.getCircuit(),
					'W', AdvancedGTMaterials.UV.getCable() }).getStackForm(1L));
		    
		//ElectromagneticSeparatorLuV
		//ElectromagneticSeparatorZPM
		//ElectromagneticSeparatorUV
		// ===================================================================================================

		// ===================================================================================================
		// ExtractorLuV
		// ===================================================================================================
		CustomItemList.ExtractorLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10120, "basicmachine.extractor.tier.06", "Elite Extractor I", 6, "Dejuicer-Device of Doom - D123",
				GT_Recipe.GT_Recipe_Map.sExtractorRecipes, 1, 1, 0, 0, 1, "Extractor.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "EXTRACTOR",
				new Object[] { "GCG", "EMP", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
					'C', AdvancedGTMaterials.LuV.getCircuit(),
					'W', AdvancedGTMaterials.LuV.getCable(),
					'G', AdvancedGTMaterials.LuV.getGlass() }).getStackForm(1L));
		    
		CustomItemList.ExtractorZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10121, "basicmachine.extractor.tier.07", "Elite Extractor II", 7, "Dejuicer-Device of Doom - D123",
				GT_Recipe.GT_Recipe_Map.sExtractorRecipes, 1, 1, 0, 0, 1, "Extractor.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "EXTRACTOR",
				new Object[] { "GCG", "EMP", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
					'C', AdvancedGTMaterials.ZPM.getCircuit(),
					'W', AdvancedGTMaterials.ZPM.getCable(),
					'G', AdvancedGTMaterials.ZPM.getGlass() }).getStackForm(1L));
		    
		CustomItemList.ExtractorUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10122, "basicmachine.extractor.tier.08", "Elite Extractor III", 8, "Dejuicer-Device of Doom - D123",
				GT_Recipe.GT_Recipe_Map.sExtractorRecipes, 1, 1, 0, 0, 1, "Extractor.png",
				(String)GregTech_API.sSoundList.get(Integer.valueOf(200)), false, false, 0, "EXTRACTOR",
				new Object[] { "GCG", "EMP", "WCW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'E', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
					'C', AdvancedGTMaterials.UV.getCircuit(),
					'W', AdvancedGTMaterials.UV.getCable(),
					'G', AdvancedGTMaterials.UV.getGlass() }).getStackForm(1L));
		    
		//ExtractorLuV
		//ExtractorZPM
		//ExtractorUV
		// ===================================================================================================

		// ===================================================================================================
		// ExtruderLuV
		// ===================================================================================================
		CustomItemList.ExtruderLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10130, "basicmachine.extruder.tier.06", "Elite Extruder I", 6, "Universal Machine for Metal Working", 
				GT_Recipe.GT_Recipe_Map.sExtruderRecipes, 2, 1, 0, 0, 1, "Extruder.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(208)), false, false, 0, "EXTRUDER", 
				new Object[] { "CCE", "XMP", "CCE", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'X', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'E', AdvancedGTMaterials.LuV.getCircuit(),
					'P', AdvancedGTMaterials.LuV.getPipe(), 
					'C', AdvancedGTMaterials.LuV.getHCoil() }).getStackForm(1L));
		
		CustomItemList.ExtruderZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10131, "basicmachine.extruder.tier.07", "Elite Extruder II", 7, "Universal Machine for Metal Working", 
				GT_Recipe.GT_Recipe_Map.sExtruderRecipes, 2, 1, 0, 0, 1, "Extruder.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(208)), false, false, 0, "EXTRUDER", 
				new Object[] { "CCE", "XMP", "CCE", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'X', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'E', AdvancedGTMaterials.ZPM.getCircuit(),
					'P', AdvancedGTMaterials.ZPM.getPipe(), 
					'C', AdvancedGTMaterials.ZPM.getHCoil() }).getStackForm(1L));
		
		CustomItemList.ExtruderUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10132, "basicmachine.extruder.tier.08", "Elite Extruder III", 8, "Universal Machine for Metal Working", 
				GT_Recipe.GT_Recipe_Map.sExtruderRecipes, 2, 1, 0, 0, 1, "Extruder.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(208)), false, false, 0, "EXTRUDER", 
				new Object[] { "CCE", "XMP", "CCE", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'X', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'E', AdvancedGTMaterials.UV.getCircuit(),
					'P', AdvancedGTMaterials.UV.getPipe(), 
					'C', AdvancedGTMaterials.UV.getHCoil() }).getStackForm(1L));
		    
		//ExtruderLuV
		//ExtruderZPM
		//ExtruderUV
		// ===================================================================================================

		// ===================================================================================================
		// FluidSolidifierLuV
		// ===================================================================================================
		CustomItemList.FluidSolidifierLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10140, "basicmachine.fluidsolidifier.tier.06", "Elite Fluid Solidifier I", 6, "Cools Fluids down to form Solids", 
				GT_Recipe.GT_Recipe_Map.sFluidSolidficationRecipes, 1, 1, 16000, 0, 1, "FluidSolidifier.png", 
				"", false, false, 0, "FLUID_SOLIDIFIER", 
				new Object[] { "PGP", "WMW", "CBC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
						'C', AdvancedGTMaterials.LuV.getCircuit(),
						'W', AdvancedGTMaterials.LuV.getCable(),
						'G', AdvancedGTMaterials.LuV.getGlass(),
						'B', OreDictNames.craftingChest }).getStackForm(1L));
		    
		CustomItemList.FluidSolidifierZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10141, "basicmachine.fluidsolidifier.tier.07", "Elite Fluid Solidifier II", 7, "Cools Fluids down to form Solids", 
				GT_Recipe.GT_Recipe_Map.sFluidSolidficationRecipes, 1, 1, 16000, 0, 1, "FluidSolidifier.png", 
				"", false, false, 0, "FLUID_SOLIDIFIER", 
				new Object[] { "PGP", "WMW", "CBC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
						'C', AdvancedGTMaterials.ZPM.getCircuit(),
						'W', AdvancedGTMaterials.ZPM.getCable(),
						'G', AdvancedGTMaterials.ZPM.getGlass(),
						'B', OreDictNames.craftingChest }).getStackForm(1L));
		    
		CustomItemList.FluidSolidifierUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10142, "basicmachine.fluidsolidifier.tier.08", "Elite Fluid Solidifier III", 8, "Cools Fluids down to form Solids", 
				GT_Recipe.GT_Recipe_Map.sFluidSolidficationRecipes, 1, 1, 16000, 0, 1, "FluidSolidifier.png", 
				"", false, false, 0, "FLUID_SOLIDIFIER", 
				new Object[] { "PGP", "WMW", "CBC", 
						'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PUMP, 
						'C', AdvancedGTMaterials.UV.getCircuit(),
						'W', AdvancedGTMaterials.UV.getCable(),
						'G', AdvancedGTMaterials.UV.getGlass(),
						'B', OreDictNames.craftingChest }).getStackForm(1L));
		    
		//FluidSolidifierLuV
		//FluidSolidifierZPM
		//FluidSolidifierUV
		// ===================================================================================================

		// ===================================================================================================
		// FormingPressLuV
		// ===================================================================================================
		CustomItemList.FormingPressLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10150, "basicmachine.press.tier.06", "Elite Forming Press I", 6, "Imprinting Images into things", 
				GT_Recipe.GT_Recipe_Map.sPressRecipes, 2, 1, 0, 0, 1, "Press.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "PRESS", 
				new Object[] { "WPW", "CMC", "WPW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.LuV.getCircuit(), 
					'W', AdvancedGTMaterials.LuV.getCable() }).getStackForm(1L));
		    
		CustomItemList.FormingPressZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10151, "basicmachine.press.tier.07", "Elite Forming Press II", 7, "Imprinting Images into things", 
				GT_Recipe.GT_Recipe_Map.sPressRecipes, 2, 1, 0, 0, 1, "Press.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "PRESS", 
				new Object[] { "WPW", "CMC", "WPW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.ZPM.getCircuit(), 
					'W', AdvancedGTMaterials.ZPM.getCable() }).getStackForm(1L));
		    
		CustomItemList.FormingPressUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10152, "basicmachine.press.tier.08", "Elite Forming Press III", 8, "Imprinting Images into things", 
				GT_Recipe.GT_Recipe_Map.sPressRecipes, 2, 1, 0, 0, 1, "Press.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(203)), false, false, 0, "PRESS", 
				new Object[] { "WPW", "CMC", "WPW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.UV.getCircuit(), 
					'W', AdvancedGTMaterials.UV.getCable() }).getStackForm(1L));
		    
		//FormingPressLuV
		//FormingPressZPM
		//FormingPressUV
		// ===================================================================================================

		// ===================================================================================================
		// ForgeHammerLuV
		// ===================================================================================================
		CustomItemList.ForgeHammerLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10160, "basicmachine.hammer.tier.06", "Elite Forge Hammer I", 6, "Stop, Hammertime!", 
				GT_Recipe.GT_Recipe_Map.sHammerRecipes, 1, 1, 0, 6, 3, "Hammer.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(1)), false, false, 0, "HAMMER", 
				new Object[] { "WPW", "CMC", "WAW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.LuV.getCircuit(),
					'W', AdvancedGTMaterials.LuV.getCable(),
					'O', AdvancedGTMaterials.LuV.getHCoil(),
					'A', OreDictNames.craftingAnvil }).getStackForm(1L));
		
		CustomItemList.ForgeHammerZPM.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10161, "basicmachine.hammer.tier.07", "Elite Forge Hammer II", 7, "Stop, Hammertime!", 
				GT_Recipe.GT_Recipe_Map.sHammerRecipes, 1, 1, 0, 6, 3, "Hammer.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(1)), false, false, 0, "HAMMER", 
				new Object[] { "WPW", "CMC", "WAW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.ZPM.getCircuit(),
					'W', AdvancedGTMaterials.ZPM.getCable(),
					'O', AdvancedGTMaterials.ZPM.getHCoil(),
					'A', OreDictNames.craftingAnvil }).getStackForm(1L));
		
		CustomItemList.ForgeHammerUV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10162, "basicmachine.hammer.tier.08", "Elite Forge Hammer III", 8, "Stop, Hammertime!", 
				GT_Recipe.GT_Recipe_Map.sHammerRecipes, 1, 1, 0, 6, 3, "Hammer.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(1)), false, false, 0, "HAMMER", 
				new Object[] { "WPW", "CMC", "WAW", 
					'M', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					'P', GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					'C', AdvancedGTMaterials.UV.getCircuit(),
					'W', AdvancedGTMaterials.UV.getCable(),
					'O', AdvancedGTMaterials.UV.getHCoil(),
					'A', OreDictNames.craftingAnvil }).getStackForm(1L));
		    
		//ForgeHammerLuV
		//ForgeHammerZPM
		//ForgeHammerUV
		// ===================================================================================================
// CONTINUE HERE 18.10.2015 00:22
		// ===================================================================================================
		// LatheLuV
		// ===================================================================================================
		CustomItemList.LatheLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10170, "basicmachine.lathe.tier.05", "Advanced Lathe IV", 5, "Produces Rods more efficiently", 
				GT_Recipe.GT_Recipe_Map.sLatheRecipes, 1, 2, 0, 0, 1, "Lathe.png", "", false, false, 0, "LATHE", 
				new Object[] { "WCW", "EMD", "CWP", 
						Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						Character.valueOf('P'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
						Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
						Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE, 
						Character.valueOf('D'), OreDictNames.craftingIndustrialDiamond }).getStackForm(1L));
		    
		//LatheLuV
		//LatheZPM
		//LatheUV
		// ===================================================================================================

		// ===================================================================================================
		// PrecisionLaserEngraverLuV
		// ===================================================================================================
		CustomItemList.PrecisionLaserEngraverLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10180, "basicmachine.laserengraver.tier.05", "Advanced Precision Laser Engraver IV", 5, "Don't look directly at the Laser", 
				GT_Recipe.GT_Recipe_Map.sLaserEngraverRecipes, 2, 1, 0, 0, 1, "LaserEngraver.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(212)), false, false, 0, "LASER_ENGRAVER", 
				new Object[] { "PEP", "CMC", "WCW", 
					Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.EMITTER, 
					Character.valueOf('P'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
					Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE }).getStackForm(1L));
		    
		//PrecisionLaserEngraverLuV
		//PrecisionLaserEngraverZPM
		//PrecisionLaserEngraverUV
		// ===================================================================================================

		// ===================================================================================================
		// MaceratorLuV
		// ===================================================================================================
		CustomItemList.MaceratorLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10190, "basicmachine.macerator.tier.05", "Blend-O-Matic 9001", 5, "Schreddering your Ores with Byproducts", 
				GT_Recipe.GT_Recipe_Map.sMaceratorRecipes, 1, 4, 0, 0, 1, "Macerator4.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(201)), false, false, 1, "PULVERIZER", 
				new Object[] { "PEG", "WWM", "CCW", 
					Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
					Character.valueOf('P'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
					Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE, 
					Character.valueOf('G'), OreDictNames.craftingGrinder }).getStackForm(1L));
		    
		//MaceratorLuV
		//MaceratorZPM
		//MaceratorUV
		// ===================================================================================================

		// ===================================================================================================
		// MassFabricatorLuV
		// ===================================================================================================
		CustomItemList.MassFabricatorLuV.set(new GT_MetaTileEntity_Massfabricator(10200, "basicmachine.massfab.tier.06", "Elite Mass Fabricator I", 6).getStackForm(1L));
		CustomItemList.MassFabricatorZPM.set(new GT_MetaTileEntity_Massfabricator(10201, "basicmachine.massfab.tier.07", "Elite Mass Fabricator II", 7).getStackForm(1L));
		CustomItemList.MassFabricatorUV.set(new GT_MetaTileEntity_Massfabricator(10202, "basicmachine.massfab.tier.08", "Elite Mass Fabricator III", 8).getStackForm(1L));
		   
		//MassFabricatorLuV
		//MassFabricatorZPM
		//MassFabricatorUV
		// ===================================================================================================

		// ===================================================================================================
		// MicrowaveLuV
		// ===================================================================================================
		CustomItemList.MicrowaveLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10210, "basicmachine.microwave.tier.05", "Advanced Microwave IV", 5, "Did you really read the instruction Manual?", 
				GT_Recipe.GT_Recipe_Map.sMicrowaveRecipes, 1, 1, 0, 0, 1, "E_Furnace.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(207)), false, false, 0, "MICROWAVE", 
				new Object[] { "LWC", "LMR", "LEC", 
					Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL,
					Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
					Character.valueOf('R'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.EMITTER, 
					Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT,
					Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE, 
					Character.valueOf('L'), OrePrefixes.plate.get(Materials.Lead) }).getStackForm(1L));
		    
		//MicrowaveLuV
		//MicrowaveZPM
		//MicrowaveUV
		// ===================================================================================================

		// ===================================================================================================
		// OreWashingPlantLuV
		// ===================================================================================================
		CustomItemList.OreWashingPlantLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10220, "basicmachine.orewasher.tier.05", "Repurposed Laundry-Washer I-360", 5, "Getting more Byproducts from your Ores", 
				GT_Recipe.GT_Recipe_Map.sOreWasherRecipes, 1, 3, 16000, 0, 1, "OreWasher.png", 
				"", false, false, 0, "ORE_WASHER", 
				new Object[] { "RGR", "CEC", "WMW", 
						Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						Character.valueOf('R'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.ROTOR, 
						Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
						Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE, 
						Character.valueOf('G'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.GLASS }).getStackForm(1L));
		    
		//OreWashingPlantLuV
		//OreWashingPlantZPM
		//OreWashingPlantUV
		// ===================================================================================================

		// ===================================================================================================
		// PolarizerLuV
		// ===================================================================================================
		CustomItemList.PolarizerLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10230, "basicmachine.polarizer.tier.05", "Advanced Polarizer IV", 5, "Bipolarising your Magnets", 
				GT_Recipe.GT_Recipe_Map.sPolarizerRecipes, 1, 1, 0, 0, 1, "Polarizer.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(212)), false, false, 0, "POLARIZER", 
				new Object[] { "ZSZ", "WMW", "ZSZ", 
					Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					Character.valueOf('S'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.STICK_ELECTROMAGNETIC, 
					Character.valueOf('Z'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.COIL_ELECTRIC, 
					Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE }).getStackForm(1L));
		    
		//PolarizerLuV
		//PolarizerZPM
		//PolarizerUV
		// ===================================================================================================

		// ===================================================================================================
		// RecyclerLuV
		// ===================================================================================================
		CustomItemList.RecyclerLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				10240, "basicmachine.recycler.tier.05", "The Oblitterator", 5, "Compress, burn, obliterate and filter EVERYTHING", 
				GT_Recipe.GT_Recipe_Map.sRecyclerRecipes, 1, 1, 0, 0, 1, "Recycler.png", 
				(String)GregTech_API.sSoundList.get(Integer.valueOf(204)), false, false, 0, "RECYCLER", 
				new Object[] { "GCG", "PMP", "WCW", 
					Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					Character.valueOf('P'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
					Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
					Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE, 
					Character.valueOf('G'), OrePrefixes.dust.get(Materials.Glowstone) }).getStackForm(1L));
		    
		//RecyclerLuV
		//RecyclerZPM
		//RecyclerUV
		// ===================================================================================================

		// ===================================================================================================
		// ReplicatorLuV
		// ===================================================================================================
		CustomItemList.ReplicatorLuV.set(new GT_MetaTileEntity_Replicator(10250, "basicmachine.replicator.tier.06", "Elite Replicator I", 6).getStackForm(1L));
		CustomItemList.ReplicatorZPM.set(new GT_MetaTileEntity_Replicator(10251, "basicmachine.replicator.tier.07", "Elite Replicator II", 7).getStackForm(1L));
		CustomItemList.ReplicatorUV.set(new GT_MetaTileEntity_Replicator(10252, "basicmachine.replicator.tier.08", "Elite Replicator III", 8).getStackForm(1L));
	    
		//ReplicatorLuV
		//ReplicatorZPM
		//ReplicatorUV
		// ===================================================================================================

		// ===================================================================================================
		// ScannerLuV
		// ===================================================================================================
		CustomItemList.ScannerLuV.set(new GT_MetaTileEntity_Scanner(10260, "basicmachine.scanner.tier.05", "Advanced Scanner IV", 5).getStackForm(1L));
		GT_ModHandler.addCraftingRecipe(CustomItemList.ScannerLuV.get(1L, new Object[0]), 
				GT_ModHandler.RecipeBits.DISMANTLEABLE | GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE | GT_ModHandler.RecipeBits.BUFFERED, 
				new Object[] { "CTC", "WMW", "CRC", 
			Character.valueOf('M'), ItemList.Hull_IV, 
			Character.valueOf('T'), ItemList.Emitter_IV, 
			Character.valueOf('R'), ItemList.Sensor_IV, 
			Character.valueOf('C'), OrePrefixes.circuit.get(Materials.Ultimate), 
			Character.valueOf('W'), OrePrefixes.cableGt01.get(Materials.Tungsten) });
		    
		//ScannerLuV
		//ScannerZPM
		//ScannerUV
		// ===================================================================================================

		// ===================================================================================================
		// SiftingMachineLuV
		// ===================================================================================================
		 CustomItemList.SiftingMachineLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				 10270, "basicmachine.sifter.tier.05", "Advanced Sifting Machine IV", 5, "Stay calm and keep sifting", 
				 GT_Recipe.GT_Recipe_Map.sSifterRecipes, 1, 9, 0, 2, 5, "Sifter.png", "", false, false, 0, "SIFTER", 
				 new Object[] { "WFW", "PMP", "CFC", 
						 Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						 Character.valueOf('P'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
						 Character.valueOf('F'), OreDictNames.craftingFilter, 
						 Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
						 Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE }).getStackForm(1L));
		    
		//SiftingMachineLuV
		//SiftingMachineZPM
		//SiftingMachineUV
		// ===================================================================================================

		// ===================================================================================================
		// SlicingMachineLuV
		// ===================================================================================================
		 CustomItemList.SlicingMachineLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				 10280, "basicmachine.slicer.tier.08", "Quantum Slicer", 8, "Be careful when slicing bread!", 
				 GT_Recipe.GT_Recipe_Map.sSlicerRecipes, 2, 1, 0, 0, 1, "Slicer.png", "", false, false, 0, "SLICER", 
				 new Object[] { "WCW", "PMV", "WCW", 
						 Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						 Character.valueOf('P'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.PISTON, 
						 Character.valueOf('V'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CONVEYOR, 
						 Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
						 Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE }).getStackForm(1L));
		   
		//SlicingMachineLuV
		//SlicingMachineZPM
		//SlicingMachineUV
		// ===================================================================================================

		// ===================================================================================================
		// ThermalCentrifugeLuV
		// ===================================================================================================
		 CustomItemList.ThermalCentrifugeLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				 10290, "basicmachine.thermalcentrifuge.tier.05", "Blaze Sweatshop T-6350", 5, "Separating Ores more precisely", 
				 GT_Recipe.GT_Recipe_Map.sThermalCentrifugeRecipes, 1, 3, 0, 0, 1, "ThermalCentrifuge.png", 
				 "", false, false, 0, "THERMAL_CENTRIFUGE", 
				 new Object[] { "CEC", "OMO", "WEW", 
						 Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
						 Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
						 Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
						 Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE, 
						 Character.valueOf('O'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.COIL_HEATING_DOUBLE }).getStackForm(1L));
		    
		//ThermalCentrifugeLuV
		//ThermalCentrifugeZPM
		//ThermalCentrifugeUV
		// ===================================================================================================

		// ===================================================================================================
		// WiremillLuV
		// ===================================================================================================
		 CustomItemList.WiremillLuV.set(new GT_MetaTileEntity_BasicMachine_GT_Recipe(
				 10300, "basicmachine.wiremill.tier.05", "Advanced Wiremill IV", 5, "Produces Wires more efficiently", 
				 GT_Recipe.GT_Recipe_Map.sWiremillRecipes, 1, 1, 0, 0, 1, "Wiremill.png", 
				 (String)GregTech_API.sSoundList.get(Integer.valueOf(204)), false, false, 0, "WIREMILL", 
				 new Object[] { "EWE", "CMC", "EWE", 
					 Character.valueOf('M'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.HULL, 
					 Character.valueOf('E'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.MOTOR, 
					 Character.valueOf('C'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.CIRCUIT, 
					 Character.valueOf('W'), GT_MetaTileEntity_BasicMachine_GT_Recipe.X.WIRE }).getStackForm(1L));
		   
		//WiremillLuV
		//WiremillZPM
		//WiremillUV
		// ===================================================================================================
	}
}
