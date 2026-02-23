package com.perblue.rpg.g2d;

import com.google.android.gms.drive.MetadataChangeSet;
import com.perblue.rpg.assets.AssetNameMapping;
import com.perblue.rpg.game.data.display.DisplayDataUtil;
import com.perblue.rpg.game.objects.Entity;
import com.perblue.rpg.game.objects.Unit;
import com.perblue.rpg.network.messages.ItemType;
import com.perblue.rpg.network.messages.UnitType;
import com.perblue.rpg.simulation.AnimationConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ParticleType {
    private static Map<ParticleType, String> ATLAS_MAPPINGS;
    public static final ParticleType BosspitEvilWizard_CastSmoke = new ParticleType("BosspitEvilWizard_CastSmoke");
    public static final ParticleType BosspitEvilWizard_DeadSmoke = new ParticleType("BosspitEvilWizard_DeadSmoke");
    public static final ParticleType BosspitEvilWizard_SummonGhostHero = new ParticleType("BosspitEvilWizard_SummonGhostHero");
    public static final ParticleType BosspitEvilWizard_SummonHand = new ParticleType("BosspitEvilWizard_SummonHand");
    public static final ParticleType BosspitEvilWizard_ThrowExplode = new ParticleType("BosspitEvilWizard_ThrowExplode");
    public static final ParticleType BosspitEvilWizard_ThrowHand = new ParticleType("BosspitEvilWizard_ThrowHand");
    public static final ParticleType BosspitGiantPlantRoot_BiteHitImpact = new ParticleType("BosspitGiantPlantRoot_BiteHitImpact");
    public static final ParticleType BosspitGiantPlantRoot_RootDeath_dust = new ParticleType("BosspitGiantPlantRoot_RootDeath_dust");
    public static final ParticleType BosspitGiantPlantRoot_RootGrowth_dust = new ParticleType("BosspitGiantPlantRoot_RootGrowth_dust");
    public static final ParticleType BosspitGiantPlant_BiteAttack = new ParticleType("BosspitGiantPlant_BiteAttack");
    public static final ParticleType BosspitGiantPlant_SpewMouth = new ParticleType("BosspitGiantPlant_SpewMouth");
    public static final ParticleType BosspitGiantPlant_SpewSeeds_explode = new ParticleType("BosspitGiantPlant_SpewSeeds_explode");
    public static final ParticleType BosspitGiantPlant_SpewSeeds_gas = new ParticleType("BosspitGiantPlant_SpewSeeds_gas");
    public static final ParticleType BosspitGiantPlant_SpewSeeds_gas_single = new ParticleType("BosspitGiantPlant_SpewSeeds_gas_single");
    public static final ParticleType BosspitGoldColossus_EastingGold_appearShield = new ParticleType("BosspitGoldColossus_EastingGold_appearShield");
    public static final ParticleType BosspitGoldColossus_EatingCoin = new ParticleType("BosspitGoldColossus_EatingCoin");
    public static final ParticleType BosspitGoldColossus_MeleeAttack_sword = new ParticleType("BosspitGoldColossus_MeleeAttack_sword");
    public static final ParticleType BosspitGoldColossus_RangedAttack_mouth = new ParticleType("BosspitGoldColossus_RangedAttack_mouth");
    public static final ParticleType BosspitGoldColossus_Victory_dust = new ParticleType("BosspitGoldColossus_Victory_dust");
    public static final ParticleType Common_BrokenShield = new ParticleType("Common_BrokenShield");
    public static final ParticleType Common_Cat = new ParticleType("Common_Cat");
    public static final ParticleType Common_HitDown = new ParticleType("Common_HitDown");
    public static final ParticleType Common_Silence = new ParticleType("Common_Silence");
    public static final ParticleType Common_Sunglasses = new ParticleType("Common_Sunglasses");
    public static final ParticleType Common_stunned = new ParticleType("Common_stunned");
    public static final ParticleType Contribution_laurel_lf = new ParticleType("Contribution_laurel_lf");
    public static final ParticleType Contribution_laurel_rt = new ParticleType("Contribution_laurel_rt");
    public static final ParticleType Contribution_lensflare = new ParticleType("Contribution_lensflare");
    public static final ParticleType Craft_normal = new ParticleType("Craft_normal");
    public static final ParticleType Craft_success = new ParticleType("Craft_success");
    public static final ParticleType FledSmoke = new ParticleType("FledSmoke");
    public static final ParticleType HeroAbyssDragon_Attack_Hit = new ParticleType("HeroAbyssDragon_Attack_Hit");
    public static final ParticleType HeroAbyssDragon_Attack_Hit_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Attack_Hit_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Attack_IceHit_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Attack_IceHit_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Attack_Ice_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Attack_Ice_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Attack_Water = new ParticleType("HeroAbyssDragon_Attack_Water");
    public static final ParticleType HeroAbyssDragon_Attack_WaterSpray = new ParticleType("HeroAbyssDragon_Attack_WaterSpray");
    public static final ParticleType HeroAbyssDragon_Attack_WaterSpray_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Attack_WaterSpray_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Attack_Water_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Attack_Water_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill1_Gather = new ParticleType("HeroAbyssDragon_Skill1_Gather");
    public static final ParticleType HeroAbyssDragon_Skill1_Gather_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill1_Gather_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill1_SwordRain = new ParticleType("HeroAbyssDragon_Skill1_SwordRain");
    public static final ParticleType HeroAbyssDragon_Skill1_SwordRain_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill1_SwordRain_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill2_buff = new ParticleType("HeroAbyssDragon_Skill2_buff");
    public static final ParticleType HeroAbyssDragon_Skill2_buff_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill2_buff_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill3_Hit = new ParticleType("HeroAbyssDragon_Skill3_Hit");
    public static final ParticleType HeroAbyssDragon_Skill3_Hit_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill3_Hit_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill3_Water = new ParticleType("HeroAbyssDragon_Skill3_Water");
    public static final ParticleType HeroAbyssDragon_Skill3_WaterSpray = new ParticleType("HeroAbyssDragon_Skill3_WaterSpray");
    public static final ParticleType HeroAbyssDragon_Skill3_WaterSpray_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill3_WaterSpray_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill3_Water_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill3_Water_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill4_Gather = new ParticleType("HeroAbyssDragon_Skill4_Gather");
    public static final ParticleType HeroAbyssDragon_Skill4_Gather_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill4_Gather_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill4_Hit = new ParticleType("HeroAbyssDragon_Skill4_Hit");
    public static final ParticleType HeroAbyssDragon_Skill4_Hit_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill4_Hit_skin_ice_dragon");
    public static final ParticleType HeroAbyssDragon_Skill4_WaterSpray = new ParticleType("HeroAbyssDragon_Skill4_WaterSpray");
    public static final ParticleType HeroAbyssDragon_Skill4_WaterSpray_skin_ice_dragon = new ParticleType("HeroAbyssDragon_Skill4_WaterSpray_skin_ice_dragon");
    public static final ParticleType HeroAncientDwarf_Attack_Hit = new ParticleType("HeroAncientDwarf_Attack_Hit");
    public static final ParticleType HeroAncientDwarf_Attack_Hit_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Attack_Hit_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Attack_Knife = new ParticleType("HeroAncientDwarf_Attack_Knife");
    public static final ParticleType HeroAncientDwarf_Attack_Knife_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Attack_Knife_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Attack_Range_Hatchet = new ParticleType("HeroAncientDwarf_Attack_Range_Hatchet");
    public static final ParticleType HeroAncientDwarf_Attack_Range_Hatchet_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Attack_Range_Hatchet_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Attack_Range_Hit = new ParticleType("HeroAncientDwarf_Attack_Range_Hit");
    public static final ParticleType HeroAncientDwarf_Attack_Range_Hit_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Attack_Range_Hit_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill1_Buff = new ParticleType("HeroAncientDwarf_Skill1_Buff");
    public static final ParticleType HeroAncientDwarf_Skill1_Buff_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill1_Buff_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill1_Ground = new ParticleType("HeroAncientDwarf_Skill1_Ground");
    public static final ParticleType HeroAncientDwarf_Skill1_Ground_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill1_Ground_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill1_Lash = new ParticleType("HeroAncientDwarf_Skill1_Lash");
    public static final ParticleType HeroAncientDwarf_Skill1_Lash_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill1_Lash_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill2_Charge = new ParticleType("HeroAncientDwarf_Skill2_Charge");
    public static final ParticleType HeroAncientDwarf_Skill2_Charge_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill2_Charge_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill2_Hit = new ParticleType("HeroAncientDwarf_Skill2_Hit");
    public static final ParticleType HeroAncientDwarf_Skill2_Hit02 = new ParticleType("HeroAncientDwarf_Skill2_Hit02");
    public static final ParticleType HeroAncientDwarf_Skill2_Hit02_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill2_Hit02_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill2_Hit03 = new ParticleType("HeroAncientDwarf_Skill2_Hit03");
    public static final ParticleType HeroAncientDwarf_Skill2_Hit03_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill2_Hit03_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill2_Hit_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill2_Hit_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill3_Treatment = new ParticleType("HeroAncientDwarf_Skill3_Treatment");
    public static final ParticleType HeroAncientDwarf_Skill3_Treatment_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill3_Treatment_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Cannon = new ParticleType("HeroAncientDwarf_Skill4_Cannon");
    public static final ParticleType HeroAncientDwarf_Skill4_Cannon_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Cannon_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Charge = new ParticleType("HeroAncientDwarf_Skill4_Charge");
    public static final ParticleType HeroAncientDwarf_Skill4_Charge_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Charge_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Hit = new ParticleType("HeroAncientDwarf_Skill4_Hit");
    public static final ParticleType HeroAncientDwarf_Skill4_Hit_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Hit_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Muzzle = new ParticleType("HeroAncientDwarf_Skill4_Muzzle");
    public static final ParticleType HeroAncientDwarf_Skill4_Muzzle02 = new ParticleType("HeroAncientDwarf_Skill4_Muzzle02");
    public static final ParticleType HeroAncientDwarf_Skill4_Muzzle02_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Muzzle02_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Muzzle_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Muzzle_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Stone = new ParticleType("HeroAncientDwarf_Skill4_Stone");
    public static final ParticleType HeroAncientDwarf_Skill4_Stone02 = new ParticleType("HeroAncientDwarf_Skill4_Stone02");
    public static final ParticleType HeroAncientDwarf_Skill4_Stone02_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Stone02_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Skill4_Stone_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Skill4_Stone_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAncientDwarf_Victory_Blast02 = new ParticleType("HeroAncientDwarf_Victory_Blast02");
    public static final ParticleType HeroAncientDwarf_Victory_Blast02_skin_ancient_dwarf_mecha = new ParticleType("HeroAncientDwarf_Victory_Blast02_skin_ancient_dwarf_mecha");
    public static final ParticleType HeroAngelDragon_Attack_Circle_skin_Fallen = new ParticleType("HeroAngelDragon_Attack_Circle_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Attack_Fire_skin_Fallen = new ParticleType("HeroAngelDragon_Attack_Fire_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Attack_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Attack_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Attack_Treatment_skin_Fallen = new ParticleType("HeroAngelDragon_Attack_Treatment_skin_Fallen");
    public static final ParticleType HeroAngelDragon_BasicAttack_Circle = new ParticleType("HeroAngelDragon_BasicAttack_Circle");
    public static final ParticleType HeroAngelDragon_BasicAttack_Circle_skin_usercontest = new ParticleType("HeroAngelDragon_BasicAttack_Circle_skin_usercontest");
    public static final ParticleType HeroAngelDragon_BasicAttack_Treatment = new ParticleType("HeroAngelDragon_BasicAttack_Treatment");
    public static final ParticleType HeroAngelDragon_BasicAttack_Treatment_skin_usercontest = new ParticleType("HeroAngelDragon_BasicAttack_Treatment_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill01_End_Stars = new ParticleType("HeroAngelDragon_Skill01_End_Stars");
    public static final ParticleType HeroAngelDragon_Skill01_End_Stars_skin_usercontest = new ParticleType("HeroAngelDragon_Skill01_End_Stars_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill01_Loop01_Glistening = new ParticleType("HeroAngelDragon_Skill01_Loop01_Glistening");
    public static final ParticleType HeroAngelDragon_Skill01_Loop01_Glistening_skin_usercontest = new ParticleType("HeroAngelDragon_Skill01_Loop01_Glistening_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill01_Loop02_Glistening = new ParticleType("HeroAngelDragon_Skill01_Loop02_Glistening");
    public static final ParticleType HeroAngelDragon_Skill01_Loop02_Glistening_skin_usercontest = new ParticleType("HeroAngelDragon_Skill01_Loop02_Glistening_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill01_Start01_Convergence = new ParticleType("HeroAngelDragon_Skill01_Start01_Convergence");
    public static final ParticleType HeroAngelDragon_Skill01_Start01_Convergence_skin_usercontest = new ParticleType("HeroAngelDragon_Skill01_Start01_Convergence_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill01_Start02_Convergence = new ParticleType("HeroAngelDragon_Skill01_Start02_Convergence");
    public static final ParticleType HeroAngelDragon_Skill01_Start02_Convergence_skin_usercontest = new ParticleType("HeroAngelDragon_Skill01_Start02_Convergence_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill02_End01_Blast = new ParticleType("HeroAngelDragon_Skill02_End01_Blast");
    public static final ParticleType HeroAngelDragon_Skill02_End01_Blast_skin_usercontest = new ParticleType("HeroAngelDragon_Skill02_End01_Blast_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill02_End02_Blast = new ParticleType("HeroAngelDragon_Skill02_End02_Blast");
    public static final ParticleType HeroAngelDragon_Skill02_End02_Blast_skin_usercontest = new ParticleType("HeroAngelDragon_Skill02_End02_Blast_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill02_Loop01_Convergence = new ParticleType("HeroAngelDragon_Skill02_Loop01_Convergence");
    public static final ParticleType HeroAngelDragon_Skill02_Loop01_Convergence_skin_usercontest = new ParticleType("HeroAngelDragon_Skill02_Loop01_Convergence_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill02_Loop02_Blast = new ParticleType("HeroAngelDragon_Skill02_Loop02_Blast");
    public static final ParticleType HeroAngelDragon_Skill02_Loop02_Blast_skin_usercontest = new ParticleType("HeroAngelDragon_Skill02_Loop02_Blast_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill02_Start_Convergence = new ParticleType("HeroAngelDragon_Skill02_Start_Convergence");
    public static final ParticleType HeroAngelDragon_Skill02_Start_Convergence_skin_usercontest = new ParticleType("HeroAngelDragon_Skill02_Start_Convergence_skin_usercontest");
    public static final ParticleType HeroAngelDragon_Skill1_End_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_End_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_End_Stars_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_End_Stars_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_Loop_Glistening_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_Loop_Glistening_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_Loop_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_Loop_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_Loop_Line_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_Loop_Line_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_Start_Collect_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_Start_Collect_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_Start_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_Start_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill1_Start_Ring_skin_Fallen = new ParticleType("HeroAngelDragon_Skill1_Start_Ring_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_End_Blast_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_End_Blast_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_End_Bomb_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_End_Bomb_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_End_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_End_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_Loop_Blast_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_Loop_Blast_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_Loop_Convergence_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_Loop_Convergence_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_Loop_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_Loop_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_Start_Convergence_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_Start_Convergence_skin_Fallen");
    public static final ParticleType HeroAngelDragon_Skill2_Start_Head_skin_Fallen = new ParticleType("HeroAngelDragon_Skill2_Start_Head_skin_Fallen");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill1 = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill1");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill1_Fallen = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill1_Fallen");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill1_skin_usercontest = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill1_skin_usercontest");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill2_1 = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill2_1");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill2_1_skin_usercontest = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill2_1_skin_usercontest");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill2_2 = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill2_2");
    public static final ParticleType HeroAngelDragon_buff_angel_dragon_skill2_2_skin_usercontest = new ParticleType("HeroAngelDragon_buff_angel_dragon_skill2_2_skin_usercontest");
    public static final ParticleType HeroAngelicHerald_BasicAttack_Waves = new ParticleType("HeroAngelicHerald_BasicAttack_Waves");
    public static final ParticleType HeroAngelicHerald_Skill1_loop_Light = new ParticleType("HeroAngelicHerald_Skill1_loop_Light");
    public static final ParticleType HeroAngelicHerald_Skill2_Hit = new ParticleType("HeroAngelicHerald_Skill2_Hit");
    public static final ParticleType HeroAngelicHerald_Skill2_Sonic = new ParticleType("HeroAngelicHerald_Skill2_Sonic");
    public static final ParticleType HeroAngelicHerald_Skill5 = new ParticleType("HeroAngelicHerald_Skill5");
    public static final ParticleType HeroApprentice_GenericPuff = new ParticleType("HeroApprentice_GenericPuff");
    public static final ParticleType HeroApprentice_GroundHitImpact = new ParticleType("HeroApprentice_GroundHitImpact");
    public static final ParticleType HeroApprentice_LegendShield = new ParticleType("HeroApprentice_LegendShield");
    public static final ParticleType HeroApprentice_LightBeamImpact = new ParticleType("HeroApprentice_LightBeamImpact");
    public static final ParticleType HeroApprentice_Meteor = new ParticleType("HeroApprentice_Meteor");
    public static final ParticleType HeroApprentice_MeteorHitGround = new ParticleType("HeroApprentice_MeteorHitGround");
    public static final ParticleType HeroApprentice_RingForFood = new ParticleType("HeroApprentice_RingForFood");
    public static final ParticleType HeroApprentice_Shield_only = new ParticleType("HeroApprentice_Shield_only");
    public static final ParticleType HeroApprentice_Skill6_Absorb = new ParticleType("HeroApprentice_Skill6_Absorb");
    public static final ParticleType HeroApprentice_Skill6_Converge = new ParticleType("HeroApprentice_Skill6_Converge");
    public static final ParticleType HeroApprentice_Skill6_Hand_Effect = new ParticleType("HeroApprentice_Skill6_Hand_Effect");
    public static final ParticleType HeroApprentice_StuffGlow = new ParticleType("HeroApprentice_StuffGlow");
    public static final ParticleType HeroApprentice_StuffGlowBlue = new ParticleType("HeroApprentice_StuffGlowBlue");
    public static final ParticleType HeroApprentice_StuffSparkle = new ParticleType("HeroApprentice_StuffSparkle");
    public static final ParticleType HeroApprentice_StuffStun = new ParticleType("HeroApprentice_StuffStun");
    public static final ParticleType HeroApprentice_ThrustUp = new ParticleType("HeroApprentice_ThrustUp");
    public static final ParticleType HeroApprentice_ThrustUpTrail = new ParticleType("HeroApprentice_ThrustUpTrail");
    public static final ParticleType HeroApprentice_Whack = new ParticleType("HeroApprentice_Whack");
    public static final ParticleType HeroAquaticMan_AttackWaterSpout = new ParticleType("HeroAquaticMan_AttackWaterSpout");
    public static final ParticleType HeroAquaticMan_AttackfromStuff = new ParticleType("HeroAquaticMan_AttackfromStuff");
    public static final ParticleType HeroAquaticMan_DeathSplush = new ParticleType("HeroAquaticMan_DeathSplush");
    public static final ParticleType HeroAquaticMan_Skill1Wave_Proj = new ParticleType("HeroAquaticMan_Skill1Wave_Proj");
    public static final ParticleType HeroAquaticMan_Skill1fromStuff_Proj = new ParticleType("HeroAquaticMan_Skill1fromStuff_Proj");
    public static final ParticleType HeroAquaticMan_Skill2WaterSpout = new ParticleType("HeroAquaticMan_Skill2WaterSpout");
    public static final ParticleType HeroAquaticMan_Skill2WaterSpoutBase = new ParticleType("HeroAquaticMan_Skill2WaterSpoutBase");
    public static final ParticleType HeroAquaticMan_Skill2WaterSpoutSingle = new ParticleType("HeroAquaticMan_Skill2WaterSpoutSingle");
    public static final ParticleType HeroAquaticMan_Skill3Whirlpool = new ParticleType("HeroAquaticMan_Skill3Whirlpool");
    public static final ParticleType HeroAquaticMan_Skill3WhirlpoolSelf = new ParticleType("HeroAquaticMan_Skill3WhirlpoolSelf");
    public static final ParticleType HeroAquaticMan_Skill3fromStuff_Proj = new ParticleType("HeroAquaticMan_Skill3fromStuff_Proj");
    public static final ParticleType HeroBanshee_death = new ParticleType("HeroBanshee_death");
    public static final ParticleType HeroBanshee_skill0_breath = new ParticleType("HeroBanshee_skill0_breath");
    public static final ParticleType HeroBanshee_skill0_projectile = new ParticleType("HeroBanshee_skill0_projectile");
    public static final ParticleType HeroBanshee_skill1 = new ParticleType("HeroBanshee_skill1");
    public static final ParticleType HeroBanshee_skill3_DoT_A = new ParticleType("HeroBanshee_skill3_DoT_A");
    public static final ParticleType HeroBanshee_skill3_mark_NPC = new ParticleType("HeroBanshee_skill3_mark_NPC");
    public static final ParticleType HeroBanshee_skill3_wisps_A = new ParticleType("HeroBanshee_skill3_wisps_A");
    public static final ParticleType HeroBanshee_skill3_wisps_B = new ParticleType("HeroBanshee_skill3_wisps_B");
    public static final ParticleType HeroBanshee_skill4_hit = new ParticleType("HeroBanshee_skill4_hit");
    public static final ParticleType HeroBardbarian_AWave = new ParticleType("HeroBardbarian_AWave");
    public static final ParticleType HeroBardbarian_AWaveB = new ParticleType("HeroBardbarian_AWaveB");
    public static final ParticleType HeroBardbarian_AWaveBImpact = new ParticleType("HeroBardbarian_AWaveBImpact");
    public static final ParticleType HeroBardbarian_AttackImpact = new ParticleType("HeroBardbarian_AttackImpact");
    public static final ParticleType HeroBardbarian_Buff = new ParticleType("HeroBardbarian_Buff");
    public static final ParticleType HeroBardbarian_BuffBardbarian = new ParticleType("HeroBardbarian_BuffBardbarian");
    public static final ParticleType HeroBardbarian_Buff_Notes = new ParticleType("HeroBardbarian_Buff_Notes");
    public static final ParticleType HeroBardbarian_Buff_Ring = new ParticleType("HeroBardbarian_Buff_Ring");
    public static final ParticleType HeroBardbarian_Skill3Impact = new ParticleType("HeroBardbarian_Skill3Impact");
    public static final ParticleType HeroBardbarian_Victory = new ParticleType("HeroBardbarian_Victory");
    public static final ParticleType HeroBlackWing_Attack_Fire = new ParticleType("HeroBlackWing_Attack_Fire");
    public static final ParticleType HeroBlackWing_Attack_Fire02 = new ParticleType("HeroBlackWing_Attack_Fire02");
    public static final ParticleType HeroBlackWing_Attack_Fire02_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Attack_Fire02_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Attack_Fire_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Attack_Fire_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Attack_Flight = new ParticleType("HeroBlackWing_Attack_Flight");
    public static final ParticleType HeroBlackWing_Attack_Flight_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Attack_Flight_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Attack_Hit = new ParticleType("HeroBlackWing_Attack_Hit");
    public static final ParticleType HeroBlackWing_Attack_Hit_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Attack_Hit_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill1_Blade = new ParticleType("HeroBlackWing_Skill1_Blade");
    public static final ParticleType HeroBlackWing_Skill1_Blade_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill1_Blade_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill1_Boom = new ParticleType("HeroBlackWing_Skill1_Boom");
    public static final ParticleType HeroBlackWing_Skill1_Boom_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill1_Boom_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill1_Fire = new ParticleType("HeroBlackWing_Skill1_Fire");
    public static final ParticleType HeroBlackWing_Skill1_Fire_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill1_Fire_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill1_Hit = new ParticleType("HeroBlackWing_Skill1_Hit");
    public static final ParticleType HeroBlackWing_Skill1_Hit_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill1_Hit_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill2_Wing = new ParticleType("HeroBlackWing_Skill2_Wing");
    public static final ParticleType HeroBlackWing_Skill2_Wing_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill2_Wing_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill4_Gather = new ParticleType("HeroBlackWing_Skill4_Gather");
    public static final ParticleType HeroBlackWing_Skill4_Gather_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill4_Gather_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill4_Glow = new ParticleType("HeroBlackWing_Skill4_Glow");
    public static final ParticleType HeroBlackWing_Skill4_Glow02 = new ParticleType("HeroBlackWing_Skill4_Glow02");
    public static final ParticleType HeroBlackWing_Skill4_Glow02_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill4_Glow02_skin_black_wing_mecha");
    public static final ParticleType HeroBlackWing_Skill4_Glow_skin_black_wing_mecha = new ParticleType("HeroBlackWing_Skill4_Glow_skin_black_wing_mecha");
    public static final ParticleType HeroBoneDragon_AttackMouthFire = new ParticleType("HeroBoneDragon_AttackMouthFire");
    public static final ParticleType HeroBoneDragon_AttackMouthSmoke = new ParticleType("HeroBoneDragon_AttackMouthSmoke");
    public static final ParticleType HeroBoneDragon_AttackSmoke_Landed = new ParticleType("HeroBoneDragon_AttackSmoke_Landed");
    public static final ParticleType HeroBoneDragon_AttackSmoke_Proj = new ParticleType("HeroBoneDragon_AttackSmoke_Proj");
    public static final ParticleType HeroBoneDragon_DeathSmoke = new ParticleType("HeroBoneDragon_DeathSmoke");
    public static final ParticleType HeroBoneDragon_Skill1Fire_Landed = new ParticleType("HeroBoneDragon_Skill1Fire_Landed");
    public static final ParticleType HeroBoneDragon_Skill1MouthFire = new ParticleType("HeroBoneDragon_Skill1MouthFire");
    public static final ParticleType HeroBoneDragon_Skill1MouthSmoke = new ParticleType("HeroBoneDragon_Skill1MouthSmoke");
    public static final ParticleType HeroBoneDragon_Skill1RibFire = new ParticleType("HeroBoneDragon_Skill1RibFire");
    public static final ParticleType HeroBoneDragon_Skill1Smoke_Proj = new ParticleType("HeroBoneDragon_Skill1Smoke_Proj");
    public static final ParticleType HeroBoneDragon_Skill2MouthFire = new ParticleType("HeroBoneDragon_Skill2MouthFire");
    public static final ParticleType HeroBoneDragon_Skill2MouthSmoke = new ParticleType("HeroBoneDragon_Skill2MouthSmoke");
    public static final ParticleType HeroBoneDragon_Skill2Smoke_Proj = new ParticleType("HeroBoneDragon_Skill2Smoke_Proj");
    public static final ParticleType HeroBoneDragon_Skill2TarLanded_Proj = new ParticleType("HeroBoneDragon_Skill2TarLanded_Proj");
    public static final ParticleType HeroBoneDragon_Skill3Buff_Proj = new ParticleType("HeroBoneDragon_Skill3Buff_Proj");
    public static final ParticleType HeroBoneDragon_Skill3MouthSmoke = new ParticleType("HeroBoneDragon_Skill3MouthSmoke");
    public static final ParticleType HeroBrozerker_Damage = new ParticleType("HeroBrozerker_Damage");
    public static final ParticleType HeroBrozerker_ExplodingShieldLoop = new ParticleType("HeroBrozerker_ExplodingShieldLoop");
    public static final ParticleType HeroBrozerker_Heal = new ParticleType("HeroBrozerker_Heal");
    public static final ParticleType HeroBrozerker_HealingShieldLoop = new ParticleType("HeroBrozerker_HealingShieldLoop");
    public static final ParticleType HeroBrozerker_Impact = new ParticleType("HeroBrozerker_Impact");
    public static final ParticleType HeroBrozerker_MagicMace = new ParticleType("HeroBrozerker_MagicMace");
    public static final ParticleType HeroBrozerker_Magicexplode_break = new ParticleType("HeroBrozerker_Magicexplode_break");
    public static final ParticleType HeroBrozerker_Magicexplode_ring = new ParticleType("HeroBrozerker_Magicexplode_ring");
    public static final ParticleType HeroBrozerker_Magicshield = new ParticleType("HeroBrozerker_Magicshield");
    public static final ParticleType HeroBrozerker_Stars = new ParticleType("HeroBrozerker_Stars");
    public static final ParticleType HeroBruteDragon_BiteFireWorks = new ParticleType("HeroBruteDragon_BiteFireWorks");
    public static final ParticleType HeroBruteDragon_BiteSplash = new ParticleType("HeroBruteDragon_BiteSplash");
    public static final ParticleType HeroBruteDragon_BuffRing = new ParticleType("HeroBruteDragon_BuffRing");
    public static final ParticleType HeroBruteDragon_BurstFlame = new ParticleType("HeroBruteDragon_BurstFlame");
    public static final ParticleType HeroBruteDragon_BurstSmoke = new ParticleType("HeroBruteDragon_BurstSmoke");
    public static final ParticleType HeroBruteDragon_FireHitDamage = new ParticleType("HeroBruteDragon_FireHitDamage");
    public static final ParticleType HeroBruteDragon_FirePlume = new ParticleType("HeroBruteDragon_FirePlume");
    public static final ParticleType HeroBruteDragon_FirePlumeLanded = new ParticleType("HeroBruteDragon_FirePlumeLanded");
    public static final ParticleType HeroBruteDragon_GreenGas = new ParticleType("HeroBruteDragon_GreenGas");
    public static final ParticleType HeroBruteDragon_GreenGasFeet = new ParticleType("HeroBruteDragon_GreenGasFeet");
    public static final ParticleType HeroBruteDragon_HeadDrop = new ParticleType("HeroBruteDragon_HeadDrop");
    public static final ParticleType HeroBruteDragon_Skill6_Buff = new ParticleType("HeroBruteDragon_Skill6_Buff");
    public static final ParticleType HeroBruteDragon_Skill6_Buff_Bottom = new ParticleType("HeroBruteDragon_Skill6_Buff_Bottom");
    public static final ParticleType HeroBruteDragon_SmokeMouth = new ParticleType("HeroBruteDragon_SmokeMouth");
    public static final ParticleType HeroBruteDragon_SmokeMouthGreen = new ParticleType("HeroBruteDragon_SmokeMouthGreen");
    public static final ParticleType HeroBruteDragon_SteamNose = new ParticleType("HeroBruteDragon_SteamNose");
    public static final ParticleType HeroBulwarkAngel_attack_crit = new ParticleType("HeroBulwarkAngel_attack_crit");
    public static final ParticleType HeroBulwarkAngel_attack_explosion1 = new ParticleType("HeroBulwarkAngel_attack_explosion1");
    public static final ParticleType HeroBulwarkAngel_skill1_end_collision = new ParticleType("HeroBulwarkAngel_skill1_end_collision");
    public static final ParticleType HeroBulwarkAngel_skill1_end_glow2 = new ParticleType("HeroBulwarkAngel_skill1_end_glow2");
    public static final ParticleType HeroBulwarkAngel_skill1_end_wave = new ParticleType("HeroBulwarkAngel_skill1_end_wave");
    public static final ParticleType HeroBulwarkAngel_skill2_end_blindness = new ParticleType("HeroBulwarkAngel_skill2_end_blindness");
    public static final ParticleType HeroBulwarkAngel_skill2_end_glow = new ParticleType("HeroBulwarkAngel_skill2_end_glow");
    public static final ParticleType HeroBulwarkAngel_skill2_loop_goldlight = new ParticleType("HeroBulwarkAngel_skill2_loop_goldlight");
    public static final ParticleType HeroBulwarkAngel_skill2_start_converge = new ParticleType("HeroBulwarkAngel_skill2_start_converge");
    public static final ParticleType HeroBulwarkAngel_skill3_loop_crack = new ParticleType("HeroBulwarkAngel_skill3_loop_crack");
    public static final ParticleType HeroBulwarkAngel_skill3_loop_explosion = new ParticleType("HeroBulwarkAngel_skill3_loop_explosion");
    public static final ParticleType HeroBulwarkAngel_skill3_loop_flash = new ParticleType("HeroBulwarkAngel_skill3_loop_flash");
    public static final ParticleType HeroBulwarkAngel_skill3_loop_laser = new ParticleType("HeroBulwarkAngel_skill3_loop_laser");
    public static final ParticleType HeroBulwarkAngel_skill3_loop_wave = new ParticleType("HeroBulwarkAngel_skill3_loop_wave");
    public static final ParticleType HeroBulwarkAngel_skill3_start_glow = new ParticleType("HeroBulwarkAngel_skill3_start_glow");
    public static final ParticleType HeroBurntOne_Attack_Hit_skin_voodoo = new ParticleType("HeroBurntOne_Attack_Hit_skin_voodoo");
    public static final ParticleType HeroBurntOne_Attack_Spray_skin_voodoo = new ParticleType("HeroBurntOne_Attack_Spray_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_End2_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_End2_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_End_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_End_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_Hit_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_Hit_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_Loop2_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_Loop2_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_Loop_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_Loop_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_Puff_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_Puff_skin_voodoo");
    public static final ParticleType HeroBurntOne_Skill1_Start_skin_voodoo = new ParticleType("HeroBurntOne_Skill1_Start_skin_voodoo");
    public static final ParticleType HeroBurntOne_skill1_activeEnd_A = new ParticleType("HeroBurntOne_skill1_activeEnd_A");
    public static final ParticleType HeroBurntOne_skill1_activeEnd_B = new ParticleType("HeroBurntOne_skill1_activeEnd_B");
    public static final ParticleType HeroBurntOne_skill1_activeEnd_hit = new ParticleType("HeroBurntOne_skill1_activeEnd_hit");
    public static final ParticleType HeroBurntOne_skill1_activeStart_A = new ParticleType("HeroBurntOne_skill1_activeStart_A");
    public static final ParticleType HeroBurntOne_skill1_activeStart_B = new ParticleType("HeroBurntOne_skill1_activeStart_B");
    public static final ParticleType HeroBurntOne_skill1_activeStart_puff = new ParticleType("HeroBurntOne_skill1_activeStart_puff");
    public static final ParticleType HeroBurntOne_skill1_attack_hit = new ParticleType("HeroBurntOne_skill1_attack_hit");
    public static final ParticleType HeroBurntOne_skill1_passiveLoop_A = new ParticleType("HeroBurntOne_skill1_passiveLoop_A");
    public static final ParticleType HeroBurntOne_skill1_passiveLoop_B = new ParticleType("HeroBurntOne_skill1_passiveLoop_B");
    public static final ParticleType HeroBurntOne_skill3_magmaWave = new ParticleType("HeroBurntOne_skill3_magmaWave");
    public static final ParticleType HeroBurntOne_skill3_magmaWave_halfHeight = new ParticleType("HeroBurntOne_skill3_magmaWave_halfHeight");
    public static final ParticleType HeroCatapultKnight_Confetti = new ParticleType("HeroCatapultKnight_Confetti");
    public static final ParticleType HeroCatapultKnight_ConfettiExplosion = new ParticleType("HeroCatapultKnight_ConfettiExplosion");
    public static final ParticleType HeroCatapultKnight_DeathDust = new ParticleType("HeroCatapultKnight_DeathDust");
    public static final ParticleType HeroCatapultKnight_FireBall = new ParticleType("HeroCatapultKnight_FireBall");
    public static final ParticleType HeroCatapultKnight_FireBall2 = new ParticleType("HeroCatapultKnight_FireBall2");
    public static final ParticleType HeroCatapultKnight_FireBall2Trail = new ParticleType("HeroCatapultKnight_FireBall2Trail");
    public static final ParticleType HeroCatapultKnight_FireBallTrail = new ParticleType("HeroCatapultKnight_FireBallTrail");
    public static final ParticleType HeroCatapultKnight_Hit = new ParticleType("HeroCatapultKnight_Hit");
    public static final ParticleType HeroCatapultKnight_Skill1RockLand = new ParticleType("HeroCatapultKnight_Skill1RockLand");
    public static final ParticleType HeroCatapultKnight_Skill1RockLand_Ground = new ParticleType("HeroCatapultKnight_Skill1RockLand_Ground");
    public static final ParticleType HeroCatapultKnight_Skill1RockLand_Top = new ParticleType("HeroCatapultKnight_Skill1RockLand_Top");
    public static final ParticleType HeroCatapultKnight_Skill2SmokeLand = new ParticleType("HeroCatapultKnight_Skill2SmokeLand");
    public static final ParticleType HeroCatapultKnight_Skill2SmokeLand_Ground = new ParticleType("HeroCatapultKnight_Skill2SmokeLand_Ground");
    public static final ParticleType HeroCatapultKnight_Skill2SmokeLand_Top = new ParticleType("HeroCatapultKnight_Skill2SmokeLand_Top");
    public static final ParticleType HeroCatapultKnight_Skill3RockLand = new ParticleType("HeroCatapultKnight_Skill3RockLand");
    public static final ParticleType HeroCentaur_ArrowCharge = new ParticleType("HeroCentaur_ArrowCharge");
    public static final ParticleType HeroCentaur_ArrowChargeGlow = new ParticleType("HeroCentaur_ArrowChargeGlow");
    public static final ParticleType HeroCentaur_ArrowRelease = new ParticleType("HeroCentaur_ArrowRelease");
    public static final ParticleType HeroCentaur_HitEnergy = new ParticleType("HeroCentaur_HitEnergy");
    public static final ParticleType HeroCentaur_HitEnergy_skin_mastery = new ParticleType("HeroCentaur_HitEnergy_skin_mastery");
    public static final ParticleType HeroCentaur_HitEnergy_skin_resplendent = new ParticleType("HeroCentaur_HitEnergy_skin_resplendent");
    public static final ParticleType HeroCentaur_HitImpact = new ParticleType("HeroCentaur_HitImpact");
    public static final ParticleType HeroCentaur_HitImpact_skin_mastery = new ParticleType("HeroCentaur_HitImpact_skin_mastery");
    public static final ParticleType HeroCentaur_HitImpact_skin_resplendent = new ParticleType("HeroCentaur_HitImpact_skin_resplendent");
    public static final ParticleType HeroCentaur_Silence = new ParticleType("HeroCentaur_Silence");
    public static final ParticleType HeroCentaur_Stopwatch = new ParticleType("HeroCentaur_Stopwatch");
    public static final ParticleType HeroCentaur_VictoryHorn = new ParticleType("HeroCentaur_VictoryHorn");
    public static final ParticleType HeroClawMan_Attack_Cllawlight = new ParticleType("HeroClawMan_Attack_Cllawlight");
    public static final ParticleType HeroClawMan_Hit_Cllawlight1 = new ParticleType("HeroClawMan_Hit_Cllawlight1");
    public static final ParticleType HeroClawMan_Hit_Cllawlight2 = new ParticleType("HeroClawMan_Hit_Cllawlight2");
    public static final ParticleType HeroClawMan_Hit_Cllawlight3 = new ParticleType("HeroClawMan_Hit_Cllawlight3");
    public static final ParticleType HeroClawMan_Hit_Cllawlight4 = new ParticleType("HeroClawMan_Hit_Cllawlight4");
    public static final ParticleType HeroClawMan_Skill1_Cllawlight = new ParticleType("HeroClawMan_Skill1_Cllawlight");
    public static final ParticleType HeroClawMan_Skill2_Cllawlight1 = new ParticleType("HeroClawMan_Skill2_Cllawlight1");
    public static final ParticleType HeroClawMan_Skill2_Cllawlight2 = new ParticleType("HeroClawMan_Skill2_Cllawlight2");
    public static final ParticleType HeroClawMan_Skill2_Cllawlight3 = new ParticleType("HeroClawMan_Skill2_Cllawlight3");
    public static final ParticleType HeroClawMan_Skill2_Hit = new ParticleType("HeroClawMan_Skill2_Hit");
    public static final ParticleType HeroClawMan_Skill2_Venom = new ParticleType("HeroClawMan_Skill2_Venom");
    public static final ParticleType HeroClawMan_Skill3_Cllawlight = new ParticleType("HeroClawMan_Skill3_Cllawlight");
    public static final ParticleType HeroClawMan_Skill3_buff = new ParticleType("HeroClawMan_Skill3_buff");
    public static final ParticleType HeroClawMan_Skill4_Grin = new ParticleType("HeroClawMan_Skill4_Grin");
    public static final ParticleType HeroCursedStatue_Blink_skin_hawaii = new ParticleType("HeroCursedStatue_Blink_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Cold_skin_hawaii = new ParticleType("HeroCursedStatue_Cold_skin_hawaii");
    public static final ParticleType HeroCursedStatue_DOT_burn = new ParticleType("HeroCursedStatue_DOT_burn");
    public static final ParticleType HeroCursedStatue_DOT_burn_Rr = new ParticleType("HeroCursedStatue_DOT_burn_Rr");
    public static final ParticleType HeroCursedStatue_DOT_burn_Rr_skin_meer = new ParticleType("HeroCursedStatue_DOT_burn_Rr_skin_meer");
    public static final ParticleType HeroCursedStatue_DOT_burn_Rr_skin_usercontest = new ParticleType("HeroCursedStatue_DOT_burn_Rr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_DOT_burn_skin_meer = new ParticleType("HeroCursedStatue_DOT_burn_skin_meer");
    public static final ParticleType HeroCursedStatue_DOT_burn_skin_usercontest = new ParticleType("HeroCursedStatue_DOT_burn_skin_usercontest");
    public static final ParticleType HeroCursedStatue_Ground_skin_hawaii = new ParticleType("HeroCursedStatue_Ground_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Head_skin_hawaii = new ParticleType("HeroCursedStatue_Head_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Laser_skin_hawaii = new ParticleType("HeroCursedStatue_Laser_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Petal_skin_hawaii = new ParticleType("HeroCursedStatue_Petal_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Ray_skin_hawaii = new ParticleType("HeroCursedStatue_Ray_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Shockwave_pulse_skin_meer = new ParticleType("HeroCursedStatue_Shockwave_pulse_skin_meer");
    public static final ParticleType HeroCursedStatue_Shockwave_pulse_skin_usercontest = new ParticleType("HeroCursedStatue_Shockwave_pulse_skin_usercontest");
    public static final ParticleType HeroCursedStatue_Spary_skin_hawaii = new ParticleType("HeroCursedStatue_Spary_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Staff_skin_hawaii = new ParticleType("HeroCursedStatue_Staff_skin_hawaii");
    public static final ParticleType HeroCursedStatue_Syrup_skin_hawaii = new ParticleType("HeroCursedStatue_Syrup_skin_hawaii");
    public static final ParticleType HeroCursedStatue_attack = new ParticleType("HeroCursedStatue_attack");
    public static final ParticleType HeroCursedStatue_attack_impact_skin_meer = new ParticleType("HeroCursedStatue_attack_impact_skin_meer");
    public static final ParticleType HeroCursedStatue_attack_impact_skin_usercontest = new ParticleType("HeroCursedStatue_attack_impact_skin_usercontest");
    public static final ParticleType HeroCursedStatue_attack_noBeam_skin_meer = new ParticleType("HeroCursedStatue_attack_noBeam_skin_meer");
    public static final ParticleType HeroCursedStatue_attack_noBeam_skin_usercontest = new ParticleType("HeroCursedStatue_attack_noBeam_skin_usercontest");
    public static final ParticleType HeroCursedStatue_attack_skin_meer = new ParticleType("HeroCursedStatue_attack_skin_meer");
    public static final ParticleType HeroCursedStatue_attack_skin_usercontest = new ParticleType("HeroCursedStatue_attack_skin_usercontest");
    public static final ParticleType HeroCursedStatue_crumble_A_skin_meer = new ParticleType("HeroCursedStatue_crumble_A_skin_meer");
    public static final ParticleType HeroCursedStatue_crumble_A_skin_usercontest = new ParticleType("HeroCursedStatue_crumble_A_skin_usercontest");
    public static final ParticleType HeroCursedStatue_crumble_B_skin_meer = new ParticleType("HeroCursedStatue_crumble_B_skin_meer");
    public static final ParticleType HeroCursedStatue_crumble_B_skin_usercontest = new ParticleType("HeroCursedStatue_crumble_B_skin_usercontest");
    public static final ParticleType HeroCursedStatue_crumble_C_skin_meer = new ParticleType("HeroCursedStatue_crumble_C_skin_meer");
    public static final ParticleType HeroCursedStatue_crumble_C_skin_usercontest = new ParticleType("HeroCursedStatue_crumble_C_skin_usercontest");
    public static final ParticleType HeroCursedStatue_death_ground = new ParticleType("HeroCursedStatue_death_ground");
    public static final ParticleType HeroCursedStatue_death_groundA_skin_meer = new ParticleType("HeroCursedStatue_death_groundA_skin_meer");
    public static final ParticleType HeroCursedStatue_death_groundA_skin_usercontest = new ParticleType("HeroCursedStatue_death_groundA_skin_usercontest");
    public static final ParticleType HeroCursedStatue_death_ground_Rr = new ParticleType("HeroCursedStatue_death_ground_Rr");
    public static final ParticleType HeroCursedStatue_death_ground_Rr_skin_meer = new ParticleType("HeroCursedStatue_death_ground_Rr_skin_meer");
    public static final ParticleType HeroCursedStatue_death_ground_Rr_skin_usercontest = new ParticleType("HeroCursedStatue_death_ground_Rr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_death_ground_skin_meer = new ParticleType("HeroCursedStatue_death_ground_skin_meer");
    public static final ParticleType HeroCursedStatue_death_ground_skin_usercontest = new ParticleType("HeroCursedStatue_death_ground_skin_usercontest");
    public static final ParticleType HeroCursedStatue_death_head = new ParticleType("HeroCursedStatue_death_head");
    public static final ParticleType HeroCursedStatue_death_head_skin_meer = new ParticleType("HeroCursedStatue_death_head_skin_meer");
    public static final ParticleType HeroCursedStatue_death_head_skin_usercontest = new ParticleType("HeroCursedStatue_death_head_skin_usercontest");
    public static final ParticleType HeroCursedStatue_death_staff = new ParticleType("HeroCursedStatue_death_staff");
    public static final ParticleType HeroCursedStatue_death_staff_skin_meer = new ParticleType("HeroCursedStatue_death_staff_skin_meer");
    public static final ParticleType HeroCursedStatue_death_staff_skin_usercontest = new ParticleType("HeroCursedStatue_death_staff_skin_usercontest");
    public static final ParticleType HeroCursedStatue_ground_Fr_skin_meer = new ParticleType("HeroCursedStatue_ground_Fr_skin_meer");
    public static final ParticleType HeroCursedStatue_ground_Fr_skin_usercontest = new ParticleType("HeroCursedStatue_ground_Fr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skill2_BG = new ParticleType("HeroCursedStatue_skill2_BG");
    public static final ParticleType HeroCursedStatue_skill2_BG_skin_meer = new ParticleType("HeroCursedStatue_skill2_BG_skin_meer");
    public static final ParticleType HeroCursedStatue_skill2_BG_skin_usercontest = new ParticleType("HeroCursedStatue_skill2_BG_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skill2_eyes01 = new ParticleType("HeroCursedStatue_skill2_eyes01");
    public static final ParticleType HeroCursedStatue_skill2_eyes01_skin_meer = new ParticleType("HeroCursedStatue_skill2_eyes01_skin_meer");
    public static final ParticleType HeroCursedStatue_skill2_eyes01_skin_usercontest = new ParticleType("HeroCursedStatue_skill2_eyes01_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skill_03_Fr = new ParticleType("HeroCursedStatue_skill_03_Fr");
    public static final ParticleType HeroCursedStatue_skill_03_Fr_skin_meer = new ParticleType("HeroCursedStatue_skill_03_Fr_skin_meer");
    public static final ParticleType HeroCursedStatue_skill_03_Fr_skin_usercontest = new ParticleType("HeroCursedStatue_skill_03_Fr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skill_03_Rr = new ParticleType("HeroCursedStatue_skill_03_Rr");
    public static final ParticleType HeroCursedStatue_skill_03_Rr_skin_meer = new ParticleType("HeroCursedStatue_skill_03_Rr_skin_meer");
    public static final ParticleType HeroCursedStatue_skill_03_Rr_skin_usercontest = new ParticleType("HeroCursedStatue_skill_03_Rr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skill_03_rays_Rr = new ParticleType("HeroCursedStatue_skill_03_rays_Rr");
    public static final ParticleType HeroCursedStatue_skill_03_rays_Rr_skin_meer = new ParticleType("HeroCursedStatue_skill_03_rays_Rr_skin_meer");
    public static final ParticleType HeroCursedStatue_skill_03_rays_Rr_skin_usercontest = new ParticleType("HeroCursedStatue_skill_03_rays_Rr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skull1_eyesGlow = new ParticleType("HeroCursedStatue_skull1_eyesGlow");
    public static final ParticleType HeroCursedStatue_skull1_eyesGlow_skin_meer = new ParticleType("HeroCursedStatue_skull1_eyesGlow_skin_meer");
    public static final ParticleType HeroCursedStatue_skull1_eyesGlow_skin_usercontest = new ParticleType("HeroCursedStatue_skull1_eyesGlow_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skull2_eyesGlow = new ParticleType("HeroCursedStatue_skull2_eyesGlow");
    public static final ParticleType HeroCursedStatue_skull2_eyesGlow_skin_meer = new ParticleType("HeroCursedStatue_skull2_eyesGlow_skin_meer");
    public static final ParticleType HeroCursedStatue_skull2_eyesGlow_skin_usercontest = new ParticleType("HeroCursedStatue_skull2_eyesGlow_skin_usercontest");
    public static final ParticleType HeroCursedStatue_skull_eyesGlow = new ParticleType("HeroCursedStatue_skull_eyesGlow");
    public static final ParticleType HeroCursedStatue_skull_eyesGlow_skin_meer = new ParticleType("HeroCursedStatue_skull_eyesGlow_skin_meer");
    public static final ParticleType HeroCursedStatue_skull_eyesGlow_skin_usercontest = new ParticleType("HeroCursedStatue_skull_eyesGlow_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spearDissolve_skin_meer = new ParticleType("HeroCursedStatue_spearDissolve_skin_meer");
    public static final ParticleType HeroCursedStatue_spearDissolve_skin_usercontest = new ParticleType("HeroCursedStatue_spearDissolve_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_Fr_skin_meer = new ParticleType("HeroCursedStatue_spear_Fr_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_Fr_skin_usercontest = new ParticleType("HeroCursedStatue_spear_Fr_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_Shockwave_burn_skin_meer = new ParticleType("HeroCursedStatue_spear_Shockwave_burn_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_Shockwave_burn_skin_usercontest = new ParticleType("HeroCursedStatue_spear_Shockwave_burn_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_shockBeam = new ParticleType("HeroCursedStatue_spear_shockBeam");
    public static final ParticleType HeroCursedStatue_spear_shockBeam_GRN = new ParticleType("HeroCursedStatue_spear_shockBeam_GRN");
    public static final ParticleType HeroCursedStatue_spear_shockBeam_GRN_skin_meer = new ParticleType("HeroCursedStatue_spear_shockBeam_GRN_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_shockBeam_GRN_skin_usercontest = new ParticleType("HeroCursedStatue_spear_shockBeam_GRN_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_shockBeam_skin_meer = new ParticleType("HeroCursedStatue_spear_shockBeam_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_shockBeam_skin_usercontest = new ParticleType("HeroCursedStatue_spear_shockBeam_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_shockwave = new ParticleType("HeroCursedStatue_spear_shockwave");
    public static final ParticleType HeroCursedStatue_spear_shockwave_BLUE = new ParticleType("HeroCursedStatue_spear_shockwave_BLUE");
    public static final ParticleType HeroCursedStatue_spear_shockwave_BLUE_skin_meer = new ParticleType("HeroCursedStatue_spear_shockwave_BLUE_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_shockwave_BLUE_skin_usercontest = new ParticleType("HeroCursedStatue_spear_shockwave_BLUE_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_shockwave_GRN_skin_meer = new ParticleType("HeroCursedStatue_spear_shockwave_GRN_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_shockwave_GRN_skin_usercontest = new ParticleType("HeroCursedStatue_spear_shockwave_GRN_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_shockwave_RED_skin_meer = new ParticleType("HeroCursedStatue_spear_shockwave_RED_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_shockwave_RED_skin_usercontest = new ParticleType("HeroCursedStatue_spear_shockwave_RED_skin_usercontest");
    public static final ParticleType HeroCursedStatue_spear_shockwave_skin_meer = new ParticleType("HeroCursedStatue_spear_shockwave_skin_meer");
    public static final ParticleType HeroCursedStatue_spear_shockwave_skin_usercontest = new ParticleType("HeroCursedStatue_spear_shockwave_skin_usercontest");
    public static final ParticleType HeroCursedStatue_swapGlow_skin_meer = new ParticleType("HeroCursedStatue_swapGlow_skin_meer");
    public static final ParticleType HeroCursedStatue_swapGlow_skin_usercontest = new ParticleType("HeroCursedStatue_swapGlow_skin_usercontest");
    public static final ParticleType HeroCyclopsWizard_Attack_Impact = new ParticleType("HeroCyclopsWizard_Attack_Impact");
    public static final ParticleType HeroCyclopsWizard_Attack_OnStaff = new ParticleType("HeroCyclopsWizard_Attack_OnStaff");
    public static final ParticleType HeroCyclopsWizard_Death = new ParticleType("HeroCyclopsWizard_Death");
    public static final ParticleType HeroCyclopsWizard_Skill1_BodyArc = new ParticleType("HeroCyclopsWizard_Skill1_BodyArc");
    public static final ParticleType HeroCyclopsWizard_Skill1_Impact = new ParticleType("HeroCyclopsWizard_Skill1_Impact");
    public static final ParticleType HeroCyclopsWizard_Skill1_Shoot = new ParticleType("HeroCyclopsWizard_Skill1_Shoot");
    public static final ParticleType HeroCyclopsWizard_Skill1_SkyLightning = new ParticleType("HeroCyclopsWizard_Skill1_SkyLightning");
    public static final ParticleType HeroCyclopsWizard_Skill1_lightning = new ParticleType("HeroCyclopsWizard_Skill1_lightning");
    public static final ParticleType HeroCyclopsWizard_Skill2_Eball = new ParticleType("HeroCyclopsWizard_Skill2_Eball");
    public static final ParticleType HeroCyclopsWizard_Skill2_Eball_Impact = new ParticleType("HeroCyclopsWizard_Skill2_Eball_Impact");
    public static final ParticleType HeroCyclopsWizard_Skill3_BoltFeet = new ParticleType("HeroCyclopsWizard_Skill3_BoltFeet");
    public static final ParticleType HeroCyclopsWizard_Skill3_HitGround = new ParticleType("HeroCyclopsWizard_Skill3_HitGround");
    public static final ParticleType HeroCyclopsWizard_Skill3_OnStaff = new ParticleType("HeroCyclopsWizard_Skill3_OnStaff");
    public static final ParticleType HeroCyclopsWizard_Skill3_burstImpact = new ParticleType("HeroCyclopsWizard_Skill3_burstImpact");
    public static final ParticleType HeroCyclopsWizard_Victory = new ParticleType("HeroCyclopsWizard_Victory");
    public static final ParticleType HeroDarkHero_Attack_Gunfiren = new ParticleType("HeroDarkHero_Attack_Gunfiren");
    public static final ParticleType HeroDarkHero_Attack_Gunfiren_Hit = new ParticleType("HeroDarkHero_Attack_Gunfiren_Hit");
    public static final ParticleType HeroDarkHero_Skill1_End_Ballistic = new ParticleType("HeroDarkHero_Skill1_End_Ballistic");
    public static final ParticleType HeroDarkHero_Skill1_End_Gunfiren = new ParticleType("HeroDarkHero_Skill1_End_Gunfiren");
    public static final ParticleType HeroDarkHero_Skill1_End_Gunfiren_Hit = new ParticleType("HeroDarkHero_Skill1_End_Gunfiren_Hit");
    public static final ParticleType HeroDarkHero_Skill1_End_Normal_Array1 = new ParticleType("HeroDarkHero_Skill1_End_Normal_Array1");
    public static final ParticleType HeroDarkHero_Skill1_Loop_Normal_Array1 = new ParticleType("HeroDarkHero_Skill1_Loop_Normal_Array1");
    public static final ParticleType HeroDarkHero_Skill1_Smoke = new ParticleType("HeroDarkHero_Skill1_Smoke");
    public static final ParticleType HeroDarkHero_Skill1_Start_Normal_Array1 = new ParticleType("HeroDarkHero_Skill1_Start_Normal_Array1");
    public static final ParticleType HeroDarkHero_Skill2_Ballistic_01 = new ParticleType("HeroDarkHero_Skill2_Ballistic_01");
    public static final ParticleType HeroDarkHero_Skill2_Gunfiren = new ParticleType("HeroDarkHero_Skill2_Gunfiren");
    public static final ParticleType HeroDarkHero_Skill2_Gunfiren_Hit = new ParticleType("HeroDarkHero_Skill2_Gunfiren_Hit");
    public static final ParticleType HeroDarkHero_Skill3_Gunfiren = new ParticleType("HeroDarkHero_Skill3_Gunfiren");
    public static final ParticleType HeroDarkHero_Skill3_Gunfiren_Hit = new ParticleType("HeroDarkHero_Skill3_Gunfiren_Hit");
    public static final ParticleType HeroDarkHero_Skill4_Normal_Array1 = new ParticleType("HeroDarkHero_Skill4_Normal_Array1");
    public static final ParticleType HeroDarkHero_Skill4_Normal_Array3 = new ParticleType("HeroDarkHero_Skill4_Normal_Array3");
    public static final ParticleType HeroDarkHorse_Attack = new ParticleType("HeroDarkHorse_Attack");
    public static final ParticleType HeroDarkHorse_Death = new ParticleType("HeroDarkHorse_Death");
    public static final ParticleType HeroDarkHorse_DeathBG = new ParticleType("HeroDarkHorse_DeathBG");
    public static final ParticleType HeroDarkHorse_Skill1Attack = new ParticleType("HeroDarkHorse_Skill1Attack");
    public static final ParticleType HeroDarkHorse_Skill2Attack = new ParticleType("HeroDarkHorse_Skill2Attack");
    public static final ParticleType HeroDarkHorse_Skill3GroundCircle = new ParticleType("HeroDarkHorse_Skill3GroundCircle");
    public static final ParticleType HeroDarkHorse_Skill3GroundHit = new ParticleType("HeroDarkHorse_Skill3GroundHit");
    public static final ParticleType HeroDarkHorse_Skill3ShieldPopUp = new ParticleType("HeroDarkHorse_Skill3ShieldPopUp");
    public static final ParticleType HeroDarkHorse_Skill3ShieldPopUp_ShieldOnly = new ParticleType("HeroDarkHorse_Skill3ShieldPopUp_ShieldOnly");
    public static final ParticleType HeroDeepDragon_Attack_Impact = new ParticleType("HeroDeepDragon_Attack_Impact");
    public static final ParticleType HeroDeepDragon_Attack_proj = new ParticleType("HeroDeepDragon_Attack_proj");
    public static final ParticleType HeroDeepDragon_Skill1Shield = new ParticleType("HeroDeepDragon_Skill1Shield");
    public static final ParticleType HeroDeepDragon_Skill1Shield_end = new ParticleType("HeroDeepDragon_Skill1Shield_end");
    public static final ParticleType HeroDeepDragon_Skill1Shield_loop = new ParticleType("HeroDeepDragon_Skill1Shield_loop");
    public static final ParticleType HeroDeepDragon_Skill1Shield_mid = new ParticleType("HeroDeepDragon_Skill1Shield_mid");
    public static final ParticleType HeroDeepDragon_Skill1Shield_start = new ParticleType("HeroDeepDragon_Skill1Shield_start");
    public static final ParticleType HeroDeepDragon_Skill2_Geyser = new ParticleType("HeroDeepDragon_Skill2_Geyser");
    public static final ParticleType HeroDeepDragon_Skill2_Stomp = new ParticleType("HeroDeepDragon_Skill2_Stomp");
    public static final ParticleType HeroDeepDragon_Skill3_proj = new ParticleType("HeroDeepDragon_Skill3_proj");
    public static final ParticleType HeroDeepDragon_Skill6_Effect = new ParticleType("HeroDeepDragon_Skill6_Effect");
    public static final ParticleType HeroDeepDragon_Skill6_Green_Absorb = new ParticleType("HeroDeepDragon_Skill6_Green_Absorb");
    public static final ParticleType HeroDeepDragon_Skill6_Green_Converge = new ParticleType("HeroDeepDragon_Skill6_Green_Converge");
    public static final ParticleType HeroDeepDragon_Victory = new ParticleType("HeroDeepDragon_Victory");
    public static final ParticleType HeroDemonTotem_AttackT1 = new ParticleType("HeroDemonTotem_AttackT1");
    public static final ParticleType HeroDemonTotem_AttackT2 = new ParticleType("HeroDemonTotem_AttackT2");
    public static final ParticleType HeroDemonTotem_AttackT3 = new ParticleType("HeroDemonTotem_AttackT3");
    public static final ParticleType HeroDemonTotem_AttackTAll = new ParticleType("HeroDemonTotem_AttackTAll");
    public static final ParticleType HeroDemonTotem_Death_t1 = new ParticleType("HeroDemonTotem_Death_t1");
    public static final ParticleType HeroDemonTotem_Death_t2 = new ParticleType("HeroDemonTotem_Death_t2");
    public static final ParticleType HeroDemonTotem_Death_t3 = new ParticleType("HeroDemonTotem_Death_t3");
    public static final ParticleType HeroDemonTotem_HitAll = new ParticleType("HeroDemonTotem_HitAll");
    public static final ParticleType HeroDemonTotem_HitT1 = new ParticleType("HeroDemonTotem_HitT1");
    public static final ParticleType HeroDemonTotem_HitT2 = new ParticleType("HeroDemonTotem_HitT2");
    public static final ParticleType HeroDemonTotem_HitT3 = new ParticleType("HeroDemonTotem_HitT3");
    public static final ParticleType HeroDemonTotem_Skill1_t1Impact = new ParticleType("HeroDemonTotem_Skill1_t1Impact");
    public static final ParticleType HeroDemonTotem_Skill1_t2Impact = new ParticleType("HeroDemonTotem_Skill1_t2Impact");
    public static final ParticleType HeroDemonTotem_Skill1_t3Impact = new ParticleType("HeroDemonTotem_Skill1_t3Impact");
    public static final ParticleType HeroDemonTotem_Skill2_PuffSmoke = new ParticleType("HeroDemonTotem_Skill2_PuffSmoke");
    public static final ParticleType HeroDemonTotem_Skill2_ShieldArc = new ParticleType("HeroDemonTotem_Skill2_ShieldArc");
    public static final ParticleType HeroDemonTotem_Skill2_ShieldArc_t2 = new ParticleType("HeroDemonTotem_Skill2_ShieldArc_t2");
    public static final ParticleType HeroDemonTotem_Skill2_ShieldArc_t3 = new ParticleType("HeroDemonTotem_Skill2_ShieldArc_t3");
    public static final ParticleType HeroDemonTotem_Skill3T1 = new ParticleType("HeroDemonTotem_Skill3T1");
    public static final ParticleType HeroDemonTotem_Skill3T2 = new ParticleType("HeroDemonTotem_Skill3T2");
    public static final ParticleType HeroDemonTotem_Skill3T3 = new ParticleType("HeroDemonTotem_Skill3T3");
    public static final ParticleType HeroDemonTotem_Skill5_Totem1_End_Fall = new ParticleType("HeroDemonTotem_Skill5_Totem1_End_Fall");
    public static final ParticleType HeroDemonTotem_Skill5_Totem1_Start_Pound = new ParticleType("HeroDemonTotem_Skill5_Totem1_Start_Pound");
    public static final ParticleType HeroDemonTotem_Skill5_Totem2_End_Fall = new ParticleType("HeroDemonTotem_Skill5_Totem2_End_Fall");
    public static final ParticleType HeroDemonTotem_Skill5_Totem2_Start_Pound = new ParticleType("HeroDemonTotem_Skill5_Totem2_Start_Pound");
    public static final ParticleType HeroDemonTotem_Skill5_Totem3_End_Fall = new ParticleType("HeroDemonTotem_Skill5_Totem3_End_Fall");
    public static final ParticleType HeroDemonTotem_Skill5_Totem3_Start_Pound = new ParticleType("HeroDemonTotem_Skill5_Totem3_Start_Pound");
    public static final ParticleType HeroDemonTotem_Skill6_totem1 = new ParticleType("HeroDemonTotem_Skill6_totem1");
    public static final ParticleType HeroDemonTotem_Skill6_totem2 = new ParticleType("HeroDemonTotem_Skill6_totem2");
    public static final ParticleType HeroDemonTotem_Skill6_totem3 = new ParticleType("HeroDemonTotem_Skill6_totem3");
    public static final ParticleType HeroDemonTotem_Skill6_totem_bottom1 = new ParticleType("HeroDemonTotem_Skill6_totem_bottom1");
    public static final ParticleType HeroDemonTotem_Skill6_totem_bottom2 = new ParticleType("HeroDemonTotem_Skill6_totem_bottom2");
    public static final ParticleType HeroDemonTotem_Skill6_totem_bottom3 = new ParticleType("HeroDemonTotem_Skill6_totem_bottom3");
    public static final ParticleType HeroDiggerMole_Attack_Knife = new ParticleType("HeroDiggerMole_Attack_Knife");
    public static final ParticleType HeroDiggerMole_Skill1_Claw = new ParticleType("HeroDiggerMole_Skill1_Claw");
    public static final ParticleType HeroDiggerMole_Skill1_Fist = new ParticleType("HeroDiggerMole_Skill1_Fist");
    public static final ParticleType HeroDiggerMole_Skill1_Talon = new ParticleType("HeroDiggerMole_Skill1_Talon");
    public static final ParticleType HeroDiggerMole_Skill2_Body = new ParticleType("HeroDiggerMole_Skill2_Body");
    public static final ParticleType HeroDiggerMole_Skill2_Hand = new ParticleType("HeroDiggerMole_Skill2_Hand");
    public static final ParticleType HeroDiggerMole_Skill2_Hit = new ParticleType("HeroDiggerMole_Skill2_Hit");
    public static final ParticleType HeroDiggerMole_Skill2_Root = new ParticleType("HeroDiggerMole_Skill2_Root");
    public static final ParticleType HeroDiggerMole_Skill2_Spear = new ParticleType("HeroDiggerMole_Skill2_Spear");
    public static final ParticleType HeroDiggerMole_Skill3_Body = new ParticleType("HeroDiggerMole_Skill3_Body");
    public static final ParticleType HeroDiggerMole_Skill3_Crack = new ParticleType("HeroDiggerMole_Skill3_Crack");
    public static final ParticleType HeroDiggerMole_Skill3_Fall = new ParticleType("HeroDiggerMole_Skill3_Fall");
    public static final ParticleType HeroDiggerMole_Skill3_Ground = new ParticleType("HeroDiggerMole_Skill3_Ground");
    public static final ParticleType HeroDiggerMole_Skill3_Samuel = new ParticleType("HeroDiggerMole_Skill3_Samuel");
    public static final ParticleType HeroDiggerMole_Skill4_Impact = new ParticleType("HeroDiggerMole_Skill4_Impact");
    public static final ParticleType HeroDiggerMole_Skill4_Parry = new ParticleType("HeroDiggerMole_Skill4_Parry");
    public static final ParticleType HeroDiggerMole_Skill5_Ball = new ParticleType("HeroDiggerMole_Skill5_Ball");
    public static final ParticleType HeroDoppelganger_Skill1_Blast_skin_molten = new ParticleType("HeroDoppelganger_Skill1_Blast_skin_molten");
    public static final ParticleType HeroDoppelganger_Skill2_fireball_skin_molten = new ParticleType("HeroDoppelganger_Skill2_fireball_skin_molten");
    public static final ParticleType HeroDoppelganger_Skill2_flies_skin_molten = new ParticleType("HeroDoppelganger_Skill2_flies_skin_molten");
    public static final ParticleType HeroDoppelganger_Skill2_hand_skin_molten = new ParticleType("HeroDoppelganger_Skill2_hand_skin_molten");
    public static final ParticleType HeroDoppelganger_Skill2_pillar_skin_molten = new ParticleType("HeroDoppelganger_Skill2_pillar_skin_molten");
    public static final ParticleType HeroDoppelganger_attackImpact = new ParticleType("HeroDoppelganger_attackImpact");
    public static final ParticleType HeroDoppelganger_attackImpact_skin_molten = new ParticleType("HeroDoppelganger_attackImpact_skin_molten");
    public static final ParticleType HeroDoppelganger_attack_proj = new ParticleType("HeroDoppelganger_attack_proj");
    public static final ParticleType HeroDoppelganger_death = new ParticleType("HeroDoppelganger_death");
    public static final ParticleType HeroDoppelganger_skill1_spray = new ParticleType("HeroDoppelganger_skill1_spray");
    public static final ParticleType HeroDoppelganger_skill2_push = new ParticleType("HeroDoppelganger_skill2_push");
    public static final ParticleType HeroDoppelganger_skill2_push2 = new ParticleType("HeroDoppelganger_skill2_push2");
    public static final ParticleType HeroDoppelganger_skill2_wave = new ParticleType("HeroDoppelganger_skill2_wave");
    public static final ParticleType HeroDoppelganger_skill3_StartWave = new ParticleType("HeroDoppelganger_skill3_StartWave");
    public static final ParticleType HeroDoppelganger_skill3_death = new ParticleType("HeroDoppelganger_skill3_death");
    public static final ParticleType HeroDoppelganger_skill3_death_skin_molten = new ParticleType("HeroDoppelganger_skill3_death_skin_molten");
    public static final ParticleType HeroDoppelganger_walk = new ParticleType("HeroDoppelganger_walk");
    public static final ParticleType HeroDoppelganger_walk_water = new ParticleType("HeroDoppelganger_walk_water");
    public static final ParticleType HeroDragonLady_Attack_Hit_skin_Spaceknight = new ParticleType("HeroDragonLady_Attack_Hit_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Hit_skin_Spaceknight = new ParticleType("HeroDragonLady_Hit_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Skill1_Dragon_skin_Spaceknight = new ParticleType("HeroDragonLady_Skill1_Dragon_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Skill1_Gather_skin_Spaceknight = new ParticleType("HeroDragonLady_Skill1_Gather_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Skill1_Hit_skin_Spaceknight = new ParticleType("HeroDragonLady_Skill1_Hit_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Skill1_Up_skin_Spaceknight = new ParticleType("HeroDragonLady_Skill1_Up_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Skill2_Hit_skin_Spaceknight = new ParticleType("HeroDragonLady_Skill2_Hit_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_Skill3_Palm_skin_Spaceknight = new ParticleType("HeroDragonLady_Skill3_Palm_skin_Spaceknight");
    public static final ParticleType HeroDragonLady_dragontrail = new ParticleType("HeroDragonLady_dragontrail");
    public static final ParticleType HeroDragonLady_energy_beam3 = new ParticleType("HeroDragonLady_energy_beam3");
    public static final ParticleType HeroDragonLady_energycharge = new ParticleType("HeroDragonLady_energycharge");
    public static final ParticleType HeroDragonLady_fireworks_explosion = new ParticleType("HeroDragonLady_fireworks_explosion");
    public static final ParticleType HeroDragonLady_impact = new ParticleType("HeroDragonLady_impact");
    public static final ParticleType HeroDragonLady_slap = new ParticleType("HeroDragonLady_slap");
    public static final ParticleType HeroDragonSlayer_Attack_Blink = new ParticleType("HeroDragonSlayer_Attack_Blink");
    public static final ParticleType HeroDragonSlayer_Attack_Blink_skin_Unicorn = new ParticleType("HeroDragonSlayer_Attack_Blink_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Attack_Hit = new ParticleType("HeroDragonSlayer_Attack_Hit");
    public static final ParticleType HeroDragonSlayer_Attack_Knife = new ParticleType("HeroDragonSlayer_Attack_Knife");
    public static final ParticleType HeroDragonSlayer_Attack_Knife_skin_Unicorn = new ParticleType("HeroDragonSlayer_Attack_Knife_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Attack_Swoosh = new ParticleType("HeroDragonSlayer_Attack_Swoosh");
    public static final ParticleType HeroDragonSlayer_Skill1_Hit = new ParticleType("HeroDragonSlayer_Skill1_Hit");
    public static final ParticleType HeroDragonSlayer_Skill1_Hit_skin_Unicorn = new ParticleType("HeroDragonSlayer_Skill1_Hit_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Skill1_Knife = new ParticleType("HeroDragonSlayer_Skill1_Knife");
    public static final ParticleType HeroDragonSlayer_Skill1_Knife_skin_Unicorn = new ParticleType("HeroDragonSlayer_Skill1_Knife_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Skill1_Swoosh = new ParticleType("HeroDragonSlayer_Skill1_Swoosh");
    public static final ParticleType HeroDragonSlayer_Skill2_Eye = new ParticleType("HeroDragonSlayer_Skill2_Eye");
    public static final ParticleType HeroDragonSlayer_Skill2_PauldronEyes = new ParticleType("HeroDragonSlayer_Skill2_PauldronEyes");
    public static final ParticleType HeroDragonSlayer_Skill2_Pulse = new ParticleType("HeroDragonSlayer_Skill2_Pulse");
    public static final ParticleType HeroDragonSlayer_Skill2_Start = new ParticleType("HeroDragonSlayer_Skill2_Start");
    public static final ParticleType HeroDragonSlayer_Skill2_Twinkle = new ParticleType("HeroDragonSlayer_Skill2_Twinkle");
    public static final ParticleType HeroDragonSlayer_Skill3_Assemble = new ParticleType("HeroDragonSlayer_Skill3_Assemble");
    public static final ParticleType HeroDragonSlayer_Skill3_Assemble_skin_Unicorn = new ParticleType("HeroDragonSlayer_Skill3_Assemble_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Skill3_Circle = new ParticleType("HeroDragonSlayer_Skill3_Circle");
    public static final ParticleType HeroDragonSlayer_Skill3_Circle_skin_Unicorn = new ParticleType("HeroDragonSlayer_Skill3_Circle_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Skill3_Hit = new ParticleType("HeroDragonSlayer_Skill3_Hit");
    public static final ParticleType HeroDragonSlayer_Skill3_Hit_skin_Unicorn = new ParticleType("HeroDragonSlayer_Skill3_Hit_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Skill3_Jump = new ParticleType("HeroDragonSlayer_Skill3_Jump");
    public static final ParticleType HeroDragonSlayer_Skill3_Jump_skin_Unicorn = new ParticleType("HeroDragonSlayer_Skill3_Jump_skin_Unicorn");
    public static final ParticleType HeroDragonSlayer_Skill4_Treatment = new ParticleType("HeroDragonSlayer_Skill4_Treatment");
    public static final ParticleType HeroDragzilla_Attack_BeamEye = new ParticleType("HeroDragzilla_Attack_BeamEye");
    public static final ParticleType HeroDragzilla_Attack_BeamImpact = new ParticleType("HeroDragzilla_Attack_BeamImpact");
    public static final ParticleType HeroDragzilla_Attack_BeamLaser = new ParticleType("HeroDragzilla_Attack_BeamLaser");
    public static final ParticleType HeroDragzilla_Skill1_MouthBlob = new ParticleType("HeroDragzilla_Skill1_MouthBlob");
    public static final ParticleType HeroDragzilla_Skill1_MouthBlob2 = new ParticleType("HeroDragzilla_Skill1_MouthBlob2");
    public static final ParticleType HeroDragzilla_Skill1_MouthBlob3 = new ParticleType("HeroDragzilla_Skill1_MouthBlob3");
    public static final ParticleType HeroDragzilla_Skill1_OnEye = new ParticleType("HeroDragzilla_Skill1_OnEye");
    public static final ParticleType HeroDragzilla_Skill1_YellowBlob_proj = new ParticleType("HeroDragzilla_Skill1_YellowBlob_proj");
    public static final ParticleType HeroDragzilla_Skill1_YellowGas = new ParticleType("HeroDragzilla_Skill1_YellowGas");
    public static final ParticleType HeroDragzilla_Skill1_YellowGas_Landed = new ParticleType("HeroDragzilla_Skill1_YellowGas_Landed");
    public static final ParticleType HeroDragzilla_Skill2_MouthBlob = new ParticleType("HeroDragzilla_Skill2_MouthBlob");
    public static final ParticleType HeroDragzilla_Skill2_OrangeBlob_proj = new ParticleType("HeroDragzilla_Skill2_OrangeBlob_proj");
    public static final ParticleType HeroDragzilla_Skill2_OrangeGas = new ParticleType("HeroDragzilla_Skill2_OrangeGas");
    public static final ParticleType HeroDragzilla_Skill2_OrangeGas_Landed = new ParticleType("HeroDragzilla_Skill2_OrangeGas_Landed");
    public static final ParticleType HeroDragzilla_Skill5_Glow = new ParticleType("HeroDragzilla_Skill5_Glow");
    public static final ParticleType HeroDragzilla_Victory_smoke = new ParticleType("HeroDragzilla_Victory_smoke");
    public static final ParticleType HeroDragzilla_Victory_smokeBG = new ParticleType("HeroDragzilla_Victory_smokeBG");
    public static final ParticleType HeroDruidinatrix_AttackGlow = new ParticleType("HeroDruidinatrix_AttackGlow");
    public static final ParticleType HeroDruidinatrix_AttackWhip = new ParticleType("HeroDruidinatrix_AttackWhip");
    public static final ParticleType HeroDruidinatrix_Attack_Glow = new ParticleType("HeroDruidinatrix_Attack_Glow");
    public static final ParticleType HeroDruidinatrix_Attack_Hit = new ParticleType("HeroDruidinatrix_Attack_Hit");
    public static final ParticleType HeroDruidinatrix_Attack_Whip = new ParticleType("HeroDruidinatrix_Attack_Whip");
    public static final ParticleType HeroDruidinatrix_BackwardWalk_Glow = new ParticleType("HeroDruidinatrix_BackwardWalk_Glow");
    public static final ParticleType HeroDruidinatrix_CloneGlow = new ParticleType("HeroDruidinatrix_CloneGlow");
    public static final ParticleType HeroDruidinatrix_Clone_Glow = new ParticleType("HeroDruidinatrix_Clone_Glow");
    public static final ParticleType HeroDruidinatrix_Clone_Petal = new ParticleType("HeroDruidinatrix_Clone_Petal");
    public static final ParticleType HeroDruidinatrix_Death = new ParticleType("HeroDruidinatrix_Death");
    public static final ParticleType HeroDruidinatrix_Death_Dissipation = new ParticleType("HeroDruidinatrix_Death_Dissipation");
    public static final ParticleType HeroDruidinatrix_Hit = new ParticleType("HeroDruidinatrix_Hit");
    public static final ParticleType HeroDruidinatrix_Hit_Gethit = new ParticleType("HeroDruidinatrix_Hit_Gethit");
    public static final ParticleType HeroDruidinatrix_Idle = new ParticleType("HeroDruidinatrix_Idle");
    public static final ParticleType HeroDruidinatrix_Skill1Darts = new ParticleType("HeroDruidinatrix_Skill1Darts");
    public static final ParticleType HeroDruidinatrix_Skill1DartsHand = new ParticleType("HeroDruidinatrix_Skill1DartsHand");
    public static final ParticleType HeroDruidinatrix_Skill1EnergyBar_drain = new ParticleType("HeroDruidinatrix_Skill1EnergyBar_drain");
    public static final ParticleType HeroDruidinatrix_Skill1GlowBody = new ParticleType("HeroDruidinatrix_Skill1GlowBody");
    public static final ParticleType HeroDruidinatrix_Skill1Hit = new ParticleType("HeroDruidinatrix_Skill1Hit");
    public static final ParticleType HeroDruidinatrix_Skill1_Darts = new ParticleType("HeroDruidinatrix_Skill1_Darts");
    public static final ParticleType HeroDruidinatrix_Skill1_DartsHand = new ParticleType("HeroDruidinatrix_Skill1_DartsHand");
    public static final ParticleType HeroDruidinatrix_Skill1_GlowBody = new ParticleType("HeroDruidinatrix_Skill1_GlowBody ");
    public static final ParticleType HeroDruidinatrix_Skill1_GlowEyeLF = new ParticleType("HeroDruidinatrix_Skill1_GlowEyeLF");
    public static final ParticleType HeroDruidinatrix_Skill1_GlowEyeRT = new ParticleType("HeroDruidinatrix_Skill1_GlowEyeRT");
    public static final ParticleType HeroDruidinatrix_Skill2Hit = new ParticleType("HeroDruidinatrix_Skill2Hit");
    public static final ParticleType HeroDruidinatrix_Skill2Whip = new ParticleType("HeroDruidinatrix_Skill2Whip");
    public static final ParticleType HeroDruidinatrix_Skill2_BodyGlow = new ParticleType("HeroDruidinatrix_Skill2_BodyGlow");
    public static final ParticleType HeroDruidinatrix_Skill2_HandGlow = new ParticleType("HeroDruidinatrix_Skill2_HandGlow");
    public static final ParticleType HeroDruidinatrix_Skill2_Hit = new ParticleType("HeroDruidinatrix_Skill2_Hit");
    public static final ParticleType HeroDruidinatrix_Skill2_Whip = new ParticleType("HeroDruidinatrix_Skill2_Whip");
    public static final ParticleType HeroDruidinatrix_Skill3Energy_Proj = new ParticleType("HeroDruidinatrix_Skill3Energy_Proj");
    public static final ParticleType HeroDruidinatrix_Skill3HandReceive = new ParticleType("HeroDruidinatrix_Skill3HandReceive");
    public static final ParticleType HeroDruidinatrix_Skill3HandRelease = new ParticleType("HeroDruidinatrix_Skill3HandRelease");
    public static final ParticleType HeroDruidinatrix_Skill3_BodyGlow = new ParticleType("HeroDruidinatrix_Skill3_BodyGlow");
    public static final ParticleType HeroDruidinatrix_Skill3_Cohesion = new ParticleType("HeroDruidinatrix_Skill3_Cohesion");
    public static final ParticleType HeroDruidinatrix_Skill3_HandRelease = new ParticleType("HeroDruidinatrix_Skill3_HandRelease");
    public static final ParticleType HeroDruidinatrix_VictoryWhip = new ParticleType("HeroDruidinatrix_VictoryWhip");
    public static final ParticleType HeroDruidinatrix_Victory_Fireworks = new ParticleType("HeroDruidinatrix_Victory_Fireworks");
    public static final ParticleType HeroDruidinatrix_Victory_Whip = new ParticleType("HeroDruidinatrix_Victory_Whip");
    public static final ParticleType HeroDungeonMan_Attack_Accuse_skin_mastery = new ParticleType("HeroDungeonMan_Attack_Accuse_skin_mastery");
    public static final ParticleType HeroDungeonMan_Death_Roll_skin_mastery = new ParticleType("HeroDungeonMan_Death_Roll_skin_mastery");
    public static final ParticleType HeroDungeonMan_Death_trap_char = new ParticleType("HeroDungeonMan_Death_trap_char");
    public static final ParticleType HeroDungeonMan_Death_trapdoors = new ParticleType("HeroDungeonMan_Death_trapdoors");
    public static final ParticleType HeroDungeonMan_Door_Fog_skin_mastery = new ParticleType("HeroDungeonMan_Door_Fog_skin_mastery");
    public static final ParticleType HeroDungeonMan_Door_Shockwave_skin_mastery = new ParticleType("HeroDungeonMan_Door_Shockwave_skin_mastery");
    public static final ParticleType HeroDungeonMan_Door_Trap_skin_mastery = new ParticleType("HeroDungeonMan_Door_Trap_skin_mastery");
    public static final ParticleType HeroDungeonMan_Hit_Injured_skin_mastery = new ParticleType("HeroDungeonMan_Hit_Injured_skin_mastery");
    public static final ParticleType HeroDungeonMan_Skill1_Flight_skin_mastery = new ParticleType("HeroDungeonMan_Skill1_Flight_skin_mastery");
    public static final ParticleType HeroDungeonMan_Skill1_Hit_skin_mastery = new ParticleType("HeroDungeonMan_Skill1_Hit_skin_mastery");
    public static final ParticleType HeroDungeonMan_attack_D6 = new ParticleType("HeroDungeonMan_attack_D6");
    public static final ParticleType HeroDungeonMan_attack_D6_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_attack_D6_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill1_D20 = new ParticleType("HeroDungeonMan_skill1_D20");
    public static final ParticleType HeroDungeonMan_skill1_D20_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill1_D20_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill1_boulderDie = new ParticleType("HeroDungeonMan_skill1_boulderDie");
    public static final ParticleType HeroDungeonMan_skill1_boulderDie_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill1_boulderDie_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill1_die_hits = new ParticleType("HeroDungeonMan_skill1_die_hits");
    public static final ParticleType HeroDungeonMan_skill1_die_hits_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill1_die_hits_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill2_rat_running = new ParticleType("HeroDungeonMan_skill2_rat_running");
    public static final ParticleType HeroDungeonMan_skill2_rat_running_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill2_rat_running_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill3_DM_start = new ParticleType("HeroDungeonMan_skill3_DM_start");
    public static final ParticleType HeroDungeonMan_skill3_DM_start_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill3_DM_start_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill3_Start_skin_mastery = new ParticleType("HeroDungeonMan_skill3_Start_skin_mastery");
    public static final ParticleType HeroDungeonMan_skill3_shockwave = new ParticleType("HeroDungeonMan_skill3_shockwave");
    public static final ParticleType HeroDungeonMan_skill3_shockwave_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill3_shockwave_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill3_trap_char = new ParticleType("HeroDungeonMan_skill3_trap_char");
    public static final ParticleType HeroDungeonMan_skill3_trap_char_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill3_trap_char_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill3_trapdoors = new ParticleType("HeroDungeonMan_skill3_trapdoors");
    public static final ParticleType HeroDungeonMan_skill3_trapdoors_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill3_trapdoors_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill4_boltSmoke_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill4_boltSmoke_skin_dungeon_man_mecha");
    public static final ParticleType HeroDungeonMan_skill4_smokeBurstAppear_skin_dungeon_man_mecha = new ParticleType("HeroDungeonMan_skill4_smokeBurstAppear_skin_dungeon_man_mecha");
    public static final ParticleType HeroDwarvenArcher_Attack_ArrowHit = new ParticleType("HeroDwarvenArcher_Attack_ArrowHit");
    public static final ParticleType HeroDwarvenArcher_Attack_ArrowVapor = new ParticleType("HeroDwarvenArcher_Attack_ArrowVapor");
    public static final ParticleType HeroDwarvenArcher_Skill1_ArrowRay = new ParticleType("HeroDwarvenArcher_Skill1_ArrowRay");
    public static final ParticleType HeroDwarvenArcher_Skill1_FeetSwirl = new ParticleType("HeroDwarvenArcher_Skill1_FeetSwirl");
    public static final ParticleType HeroDwarvenArcher_Skill1_GreenRay = new ParticleType("HeroDwarvenArcher_Skill1_GreenRay");
    public static final ParticleType HeroDwarvenArcher_Skill2_ArrowGreen = new ParticleType("HeroDwarvenArcher_Skill2_ArrowGreen");
    public static final ParticleType HeroDwarvenArcher_Skill2_Hit = new ParticleType("HeroDwarvenArcher_Skill2_Hit");
    public static final ParticleType HeroDwarvenArcher_Skill3_Feetbuff = new ParticleType("HeroDwarvenArcher_Skill3_Feetbuff");
    public static final ParticleType HeroDwarvenArcher_Skill3_GlowShape = new ParticleType("HeroDwarvenArcher_Skill3_GlowShape");
    public static final ParticleType HeroDwarvenArcher_Victory_Dust = new ParticleType("HeroDwarvenArcher_Victory_Dust");
    public static final ParticleType HeroElectroYeti_ElectricityRing = new ParticleType("HeroElectroYeti_ElectricityRing");
    public static final ParticleType HeroElectroYeti_Verlightning = new ParticleType("HeroElectroYeti_Verlightning");
    public static final ParticleType HeroElectroYeti_cloudlightning = new ParticleType("HeroElectroYeti_cloudlightning");
    public static final ParticleType HeroElectroYeti_impact = new ParticleType("HeroElectroYeti_impact");
    public static final ParticleType HeroElectroYeti_lightning_energyhorn = new ParticleType("HeroElectroYeti_lightning_energyhorn");
    public static final ParticleType HeroElectroYeti_lightning_finger = new ParticleType("HeroElectroYeti_lightning_finger");
    public static final ParticleType HeroElectroYeti_lightning_ground_burst = new ParticleType("HeroElectroYeti_lightning_ground_burst");
    public static final ParticleType HeroElectroYeti_lightning_hit_projectile2 = new ParticleType("HeroElectroYeti_lightning_hit_projectile2");
    public static final ParticleType HeroElectroYeti_lightning_leg = new ParticleType("HeroElectroYeti_lightning_leg");
    public static final ParticleType HeroEternalEnchanter_Attack_Hit_Issue = new ParticleType("HeroEternalEnchanter_Attack_Hit_Issue");
    public static final ParticleType HeroEternalEnchanter_Attack_Launch_Issue = new ParticleType("HeroEternalEnchanter_Attack_Launch_Issue");
    public static final ParticleType HeroEternalEnchanter_Attack_Missile_Issue = new ParticleType("HeroEternalEnchanter_Attack_Missile_Issue");
    public static final ParticleType HeroEternalEnchanter_Death_Blast = new ParticleType("HeroEternalEnchanter_Death_Blast");
    public static final ParticleType HeroEternalEnchanter_Death_Twinkle = new ParticleType("HeroEternalEnchanter_Death_Twinkle");
    public static final ParticleType HeroEternalEnchanter_Skill1_End_Complete1 = new ParticleType("HeroEternalEnchanter_Skill1_End_Complete1");
    public static final ParticleType HeroEternalEnchanter_Skill1_Hit = new ParticleType("HeroEternalEnchanter_Skill1_Hit");
    public static final ParticleType HeroEternalEnchanter_Skill1_Loop_Accuse = new ParticleType("HeroEternalEnchanter_Skill1_Loop_Accuse");
    public static final ParticleType HeroEternalEnchanter_Skill1_Start_Circle = new ParticleType("HeroEternalEnchanter_Skill1_Start_Circle");
    public static final ParticleType HeroEternalEnchanter_Skill2_Assemble = new ParticleType("HeroEternalEnchanter_Skill2_Assemble");
    public static final ParticleType HeroEternalEnchanter_Skill2_Bolt = new ParticleType("HeroEternalEnchanter_Skill2_Bolt");
    public static final ParticleType HeroEternalEnchanter_Skill2_Hit = new ParticleType("HeroEternalEnchanter_Skill2_Hit");
    public static final ParticleType HeroEternalEnchanter_Skill2_Source = new ParticleType("HeroEternalEnchanter_Skill2_Source");
    public static final ParticleType HeroEternalEnchanter_Skill3_End_Shield = new ParticleType("HeroEternalEnchanter_Skill3_End_Shield");
    public static final ParticleType HeroEternalEnchanter_Skill3_Loop_Shield = new ParticleType("HeroEternalEnchanter_Skill3_Loop_Shield");
    public static final ParticleType HeroEternalEnchanter_Skill3_Loop_Sparkle = new ParticleType("HeroEternalEnchanter_Skill3_Loop_Sparkle");
    public static final ParticleType HeroEternalEnchanter_Skill3_Start_Shield = new ParticleType("HeroEternalEnchanter_Skill3_Start_Shield");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt = new ParticleType("HeroEternalEnchanter_Skill5_Bolt");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt02 = new ParticleType("HeroEternalEnchanter_Skill5_Bolt02");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt03 = new ParticleType("HeroEternalEnchanter_Skill5_Bolt03");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt04 = new ParticleType("HeroEternalEnchanter_Skill5_Bolt04");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt05 = new ParticleType("HeroEternalEnchanter_Skill5_Bolt05");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt06 = new ParticleType("HeroEternalEnchanter_Skill5_Bolt06");
    public static final ParticleType HeroEternalEnchanter_Skill5_Bolt07 = new ParticleType("HeroEternalEnchanter_Skill5_Bolt07");
    public static final ParticleType HeroFairyDragon_Attack_Crit_skin_mecha = new ParticleType("HeroFairyDragon_Attack_Crit_skin_mecha");
    public static final ParticleType HeroFairyDragon_BlueBallCharge = new ParticleType("HeroFairyDragon_BlueBallCharge");
    public static final ParticleType HeroFairyDragon_BlueBallEnergy = new ParticleType("HeroFairyDragon_BlueBallEnergy");
    public static final ParticleType HeroFairyDragon_BlueBallExplode = new ParticleType("HeroFairyDragon_BlueBallExplode");
    public static final ParticleType HeroFairyDragon_BlueBallExplode_skin_mecha = new ParticleType("HeroFairyDragon_BlueBallExplode_skin_mecha");
    public static final ParticleType HeroFairyDragon_BlueBallPuff = new ParticleType("HeroFairyDragon_BlueBallPuff");
    public static final ParticleType HeroFairyDragon_LightBeamBallOnly = new ParticleType("HeroFairyDragon_LightBeamBallOnly");
    public static final ParticleType HeroFairyDragon_LightBeamBallOnly_skin_mecha = new ParticleType("HeroFairyDragon_LightBeamBallOnly_skin_mecha");
    public static final ParticleType HeroFairyDragon_LightBeamFlashOnly = new ParticleType("HeroFairyDragon_LightBeamFlashOnly");
    public static final ParticleType HeroFairyDragon_LightBeamOnly = new ParticleType("HeroFairyDragon_LightBeamOnly");
    public static final ParticleType HeroFairyDragon_RedBallEnergy = new ParticleType("HeroFairyDragon_RedBallEnergy");
    public static final ParticleType HeroFairyDragon_RedBallExplode = new ParticleType("HeroFairyDragon_RedBallExplode");
    public static final ParticleType HeroFairyDragon_RedBallExplode_skin_mecha = new ParticleType("HeroFairyDragon_RedBallExplode_skin_mecha");
    public static final ParticleType HeroFairyDragon_RedBallPuff = new ParticleType("HeroFairyDragon_RedBallPuff");
    public static final ParticleType HeroFairyDragon_Ripple = new ParticleType("HeroFairyDragon_Ripple");
    public static final ParticleType HeroFairyDragon_RippleGround = new ParticleType("HeroFairyDragon_RippleGround");
    public static final ParticleType HeroFairyDragon_Skill1_End_skin_mecha = new ParticleType("HeroFairyDragon_Skill1_End_skin_mecha");
    public static final ParticleType HeroFairyDragon_Skill1_Start_skin_mecha = new ParticleType("HeroFairyDragon_Skill1_Start_skin_mecha");
    public static final ParticleType HeroFairyDragon_Skill2_Ball_skin_mecha = new ParticleType("HeroFairyDragon_Skill2_Ball_skin_mecha");
    public static final ParticleType HeroFairyDragon_Skill2_Twinkle_skin_mecha = new ParticleType("HeroFairyDragon_Skill2_Twinkle_skin_mecha");
    public static final ParticleType HeroFairyDragon_Skill3_Thunder_skin_mecha = new ParticleType("HeroFairyDragon_Skill3_Thunder_skin_mecha");
    public static final ParticleType HeroFairyDragon_ThreeBeam = new ParticleType("HeroFairyDragon_ThreeBeam");
    public static final ParticleType HeroFairyDragon_Victory_Cirque_skin_mecha = new ParticleType("HeroFairyDragon_Victory_Cirque_skin_mecha");
    public static final ParticleType HeroFaithHealer_ProjectileBook_glow = new ParticleType("HeroFaithHealer_ProjectileBook_glow");
    public static final ParticleType HeroFaithHealer_ProjectileBook_glow_skin_cthulu = new ParticleType("HeroFaithHealer_ProjectileBook_glow_skin_cthulu");
    public static final ParticleType HeroFaithHealer_circle_healonly = new ParticleType("HeroFaithHealer_circle_healonly");
    public static final ParticleType HeroFaithHealer_circle_healonly_skin_cthulu = new ParticleType("HeroFaithHealer_circle_healonly_skin_cthulu");
    public static final ParticleType HeroFaithHealer_circle_only = new ParticleType("HeroFaithHealer_circle_only");
    public static final ParticleType HeroFaithHealer_circle_only_skin_cthulu = new ParticleType("HeroFaithHealer_circle_only_skin_cthulu");
    public static final ParticleType HeroFaithHealer_dusttwirl = new ParticleType("HeroFaithHealer_dusttwirl");
    public static final ParticleType HeroFaithHealer_dusttwirl_skin_cthulu = new ParticleType("HeroFaithHealer_dusttwirl_skin_cthulu");
    public static final ParticleType HeroFaithHealer_impactbook = new ParticleType("HeroFaithHealer_impactbook");
    public static final ParticleType HeroFaithHealer_impactbook_skin_cthulu = new ParticleType("HeroFaithHealer_impactbook_skin_cthulu");
    public static final ParticleType HeroFaithHealer_msmoke = new ParticleType("HeroFaithHealer_msmoke");
    public static final ParticleType HeroFaithHealer_msmoke_skin_cthulu = new ParticleType("HeroFaithHealer_msmoke_skin_cthulu");
    public static final ParticleType HeroFaithHealer_pastelcharms = new ParticleType("HeroFaithHealer_pastelcharms");
    public static final ParticleType HeroFaithHealer_pastelcharms_skin_cthulu = new ParticleType("HeroFaithHealer_pastelcharms_skin_cthulu");
    public static final ParticleType HeroForgottenDragon_Attack_Hit = new ParticleType("HeroForgottenDragon_Attack_Hit");
    public static final ParticleType HeroForgottenDragon_Attack_Light = new ParticleType("HeroForgottenDragon_Attack_Light");
    public static final ParticleType HeroForgottenDragon_Attack_Torrent = new ParticleType("HeroForgottenDragon_Attack_Torrent");
    public static final ParticleType HeroForgottenDragon_Death_Float = new ParticleType("HeroForgottenDragon_Death_Float");
    public static final ParticleType HeroForgottenDragon_Hit_Gethit = new ParticleType("HeroForgottenDragon_Hit_Gethit");
    public static final ParticleType HeroForgottenDragon_Skill1_Glow = new ParticleType("HeroForgottenDragon_Skill1_Glow");
    public static final ParticleType HeroForgottenDragon_Skill1_Ground = new ParticleType("HeroForgottenDragon_Skill1_Ground");
    public static final ParticleType HeroForgottenDragon_Skill1_Mouth = new ParticleType("HeroForgottenDragon_Skill1_Mouth");
    public static final ParticleType HeroForgottenDragon_Skill1_Wind = new ParticleType("HeroForgottenDragon_Skill1_Wind");
    public static final ParticleType HeroForgottenDragon_Skill2_Blink = new ParticleType("HeroForgottenDragon_Skill2_Blink");
    public static final ParticleType HeroForgottenDragon_Skill2_Wind = new ParticleType("HeroForgottenDragon_Skill2_Wind");
    public static final ParticleType HeroForgottenDragon_Skill3_Treatment = new ParticleType("HeroForgottenDragon_Skill3_Treatment");
    public static final ParticleType HeroForgottenDragon_Skill4_Sunshine = new ParticleType("HeroForgottenDragon_Skill4_Sunshine");
    public static final ParticleType HeroForgottenDragon_Walk_Leaf = new ParticleType("HeroForgottenDragon_Walk_Leaf");
    public static final ParticleType HeroFrostGiant_AttackExplode = new ParticleType("HeroFrostGiant_AttackExplode");
    public static final ParticleType HeroFrostGiant_AttackSBall_Proj = new ParticleType("HeroFrostGiant_AttackSBall_Proj");
    public static final ParticleType HeroFrostGiant_DeathExplode = new ParticleType("HeroFrostGiant_DeathExplode");
    public static final ParticleType HeroFrostGiant_IdleAir = new ParticleType("HeroFrostGiant_IdleAir");
    public static final ParticleType HeroFrostGiant_Skill1Gas = new ParticleType("HeroFrostGiant_Skill1Gas");
    public static final ParticleType HeroFrostGiant_Skill1Hit = new ParticleType("HeroFrostGiant_Skill1Hit");
    public static final ParticleType HeroFrostGiant_Skill1SideSplash = new ParticleType("HeroFrostGiant_Skill1SideSplash");
    public static final ParticleType HeroFrostGiant_Skill1SnowBreeze_Proj = new ParticleType("HeroFrostGiant_Skill1SnowBreeze_Proj");
    public static final ParticleType HeroFrostGiant_Skill2IcecleHit = new ParticleType("HeroFrostGiant_Skill2IcecleHit");
    public static final ParticleType HeroFrostGiant_Skill2Icecle_Proj = new ParticleType("HeroFrostGiant_Skill2Icecle_Proj");
    public static final ParticleType HeroFrostGiant_Skill3BlastAir = new ParticleType("HeroFrostGiant_Skill3BlastAir");
    public static final ParticleType HeroFrostGiant_Skill3FrostGround = new ParticleType("HeroFrostGiant_Skill3FrostGround");
    public static final ParticleType HeroFrostGiant_Skill3IntakeAir = new ParticleType("HeroFrostGiant_Skill3IntakeAir");
    public static final ParticleType HeroFrostGiant_WalkAir = new ParticleType("HeroFrostGiant_WalkAir");
    public static final ParticleType HeroGenie_Attack = new ParticleType("HeroGenie_Attack");
    public static final ParticleType HeroGenie_Attack_cowglow = new ParticleType("HeroGenie_Attack_cowglow");
    public static final ParticleType HeroGenie_Death = new ParticleType("HeroGenie_Death");
    public static final ParticleType HeroGenie_Skill1_Impact = new ParticleType("HeroGenie_Skill1_Impact");
    public static final ParticleType HeroGenie_Skill1_cannon = new ParticleType("HeroGenie_Skill1_cannon");
    public static final ParticleType HeroGenie_Skill2_SmokeLamp = new ParticleType("HeroGenie_Skill2_SmokeLamp");
    public static final ParticleType HeroGenie_Skill2_SmokeLamp_out = new ParticleType("HeroGenie_Skill2_SmokeLamp_out");
    public static final ParticleType HeroGenie_Skill3_Impact = new ParticleType("HeroGenie_Skill3_Impact");
    public static final ParticleType HeroGenie_Skill3_goatglow = new ParticleType("HeroGenie_Skill3_goatglow");
    public static final ParticleType HeroGenie_Skill3_hand = new ParticleType("HeroGenie_Skill3_hand");
    public static final ParticleType HeroGenie_Skill4_Horn = new ParticleType("HeroGenie_Skill4_Horn");
    public static final ParticleType HeroGenie_Skill5_End = new ParticleType("HeroGenie_Skill5_End");
    public static final ParticleType HeroGenie_Skill5_End2 = new ParticleType("HeroGenie_Skill5_End2");
    public static final ParticleType HeroGenie_Skill5_End3 = new ParticleType("HeroGenie_Skill5_End3");
    public static final ParticleType HeroGenie_Skill5_End4 = new ParticleType("HeroGenie_Skill5_End4");
    public static final ParticleType HeroGenie_Skill5_Loop = new ParticleType("HeroGenie_Skill5_Loop");
    public static final ParticleType HeroGenie_Skill5_Loop2 = new ParticleType("HeroGenie_Skill5_Loop2");
    public static final ParticleType HeroGenie_Skill5_Loop3 = new ParticleType("HeroGenie_Skill5_Loop3");
    public static final ParticleType HeroGenie_Skill5_Loop4 = new ParticleType("HeroGenie_Skill5_Loop4");
    public static final ParticleType HeroGenie_Skill5_Puff = new ParticleType("HeroGenie_Skill5_Puff");
    public static final ParticleType HeroGenie_Skill5_Smoke = new ParticleType("HeroGenie_Skill5_Smoke");
    public static final ParticleType HeroGenie_Skill5_Start = new ParticleType("HeroGenie_Skill5_Start");
    public static final ParticleType HeroGrandHuntress_Skill4_quagmire = new ParticleType("HeroGrandHuntress_Skill4_quagmire");
    public static final ParticleType HeroGrandHuntress_attack1 = new ParticleType("HeroGrandHuntress_attack1");
    public static final ParticleType HeroGrandHuntress_skill1_attack = new ParticleType("HeroGrandHuntress_skill1_attack");
    public static final ParticleType HeroGrandHuntress_skill1_barrage = new ParticleType("HeroGrandHuntress_skill1_barrage");
    public static final ParticleType HeroGrandHuntress_skill1_bow = new ParticleType("HeroGrandHuntress_skill1_bow");
    public static final ParticleType HeroGrandHuntress_skill1_focusenergy = new ParticleType("HeroGrandHuntress_skill1_focusenergy");
    public static final ParticleType HeroGrandHuntress_skill1_hitspark = new ParticleType("HeroGrandHuntress_skill1_hitspark");
    public static final ParticleType HeroGrandHuntress_skill2_inhale = new ParticleType("HeroGrandHuntress_skill2_inhale");
    public static final ParticleType HeroGrandHuntress_skill2_roar = new ParticleType("HeroGrandHuntress_skill2_roar");
    public static final ParticleType HeroGrandHuntress_skill2_stomp = new ParticleType("HeroGrandHuntress_skill2_stomp");
    public static final ParticleType HeroGrandHuntress_skill3_focusenergy = new ParticleType("HeroGrandHuntress_skill3_focusenergy");
    public static final ParticleType HeroGrandHuntress_skill3_hitring = new ParticleType("HeroGrandHuntress_skill3_hitring");
    public static final ParticleType HeroGrandHuntress_skill3_hitsmoke = new ParticleType("HeroGrandHuntress_skill3_hitsmoke");
    public static final ParticleType HeroGrandHuntress_skill3_hitspark = new ParticleType("HeroGrandHuntress_skill3_hitspark");
    public static final ParticleType HeroGrandHuntress_skill3_trail = new ParticleType("HeroGrandHuntress_skill3_trail");
    public static final ParticleType HeroGreedyDragon_Attack_Tooth = new ParticleType("HeroGreedyDragon_Attack_Tooth");
    public static final ParticleType HeroGreedyDragon_Skill1_End_Fire = new ParticleType("HeroGreedyDragon_Skill1_End_Fire");
    public static final ParticleType HeroGreedyDragon_Skill1_Fire = new ParticleType("HeroGreedyDragon_Skill1_Fire");
    public static final ParticleType HeroGreedyDragon_Skill1_Start_Fire = new ParticleType("HeroGreedyDragon_Skill1_Start_Fire");
    public static final ParticleType HeroGreedyDragon_Skill2_Ground = new ParticleType("HeroGreedyDragon_Skill2_Ground");
    public static final ParticleType HeroGreedyDragon_Skill2_Smoke = new ParticleType("HeroGreedyDragon_Skill2_Smoke");
    public static final ParticleType HeroGreedyDragon_Skill3_Chicken = new ParticleType("HeroGreedyDragon_Skill3_Chicken");
    public static final ParticleType HeroGreedyDragon_Skill4_Flashlight = new ParticleType("HeroGreedyDragon_Skill4_Flashlight");
    public static final ParticleType HeroGreedyDragon_Victory_Fire = new ParticleType("HeroGreedyDragon_Victory_Fire");
    public static final ParticleType HeroGroovyDruid_AttackBee_Proj = new ParticleType("HeroGroovyDruid_AttackBee_Proj");
    public static final ParticleType HeroGroovyDruid_AttackHand = new ParticleType("HeroGroovyDruid_AttackHand");
    public static final ParticleType HeroGroovyDruid_AttackHandRelease = new ParticleType("HeroGroovyDruid_AttackHandRelease");
    public static final ParticleType HeroGroovyDruid_AttackHandRelease_skin_disco = new ParticleType("HeroGroovyDruid_AttackHandRelease_skin_disco");
    public static final ParticleType HeroGroovyDruid_AttackHand_skin_disco = new ParticleType("HeroGroovyDruid_AttackHand_skin_disco");
    public static final ParticleType HeroGroovyDruid_AttackImpact = new ParticleType("HeroGroovyDruid_AttackImpact");
    public static final ParticleType HeroGroovyDruid_Ball_skin_disco = new ParticleType("HeroGroovyDruid_Ball_skin_disco");
    public static final ParticleType HeroGroovyDruid_Blink_skin_disco = new ParticleType("HeroGroovyDruid_Blink_skin_disco");
    public static final ParticleType HeroGroovyDruid_DeathDust = new ParticleType("HeroGroovyDruid_DeathDust");
    public static final ParticleType HeroGroovyDruid_DeathDust_skin_disco = new ParticleType("HeroGroovyDruid_DeathDust_skin_disco");
    public static final ParticleType HeroGroovyDruid_Ears_skin_disco = new ParticleType("HeroGroovyDruid_Ears_skin_disco");
    public static final ParticleType HeroGroovyDruid_Flight_skin_disco = new ParticleType("HeroGroovyDruid_Flight_skin_disco");
    public static final ParticleType HeroGroovyDruid_Flower_skin_disco = new ParticleType("HeroGroovyDruid_Flower_skin_disco");
    public static final ParticleType HeroGroovyDruid_HedgehogSpike_Proj = new ParticleType("HeroGroovyDruid_HedgehogSpike_Proj");
    public static final ParticleType HeroGroovyDruid_Honour_skin_disco = new ParticleType("HeroGroovyDruid_Honour_skin_disco");
    public static final ParticleType HeroGroovyDruid_Impact_skin_disco = new ParticleType("HeroGroovyDruid_Impact_skin_disco");
    public static final ParticleType HeroGroovyDruid_Injured_skin_disco = new ParticleType("HeroGroovyDruid_Injured_skin_disco");
    public static final ParticleType HeroGroovyDruid_LegendSmoke = new ParticleType("HeroGroovyDruid_LegendSmoke");
    public static final ParticleType HeroGroovyDruid_Line_skin_disco = new ParticleType("HeroGroovyDruid_Line_skin_disco");
    public static final ParticleType HeroGroovyDruid_Lug_skin_disco = new ParticleType("HeroGroovyDruid_Lug_skin_disco");
    public static final ParticleType HeroGroovyDruid_Path_skin_disco = new ParticleType("HeroGroovyDruid_Path_skin_disco");
    public static final ParticleType HeroGroovyDruid_Radiance_skin_disco = new ParticleType("HeroGroovyDruid_Radiance_skin_disco");
    public static final ParticleType HeroGroovyDruid_Seedling_skin_disco = new ParticleType("HeroGroovyDruid_Seedling_skin_disco");
    public static final ParticleType HeroGroovyDruid_Shine2_skin_disco = new ParticleType("HeroGroovyDruid_Shine2_skin_disco");
    public static final ParticleType HeroGroovyDruid_Shine3_skin_disco = new ParticleType("HeroGroovyDruid_Shine3_skin_disco");
    public static final ParticleType HeroGroovyDruid_Shine4_skin_disco = new ParticleType("HeroGroovyDruid_Shine4_skin_disco");
    public static final ParticleType HeroGroovyDruid_Shine5_skin_disco = new ParticleType("HeroGroovyDruid_Shine5_skin_disco");
    public static final ParticleType HeroGroovyDruid_Shine6_skin_disco = new ParticleType("HeroGroovyDruid_Shine6_skin_disco");
    public static final ParticleType HeroGroovyDruid_Shine_skin_disco = new ParticleType("HeroGroovyDruid_Shine_skin_disco");
    public static final ParticleType HeroGroovyDruid_Skill1Hand = new ParticleType("HeroGroovyDruid_Skill1Hand");
    public static final ParticleType HeroGroovyDruid_Skill1Impact = new ParticleType("HeroGroovyDruid_Skill1Impact");
    public static final ParticleType HeroGroovyDruid_Skill2BeeCast = new ParticleType("HeroGroovyDruid_Skill2BeeCast");
    public static final ParticleType HeroGroovyDruid_Skill2BeeSwarm_Proj = new ParticleType("HeroGroovyDruid_Skill2BeeSwarm_Proj");
    public static final ParticleType HeroGroovyDruid_Skill3MagicalArmor = new ParticleType("HeroGroovyDruid_Skill3MagicalArmor");
    public static final ParticleType HeroGroovyDruid_Skill3MagicalCast = new ParticleType("HeroGroovyDruid_Skill3MagicalCast");
    public static final ParticleType HeroGroovyDruid_Staff_skin_disco = new ParticleType("HeroGroovyDruid_Staff_skin_disco");
    public static final ParticleType HeroGroovyDruid_Streamer_skin_disco = new ParticleType("HeroGroovyDruid_Streamer_skin_disco");
    public static final ParticleType HeroGroovyDruid_Swing_skin_disco = new ParticleType("HeroGroovyDruid_Swing_skin_disco");
    public static final ParticleType HeroGroovyDruid_Tailing_skin_disco = new ParticleType("HeroGroovyDruid_Tailing_skin_disco");
    public static final ParticleType HeroGroovyDruid_WalkFlower = new ParticleType("HeroGroovyDruid_WalkFlower");
    public static final ParticleType HeroKaraokeKing_Attack_Flight = new ParticleType("HeroKaraokeKing_Attack_Flight");
    public static final ParticleType HeroKaraokeKing_Attack_Flight_Other = new ParticleType("HeroKaraokeKing_Attack_Flight_Other");
    public static final ParticleType HeroKaraokeKing_Attack_Hit = new ParticleType("HeroKaraokeKing_Attack_Hit");
    public static final ParticleType HeroKaraokeKing_Attack_Hit_Other = new ParticleType("HeroKaraokeKing_Attack_Hit_Other");
    public static final ParticleType HeroKaraokeKing_Death_Smoke = new ParticleType("HeroKaraokeKing_Death_Smoke");
    public static final ParticleType HeroKaraokeKing_Skill1_Loop_Ground = new ParticleType("HeroKaraokeKing_Skill1_Loop_Ground");
    public static final ParticleType HeroKaraokeKing_Skill2_Smoke = new ParticleType("HeroKaraokeKing_Skill2_Smoke");
    public static final ParticleType HeroKaraokeKing_Skill2_Smoke2 = new ParticleType("HeroKaraokeKing_Skill2_Smoke2");
    public static final ParticleType HeroKaraokeKing_Skill2_Smoke_Other = new ParticleType("HeroKaraokeKing_Skill2_Smoke_Other");
    public static final ParticleType HeroKaraokeKing_Skill3_Caster = new ParticleType("HeroKaraokeKing_Skill3_Caster");
    public static final ParticleType HeroKaraokeKing_Skill3_Drop = new ParticleType("HeroKaraokeKing_Skill3_Drop");
    public static final ParticleType HeroKaraokeKing_Skill4_Hit = new ParticleType("HeroKaraokeKing_Skill4_Hit");
    public static final ParticleType HeroKaraokeKing_Skill4_Hit_Duration = new ParticleType("HeroKaraokeKing_Skill4_Hit_Duration");
    public static final ParticleType HeroKaraokeKing_Skill4_water = new ParticleType("HeroKaraokeKing_Skill4_water");
    public static final ParticleType HeroKrakenKing_Drop_skin_mechalord = new ParticleType("HeroKrakenKing_Drop_skin_mechalord");
    public static final ParticleType HeroKrakenKing_Impact_skin_mechalord = new ParticleType("HeroKrakenKing_Impact_skin_mechalord");
    public static final ParticleType HeroKrakenKing_Injured_skin_mechalord = new ParticleType("HeroKrakenKing_Injured_skin_mechalord");
    public static final ParticleType HeroKrakenKing_Roquet_skin_mechalord = new ParticleType("HeroKrakenKing_Roquet_skin_mechalord");
    public static final ParticleType HeroKrakenKing_attack = new ParticleType("HeroKrakenKing_attack");
    public static final ParticleType HeroKrakenKing_debuff = new ParticleType("HeroKrakenKing_debuff");
    public static final ParticleType HeroKrakenKing_skill1_drop = new ParticleType("HeroKrakenKing_skill1_drop");
    public static final ParticleType HeroKrakenKing_skill2_glowTentacle = new ParticleType("HeroKrakenKing_skill2_glowTentacle");
    public static final ParticleType HeroKrakenKing_skill2_glowTentacle_small = new ParticleType("HeroKrakenKing_skill2_glowTentacle_small");
    public static final ParticleType HeroKrakenKing_skill3Impact = new ParticleType("HeroKrakenKing_skill3Impact");
    public static final ParticleType HeroLastDefender_Attack_Hammer_Hit = new ParticleType("HeroLastDefender_Attack_Hammer_Hit");
    public static final ParticleType HeroLastDefender_Attack_Hammer_Knife = new ParticleType("HeroLastDefender_Attack_Hammer_Knife");
    public static final ParticleType HeroLastDefender_Attack_Shield_Hit = new ParticleType("HeroLastDefender_Attack_Shield_Hit");
    public static final ParticleType HeroLastDefender_Death_Smoke = new ParticleType("HeroLastDefender_Death_Smoke");
    public static final ParticleType HeroLastDefender_Skill1_End_Born = new ParticleType("HeroLastDefender_Skill1_End_Born");
    public static final ParticleType HeroLastDefender_Skill1_Loop_Crack = new ParticleType("HeroLastDefender_Skill1_Loop_Crack");
    public static final ParticleType HeroLastDefender_Skill1_Loop_Explode = new ParticleType("HeroLastDefender_Skill1_Loop_Explode");
    public static final ParticleType HeroLastDefender_Skill1_Loop_Knife = new ParticleType("HeroLastDefender_Skill1_Loop_Knife");
    public static final ParticleType HeroLastDefender_Skill1_Loop_Knife2 = new ParticleType("HeroLastDefender_Skill1_Loop_Knife2");
    public static final ParticleType HeroLastDefender_Skill1_Start_Born = new ParticleType("HeroLastDefender_Skill1_Start_Born");
    public static final ParticleType HeroLastDefender_Skill2_Shield = new ParticleType("HeroLastDefender_Skill2_Shield");
    public static final ParticleType HeroLastDefender_Skill2_Shield_Loop = new ParticleType("HeroLastDefender_Skill2_Shield_Loop");
    public static final ParticleType HeroLastDefender_Skill3_Passive = new ParticleType("HeroLastDefender_Skill3_Passive");
    public static final ParticleType HeroLastDefender_Skill5_Shield = new ParticleType("HeroLastDefender_Skill5_Shield");
    public static final ParticleType HeroMagicDragon_AttackBall_Proj = new ParticleType("HeroMagicDragon_AttackBall_Proj");
    public static final ParticleType HeroMagicDragon_AttackExplosion = new ParticleType("HeroMagicDragon_AttackExplosion");
    public static final ParticleType HeroMagicDragon_AttackLaunching = new ParticleType("HeroMagicDragon_AttackLaunching");
    public static final ParticleType HeroMagicDragon_DeathGlow = new ParticleType("HeroMagicDragon_DeathGlow");
    public static final ParticleType HeroMagicDragon_DeathGlowInside = new ParticleType("HeroMagicDragon_DeathGlowInside");
    public static final ParticleType HeroMagicDragon_SKill1Ball_Proj = new ParticleType("HeroMagicDragon_SKill1Ball_Proj");
    public static final ParticleType HeroMagicDragon_SKill1Explosion = new ParticleType("HeroMagicDragon_SKill1Explosion");
    public static final ParticleType HeroMagicDragon_SKill1Hand = new ParticleType("HeroMagicDragon_SKill1Hand");
    public static final ParticleType HeroMagicDragon_SKill2Explosion = new ParticleType("HeroMagicDragon_SKill2Explosion");
    public static final ParticleType HeroMagicDragon_SKill3Ball_Proj = new ParticleType("HeroMagicDragon_SKill3Ball_Proj");
    public static final ParticleType HeroMagicDragon_SKill3Explosion = new ParticleType("HeroMagicDragon_SKill3Explosion");
    public static final ParticleType HeroMagicDragon_SKill3Hand = new ParticleType("HeroMagicDragon_SKill3Hand");
    public static final ParticleType HeroMagicDragon_Skill1Launching = new ParticleType("HeroMagicDragon_Skill1Launching");
    public static final ParticleType HeroMagicDragon_Skill2Ball_Proj = new ParticleType("HeroMagicDragon_Skill2Ball_Proj");
    public static final ParticleType HeroMagicDragon_Skill2Launching = new ParticleType("HeroMagicDragon_Skill2Launching");
    public static final ParticleType HeroMagicDragon_Skill3Launching = new ParticleType("HeroMagicDragon_Skill3Launching");
    public static final ParticleType HeroMagicDragon_Victory_Proj = new ParticleType("HeroMagicDragon_Victory_Proj");
    public static final ParticleType HeroMagicDragon_WalkMist = new ParticleType("HeroMagicDragon_WalkMist");
    public static final ParticleType HeroMedusa_EnergyBall = new ParticleType("HeroMedusa_EnergyBall");
    public static final ParticleType HeroMedusa_EnergyBall_Release = new ParticleType("HeroMedusa_EnergyBall_Release");
    public static final ParticleType HeroMedusa_EnergyBall_Release_skin_futakuchi = new ParticleType("HeroMedusa_EnergyBall_Release_skin_futakuchi");
    public static final ParticleType HeroMedusa_EnergyBall_skin_futakuchi = new ParticleType("HeroMedusa_EnergyBall_skin_futakuchi");
    public static final ParticleType HeroMedusa_EyeLaser = new ParticleType("HeroMedusa_EyeLaser");
    public static final ParticleType HeroMedusa_EyeLaserImpact = new ParticleType("HeroMedusa_EyeLaserImpact");
    public static final ParticleType HeroMedusa_EyeLaserImpact_skin_futakuchi = new ParticleType("HeroMedusa_EyeLaserImpact_skin_futakuchi");
    public static final ParticleType HeroMedusa_EyeLaserRed_skin_futakuchi = new ParticleType("HeroMedusa_EyeLaserRed_skin_futakuchi");
    public static final ParticleType HeroMedusa_EyeLaser_skin_futakuchi = new ParticleType("HeroMedusa_EyeLaser_skin_futakuchi");
    public static final ParticleType HeroMedusa_Skill1Impact = new ParticleType("HeroMedusa_Skill1Impact");
    public static final ParticleType HeroMedusa_Skill1Impact_skin_futakuchi = new ParticleType("HeroMedusa_Skill1Impact_skin_futakuchi");
    public static final ParticleType HeroMedusa_Skill2Impact = new ParticleType("HeroMedusa_Skill2Impact");
    public static final ParticleType HeroMedusa_Skill2Impact_skin_futakuchi = new ParticleType("HeroMedusa_Skill2Impact_skin_futakuchi");
    public static final ParticleType HeroMedusa_SnakeLaser = new ParticleType("HeroMedusa_SnakeLaser");
    public static final ParticleType HeroMedusa_SnakeLaser_skin_futakuchi = new ParticleType("HeroMedusa_SnakeLaser_skin_futakuchi");
    public static final ParticleType HeroMedusa_WalkDust = new ParticleType("HeroMedusa_WalkDust");
    public static final ParticleType HeroMedusa_WalkDust_skin_futakuchi = new ParticleType("HeroMedusa_WalkDust_skin_futakuchi");
    public static final ParticleType HeroMinotaur_AttackHitImpact = new ParticleType("HeroMinotaur_AttackHitImpact");
    public static final ParticleType HeroMinotaur_Attack_swing = new ParticleType("HeroMinotaur_Attack_swing");
    public static final ParticleType HeroMinotaur_Death_Smoke = new ParticleType("HeroMinotaur_Death_Smoke");
    public static final ParticleType HeroMinotaur_Skill1_Impact = new ParticleType("HeroMinotaur_Skill1_Impact");
    public static final ParticleType HeroMinotaur_Skill1_swing = new ParticleType("HeroMinotaur_Skill1_swing");
    public static final ParticleType HeroMinotaur_Skill2_Attack = new ParticleType("HeroMinotaur_Skill2_Attack");
    public static final ParticleType HeroMinotaur_Skill2_AttackImpact = new ParticleType("HeroMinotaur_Skill2_AttackImpact");
    public static final ParticleType HeroMinotaur_Skill2_FootDust = new ParticleType("HeroMinotaur_Skill2_FootDust");
    public static final ParticleType HeroMinotaur_Skill2_Shield = new ParticleType("HeroMinotaur_Skill2_Shield");
    public static final ParticleType HeroMinotaur_Skill3_ArmorBonus = new ParticleType("HeroMinotaur_Skill3_ArmorBonus");
    public static final ParticleType HeroMinotaur_Skill3_AtackBonus = new ParticleType("HeroMinotaur_Skill3_AtackBonus");
    public static final ParticleType HeroMinotaur_Skill3_Blue_GlassFloor = new ParticleType("HeroMinotaur_Skill3_Blue_GlassFloor");
    public static final ParticleType HeroMinotaur_Skill3_GainEnergy = new ParticleType("HeroMinotaur_Skill3_GainEnergy");
    public static final ParticleType HeroMinotaur_Skill3_Green_GlassFloor = new ParticleType("HeroMinotaur_Skill3_Green_GlassFloor");
    public static final ParticleType HeroMinotaur_Skill3_HealSelf_BG = new ParticleType("HeroMinotaur_Skill3_HealSelf_BG");
    public static final ParticleType HeroMinotaur_Skill3_HealSelf_FG = new ParticleType("HeroMinotaur_Skill3_HealSelf_FG");
    public static final ParticleType HeroMinotaur_Skill3_Yellow_GlassFloor = new ParticleType("HeroMinotaur_Skill3_Yellow_GlassFloor");
    public static final ParticleType HeroMinotaur_VictorySmoke = new ParticleType("HeroMinotaur_VictorySmoke");
    public static final ParticleType HeroMistressManicure_attack_hit = new ParticleType("HeroMistressManicure_attack_hit");
    public static final ParticleType HeroMistressManicure_attack_preload = new ParticleType("HeroMistressManicure_attack_preload");
    public static final ParticleType HeroMistressManicure_attack_projectile = new ParticleType("HeroMistressManicure_attack_projectile");
    public static final ParticleType HeroMistressManicure_death = new ParticleType("HeroMistressManicure_death");
    public static final ParticleType HeroMistressManicure_death2 = new ParticleType("HeroMistressManicure_death2");
    public static final ParticleType HeroMistressManicure_skill1_clawSpray = new ParticleType("HeroMistressManicure_skill1_clawSpray");
    public static final ParticleType HeroMistressManicure_skill2_claw_BG = new ParticleType("HeroMistressManicure_skill2_claw_BG");
    public static final ParticleType HeroMistressManicure_skill2_claw_FG = new ParticleType("HeroMistressManicure_skill2_claw_FG");
    public static final ParticleType HeroMistressManicure_skill2_puddleClaw_Dn = new ParticleType("HeroMistressManicure_skill2_puddleClaw_Dn");
    public static final ParticleType HeroMistressManicure_skill2_puddleClaw_Loop = new ParticleType("HeroMistressManicure_skill2_puddleClaw_Loop");
    public static final ParticleType HeroMistressManicure_skill2_puddleClaw_Up = new ParticleType("HeroMistressManicure_skill2_puddleClaw_Up");
    public static final ParticleType HeroMistressManicure_skill2_puddle_loop_LG = new ParticleType("HeroMistressManicure_skill2_puddle_loop_LG");
    public static final ParticleType HeroMistressManicure_skill2_puddle_loop_SM = new ParticleType("HeroMistressManicure_skill2_puddle_loop_SM");
    public static final ParticleType HeroMistressManicure_skill2_puddle_spread = new ParticleType("HeroMistressManicure_skill2_puddle_spread");
    public static final ParticleType HeroMistressManicure_skill2_puddle_spread2 = new ParticleType("HeroMistressManicure_skill2_puddle_spread2");
    public static final ParticleType HeroMistressManicure_skill3_burst = new ParticleType("HeroMistressManicure_skill3_burst");
    public static final ParticleType HeroMistressManicure_skill3_charge = new ParticleType("HeroMistressManicure_skill3_charge");
    public static final ParticleType HeroMistressManicure_skill3_charge_BG = new ParticleType("HeroMistressManicure_skill3_charge_BG");
    public static final ParticleType HeroMistressManicure_skill3_charge_FG = new ParticleType("HeroMistressManicure_skill3_charge_FG");
    public static final ParticleType HeroMistressManicure_skill3_projectile = new ParticleType("HeroMistressManicure_skill3_projectile");
    public static final ParticleType HeroNinjaDwarf_Debuff_Beer = new ParticleType("HeroNinjaDwarf_Debuff_Beer");
    public static final ParticleType HeroNinjaDwarf_Debuff_Beer_skin_animal = new ParticleType("HeroNinjaDwarf_Debuff_Beer_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Impact = new ParticleType("HeroNinjaDwarf_Impact");
    public static final ParticleType HeroNinjaDwarf_ImpactNew = new ParticleType("HeroNinjaDwarf_ImpactNew");
    public static final ParticleType HeroNinjaDwarf_ImpactNew_skin_animal = new ParticleType("HeroNinjaDwarf_ImpactNew_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Impact_skin_animal = new ParticleType("HeroNinjaDwarf_Impact_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Skill6_Hit_Rate_Reduction = new ParticleType("HeroNinjaDwarf_Skill6_Hit_Rate_Reduction");
    public static final ParticleType HeroNinjaDwarf_Swoosh = new ParticleType("HeroNinjaDwarf_Swoosh");
    public static final ParticleType HeroNinjaDwarf_Swoosh2 = new ParticleType("HeroNinjaDwarf_Swoosh2");
    public static final ParticleType HeroNinjaDwarf_Swoosh2_skin_animal = new ParticleType("HeroNinjaDwarf_Swoosh2_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Swoosh3 = new ParticleType("HeroNinjaDwarf_Swoosh3");
    public static final ParticleType HeroNinjaDwarf_Swoosh3_skin_animal = new ParticleType("HeroNinjaDwarf_Swoosh3_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Swoosh4 = new ParticleType("HeroNinjaDwarf_Swoosh4");
    public static final ParticleType HeroNinjaDwarf_Swoosh4_skin_animal = new ParticleType("HeroNinjaDwarf_Swoosh4_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Swoosh_skin_animal = new ParticleType("HeroNinjaDwarf_Swoosh_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Victory = new ParticleType("HeroNinjaDwarf_Victory");
    public static final ParticleType HeroNinjaDwarf_Victory_drink = new ParticleType("HeroNinjaDwarf_Victory_drink");
    public static final ParticleType HeroNinjaDwarf_Victory_drink_skin_animal = new ParticleType("HeroNinjaDwarf_Victory_drink_skin_animal");
    public static final ParticleType HeroNinjaDwarf_Victory_skin_animal = new ParticleType("HeroNinjaDwarf_Victory_skin_animal");
    public static final ParticleType HeroNinjaDwarf_WhirlingRing = new ParticleType("HeroNinjaDwarf_WhirlingRing");
    public static final ParticleType HeroNinjaDwarf_WhirlingRing_skin_animal = new ParticleType("HeroNinjaDwarf_WhirlingRing_skin_animal");
    public static final ParticleType HeroOrcMonk_BurnerSmoke = new ParticleType("HeroOrcMonk_BurnerSmoke");
    public static final ParticleType HeroOrcMonk_BurnerSmokeWalk = new ParticleType("HeroOrcMonk_BurnerSmokeWalk");
    public static final ParticleType HeroOrcMonk_Skill1_ringSmoke = new ParticleType("HeroOrcMonk_Skill1_ringSmoke");
    public static final ParticleType HeroOrcMonk_Skill1_ringSmoke_angel = new ParticleType("HeroOrcMonk_Skill1_ringSmoke_angel");
    public static final ParticleType HeroOrcMonk_Skill2_bubbleBurst = new ParticleType("HeroOrcMonk_Skill2_bubbleBurst");
    public static final ParticleType HeroOrcMonk_Skill2_bubbleBurst_Ally = new ParticleType("HeroOrcMonk_Skill2_bubbleBurst_Ally");
    public static final ParticleType HeroOrcMonk_Skill3_SmokeRing = new ParticleType("HeroOrcMonk_Skill3_SmokeRing");
    public static final ParticleType HeroOrcMonk_Skill3_Smoke_proj = new ParticleType("HeroOrcMonk_Skill3_Smoke_proj");
    public static final ParticleType HeroPchAnubisDragon_Attack_Drop = new ParticleType("HeroPchAnubisDragon_Attack_Drop");
    public static final ParticleType HeroPchAnubisDragon_Attack_Hit = new ParticleType("HeroPchAnubisDragon_Attack_Hit");
    public static final ParticleType HeroPchAnubisDragon_Attack_Storage = new ParticleType("HeroPchAnubisDragon_Attack_Storage");
    public static final ParticleType HeroPchAnubisDragon_Hit_Brust = new ParticleType("HeroPchAnubisDragon_Hit_Brust");
    public static final ParticleType HeroPchAnubisDragon_Hit_shield = new ParticleType("HeroPchAnubisDragon_Hit_shield");
    public static final ParticleType HeroPchAnubisDragon_Idle_Buff = new ParticleType("HeroPchAnubisDragon_Idle_Buff");
    public static final ParticleType HeroPchAnubisDragon_Idle_Buff02 = new ParticleType("HeroPchAnubisDragon_Idle_Buff02");
    public static final ParticleType HeroPchAnubisDragon_Skill1_Drop2 = new ParticleType("HeroPchAnubisDragon_Skill1_Drop2");
    public static final ParticleType HeroPchAnubisDragon_Skill1_Hit = new ParticleType("HeroPchAnubisDragon_Skill1_Hit");
    public static final ParticleType HeroPchAnubisDragon_Skill1_Storage = new ParticleType("HeroPchAnubisDragon_Skill1_Storage");
    public static final ParticleType HeroPchAnubisDragon_Skill2 = new ParticleType("HeroPchAnubisDragon_Skill2");
    public static final ParticleType HeroPchAnubisDragon_Skill3_Arm = new ParticleType("HeroPchAnubisDragon_Skill3_Arm");
    public static final ParticleType HeroPchAnubisDragon_Skill3_Brust = new ParticleType("HeroPchAnubisDragon_Skill3_Brust");
    public static final ParticleType HeroPchAnubisDragon_Skill3_Gather = new ParticleType("HeroPchAnubisDragon_Skill3_Gather");
    public static final ParticleType HeroPchAnubisDragon_Skill4_Glistening = new ParticleType("HeroPchAnubisDragon_Skill4_Glistening");
    public static final ParticleType HeroPchAnubisDragon_Victory_Gather = new ParticleType("HeroPchAnubisDragon_Victory_Gather");
    public static final ParticleType HeroPchAnubisDragon_Victory_Loop_Wing = new ParticleType("HeroPchAnubisDragon_Victory_Loop_Wing");
    public static final ParticleType HeroPchAnubisDragon_Victory_Wing = new ParticleType("HeroPchAnubisDragon_Victory_Wing");
    public static final ParticleType HeroPirate_Attack_CannonBall = new ParticleType("HeroPirate_Attack_CannonBall");
    public static final ParticleType HeroPirate_Attack_Explosion = new ParticleType("HeroPirate_Attack_Explosion");
    public static final ParticleType HeroPirate_Attack_HitImpact = new ParticleType("HeroPirate_Attack_HitImpact");
    public static final ParticleType HeroPirate_Death_Splash = new ParticleType("HeroPirate_Death_Splash");
    public static final ParticleType HeroPirate_Skill1_ExplosionSplash = new ParticleType("HeroPirate_Skill1_ExplosionSplash");
    public static final ParticleType HeroPirate_Skill1_HitImpact = new ParticleType("HeroPirate_Skill1_HitImpact");
    public static final ParticleType HeroPirate_Skill1_WaterBullet = new ParticleType("HeroPirate_Skill1_WaterBullet");
    public static final ParticleType HeroPirate_Skill2_Shield = new ParticleType("HeroPirate_Skill2_Shield");
    public static final ParticleType HeroPirate_Skill3_AnchorTrail = new ParticleType("HeroPirate_Skill3_AnchorTrail");
    public static final ParticleType HeroPirate_Skill3_HitImpact = new ParticleType("HeroPirate_Skill3_HitImpact");
    public static final ParticleType HeroPirate_Skill4_CannonBall = new ParticleType("HeroPirate_Skill4_CannonBall");
    public static final ParticleType HeroPirate_Skill4_Explosion = new ParticleType("HeroPirate_Skill4_Explosion");
    public static final ParticleType HeroPirate_Skill4_HitImpact = new ParticleType("HeroPirate_Skill4_HitImpact");
    public static final ParticleType HeroPirate_Victory_Gun = new ParticleType("HeroPirate_Victory_Gun");
    public static final ParticleType HeroPlagueEntrepreneur_attack = new ParticleType("HeroPlagueEntrepreneur_attack");
    public static final ParticleType HeroPlagueEntrepreneur_attack_hit = new ParticleType("HeroPlagueEntrepreneur_attack_hit");
    public static final ParticleType HeroPlagueEntrepreneur_death_gas = new ParticleType("HeroPlagueEntrepreneur_death_gas");
    public static final ParticleType HeroPlagueEntrepreneur_skill1_bladeDrip = new ParticleType("HeroPlagueEntrepreneur_skill1_bladeDrip");
    public static final ParticleType HeroPlagueEntrepreneur_skill2_debuff = new ParticleType("HeroPlagueEntrepreneur_skill2_debuff");
    public static final ParticleType HeroPlagueEntrepreneur_skill2_plagueGas_hit = new ParticleType("HeroPlagueEntrepreneur_skill2_plagueGas_hit");
    public static final ParticleType HeroPlagueEntrepreneur_skill2_vialSteam = new ParticleType("HeroPlagueEntrepreneur_skill2_vialSteam");
    public static final ParticleType HeroPlagueEntrepreneur_skill2_vial_KILL_ON_THROW = new ParticleType("HeroPlagueEntrepreneur_skill2_vial_KILL_ON_THROW");
    public static final ParticleType HeroPlagueEntrepreneur_skill3_drip = new ParticleType("HeroPlagueEntrepreneur_skill3_drip");
    public static final ParticleType HeroPlagueEntrepreneur_skill3_spear = new ParticleType("HeroPlagueEntrepreneur_skill3_spear");
    public static final ParticleType HeroPlantSoulMaster_Death_Currency = new ParticleType("HeroPlantSoulMaster_Death_Currency");
    public static final ParticleType HeroPlantSoulMaster_Enchant_Currency = new ParticleType("HeroPlantSoulMaster_Enchant_Currency");
    public static final ParticleType HeroPlantSoulMaster_Hit = new ParticleType("HeroPlantSoulMaster_Hit");
    public static final ParticleType HeroPlantSoulMaster_Hit_Petals = new ParticleType("HeroPlantSoulMaster_Hit_Petals");
    public static final ParticleType HeroPlantSoulMaster_Idle_Currency = new ParticleType("HeroPlantSoulMaster_Idle_Currency");
    public static final ParticleType HeroPlantSoulMaster_Skill1_Enchant = new ParticleType("HeroPlantSoulMaster_Skill1_Enchant");
    public static final ParticleType HeroPlantSoulMaster_SwordHit_Petals = new ParticleType("HeroPlantSoulMaster_SwordHit_Petals");
    public static final ParticleType HeroPlantSoul_coreGlow1 = new ParticleType("HeroPlantSoul_coreGlow1");
    public static final ParticleType HeroPlantSoul_deathGlow_A = new ParticleType("HeroPlantSoul_deathGlow_A");
    public static final ParticleType HeroPlantSoul_deathMote_A = new ParticleType("HeroPlantSoul_deathMote_A");
    public static final ParticleType HeroPlantSoul_deathMote_B1 = new ParticleType("HeroPlantSoul_deathMote_B1");
    public static final ParticleType HeroPlantSoul_deathMote_coreGen = new ParticleType("HeroPlantSoul_deathMote_coreGen");
    public static final ParticleType HeroPlantSoul_hit = new ParticleType("HeroPlantSoul_hit");
    public static final ParticleType HeroPlantSoul_hit_leaves = new ParticleType("HeroPlantSoul_hit_leaves");
    public static final ParticleType HeroPlantSoul_skill1_blast = new ParticleType("HeroPlantSoul_skill1_blast");
    public static final ParticleType HeroPlantSoul_swordBang = new ParticleType("HeroPlantSoul_swordBang");
    public static final ParticleType HeroPlantSoul_swordHit_leaves = new ParticleType("HeroPlantSoul_swordHit_leaves");
    public static final ParticleType HeroPlantSoul_swordSlash_A = new ParticleType("HeroPlantSoul_swordSlash_A");
    public static final ParticleType HeroPlantSoul_swordTrail = new ParticleType("HeroPlantSoul_swordTrail");
    public static final ParticleType HeroPlantSoul_swordTrail_anim = new ParticleType("HeroPlantSoul_swordTrail_anim");
    public static final ParticleType HeroPlantSoul_swordTrail_sm = new ParticleType("HeroPlantSoul_swordTrail_sm");
    public static final ParticleType HeroPolemaster_EnergyDrain = new ParticleType("HeroPolemaster_EnergyDrain");
    public static final ParticleType HeroPolemaster_GroundHit = new ParticleType("HeroPolemaster_GroundHit");
    public static final ParticleType HeroPolemaster_Kick = new ParticleType("HeroPolemaster_Kick");
    public static final ParticleType HeroPolemaster_SplashyGreen = new ParticleType("HeroPolemaster_SplashyGreen");
    public static final ParticleType HeroPolemaster_SplashyGreenMulti = new ParticleType("HeroPolemaster_SplashyGreenMulti");
    public static final ParticleType HeroPolemaster_SplashyGreenRing = new ParticleType("HeroPolemaster_SplashyGreenRing");
    public static final ParticleType HeroRabidDragon_AttackFireBall = new ParticleType("HeroRabidDragon_AttackFireBall");
    public static final ParticleType HeroRabidDragon_AttackFireBall_Impact = new ParticleType("HeroRabidDragon_AttackFireBall_Impact");
    public static final ParticleType HeroRabidDragon_AttackFireBall_Mouth = new ParticleType("HeroRabidDragon_AttackFireBall_Mouth");
    public static final ParticleType HeroRabidDragon_AttackFireBallv2 = new ParticleType("HeroRabidDragon_AttackFireBallv2");
    public static final ParticleType HeroRabidDragon_AttackNose_Smoke = new ParticleType("HeroRabidDragon_AttackNose_Smoke");
    public static final ParticleType HeroRabidDragon_Skill1_4thseg = new ParticleType("HeroRabidDragon_Skill1_4thseg");
    public static final ParticleType HeroRabidDragon_Skill1_5thsegBite = new ParticleType("HeroRabidDragon_Skill1_5thsegBite");
    public static final ParticleType HeroRabidDragon_Skill1_5thsegBite1 = new ParticleType("HeroRabidDragon_Skill1_5thsegBite1");
    public static final ParticleType HeroRabidDragon_Skill1_5thsegCloud = new ParticleType("HeroRabidDragon_Skill1_5thsegCloud");
    public static final ParticleType HeroRabidDragon_Skill1_5thsegCloudBg = new ParticleType("HeroRabidDragon_Skill1_5thsegCloudBg");
    public static final ParticleType HeroRabidDragon_Skill2MachineGun = new ParticleType("HeroRabidDragon_Skill2MachineGun");
    public static final ParticleType HeroRabidDragon_Skill2MachineGun_Impact = new ParticleType("HeroRabidDragon_Skill2MachineGun_Impact");
    public static final ParticleType HeroRabidDragon_Skill2MachineGun_Mouth = new ParticleType("HeroRabidDragon_Skill2MachineGun_Mouth");
    public static final ParticleType HeroRabidDragon_Skill3GlowNose = new ParticleType("HeroRabidDragon_Skill3GlowNose");
    public static final ParticleType HeroRagingRevenant_Skill5_Gain = new ParticleType("HeroRagingRevenant_Skill5_Gain");
    public static final ParticleType HeroRagingRevenant_Skill5_Line = new ParticleType("HeroRagingRevenant_Skill5_Line");
    public static final ParticleType HeroRagingRevenant_attack = new ParticleType("HeroRagingRevenant_attack");
    public static final ParticleType HeroRagingRevenant_attack_b = new ParticleType("HeroRagingRevenant_attack_b");
    public static final ParticleType HeroRagingRevenant_skill1_ally = new ParticleType("HeroRagingRevenant_skill1_ally");
    public static final ParticleType HeroRagingRevenant_skill1_sacrifice_back = new ParticleType("HeroRagingRevenant_skill1_sacrifice_back");
    public static final ParticleType HeroRagingRevenant_skill1_smoke = new ParticleType("HeroRagingRevenant_skill1_smoke");
    public static final ParticleType HeroRagingRevenant_skill2_hit = new ParticleType("HeroRagingRevenant_skill2_hit");
    public static final ParticleType HeroRagingRevenant_skill2_projectile = new ParticleType("HeroRagingRevenant_skill2_projectile");
    public static final ParticleType HeroRagingRevenant_skill3_shockwave = new ParticleType("HeroRagingRevenant_skill3_shockwave");
    public static final ParticleType HeroRagingRevenant_skill3_shockwave_Fr = new ParticleType("HeroRagingRevenant_skill3_shockwave_Fr");
    public static final ParticleType HeroRagingRevenant_skill3_shockwave_ally = new ParticleType("HeroRagingRevenant_skill3_shockwave_ally");
    public static final ParticleType HeroRagingRevenant_skill4 = new ParticleType("HeroRagingRevenant_skill4");
    public static final ParticleType HeroRagingRevenant_skill4_energyPull_root = new ParticleType("HeroRagingRevenant_skill4_energyPull_root");
    public static final ParticleType HeroRagingRevenant_swordCharge = new ParticleType("HeroRagingRevenant_swordCharge");
    public static final ParticleType HeroRedShaman_DeathSmoke = new ParticleType("HeroRedShaman_DeathSmoke");
    public static final ParticleType HeroRedShaman_DeathSmoke_skin_crow = new ParticleType("HeroRedShaman_DeathSmoke_skin_crow");
    public static final ParticleType HeroRedShaman_GlowingBuff = new ParticleType("HeroRedShaman_GlowingBuff");
    public static final ParticleType HeroRedShaman_GlowingBuff_skin_crow = new ParticleType("HeroRedShaman_GlowingBuff_skin_crow");
    public static final ParticleType HeroRedShaman_ShimmerBuff = new ParticleType("HeroRedShaman_ShimmerBuff");
    public static final ParticleType HeroRedShaman_ShimmerBuff_skin_crow = new ParticleType("HeroRedShaman_ShimmerBuff_skin_crow");
    public static final ParticleType HeroRedShaman_SummonBall = new ParticleType("HeroRedShaman_SummonBall");
    public static final ParticleType HeroRedShaman_SummonBallMulti = new ParticleType("HeroRedShaman_SummonBallMulti");
    public static final ParticleType HeroRedShaman_SummonBallMulti_skin_crow = new ParticleType("HeroRedShaman_SummonBallMulti_skin_crow");
    public static final ParticleType HeroRedShaman_SummonBall_skin_crow = new ParticleType("HeroRedShaman_SummonBall_skin_crow");
    public static final ParticleType HeroRedShaman_SummonRing = new ParticleType("HeroRedShaman_SummonRing");
    public static final ParticleType HeroRedShaman_SummonRing_skin_crow = new ParticleType("HeroRedShaman_SummonRing_skin_crow");
    public static final ParticleType HeroRollerViking_CrackGroundImpact = new ParticleType("HeroRollerViking_CrackGroundImpact");
    public static final ParticleType HeroRollerViking_RockImpact = new ParticleType("HeroRollerViking_RockImpact");
    public static final ParticleType HeroRollerViking_ShockWave = new ParticleType("HeroRollerViking_ShockWave");
    public static final ParticleType HeroRollerViking_debuff_Roller_Viking_skill6 = new ParticleType("HeroRollerViking_debuff_Roller_Viking_skill6");
    public static final ParticleType HeroRollerViking_punchImpact = new ParticleType("HeroRollerViking_punchImpact");
    public static final ParticleType HeroRollerViking_punchImpactMulti = new ParticleType("HeroRollerViking_punchImpactMulti");
    public static final ParticleType HeroRollerViking_punchLast = new ParticleType("HeroRollerViking_punchLast");
    public static final ParticleType HeroSadisticDancer_Attack_Bolt = new ParticleType("HeroSadisticDancer_Attack_Bolt");
    public static final ParticleType HeroSadisticDancer_Attack_Bolt02 = new ParticleType("HeroSadisticDancer_Attack_Bolt02");
    public static final ParticleType HeroSadisticDancer_Attack_Bolt02_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Attack_Bolt02_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Attack_Bolt_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Attack_Bolt_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Attack_Hit = new ParticleType("HeroSadisticDancer_Attack_Hit");
    public static final ParticleType HeroSadisticDancer_Attack_Hit_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Attack_Hit_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Attack_Sheet = new ParticleType("HeroSadisticDancer_Attack_Sheet");
    public static final ParticleType HeroSadisticDancer_Attack_Sheet_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Attack_Sheet_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill1_End_Buff = new ParticleType("HeroSadisticDancer_Skill1_End_Buff");
    public static final ParticleType HeroSadisticDancer_Skill1_End_Buff_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill1_End_Buff_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill1_End_Debuff = new ParticleType("HeroSadisticDancer_Skill1_End_Debuff");
    public static final ParticleType HeroSadisticDancer_Skill1_End_Debuff_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill1_End_Debuff_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill1_End_Heart = new ParticleType("HeroSadisticDancer_Skill1_End_Heart");
    public static final ParticleType HeroSadisticDancer_Skill1_End_Heart_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill1_End_Heart_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill1_Star_Gas = new ParticleType("HeroSadisticDancer_Skill1_Star_Gas");
    public static final ParticleType HeroSadisticDancer_Skill1_Star_Gas_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill1_Star_Gas_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill1_Star_Heart_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill1_Star_Heart_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_End_02 = new ParticleType("HeroSadisticDancer_Skill2_End_02");
    public static final ParticleType HeroSadisticDancer_Skill2_End_02_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_End_02_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_End_Shere = new ParticleType("HeroSadisticDancer_Skill2_End_Shere");
    public static final ParticleType HeroSadisticDancer_Skill2_End_Shere1_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_End_Shere1_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_End_Shere2_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_End_Shere2_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_End_Shere_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_End_Shere_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_Loop_01 = new ParticleType("HeroSadisticDancer_Skill2_Loop_01");
    public static final ParticleType HeroSadisticDancer_Skill2_Loop_01_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_Loop_01_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_Recovery = new ParticleType("HeroSadisticDancer_Skill2_Recovery");
    public static final ParticleType HeroSadisticDancer_Skill2_Recovery_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_Recovery_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_Skill2_Start_01 = new ParticleType("HeroSadisticDancer_Skill2_Start_01");
    public static final ParticleType HeroSadisticDancer_Skill2_Start_01_skin_scarlett_fox = new ParticleType("HeroSadisticDancer_Skill2_Start_01_skin_scarlett_fox");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Bolt = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Bolt");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Bolt02 = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Bolt02");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Hit = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Hit");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Sheet = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Sheet");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Buff = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Buff");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Debuff = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Debuff");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Heart = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Heart");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_Star_Gas = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_Star_Gas");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_Star_Heart = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_Star_Heart");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_02 = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_02");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere1 = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere1");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere2 = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere2");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Loop_01 = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Loop_01");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Recovery = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Recovery");
    public static final ParticleType HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Start_01 = new ParticleType("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Start_01");
    public static final ParticleType HeroSandDragon_BigFireBall = new ParticleType("HeroSandDragon_BigFireBall");
    public static final ParticleType HeroSandDragon_FireBallHit = new ParticleType("HeroSandDragon_FireBallHit");
    public static final ParticleType HeroSandDragon_FirePlume = new ParticleType("HeroSandDragon_FirePlume");
    public static final ParticleType HeroSandDragon_FirePlumeL = new ParticleType("HeroSandDragon_FirePlumeL");
    public static final ParticleType HeroSandDragon_FirePlumeLanded = new ParticleType("HeroSandDragon_FirePlumeLanded");
    public static final ParticleType HeroSandDragon_dustdeath = new ParticleType("HeroSandDragon_dustdeath");
    public static final ParticleType HeroSandDragon_dustdeath_bk = new ParticleType("HeroSandDragon_dustdeath_bk");
    public static final ParticleType HeroSandDragon_fireball = new ParticleType("HeroSandDragon_fireball");
    public static final ParticleType HeroSandDragon_fireballlanded = new ParticleType("HeroSandDragon_fireballlanded");
    public static final ParticleType HeroSandDragon_firefeet = new ParticleType("HeroSandDragon_firefeet");
    public static final ParticleType HeroSandDragon_sandball_impact = new ParticleType("HeroSandDragon_sandball_impact");
    public static final ParticleType HeroSandDragon_sandball_onlyfront = new ParticleType("HeroSandDragon_sandball_onlyfront");
    public static final ParticleType HeroSandDragon_sandring = new ParticleType("HeroSandDragon_sandring");
    public static final ParticleType HeroSandDragon_wind_blast = new ParticleType("HeroSandDragon_wind_blast");
    public static final ParticleType HeroSatyr_Attack_bellWave = new ParticleType("HeroSatyr_Attack_bellWave");
    public static final ParticleType HeroSatyr_Skill1_arrowTrail = new ParticleType("HeroSatyr_Skill1_arrowTrail");
    public static final ParticleType HeroSatyr_Skill1_flut = new ParticleType("HeroSatyr_Skill1_flut");
    public static final ParticleType HeroSatyr_Skill1_hitImpact = new ParticleType("HeroSatyr_Skill1_hitImpact");
    public static final ParticleType HeroSatyr_Skill2_ballTrail = new ParticleType("HeroSatyr_Skill2_ballTrail");
    public static final ParticleType HeroSatyr_Skill2_flut = new ParticleType("HeroSatyr_Skill2_flut");
    public static final ParticleType HeroSatyr_Skill2_healMusic = new ParticleType("HeroSatyr_Skill2_healMusic");
    public static final ParticleType HeroSatyr_Skill2_healMusic_allies = new ParticleType("HeroSatyr_Skill2_healMusic_allies");
    public static final ParticleType HeroSavageCutie_AttackClaw = new ParticleType("HeroSavageCutie_AttackClaw");
    public static final ParticleType HeroSavageCutie_DeathDust = new ParticleType("HeroSavageCutie_DeathDust");
    public static final ParticleType HeroSavageCutie_DeathDustFr = new ParticleType("HeroSavageCutie_DeathDustFr");
    public static final ParticleType HeroSavageCutie_Skill1Wave = new ParticleType("HeroSavageCutie_Skill1Wave");
    public static final ParticleType HeroSavageCutie_Skill1WaveLoop = new ParticleType("HeroSavageCutie_Skill1WaveLoop");
    public static final ParticleType HeroSavageCutie_Skill2Claw = new ParticleType("HeroSavageCutie_Skill2Claw");
    public static final ParticleType HeroSavageCutie_Skill2ClawR = new ParticleType("HeroSavageCutie_Skill2ClawR");
    public static final ParticleType HeroSavageCutie_Skill3Claw = new ParticleType("HeroSavageCutie_Skill3Claw");
    public static final ParticleType HeroShadowAssassin_AttackHit = new ParticleType("HeroShadowAssassin_AttackHit");
    public static final ParticleType HeroShadowAssassin_AttackYKnifeProj = new ParticleType("HeroShadowAssassin_AttackYKnifeProj");
    public static final ParticleType HeroShadowAssassin_AttackYKnifeProj_skin_watch = new ParticleType("HeroShadowAssassin_AttackYKnifeProj_skin_watch");
    public static final ParticleType HeroShadowAssassin_Attack_Splash_skin_watch = new ParticleType("HeroShadowAssassin_Attack_Splash_skin_watch");
    public static final ParticleType HeroShadowAssassin_Attack_Spray_skin_watch = new ParticleType("HeroShadowAssassin_Attack_Spray_skin_watch");
    public static final ParticleType HeroShadowAssassin_Cross_only = new ParticleType("HeroShadowAssassin_Cross_only");
    public static final ParticleType HeroShadowAssassin_DeathSmoke = new ParticleType("HeroShadowAssassin_DeathSmoke");
    public static final ParticleType HeroShadowAssassin_Skill1Hit = new ParticleType("HeroShadowAssassin_Skill1Hit");
    public static final ParticleType HeroShadowAssassin_Skill1VaPuff = new ParticleType("HeroShadowAssassin_Skill1VaPuff");
    public static final ParticleType HeroShadowAssassin_Skill2BKnife = new ParticleType("HeroShadowAssassin_Skill2BKnife");
    public static final ParticleType HeroShadowAssassin_Skill2BKnifeProj = new ParticleType("HeroShadowAssassin_Skill2BKnifeProj");
    public static final ParticleType HeroShadowAssassin_Skill2BKnifeProj_skin_watch = new ParticleType("HeroShadowAssassin_Skill2BKnifeProj_skin_watch");
    public static final ParticleType HeroShadowAssassin_Skill2Hit = new ParticleType("HeroShadowAssassin_Skill2Hit");
    public static final ParticleType HeroShadowAssassin_Skill3Hit = new ParticleType("HeroShadowAssassin_Skill3Hit");
    public static final ParticleType HeroShadowAssassin_Skill3WKnifeProj = new ParticleType("HeroShadowAssassin_Skill3WKnifeProj");
    public static final ParticleType HeroShadowAssassin_Skill3WKnifeProj_skin_watch = new ParticleType("HeroShadowAssassin_Skill3WKnifeProj_skin_watch");
    public static final ParticleType HeroShadowAssassin_Skill6_Gain = new ParticleType("HeroShadowAssassin_Skill6_Gain");
    public static final ParticleType HeroShadowAssassin_Skill6_Line = new ParticleType("HeroShadowAssassin_Skill6_Line");
    public static final ParticleType HeroShadowAssassin_Skill6_Slash = new ParticleType("HeroShadowAssassin_Skill6_Slash");
    public static final ParticleType HeroShadowOfSven_Attack_Knife = new ParticleType("HeroShadowOfSven_Attack_Knife");
    public static final ParticleType HeroShadowOfSven_Death_Atmosphere = new ParticleType("HeroShadowOfSven_Death_Atmosphere");
    public static final ParticleType HeroShadowOfSven_Skill1_End_Bolt = new ParticleType("HeroShadowOfSven_Skill1_End_Bolt");
    public static final ParticleType HeroShadowOfSven_Skill1_End_Door = new ParticleType("HeroShadowOfSven_Skill1_End_Door");
    public static final ParticleType HeroShadowOfSven_Skill1_Loop_Black = new ParticleType("HeroShadowOfSven_Skill1_Loop_Black");
    public static final ParticleType HeroShadowOfSven_Skill1_Loop_Bolt = new ParticleType("HeroShadowOfSven_Skill1_Loop_Bolt");
    public static final ParticleType HeroShadowOfSven_Skill1_Loop_Door = new ParticleType("HeroShadowOfSven_Skill1_Loop_Door");
    public static final ParticleType HeroShadowOfSven_Skill1_Start_Black = new ParticleType("HeroShadowOfSven_Skill1_Start_Black");
    public static final ParticleType HeroShadowOfSven_Skill1_Start_Bolt = new ParticleType("HeroShadowOfSven_Skill1_Start_Bolt");
    public static final ParticleType HeroShadowOfSven_Skill2_Ground = new ParticleType("HeroShadowOfSven_Skill2_Ground");
    public static final ParticleType HeroShadowOfSven_Skill2_Knife = new ParticleType("HeroShadowOfSven_Skill2_Knife");
    public static final ParticleType HeroShadowOfSven_Skill2_Shift = new ParticleType("HeroShadowOfSven_Skill2_Shift");
    public static final ParticleType HeroShadowOfSven_Skill3_State = new ParticleType("HeroShadowOfSven_Skill3_State");
    public static final ParticleType HeroShadowOfSven_Skill4_Hit = new ParticleType("HeroShadowOfSven_Skill4_Hit");
    public static final ParticleType HeroShadowOfSven_Skill5_Gather = new ParticleType("HeroShadowOfSven_Skill5_Gather");
    public static final ParticleType HeroShadowOfSven_Skill5_Laser = new ParticleType("HeroShadowOfSven_Skill5_Laser");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Attack_Knife = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Attack_Knife");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Death_Atmosphere = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Death_Atmosphere");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_End_Bolt = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_End_Bolt");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_End_Door = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_End_Door");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Black = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Black");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Bolt = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Bolt");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Door = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Door");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Start_Black = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Start_Black");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Start_Bolt = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Start_Bolt");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Ground = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Ground");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Knife = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Knife");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Shift = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Shift");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill3_State = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill3_State");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill4_Hit = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill4_Hit");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill5_Gather = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill5_Gather");
    public static final ParticleType HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill5_Laser = new ParticleType("HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill5_Laser");
    public static final ParticleType HeroSilentSpirit_attack_Bg = new ParticleType("HeroSilentSpirit_attack_Bg");
    public static final ParticleType HeroSilentSpirit_attack_Fr = new ParticleType("HeroSilentSpirit_attack_Fr");
    public static final ParticleType HeroSilentSpirit_attack_end = new ParticleType("HeroSilentSpirit_attack_end");
    public static final ParticleType HeroSilentSpirit_attack_smoke_blk = new ParticleType("HeroSilentSpirit_attack_smoke_blk");
    public static final ParticleType HeroSilentSpirit_attack_smoke_wht = new ParticleType("HeroSilentSpirit_attack_smoke_wht");
    public static final ParticleType HeroSilentSpirit_skill1_wallCollapse = new ParticleType("HeroSilentSpirit_skill1_wallCollapse");
    public static final ParticleType HeroSilentSpirit_skill1_wall_FPO = new ParticleType("HeroSilentSpirit_skill1_wall_FPO");
    public static final ParticleType HeroSilentSpirit_skill2 = new ParticleType("HeroSilentSpirit_skill2");
    public static final ParticleType HeroSilentSpirit_skill3_hammer = new ParticleType("HeroSilentSpirit_skill3_hammer");
    public static final ParticleType HeroSkeletonKing_Attack_Impact = new ParticleType("HeroSkeletonKing_Attack_Impact");
    public static final ParticleType HeroSkeletonKing_Attack_Impact_skin_ascendant = new ParticleType("HeroSkeletonKing_Attack_Impact_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Attack_Ink = new ParticleType("HeroSkeletonKing_Attack_Ink");
    public static final ParticleType HeroSkeletonKing_Attack_Ink_proj = new ParticleType("HeroSkeletonKing_Attack_Ink_proj");
    public static final ParticleType HeroSkeletonKing_Attack_Spray_skin_ascendant = new ParticleType("HeroSkeletonKing_Attack_Spray_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Death_Body_skin_ascendant = new ParticleType("HeroSkeletonKing_Death_Body_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Death_End_skin_ascendant = new ParticleType("HeroSkeletonKing_Death_End_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Death_Glow_skin_ascendant = new ParticleType("HeroSkeletonKing_Death_Glow_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Death_smoke = new ParticleType("HeroSkeletonKing_Death_smoke");
    public static final ParticleType HeroSkeletonKing_Hit_Injured_skin_ascendant = new ParticleType("HeroSkeletonKing_Hit_Injured_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Idle_Shine2_skin_ascendant = new ParticleType("HeroSkeletonKing_Idle_Shine2_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill1_Laser_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill1_Laser_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill1_SmokeBody_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill1_SmokeBody_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill1_boltSmoke = new ParticleType("HeroSkeletonKing_Skill1_boltSmoke");
    public static final ParticleType HeroSkeletonKing_Skill1_smokeBurstAppear = new ParticleType("HeroSkeletonKing_Skill1_smokeBurstAppear");
    public static final ParticleType HeroSkeletonKing_Skill2_DamageShoot = new ParticleType("HeroSkeletonKing_Skill2_DamageShoot");
    public static final ParticleType HeroSkeletonKing_Skill2_DamageSmoke = new ParticleType("HeroSkeletonKing_Skill2_DamageSmoke");
    public static final ParticleType HeroSkeletonKing_Skill2_DamageSmoke_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill2_DamageSmoke_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill2_Foot_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill2_Foot_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill2_Gather2_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill2_Gather2_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill2_Gather_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill2_Gather_skin_ascendant");
    public static final ParticleType HeroSkeletonKing_Skill2_HealingRing = new ParticleType("HeroSkeletonKing_Skill2_HealingRing");
    public static final ParticleType HeroSkeletonKing_Skill3_Ink = new ParticleType("HeroSkeletonKing_Skill3_Ink");
    public static final ParticleType HeroSkeletonKing_Skill3_Strengthen_skin_ascendant = new ParticleType("HeroSkeletonKing_Skill3_Strengthen_skin_ascendant");
    public static final ParticleType HeroSnakeDragon_Skill1GlowWing = new ParticleType("HeroSnakeDragon_Skill1GlowWing");
    public static final ParticleType HeroSnakeDragon_concentric_ring_loop = new ParticleType("HeroSnakeDragon_concentric_ring_loop");
    public static final ParticleType HeroSnakeDragon_concentric_ring_mouth = new ParticleType("HeroSnakeDragon_concentric_ring_mouth");
    public static final ParticleType HeroSnakeDragon_death_dust = new ParticleType("HeroSnakeDragon_death_dust");
    public static final ParticleType HeroSnakeDragon_death_dust_skin_sea_dragon = new ParticleType("HeroSnakeDragon_death_dust_skin_sea_dragon");
    public static final ParticleType HeroSnakeDragon_impact = new ParticleType("HeroSnakeDragon_impact");
    public static final ParticleType HeroSnakeDragon_spatter_top = new ParticleType("HeroSnakeDragon_spatter_top");
    public static final ParticleType HeroSnakeDragon_spatter_top_skin_sea_dragon = new ParticleType("HeroSnakeDragon_spatter_top_skin_sea_dragon");
    public static final ParticleType HeroSnakeDragon_walk_dust = new ParticleType("HeroSnakeDragon_walk_dust");
    public static final ParticleType HeroSnakeDragon_walk_dust_skin_sea_dragon = new ParticleType("HeroSnakeDragon_walk_dust_skin_sea_dragon");
    public static final ParticleType HeroSniperWolf_AttackBlow = new ParticleType("HeroSniperWolf_AttackBlow");
    public static final ParticleType HeroSniperWolf_AttackEnemy_Proj = new ParticleType("HeroSniperWolf_AttackEnemy_Proj");
    public static final ParticleType HeroSniperWolf_AttackHand = new ParticleType("HeroSniperWolf_AttackHand");
    public static final ParticleType HeroSniperWolf_Hit = new ParticleType("HeroSniperWolf_Hit");
    public static final ParticleType HeroSniperWolf_Skill1_GlowRing = new ParticleType("HeroSniperWolf_Skill1_GlowRing");
    public static final ParticleType HeroSniperWolf_Skill1_GlowRing_boost = new ParticleType("HeroSniperWolf_Skill1_GlowRing_boost");
    public static final ParticleType HeroSniperWolf_Skill1_MagicOnHand = new ParticleType("HeroSniperWolf_Skill1_MagicOnHand");
    public static final ParticleType HeroSniperWolf_Skill2_Buff = new ParticleType("HeroSniperWolf_Skill2_Buff");
    public static final ParticleType HeroSniperWolf_Skill2_MagicOnHand = new ParticleType("HeroSniperWolf_Skill2_MagicOnHand");
    public static final ParticleType HeroSniperWolf_Skill3_Cloth_Proj = new ParticleType("HeroSniperWolf_Skill3_Cloth_Proj");
    public static final ParticleType HeroSniperWolf_Skill3_MagicPuff = new ParticleType("HeroSniperWolf_Skill3_MagicPuff");
    public static final ParticleType HeroSniperWolf_VictoryHair = new ParticleType("HeroSniperWolf_VictoryHair");
    public static final ParticleType HeroSniperWolf_VictoryHairTip = new ParticleType("HeroSniperWolf_VictoryHairTip");
    public static final ParticleType HeroSojournerSorceress_Attack_Fireball = new ParticleType("HeroSojournerSorceress_Attack_Fireball");
    public static final ParticleType HeroSojournerSorceress_Attack_Hit = new ParticleType("HeroSojournerSorceress_Attack_Hit");
    public static final ParticleType HeroSojournerSorceress_Skill1_Hit = new ParticleType("HeroSojournerSorceress_Skill1_Hit");
    public static final ParticleType HeroSojournerSorceress_Skill1_fly = new ParticleType("HeroSojournerSorceress_Skill1_fly");
    public static final ParticleType HeroSojournerSorceress_Skill2_Caster = new ParticleType("HeroSojournerSorceress_Skill2_Caster");
    public static final ParticleType HeroSojournerSorceress_Skill2_Hit = new ParticleType("HeroSojournerSorceress_Skill2_Hit");
    public static final ParticleType HeroSojournerSorceress_Skill3_Gather = new ParticleType("HeroSojournerSorceress_Skill3_Gather");
    public static final ParticleType HeroSojournerSorceress_Skill3_Main = new ParticleType("HeroSojournerSorceress_Skill3_Main");
    public static final ParticleType HeroSojournerSorceress_Skill3_Smoke = new ParticleType("HeroSojournerSorceress_Skill3_Smoke");
    public static final ParticleType HeroSojournerSorceress_Skill5_Blast = new ParticleType("HeroSojournerSorceress_Skill5_Blast");
    public static final ParticleType HeroSojournerSorceress_Skill5_Smoke = new ParticleType("HeroSojournerSorceress_Skill5_Smoke");
    public static final ParticleType HeroSolidLongevity_Attack_Sample = new ParticleType("HeroSolidLongevity_Attack_Sample");
    public static final ParticleType HeroSolidLongevity_Skill1_Attack_Fissure = new ParticleType("HeroSolidLongevity_Skill1_Attack_Fissure");
    public static final ParticleType HeroSolidLongevity_Skill1_Attack_Glow = new ParticleType("HeroSolidLongevity_Skill1_Attack_Glow");
    public static final ParticleType HeroSolidLongevity_Skill1_Attack_Knife = new ParticleType("HeroSolidLongevity_Skill1_Attack_Knife");
    public static final ParticleType HeroSolidLongevity_Skill1_Loop_Glow = new ParticleType("HeroSolidLongevity_Skill1_Loop_Glow");
    public static final ParticleType HeroSolidLongevity_Skill1_Loop_Storage = new ParticleType("HeroSolidLongevity_Skill1_Loop_Storage");
    public static final ParticleType HeroSolidLongevity_Skill1_Loop_Storage02 = new ParticleType("HeroSolidLongevity_Skill1_Loop_Storage02");
    public static final ParticleType HeroSolidLongevity_Skill2_Shield = new ParticleType("HeroSolidLongevity_Skill2_Shield");
    public static final ParticleType HeroSolidLongevity_Skill3_Hollow = new ParticleType("HeroSolidLongevity_Skill3_Hollow");
    public static final ParticleType HeroSolidLongevity_Skill3_Hollow02 = new ParticleType("HeroSolidLongevity_Skill3_Hollow02");
    public static final ParticleType HeroSolidLongevity_Skill4_Buff = new ParticleType("HeroSolidLongevity_Skill4_Buff");
    public static final ParticleType HeroSpectralDragon_attack_hit = new ParticleType("HeroSpectralDragon_attack_hit");
    public static final ParticleType HeroSpectralDragon_attack_hit_skin_easter = new ParticleType("HeroSpectralDragon_attack_hit_skin_easter");
    public static final ParticleType HeroSpectralDragon_attack_projectile = new ParticleType("HeroSpectralDragon_attack_projectile");
    public static final ParticleType HeroSpectralDragon_attack_projectile_skin_easter = new ParticleType("HeroSpectralDragon_attack_projectile_skin_easter");
    public static final ParticleType HeroSpectralDragon_death = new ParticleType("HeroSpectralDragon_death");
    public static final ParticleType HeroSpectralDragon_death_motes = new ParticleType("HeroSpectralDragon_death_motes");
    public static final ParticleType HeroSpectralDragon_death_motes_skin_easter = new ParticleType("HeroSpectralDragon_death_motes_skin_easter");
    public static final ParticleType HeroSpectralDragon_death_skin_easter = new ParticleType("HeroSpectralDragon_death_skin_easter");
    public static final ParticleType HeroSpectralDragon_skill1_hit_skin_easter = new ParticleType("HeroSpectralDragon_skill1_hit_skin_easter");
    public static final ParticleType HeroSpectralDragon_skill1_projectile = new ParticleType("HeroSpectralDragon_skill1_projectile");
    public static final ParticleType HeroSpectralDragon_skill1_projectile_HOT = new ParticleType("HeroSpectralDragon_skill1_projectile_HOT");
    public static final ParticleType HeroSpectralDragon_skill1_projectile_HOT_skin_easter = new ParticleType("HeroSpectralDragon_skill1_projectile_HOT_skin_easter");
    public static final ParticleType HeroSpectralDragon_skill1_projectile_skin_easter = new ParticleType("HeroSpectralDragon_skill1_projectile_skin_easter");
    public static final ParticleType HeroSpectralDragon_skill3_hit = new ParticleType("HeroSpectralDragon_skill3_hit");
    public static final ParticleType HeroSpectralDragon_skill3_hit_skin_easter = new ParticleType("HeroSpectralDragon_skill3_hit_skin_easter");
    public static final ParticleType HeroSpectralDragon_skill4_mote_hit = new ParticleType("HeroSpectralDragon_skill4_mote_hit");
    public static final ParticleType HeroSpectralDragon_skill4_mote_hit_skin_easter = new ParticleType("HeroSpectralDragon_skill4_mote_hit_skin_easter");
    public static final ParticleType HeroSpectralDragon_skill4_motes = new ParticleType("HeroSpectralDragon_skill4_motes");
    public static final ParticleType HeroSpectralDragon_skill4_motes_skin_easter = new ParticleType("HeroSpectralDragon_skill4_motes_skin_easter");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_hit = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_hit");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_projectile = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_projectile");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_death = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_death");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_death_motes = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_death_motes");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_hit = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_hit");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile_HOT = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile_HOT");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_skill3_hit = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill3_hit");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_skill4_mote_hit = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill4_mote_hit");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_skill4_motes = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill4_motes");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire_L_R = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire_L_R");
    public static final ParticleType HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire_hit = new ParticleType("HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire_hit");
    public static final ParticleType HeroSpectralDragon_talismanFire = new ParticleType("HeroSpectralDragon_talismanFire");
    public static final ParticleType HeroSpectralDragon_talismanFire_L_R = new ParticleType("HeroSpectralDragon_talismanFire_L_R");
    public static final ParticleType HeroSpectralDragon_talismanFire_L_R_skin_easter = new ParticleType("HeroSpectralDragon_talismanFire_L_R_skin_easter");
    public static final ParticleType HeroSpectralDragon_talismanFire_hit = new ParticleType("HeroSpectralDragon_talismanFire_hit");
    public static final ParticleType HeroSpectralDragon_talismanFire_hit_skin_easter = new ParticleType("HeroSpectralDragon_talismanFire_hit_skin_easter");
    public static final ParticleType HeroSpectralDragon_talismanFire_skin_easter = new ParticleType("HeroSpectralDragon_talismanFire_skin_easter");
    public static final ParticleType HeroSpiderQueenMastery_attack = new ParticleType("HeroSpiderQueenMastery_attack");
    public static final ParticleType HeroSpiderQueenMastery_attack_hit = new ParticleType("HeroSpiderQueenMastery_attack_hit");
    public static final ParticleType HeroSpiderQueenMastery_basicAttack = new ParticleType("HeroSpiderQueenMastery_basicAttack");
    public static final ParticleType HeroSpiderQueenMastery_children = new ParticleType("HeroSpiderQueenMastery_children");
    public static final ParticleType HeroSpiderQueenMastery_cocoon_pop = new ParticleType("HeroSpiderQueenMastery_cocoon_pop");
    public static final ParticleType HeroSpiderQueenMastery_silk_baseEmit = new ParticleType("HeroSpiderQueenMastery_silk_baseEmit");
    public static final ParticleType HeroSpiderQueenMastery_silk_base_lateral = new ParticleType("HeroSpiderQueenMastery_silk_base_lateral");
    public static final ParticleType HeroSpiderQueenMastery_silk_base_vertical = new ParticleType("HeroSpiderQueenMastery_silk_base_vertical");
    public static final ParticleType HeroSpiderQueenMastery_silk_handKnit_A = new ParticleType("HeroSpiderQueenMastery_silk_handKnit_A");
    public static final ParticleType HeroSpiderQueenMastery_silk_handKnit_B = new ParticleType("HeroSpiderQueenMastery_silk_handKnit_B");
    public static final ParticleType HeroSpiderQueenMastery_silk_knit = new ParticleType("HeroSpiderQueenMastery_silk_knit");
    public static final ParticleType HeroSpiderQueenMastery_silk_knit2 = new ParticleType("HeroSpiderQueenMastery_silk_knit2");
    public static final ParticleType HeroSpiderQueenMastery_skill0 = new ParticleType("HeroSpiderQueenMastery_skill0");
    public static final ParticleType HeroSpiderQueenMastery_skill0_victim = new ParticleType("HeroSpiderQueenMastery_skill0_victim");
    public static final ParticleType HeroSpiderQueenMastery_skill1_cocoon_swirl = new ParticleType("HeroSpiderQueenMastery_skill1_cocoon_swirl");
    public static final ParticleType HeroSpiderQueenMastery_skill1_cocooning = new ParticleType("HeroSpiderQueenMastery_skill1_cocooning");
    public static final ParticleType HeroSpiderQueenMastery_skill1_hit_Rr = new ParticleType("HeroSpiderQueenMastery_skill1_hit_Rr");
    public static final ParticleType HeroSpiderQueenMastery_skill1_hit_momentary_Fr = new ParticleType("HeroSpiderQueenMastery_skill1_hit_momentary_Fr");
    public static final ParticleType HeroSpiderQueenMastery_skill1_legStab = new ParticleType("HeroSpiderQueenMastery_skill1_legStab");
    public static final ParticleType HeroSpiderQueenMastery_skill2_bite = new ParticleType("HeroSpiderQueenMastery_skill2_bite");
    public static final ParticleType HeroSpiderQueenMastery_skill2_bite_L = new ParticleType("HeroSpiderQueenMastery_skill2_bite_L");
    public static final ParticleType HeroSpiderQueenMastery_skill2_bite_R = new ParticleType("HeroSpiderQueenMastery_skill2_bite_R");
    public static final ParticleType HeroSpiderQueenMastery_skill2_bite_tooth = new ParticleType("HeroSpiderQueenMastery_skill2_bite_tooth");
    public static final ParticleType HeroSpiderQueenMastery_skill2_bite_victim = new ParticleType("HeroSpiderQueenMastery_skill2_bite_victim");
    public static final ParticleType HeroSpiderQueenMastery_venom = new ParticleType("HeroSpiderQueenMastery_venom");
    public static final ParticleType HeroSpiderQueenMastery_venom2 = new ParticleType("HeroSpiderQueenMastery_venom2");
    public static final ParticleType HeroSpiderQueen_basicAttack = new ParticleType("HeroSpiderQueen_basicAttack");
    public static final ParticleType HeroSpiderQueen_children = new ParticleType("HeroSpiderQueen_children");
    public static final ParticleType HeroSpiderQueen_cocoon_pop = new ParticleType("HeroSpiderQueen_cocoon_pop");
    public static final ParticleType HeroSpiderQueen_silk_baseEmit = new ParticleType("HeroSpiderQueen_silk_baseEmit");
    public static final ParticleType HeroSpiderQueen_silk_base_vertical = new ParticleType("HeroSpiderQueen_silk_base_vertical");
    public static final ParticleType HeroSpiderQueen_skill1_legStab = new ParticleType("HeroSpiderQueen_skill1_legStab");
    public static final ParticleType HeroSpiderQueen_skill2_bite = new ParticleType("HeroSpiderQueen_skill2_bite");
    public static final ParticleType HeroSpiderQueen_skill2_bite_L = new ParticleType("HeroSpiderQueen_skill2_bite_L");
    public static final ParticleType HeroSpiderQueen_skill2_bite_R = new ParticleType("HeroSpiderQueen_skill2_bite_R");
    public static final ParticleType HeroSpikeyDragon_AttackImpact = new ParticleType("HeroSpikeyDragon_AttackImpact");
    public static final ParticleType HeroSpikeyDragon_AttackSpike_Proj1 = new ParticleType("HeroSpikeyDragon_AttackSpike_Proj1");
    public static final ParticleType HeroSpikeyDragon_AttackSpike_Proj2 = new ParticleType("HeroSpikeyDragon_AttackSpike_Proj2");
    public static final ParticleType HeroSpikeyDragon_AttackSpike_Proj3 = new ParticleType("HeroSpikeyDragon_AttackSpike_Proj3");
    public static final ParticleType HeroSpikeyDragon_AttackSpike_Proj4 = new ParticleType("HeroSpikeyDragon_AttackSpike_Proj4");
    public static final ParticleType HeroSpikeyDragon_AttackSpike_Proj5 = new ParticleType("HeroSpikeyDragon_AttackSpike_Proj5");
    public static final ParticleType HeroSpikeyDragon_AttackTail = new ParticleType("HeroSpikeyDragon_AttackTail");
    public static final ParticleType HeroSpikeyDragon_Skill1ImpactGround = new ParticleType("HeroSpikeyDragon_Skill1ImpactGround");
    public static final ParticleType HeroSpikeyDragon_Skill1Release = new ParticleType("HeroSpikeyDragon_Skill1Release");
    public static final ParticleType HeroSpikeyDragon_Skill1Spike_Proj = new ParticleType("HeroSpikeyDragon_Skill1Spike_Proj");
    public static final ParticleType HeroSpikeyDragon_Skill2ImpactGround = new ParticleType("HeroSpikeyDragon_Skill2ImpactGround");
    public static final ParticleType HeroSpikeyDragon_Skill2Launch = new ParticleType("HeroSpikeyDragon_Skill2Launch");
    public static final ParticleType HeroSpikeyDragon_Skill2Release = new ParticleType("HeroSpikeyDragon_Skill2Release");
    public static final ParticleType HeroSpikeyDragon_Skill2Spike_Proj = new ParticleType("HeroSpikeyDragon_Skill2Spike_Proj");
    public static final ParticleType HeroSpikeyDragon_Skill3Release = new ParticleType("HeroSpikeyDragon_Skill3Release");
    public static final ParticleType HeroSpikeyDragon_Skill3Release2 = new ParticleType("HeroSpikeyDragon_Skill3Release2");
    public static final ParticleType HeroSpikeyDragon_Skill3Release3 = new ParticleType("HeroSpikeyDragon_Skill3Release3");
    public static final ParticleType HeroSpikeyDragon_Skill3Spike_Proj = new ParticleType("HeroSpikeyDragon_Skill3Spike_Proj");
    public static final ParticleType HeroSpikeyDragon_Skill5DayquillBlast = new ParticleType("HeroSpikeyDragon_Skill5DayquillBlast");
    public static final ParticleType HeroStepladderBrothers_Attack_Hammer = new ParticleType("HeroStepladderBrothers_Attack_Hammer");
    public static final ParticleType HeroStepladderBrothers_Attack_Hammer_skin_kabuki = new ParticleType("HeroStepladderBrothers_Attack_Hammer_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill1_End_Flight = new ParticleType("HeroStepladderBrothers_Skill1_End_Flight");
    public static final ParticleType HeroStepladderBrothers_Skill1_End_Flight_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill1_End_Flight_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill1_End_hit = new ParticleType("HeroStepladderBrothers_Skill1_End_hit");
    public static final ParticleType HeroStepladderBrothers_Skill1_End_hit_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill1_End_hit_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill1_Loop_Smoke = new ParticleType("HeroStepladderBrothers_Skill1_Loop_Smoke");
    public static final ParticleType HeroStepladderBrothers_Skill1_Loop_Smoke_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill1_Loop_Smoke_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill1_Smoke = new ParticleType("HeroStepladderBrothers_Skill1_Smoke");
    public static final ParticleType HeroStepladderBrothers_Skill1_Smoke_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill1_Smoke_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill1_Start_Glow = new ParticleType("HeroStepladderBrothers_Skill1_Start_Glow");
    public static final ParticleType HeroStepladderBrothers_Skill1_Start_Glow_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill1_Start_Glow_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill2_Build = new ParticleType("HeroStepladderBrothers_Skill2_Build");
    public static final ParticleType HeroStepladderBrothers_Skill2_Build_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill2_Build_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill2_Wall = new ParticleType("HeroStepladderBrothers_Skill2_Wall");
    public static final ParticleType HeroStepladderBrothers_Skill2_Wall_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill2_Wall_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill3_Body = new ParticleType("HeroStepladderBrothers_Skill3_Body");
    public static final ParticleType HeroStepladderBrothers_Skill3_Body_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill3_Body_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill4_Board = new ParticleType("HeroStepladderBrothers_Skill4_Board");
    public static final ParticleType HeroStepladderBrothers_Skill4_Board_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill4_Board_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill4_Hand = new ParticleType("HeroStepladderBrothers_Skill4_Hand");
    public static final ParticleType HeroStepladderBrothers_Skill4_Hand_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill4_Hand_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_Skill4_hit = new ParticleType("HeroStepladderBrothers_Skill4_hit");
    public static final ParticleType HeroStepladderBrothers_Skill4_hit_skin_kabuki = new ParticleType("HeroStepladderBrothers_Skill4_hit_skin_kabuki");
    public static final ParticleType HeroStepladderBrothers_basic_attack_hit = new ParticleType("HeroStepladderBrothers_basic_attack_hit");
    public static final ParticleType HeroStepladderBrothers_basic_attack_hit_skin_kabuki = new ParticleType("HeroStepladderBrothers_basic_attack_hit_skin_kabuki");
    public static final ParticleType HeroStormDragon_Attack = new ParticleType("HeroStormDragon_Attack");
    public static final ParticleType HeroStormDragon_AttackBolt = new ParticleType("HeroStormDragon_AttackBolt");
    public static final ParticleType HeroStormDragon_Attack_Impact = new ParticleType("HeroStormDragon_Attack_Impact");
    public static final ParticleType HeroStormDragon_Attack_Loading = new ParticleType("HeroStormDragon_Attack_Loading");
    public static final ParticleType HeroStormDragon_Skill1Breath = new ParticleType("HeroStormDragon_Skill1Breath");
    public static final ParticleType HeroStormDragon_Skill1Tornado_Dust = new ParticleType("HeroStormDragon_Skill1Tornado_Dust");
    public static final ParticleType HeroStormDragon_Skill1Tornado_Impact = new ParticleType("HeroStormDragon_Skill1Tornado_Impact");
    public static final ParticleType HeroStormDragon_Skill2Breath = new ParticleType("HeroStormDragon_Skill2Breath");
    public static final ParticleType HeroStormDragon_Skill2Cloud_Cover = new ParticleType("HeroStormDragon_Skill2Cloud_Cover");
    public static final ParticleType HeroStormDragon_Skill2Tornado_Dust = new ParticleType("HeroStormDragon_Skill2Tornado_Dust");
    public static final ParticleType HeroStormDragon_Skill2Tornado_Impact = new ParticleType("HeroStormDragon_Skill2Tornado_Impact");
    public static final ParticleType HeroStormDragon_Skill3 = new ParticleType("HeroStormDragon_Skill3");
    public static final ParticleType HeroStormDragon_Skill3Bolt = new ParticleType("HeroStormDragon_Skill3Bolt");
    public static final ParticleType HeroStormDragon_Skill3_Impact = new ParticleType("HeroStormDragon_Skill3_Impact");
    public static final ParticleType HeroStormDragon_Skill3_Loading = new ParticleType("HeroStormDragon_Skill3_Loading");
    public static final ParticleType HeroStormDragon_SystemShock_back = new ParticleType("HeroStormDragon_SystemShock_back");
    public static final ParticleType HeroStormDragon_SystemShock_front = new ParticleType("HeroStormDragon_SystemShock_front");
    public static final ParticleType HeroStowaway_attack_gunfire = new ParticleType("HeroStowaway_attack_gunfire");
    public static final ParticleType HeroStowaway_attack_impact = new ParticleType("HeroStowaway_attack_impact");
    public static final ParticleType HeroStowaway_skill1_boomerang = new ParticleType("HeroStowaway_skill1_boomerang");
    public static final ParticleType HeroStowaway_skill1_boomerangImpact = new ParticleType("HeroStowaway_skill1_boomerangImpact");
    public static final ParticleType HeroStowaway_skill1_boomerang_proj = new ParticleType("HeroStowaway_skill1_boomerang_proj");
    public static final ParticleType HeroStowaway_skill1_coin = new ParticleType("HeroStowaway_skill1_coin");
    public static final ParticleType HeroStowaway_skill1_coinImpact = new ParticleType("HeroStowaway_skill1_coinImpact");
    public static final ParticleType HeroStowaway_skill1_coin_proj = new ParticleType("HeroStowaway_skill1_coin_proj");
    public static final ParticleType HeroStowaway_skill1_grab = new ParticleType("HeroStowaway_skill1_grab");
    public static final ParticleType HeroStowaway_skill1_grenade = new ParticleType("HeroStowaway_skill1_grenade");
    public static final ParticleType HeroStowaway_skill1_grenadeImpact = new ParticleType("HeroStowaway_skill1_grenadeImpact");
    public static final ParticleType HeroStowaway_skill1_grenade_proj = new ParticleType("HeroStowaway_skill1_grenade_proj");
    public static final ParticleType HeroStowaway_skill1_photobomb = new ParticleType("HeroStowaway_skill1_photobomb");
    public static final ParticleType HeroStowaway_skill1_photobombImpact = new ParticleType("HeroStowaway_skill1_photobombImpact");
    public static final ParticleType HeroStowaway_skill1_photobomb_proj = new ParticleType("HeroStowaway_skill1_photobomb_proj");
    public static final ParticleType HeroStowaway_skill1_tearJar = new ParticleType("HeroStowaway_skill1_tearJar");
    public static final ParticleType HeroStowaway_skill1_tearJarImpact = new ParticleType("HeroStowaway_skill1_tearJarImpact");
    public static final ParticleType HeroStowaway_skill1_tearJar_proj = new ParticleType("HeroStowaway_skill1_tearJar_proj");
    public static final ParticleType HeroStowaway_skill2_grab = new ParticleType("HeroStowaway_skill2_grab");
    public static final ParticleType HeroStowaway_skill4_handglow = new ParticleType("HeroStowaway_skill4_handglow");
    public static final ParticleType HeroStowaway_skill4_vanishAppear = new ParticleType("HeroStowaway_skill4_vanishAppear");
    public static final ParticleType HeroSunSeeker_Attack_Falchion = new ParticleType("HeroSunSeeker_Attack_Falchion");
    public static final ParticleType HeroSunSeeker_Attack_Knife = new ParticleType("HeroSunSeeker_Attack_Knife");
    public static final ParticleType HeroSunSeeker_Skill1_Ball = new ParticleType("HeroSunSeeker_Skill1_Ball");
    public static final ParticleType HeroSunSeeker_Skill1_Fire = new ParticleType("HeroSunSeeker_Skill1_Fire");
    public static final ParticleType HeroSunSeeker_Skill1_Follow = new ParticleType("HeroSunSeeker_Skill1_Follow");
    public static final ParticleType HeroSunSeeker_Skill1_Hit = new ParticleType("HeroSunSeeker_Skill1_Hit");
    public static final ParticleType HeroSunSeeker_Skill1_ballFollow = new ParticleType("HeroSunSeeker_Skill1_ballFollow");
    public static final ParticleType HeroSunSeeker_Skill1_fireBall = new ParticleType("HeroSunSeeker_Skill1_fireBall");
    public static final ParticleType HeroSunSeeker_Skill2_Fire = new ParticleType("HeroSunSeeker_Skill2_Fire");
    public static final ParticleType HeroSunSeeker_Skill2_Gather = new ParticleType("HeroSunSeeker_Skill2_Gather");
    public static final ParticleType HeroSunSeeker_Skill2_Hit = new ParticleType("HeroSunSeeker_Skill2_Hit");
    public static final ParticleType HeroSunSeeker_Skill3_Daytime = new ParticleType("HeroSunSeeker_Skill3_Daytime");
    public static final ParticleType HeroSunSeeker_Skill3_Night = new ParticleType("HeroSunSeeker_Skill3_Night");
    public static final ParticleType HeroSunSeeker_Skill4_Blast = new ParticleType("HeroSunSeeker_Skill4_Blast");
    public static final ParticleType HeroSunSeeker_Skill4_Gather = new ParticleType("HeroSunSeeker_Skill4_Gather");
    public static final ParticleType HeroSunSeeker_Skill4_Sun = new ParticleType("HeroSunSeeker_Skill4_Sun");
    public static final ParticleType HeroSunSeeker_Skill4_Sun_End = new ParticleType("HeroSunSeeker_Skill4_Sun_End");
    public static final ParticleType HeroSunSeeker_Skill4_Sun_Loop = new ParticleType("HeroSunSeeker_Skill4_Sun_Loop");
    public static final ParticleType HeroSunSeeker_Skill4_Sun_Start = new ParticleType("HeroSunSeeker_Skill4_Sun_Start");
    public static final ParticleType HeroSunSeeker_Skill4_Sunline = new ParticleType("HeroSunSeeker_Skill4_Sunline");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Attack_Falchion = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Attack_Falchion");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Attack_Knife = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Attack_Knife");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill1_Ball = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill1_Ball");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill1_Fire = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill1_Fire");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill1_Follow = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill1_Follow");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill1_Hit = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill1_Hit");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill1_ballFollow = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill1_ballFollow");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill1_fireBall = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill1_fireBall");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill2_Fire = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill2_Fire");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill2_Gather = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill2_Gather");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill2_Hit = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill2_Hit");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill3_Daytime = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill3_Daytime");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill3_Night = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill3_Night");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Blast = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Blast");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Gather = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Gather");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_End = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_End");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Loop = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Loop");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Start = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Start");
    public static final ParticleType HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sunline = new ParticleType("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sunline");
    public static final ParticleType HeroTombAngel_Attack_Hit = new ParticleType("HeroTombAngel_Attack_Hit");
    public static final ParticleType HeroTombAngel_Attack_Hit_skin_usercontest = new ParticleType("HeroTombAngel_Attack_Hit_skin_usercontest");
    public static final ParticleType HeroTombAngel_Attack_Projectile = new ParticleType("HeroTombAngel_Attack_Projectile");
    public static final ParticleType HeroTombAngel_Attack_Projectile_skin_usercontest = new ParticleType("HeroTombAngel_Attack_Projectile_skin_usercontest");
    public static final ParticleType HeroTombAngel_Attack_Spike1 = new ParticleType("HeroTombAngel_Attack_Spike1");
    public static final ParticleType HeroTombAngel_Attack_Spike1_skin_usercontest = new ParticleType("HeroTombAngel_Attack_Spike1_skin_usercontest");
    public static final ParticleType HeroTombAngel_Skill1_Convergence1 = new ParticleType("HeroTombAngel_Skill1_Convergence1");
    public static final ParticleType HeroTombAngel_Skill1_Convergence1_skin_usercontest = new ParticleType("HeroTombAngel_Skill1_Convergence1_skin_usercontest");
    public static final ParticleType HeroTombAngel_Skill1_Imprisonment = new ParticleType("HeroTombAngel_Skill1_Imprisonment");
    public static final ParticleType HeroTombAngel_Skill1_Imprisonment_skin_usercontest = new ParticleType("HeroTombAngel_Skill1_Imprisonment_skin_usercontest");
    public static final ParticleType HeroTombAngel_Skill1_end = new ParticleType("HeroTombAngel_Skill1_end");
    public static final ParticleType HeroTombAngel_Skill1_end_skin_usercontest = new ParticleType("HeroTombAngel_Skill1_end_skin_usercontest");
    public static final ParticleType HeroTombAngel_Skill2_Clawslash4 = new ParticleType("HeroTombAngel_Skill2_Clawslash4");
    public static final ParticleType HeroTombAngel_Skill2_Clawslash4_skin_usercontest = new ParticleType("HeroTombAngel_Skill2_Clawslash4_skin_usercontest");
    public static final ParticleType HeroTombAngel_Skill2_Projectile = new ParticleType("HeroTombAngel_Skill2_Projectile");
    public static final ParticleType HeroTombAngel_Skill2_Projectile_skin_usercontest = new ParticleType("HeroTombAngel_Skill2_Projectile_skin_usercontest");
    public static final ParticleType HeroTombAngel_Skill3_Explosion1 = new ParticleType("HeroTombAngel_Skill3_Explosion1");
    public static final ParticleType HeroTombAngel_Skill3_Explosion1_skin_usercontest = new ParticleType("HeroTombAngel_Skill3_Explosion1_skin_usercontest");
    public static final ParticleType HeroTripleThreat_attack_clawslash = new ParticleType("HeroTripleThreat_attack_clawslash");
    public static final ParticleType HeroTripleThreat_skill1_stingout = new ParticleType("HeroTripleThreat_skill1_stingout");
    public static final ParticleType HeroTripleThreat_skill2_bite = new ParticleType("HeroTripleThreat_skill2_bite");
    public static final ParticleType HeroTripleThreat_skill3_explode = new ParticleType("HeroTripleThreat_skill3_explode");
    public static final ParticleType HeroTripleThreat_skill3_fire = new ParticleType("HeroTripleThreat_skill3_fire");
    public static final ParticleType HeroTripleThreat_skill3_projectile = new ParticleType("HeroTripleThreat_skill3_projectile");
    public static final ParticleType HeroUmlautTheFirst_Attack = new ParticleType("HeroUmlautTheFirst_Attack");
    public static final ParticleType HeroUmlautTheFirst_Attack_Line = new ParticleType("HeroUmlautTheFirst_Attack_Line");
    public static final ParticleType HeroUmlautTheFirst_Skill1_Earthquake1 = new ParticleType("HeroUmlautTheFirst_Skill1_Earthquake1");
    public static final ParticleType HeroUmlautTheFirst_Skill1_Earthquake2 = new ParticleType("HeroUmlautTheFirst_Skill1_Earthquake2");
    public static final ParticleType HeroUmlautTheFirst_Skill2_Base = new ParticleType("HeroUmlautTheFirst_Skill2_Base");
    public static final ParticleType HeroUmlautTheFirst_Skill2_Litht1 = new ParticleType("HeroUmlautTheFirst_Skill2_Litht1");
    public static final ParticleType HeroUmlautTheFirst_Skill2_Litht2 = new ParticleType("HeroUmlautTheFirst_Skill2_Litht2");
    public static final ParticleType HeroUmlautTheFirst_Skill2_Twinkle = new ParticleType("HeroUmlautTheFirst_Skill2_Twinkle");
    public static final ParticleType HeroUmlautTheFirst_Skill4_Base = new ParticleType("HeroUmlautTheFirst_Skill4_Base");
    public static final ParticleType HeroUmlautTheFirst_Skill4_Litht1 = new ParticleType("HeroUmlautTheFirst_Skill4_Litht1");
    public static final ParticleType HeroUmlautTheFirst_Skill4_Litht2 = new ParticleType("HeroUmlautTheFirst_Skill4_Litht2");
    public static final ParticleType HeroUmlautTheFirst_Skill4_Twinkle = new ParticleType("HeroUmlautTheFirst_Skill4_Twinkle");
    public static final ParticleType HeroUnicorgi_Attack_Impact = new ParticleType("HeroUnicorgi_Attack_Impact");
    public static final ParticleType HeroUnicorgi_Attack_slash = new ParticleType("HeroUnicorgi_Attack_slash");
    public static final ParticleType HeroUnicorgi_Cute = new ParticleType("HeroUnicorgi_Cute");
    public static final ParticleType HeroUnicorgi_Death = new ParticleType("HeroUnicorgi_Death");
    public static final ParticleType HeroUnicorgi_Skill1_Impact = new ParticleType("HeroUnicorgi_Skill1_Impact");
    public static final ParticleType HeroUnicorgi_Skill2_Impact = new ParticleType("HeroUnicorgi_Skill2_Impact");
    public static final ParticleType HeroUnicorgi_Skill2_spin = new ParticleType("HeroUnicorgi_Skill2_spin");
    public static final ParticleType HeroUnicorgi_Skill3_FromHorn = new ParticleType("HeroUnicorgi_Skill3_FromHorn");
    public static final ParticleType HeroUnicorgi_Skill3_HealOnly = new ParticleType("HeroUnicorgi_Skill3_HealOnly");
    public static final ParticleType HeroUnripeMythology_Attack_Papaw = new ParticleType("HeroUnripeMythology_Attack_Papaw");
    public static final ParticleType HeroUnripeMythology_Death_Dragon = new ParticleType("HeroUnripeMythology_Death_Dragon");
    public static final ParticleType HeroUnripeMythology_Death_Egg = new ParticleType("HeroUnripeMythology_Death_Egg");
    public static final ParticleType HeroUnripeMythology_Death_Egg_Light = new ParticleType("HeroUnripeMythology_Death_Egg_Light");
    public static final ParticleType HeroUnripeMythology_Egg_Idle = new ParticleType("HeroUnripeMythology_Egg_Idle");
    public static final ParticleType HeroUnripeMythology_Skill1 = new ParticleType("HeroUnripeMythology_Skill1");
    public static final ParticleType HeroUnripeMythology_Skill1_Ballistic = new ParticleType("HeroUnripeMythology_Skill1_Ballistic");
    public static final ParticleType HeroUnripeMythology_Skill1_Hit = new ParticleType("HeroUnripeMythology_Skill1_Hit");
    public static final ParticleType HeroUnripeMythology_Skill2 = new ParticleType("HeroUnripeMythology_Skill2");
    public static final ParticleType HeroUnripeMythology_Skill3_End = new ParticleType("HeroUnripeMythology_Skill3_End");
    public static final ParticleType HeroUnripeMythology_Skill3_End_Ballistic = new ParticleType("HeroUnripeMythology_Skill3_End_Ballistic");
    public static final ParticleType HeroUnripeMythology_Skill3_End_Hit = new ParticleType("HeroUnripeMythology_Skill3_End_Hit");
    public static final ParticleType HeroUnripeMythology_Skill3_Loop_Papaw = new ParticleType("HeroUnripeMythology_Skill3_Loop_Papaw");
    public static final ParticleType HeroUnripeMythology_Skill4_Papaw = new ParticleType("HeroUnripeMythology_Skill4_Papaw");
    public static final ParticleType HeroUnripeMythology_Victory_Papaw = new ParticleType("HeroUnripeMythology_Victory_Papaw");
    public static final ParticleType HeroVampireDragon_GroundSmoke = new ParticleType("HeroVampireDragon_GroundSmoke");
    public static final ParticleType HeroVampireDragon_GroundSmoke02_skin_vamp = new ParticleType("HeroVampireDragon_GroundSmoke02_skin_vamp");
    public static final ParticleType HeroVampireDragon_GroundSmoke_skin_vamp = new ParticleType("HeroVampireDragon_GroundSmoke_skin_vamp");
    public static final ParticleType HeroVampireDragon_HandSplash = new ParticleType("HeroVampireDragon_HandSplash");
    public static final ParticleType HeroVampireDragon_HandSplash2 = new ParticleType("HeroVampireDragon_HandSplash2");
    public static final ParticleType HeroVampireDragon_HandSplash2_skin_vamp = new ParticleType("HeroVampireDragon_HandSplash2_skin_vamp");
    public static final ParticleType HeroVampireDragon_HandSplash_skin_vamp = new ParticleType("HeroVampireDragon_HandSplash_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleDamage = new ParticleType("HeroVampireDragon_PurpleDamage");
    public static final ParticleType HeroVampireDragon_PurpleDamage_skin_vamp = new ParticleType("HeroVampireDragon_PurpleDamage_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleMagicReturn = new ParticleType("HeroVampireDragon_PurpleMagicReturn");
    public static final ParticleType HeroVampireDragon_PurpleMagicReturn_skin_vamp = new ParticleType("HeroVampireDragon_PurpleMagicReturn_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleMagicTwist = new ParticleType("HeroVampireDragon_PurpleMagicTwist");
    public static final ParticleType HeroVampireDragon_PurpleMagicTwist02_skin_vamp = new ParticleType("HeroVampireDragon_PurpleMagicTwist02_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleMagicTwist_skin_vamp = new ParticleType("HeroVampireDragon_PurpleMagicTwist_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleMagic_skin_vamp = new ParticleType("HeroVampireDragon_PurpleMagic_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleMouth = new ParticleType("HeroVampireDragon_PurpleMouth");
    public static final ParticleType HeroVampireDragon_PurpleMouth_skin_vamp = new ParticleType("HeroVampireDragon_PurpleMouth_skin_vamp");
    public static final ParticleType HeroVampireDragon_PurpleWave = new ParticleType("HeroVampireDragon_PurpleWave");
    public static final ParticleType HeroVampireDragon_PurpleWave_skin_vamp = new ParticleType("HeroVampireDragon_PurpleWave_skin_vamp");
    public static final ParticleType HeroVampireDragon_SoulEnergy = new ParticleType("HeroVampireDragon_SoulEnergy");
    public static final ParticleType HeroVampireDragon_SoulEnergy_skin_vamp = new ParticleType("HeroVampireDragon_SoulEnergy_skin_vamp");
    public static final ParticleType HeroVampireDragon_hit = new ParticleType("HeroVampireDragon_hit");
    public static final ParticleType HeroVampireDragon_hit_skin_vamp = new ParticleType("HeroVampireDragon_hit_skin_vamp");
    public static final ParticleType HeroVermilionBird_Attack_FireFlight = new ParticleType("HeroVermilionBird_Attack_FireFlight");
    public static final ParticleType HeroVermilionBird_Attack_Hit = new ParticleType("HeroVermilionBird_Attack_Hit");
    public static final ParticleType HeroVermilionBird_Attack_Rune = new ParticleType("HeroVermilionBird_Attack_Rune");
    public static final ParticleType HeroVermilionBird_Skill1_Hit = new ParticleType("HeroVermilionBird_Skill1_Hit");
    public static final ParticleType HeroVermilionBird_Skill1_Rune = new ParticleType("HeroVermilionBird_Skill1_Rune");
    public static final ParticleType HeroVermilionBird_Skill1_Sprint = new ParticleType("HeroVermilionBird_Skill1_Sprint");
    public static final ParticleType HeroVermilionBird_Skill2_Rune = new ParticleType("HeroVermilionBird_Skill2_Rune");
    public static final ParticleType HeroVermilionBird_Skill2_Sole = new ParticleType("HeroVermilionBird_Skill2_Sole");
    public static final ParticleType HeroVermilionBird_Skill3_Caster = new ParticleType("HeroVermilionBird_Skill3_Caster");
    public static final ParticleType HeroVermilionBird_Skill4_Caster = new ParticleType("HeroVermilionBird_Skill4_Caster");
    public static final ParticleType HeroVileBile_attack = new ParticleType("HeroVileBile_attack");
    public static final ParticleType HeroVileBile_drips = new ParticleType("HeroVileBile_drips");
    public static final ParticleType HeroVileBile_skill2_puddle_creep = new ParticleType("HeroVileBile_skill2_puddle_creep");
    public static final ParticleType HeroVileBile_skill2_puddle_gen = new ParticleType("HeroVileBile_skill2_puddle_gen");
    public static final ParticleType HeroVileBile_skill2_puddle_gen_steam = new ParticleType("HeroVileBile_skill2_puddle_gen_steam");
    public static final ParticleType HeroVileBile_skill4_blast = new ParticleType("HeroVileBile_skill4_blast");
    public static final ParticleType HeroVileBile_skill5_puddle_reversal = new ParticleType("HeroVileBile_skill5_puddle_reversal");
    public static final ParticleType HeroVileBile_spew = new ParticleType("HeroVileBile_spew");
    public static final ParticleType HeroVileBile_steamer = new ParticleType("HeroVileBile_steamer");
    public static final ParticleType HeroVileBile_stomp = new ParticleType("HeroVileBile_stomp");
    public static final ParticleType HeroVileBile_stomp_L = new ParticleType("HeroVileBile_stomp_L");
    public static final ParticleType HeroVileBile_stomp_R = new ParticleType("HeroVileBile_stomp_R");
    public static final ParticleType HeroVoidWyvernMastery_Attack = new ParticleType("HeroVoidWyvernMastery_Attack");
    public static final ParticleType HeroVoidWyvernMastery_Attack_Tail_Precharge = new ParticleType("HeroVoidWyvernMastery_Attack_Tail_Precharge");
    public static final ParticleType HeroVoidWyvernMastery_Attack_quse = new ParticleType("HeroVoidWyvernMastery_Attack_quse");
    public static final ParticleType HeroVoidWyvernMastery_Skill1_Detonation = new ParticleType("HeroVoidWyvernMastery_Skill1_Detonation");
    public static final ParticleType HeroVoidWyvernMastery_Skill1_Loop = new ParticleType("HeroVoidWyvernMastery_Skill1_Loop");
    public static final ParticleType HeroVoidWyvernMastery_Skill2_Projectile = new ParticleType("HeroVoidWyvernMastery_Skill2_Projectile");
    public static final ParticleType HeroVoidWyvernMastery_Skill3_Gust_00 = new ParticleType("HeroVoidWyvernMastery_Skill3_Gust_00");
    public static final ParticleType HeroVoidWyvernMastery_Skill3_Gust_01 = new ParticleType("HeroVoidWyvernMastery_Skill3_Gust_01");
    public static final ParticleType HeroVoidWyvernMastery_Skill4_DOT = new ParticleType("HeroVoidWyvernMastery_Skill4_DOT");
    public static final ParticleType HeroVoidWyvernMastery_Skill4_DOT_BG = new ParticleType("HeroVoidWyvernMastery_Skill4_DOT_BG");
    public static final ParticleType HeroVoidWyvernMastery_Skill4_DOT_FG = new ParticleType("HeroVoidWyvernMastery_Skill4_DOT_FG");
    public static final ParticleType HeroVoidWyvernMastery_Skill4_DOT_REF = new ParticleType("HeroVoidWyvernMastery_Skill4_DOT_REF");
    public static final ParticleType HeroVoidWyvernMastery_Victory = new ParticleType("HeroVoidWyvernMastery_Victory");
    public static final ParticleType HeroVoidWyvernMastery_death = new ParticleType("HeroVoidWyvernMastery_death");
    public static final ParticleType HeroVoidWyvern_attack = new ParticleType("HeroVoidWyvern_attack");
    public static final ParticleType HeroVoidWyvern_death = new ParticleType("HeroVoidWyvern_death");
    public static final ParticleType HeroVoidWyvern_death_imagination = new ParticleType("HeroVoidWyvern_death_imagination");
    public static final ParticleType HeroVoidWyvern_hit = new ParticleType("HeroVoidWyvern_hit");
    public static final ParticleType HeroVoidWyvern_skill1_detonation = new ParticleType("HeroVoidWyvern_skill1_detonation");
    public static final ParticleType HeroVoidWyvern_skill1_detonation_imagination = new ParticleType("HeroVoidWyvern_skill1_detonation_imagination");
    public static final ParticleType HeroVoidWyvern_skill1_loop = new ParticleType("HeroVoidWyvern_skill1_loop");
    public static final ParticleType HeroVoidWyvern_skill1_loop2 = new ParticleType("HeroVoidWyvern_skill1_loop2");
    public static final ParticleType HeroVoidWyvern_skill1_loop2_test = new ParticleType("HeroVoidWyvern_skill1_loop2_test");
    public static final ParticleType HeroVoidWyvern_skill1_loop_02 = new ParticleType("HeroVoidWyvern_skill1_loop_02");
    public static final ParticleType HeroVoidWyvern_skill1_loop_IN = new ParticleType("HeroVoidWyvern_skill1_loop_IN");
    public static final ParticleType HeroVoidWyvern_skill1_loop_imagination = new ParticleType("HeroVoidWyvern_skill1_loop_imagination");
    public static final ParticleType HeroVoidWyvern_skill2_projectile = new ParticleType("HeroVoidWyvern_skill2_projectile");
    public static final ParticleType HeroVoidWyvern_skill2_projectile_imagination = new ParticleType("HeroVoidWyvern_skill2_projectile_imagination");
    public static final ParticleType HeroVoidWyvern_skill3_gust_00 = new ParticleType("HeroVoidWyvern_skill3_gust_00");
    public static final ParticleType HeroVoidWyvern_skill3_gust_00_imagination = new ParticleType("HeroVoidWyvern_skill3_gust_00_imagination");
    public static final ParticleType HeroVoidWyvern_skill3_gust_01 = new ParticleType("HeroVoidWyvern_skill3_gust_01");
    public static final ParticleType HeroVoidWyvern_skill3_gust_01_imagination = new ParticleType("HeroVoidWyvern_skill3_gust_01_imagination");
    public static final ParticleType HeroVoidWyvern_skill4_DOT = new ParticleType("HeroVoidWyvern_skill4_DOT");
    public static final ParticleType HeroVoidWyvern_skill4_DOT_BG = new ParticleType("HeroVoidWyvern_skill4_DOT_BG");
    public static final ParticleType HeroVoidWyvern_skill4_DOT_FG = new ParticleType("HeroVoidWyvern_skill4_DOT_FG");
    public static final ParticleType HeroVoidWyvern_skill4_DOT_REF = new ParticleType("HeroVoidWyvern_skill4_DOT_REF");
    public static final ParticleType HeroVoidWyvern_skill4_DOT_imagination = new ParticleType("HeroVoidWyvern_skill4_DOT_imagination");
    public static final ParticleType HeroVoidWyvern_tail_precharge = new ParticleType("HeroVoidWyvern_tail_precharge");
    public static final ParticleType HeroVoidWyvern_tail_precharge_imagination = new ParticleType("HeroVoidWyvern_tail_precharge_imagination");
    public static final ParticleType HeroVoidWyvern_victory = new ParticleType("HeroVoidWyvern_victory");
    public static final ParticleType HeroVoidWyvern_victory_imagination = new ParticleType("HeroVoidWyvern_victory_imagination");
    public static final ParticleType HeroVulcanElf_HandSplash = new ParticleType("HeroVulcanElf_HandSplash");
    public static final ParticleType HeroVulcanElf_Hit = new ParticleType("HeroVulcanElf_Hit");
    public static final ParticleType HeroVulcanElf_LaserPoint = new ParticleType("HeroVulcanElf_LaserPoint");
    public static final ParticleType HeroVulcanElf_RingHit = new ParticleType("HeroVulcanElf_RingHit");
    public static final ParticleType HeroVulcanElf_Skill6_RingHit = new ParticleType("HeroVulcanElf_Skill6_RingHit");
    public static final ParticleType HeroVulcanElf_Skill6_SoulEnergy = new ParticleType("HeroVulcanElf_Skill6_SoulEnergy");
    public static final ParticleType HeroVulcanElf_Skill6_wave = new ParticleType("HeroVulcanElf_Skill6_wave");
    public static final ParticleType HeroVulcanElf_Teleporter = new ParticleType("HeroVulcanElf_Teleporter");
    public static final ParticleType HeroVulcanElf_TeleporterHand = new ParticleType("HeroVulcanElf_TeleporterHand");
    public static final ParticleType HeroVulcanElf_Torpedo = new ParticleType("HeroVulcanElf_Torpedo");
    public static final ParticleType HeroVultureDragon_attack = new ParticleType("HeroVultureDragon_attack");
    public static final ParticleType HeroVultureDragon_attack_Rr = new ParticleType("HeroVultureDragon_attack_Rr");
    public static final ParticleType HeroVultureDragon_skill4 = new ParticleType("HeroVultureDragon_skill4");
    public static final ParticleType HeroVultureDragon_skill4_Fr = new ParticleType("HeroVultureDragon_skill4_Fr");
    public static final ParticleType HeroVultureDragon_skill4_Rr = new ParticleType("HeroVultureDragon_skill4_Rr");
    public static final ParticleType HeroVultureDragon_skill4_dot = new ParticleType("HeroVultureDragon_skill4_dot");
    public static final ParticleType HeroVultureDragon_skill4_hit = new ParticleType("HeroVultureDragon_skill4_hit");
    public static final ParticleType HeroVultureDragon_skill5_blue_fire = new ParticleType("HeroVultureDragon_skill5_blue_fire");
    public static final ParticleType HeroVultureDragon_skill5_blue_fire02 = new ParticleType("HeroVultureDragon_skill5_blue_fire02");
    public static final ParticleType HeroVultureDragon_skill5_blue_fire03 = new ParticleType("HeroVultureDragon_skill5_blue_fire03");
    public static final ParticleType HeroVultureDragon_wingFlap = new ParticleType("HeroVultureDragon_wingFlap");
    public static final ParticleType HeroWeeWitch_attack = new ParticleType("HeroWeeWitch_attack");
    public static final ParticleType HeroWeeWitch_attack_hit = new ParticleType("HeroWeeWitch_attack_hit");
    public static final ParticleType HeroWeeWitch_attack_hit_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_attack_hit_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_attack_pre = new ParticleType("HeroWeeWitch_attack_pre");
    public static final ParticleType HeroWeeWitch_attack_pre_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_attack_pre_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_attack_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_attack_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_skill1_hit = new ParticleType("HeroWeeWitch_skill1_hit");
    public static final ParticleType HeroWeeWitch_skill1_hit_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_skill1_hit_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_skill1_launch = new ParticleType("HeroWeeWitch_skill1_launch");
    public static final ParticleType HeroWeeWitch_skill1_launch_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_skill1_launch_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_skill1_projectile = new ParticleType("HeroWeeWitch_skill1_projectile");
    public static final ParticleType HeroWeeWitch_skill1_projectile_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_skill1_projectile_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_skill2_beam_A = new ParticleType("HeroWeeWitch_skill2_beam_A");
    public static final ParticleType HeroWeeWitch_skill2_beam_A_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_skill2_beam_A_skin_pumpkin_witch");
    public static final ParticleType HeroWeeWitch_victory = new ParticleType("HeroWeeWitch_victory");
    public static final ParticleType HeroWeeWitch_victory_skin_pumpkin_witch = new ParticleType("HeroWeeWitch_victory_skin_pumpkin_witch");
    public static final ParticleType HeroWereDragon_Attack_Hand = new ParticleType("HeroWereDragon_Attack_Hand");
    public static final ParticleType HeroWereDragon_Attack_Hand_skin_mastery = new ParticleType("HeroWereDragon_Attack_Hand_skin_mastery");
    public static final ParticleType HeroWereDragon_Skill1_Fire_skin_mastery = new ParticleType("HeroWereDragon_Skill1_Fire_skin_mastery");
    public static final ParticleType HeroWereDragon_Skill1_Fireburst_skin_mastery = new ParticleType("HeroWereDragon_Skill1_Fireburst_skin_mastery");
    public static final ParticleType HeroWereDragon_Skill1_Smoke_skin_mastery = new ParticleType("HeroWereDragon_Skill1_Smoke_skin_mastery");
    public static final ParticleType HeroWereDragon_Skill3_FlameSurge = new ParticleType("HeroWereDragon_Skill3_FlameSurge");
    public static final ParticleType HeroWereDragon_Skill3_Knit_skin_mastery = new ParticleType("HeroWereDragon_Skill3_Knit_skin_mastery");
    public static final ParticleType HeroWereDragon_Skill3_Weave = new ParticleType("HeroWereDragon_Skill3_Weave");
    public static final ParticleType HeroWereDragon_attack = new ParticleType("HeroWereDragon_attack");
    public static final ParticleType HeroWereDragon_attack_hand = new ParticleType("HeroWereDragon_attack_hand");
    public static final ParticleType HeroWereDragon_attack_projectile = new ParticleType("HeroWereDragon_attack_projectile");
    public static final ParticleType HeroWereDragon_skill1_fire_BG = new ParticleType("HeroWereDragon_skill1_fire_BG");
    public static final ParticleType HeroWereDragon_skill1_fire_FR = new ParticleType("HeroWereDragon_skill1_fire_FR");
    public static final ParticleType HeroWereDragon_skill1_fireburst = new ParticleType("HeroWereDragon_skill1_fireburst");
    public static final ParticleType HeroWereDragon_skill3_beam = new ParticleType("HeroWereDragon_skill3_beam");
    public static final ParticleType HeroWereDragon_skill3_beam_fireFlare = new ParticleType("HeroWereDragon_skill3_beam_fireFlare");
    public static final ParticleType HeroWereDragon_skill3_beam_hit_engulf = new ParticleType("HeroWereDragon_skill3_beam_hit_engulf");
    public static final ParticleType HeroWereDragon_skill3_beam_hit_flare = new ParticleType("HeroWereDragon_skill3_beam_hit_flare");
    public static final ParticleType HeroWereDragon_skill3_flameSurge = new ParticleType("HeroWereDragon_skill3_flameSurge");
    public static final ParticleType HeroWereDragon_skill3_weave = new ParticleType("HeroWereDragon_skill3_weave");
    public static final ParticleType HeroWereDragon_skill5_blue_fire = new ParticleType("HeroWereDragon_skill5_blue_fire");
    public static final ParticleType HeroWereDragon_skill5_blue_fire02 = new ParticleType("HeroWereDragon_skill5_blue_fire02");
    public static final ParticleType HeroWereDragon_skill5_fire = new ParticleType("HeroWereDragon_skill5_fire");
    public static final ParticleType HeroWereDragon_skill5_hit = new ParticleType("HeroWereDragon_skill5_hit");
    public static final ParticleType HeroWereDragon_skill5_hit02 = new ParticleType("HeroWereDragon_skill5_hit02");
    public static final ParticleType HeroWeredragon_Death_Smoke_skin_mastery = new ParticleType("HeroWeredragon_Death_Smoke_skin_mastery");
    public static final ParticleType HeroWeredragon_Dynamic_Fire_skin_mastery = new ParticleType("HeroWeredragon_Dynamic_Fire_skin_mastery");
    public static final ParticleType HeroWeredragon_Revert_Rise_skin_mastery = new ParticleType("HeroWeredragon_Revert_Rise_skin_mastery");
    public static final ParticleType HeroWeredragon_Revert_Trim_skin_mastery = new ParticleType("HeroWeredragon_Revert_Trim_skin_mastery");
    public static final ParticleType HeroWeredragon_Skill1_Revert_skin_mastery = new ParticleType("HeroWeredragon_Skill1_Revert_skin_mastery");
    public static final ParticleType HeroWeredragon_Skill1_Upward_skin_mastery = new ParticleType("HeroWeredragon_Skill1_Upward_skin_mastery");
    public static final ParticleType HeroWeredragon_Underfooting_Smoke_skin_mastery = new ParticleType("HeroWeredragon_Underfooting_Smoke_skin_mastery");
    public static final ParticleType HeroWeredragon_death_revert = new ParticleType("HeroWeredragon_death_revert");
    public static final ParticleType HeroWeredragon_revert_spinner = new ParticleType("HeroWeredragon_revert_spinner");
    public static final ParticleType HeroWeredragon_revert_upward = new ParticleType("HeroWeredragon_revert_upward");
    public static final ParticleType HeroWeredragon_skill1_revert = new ParticleType("HeroWeredragon_skill1_revert");
    public static final ParticleType HeroWhiteTiger_Attack_Hit01 = new ParticleType("HeroWhiteTiger_Attack_Hit01");
    public static final ParticleType HeroWhiteTiger_Attack_Hit02 = new ParticleType("HeroWhiteTiger_Attack_Hit02");
    public static final ParticleType HeroWhiteTiger_Attack_Hit03 = new ParticleType("HeroWhiteTiger_Attack_Hit03");
    public static final ParticleType HeroWhiteTiger_Attack_Line = new ParticleType("HeroWhiteTiger_Attack_Line");
    public static final ParticleType HeroWhiteTiger_Attack_Line00 = new ParticleType("HeroWhiteTiger_Attack_Line00");
    public static final ParticleType HeroWhiteTiger_Attack_Line01 = new ParticleType("HeroWhiteTiger_Attack_Line01");
    public static final ParticleType HeroWhiteTiger_Attack_Line02 = new ParticleType("HeroWhiteTiger_Attack_Line02");
    public static final ParticleType HeroWhiteTiger_Attack_Line03 = new ParticleType("HeroWhiteTiger_Attack_Line03");
    public static final ParticleType HeroWhiteTiger_Attack_Punch01 = new ParticleType("HeroWhiteTiger_Attack_Punch01");
    public static final ParticleType HeroWhiteTiger_Attack_Punch02 = new ParticleType("HeroWhiteTiger_Attack_Punch02");
    public static final ParticleType HeroWhiteTiger_Attack_Punch03 = new ParticleType("HeroWhiteTiger_Attack_Punch03");
    public static final ParticleType HeroWhiteTiger_Skill1_Ballistic = new ParticleType("HeroWhiteTiger_Skill1_Ballistic");
    public static final ParticleType HeroWhiteTiger_Skill1_Caster = new ParticleType("HeroWhiteTiger_Skill1_Caster");
    public static final ParticleType HeroWhiteTiger_Skill1_Energy = new ParticleType("HeroWhiteTiger_Skill1_Energy");
    public static final ParticleType HeroWhiteTiger_Skill1_Hit = new ParticleType("HeroWhiteTiger_Skill1_Hit");
    public static final ParticleType HeroWhiteTiger_Skill2_Arrogance = new ParticleType("HeroWhiteTiger_Skill2_Arrogance");
    public static final ParticleType HeroWhiteTiger_Skill2_Blast = new ParticleType("HeroWhiteTiger_Skill2_Blast");
    public static final ParticleType HeroWhiteTiger_Skill2_Sole = new ParticleType("HeroWhiteTiger_Skill2_Sole");
    public static final ParticleType HeroWhiteTiger_Skill3_Ballistic = new ParticleType("HeroWhiteTiger_Skill3_Ballistic");
    public static final ParticleType HeroWhiteTiger_Skill3_Caster = new ParticleType("HeroWhiteTiger_Skill3_Caster");
    public static final ParticleType HeroWhiteTiger_Skill4_Caster = new ParticleType("HeroWhiteTiger_Skill4_Caster");
    public static final ParticleType HeroZombieSquire_Attack_Pop_skin_Digital = new ParticleType("HeroZombieSquire_Attack_Pop_skin_Digital");
    public static final ParticleType HeroZombieSquire_Attack_Wound_skin_Digital = new ParticleType("HeroZombieSquire_Attack_Wound_skin_Digital");
    public static final ParticleType HeroZombieSquire_BloodSplash = new ParticleType("HeroZombieSquire_BloodSplash");
    public static final ParticleType HeroZombieSquire_BloodSplashLeg = new ParticleType("HeroZombieSquire_BloodSplashLeg");
    public static final ParticleType HeroZombieSquire_BloodSplashSk2 = new ParticleType("HeroZombieSquire_BloodSplashSk2");
    public static final ParticleType HeroZombieSquire_Death_Drop_skin_Digital = new ParticleType("HeroZombieSquire_Death_Drop_skin_Digital");
    public static final ParticleType HeroZombieSquire_Death_Twinkle_skin_Digital = new ParticleType("HeroZombieSquire_Death_Twinkle_skin_Digital");
    public static final ParticleType HeroZombieSquire_Dust = new ParticleType("HeroZombieSquire_Dust");
    public static final ParticleType HeroZombieSquire_Hit_skin_Digital = new ParticleType("HeroZombieSquire_Hit_skin_Digital");
    public static final ParticleType HeroZombieSquire_ReviveFire = new ParticleType("HeroZombieSquire_ReviveFire");
    public static final ParticleType HeroZombieSquire_Shimmer = new ParticleType("HeroZombieSquire_Shimmer");
    public static final ParticleType HeroZombieSquire_Skill1_Hit_skin_Digital = new ParticleType("HeroZombieSquire_Skill1_Hit_skin_Digital");
    public static final ParticleType HeroZombieSquire_Skill2_Hit_skin_Digital = new ParticleType("HeroZombieSquire_Skill2_Hit_skin_Digital");
    public static final ParticleType HeroZombieSquire_Walk_Dust_skin_Digital = new ParticleType("HeroZombieSquire_Walk_Dust_skin_Digital");
    public static final ParticleType HeroZombieSquire_Walk_Particle_skin_Digital = new ParticleType("HeroZombieSquire_Walk_Particle_skin_Digital");
    public static final ParticleType MonsterAngelicAvenger_BasicAttack = new ParticleType("MonsterAngelicAvenger_BasicAttack");
    public static final ParticleType MonsterAnt_ambush = new ParticleType("MonsterAnt_ambush");
    public static final ParticleType MonsterAnt_digdug = new ParticleType("MonsterAnt_digdug");
    public static final ParticleType MonsterAnt_digdug_Fr = new ParticleType("MonsterAnt_digdug_Fr");
    public static final ParticleType MonsterAnubisDragon_Attack_Drop = new ParticleType("MonsterAnubisDragon_Attack_Drop");
    public static final ParticleType MonsterAnubisDragon_Attack_Hit = new ParticleType("MonsterAnubisDragon_Attack_Hit");
    public static final ParticleType MonsterAnubisDragon_Attack_Storage = new ParticleType("MonsterAnubisDragon_Attack_Storage");
    public static final ParticleType MonsterAnubisDragon_Hit_Brust = new ParticleType("MonsterAnubisDragon_Hit_Brust");
    public static final ParticleType MonsterAnubisDragon_Hit_Shield = new ParticleType("MonsterAnubisDragon_Hit_Shield");
    public static final ParticleType MonsterAnubisDragon_Idle_Buff = new ParticleType("MonsterAnubisDragon_Idle_Buff");
    public static final ParticleType MonsterAnubisDragon_Idle_Buff02 = new ParticleType("MonsterAnubisDragon_Idle_Buff02");
    public static final ParticleType MonsterAnubisDragon_Skill1_Caster = new ParticleType("MonsterAnubisDragon_Skill1_Caster");
    public static final ParticleType MonsterAnubisDragon_Skill1_Hit = new ParticleType("MonsterAnubisDragon_Skill1_Hit");
    public static final ParticleType MonsterAnubisDragon_Skill1_Sand01 = new ParticleType("MonsterAnubisDragon_Skill1_Sand01");
    public static final ParticleType MonsterAnubisDragon_Skill1_Sand02 = new ParticleType("MonsterAnubisDragon_Skill1_Sand02");
    public static final ParticleType MonsterAnubisDragon_Skill1_Sand03 = new ParticleType("MonsterAnubisDragon_Skill1_Sand03");
    public static final ParticleType MonsterAnubisDragon_Victory_Gather = new ParticleType("MonsterAnubisDragon_Victory_Gather");
    public static final ParticleType MonsterAnubisDragon_Victory_Loop_Wing = new ParticleType("MonsterAnubisDragon_Victory_Loop_Wing");
    public static final ParticleType MonsterAnubisDragon_Victory_Wing = new ParticleType("MonsterAnubisDragon_Victory_Wing");
    public static final ParticleType MonsterArcherGrunt_ArrowImpact = new ParticleType("MonsterArcherGrunt_ArrowImpact");
    public static final ParticleType MonsterArcherGrunt_ArrowRelease = new ParticleType("MonsterArcherGrunt_ArrowRelease");
    public static final ParticleType MonsterArcherMagic_ArrowCharge = new ParticleType("MonsterArcherMagic_ArrowCharge");
    public static final ParticleType MonsterArcherMagic_ArrowImpact = new ParticleType("MonsterArcherMagic_ArrowImpact");
    public static final ParticleType MonsterArcherPhys_ArrowImpact = new ParticleType("MonsterArcherPhys_ArrowImpact");
    public static final ParticleType MonsterArcherPhys_ArrowRelease = new ParticleType("MonsterArcherPhys_ArrowRelease");
    public static final ParticleType MonsterBlueDragon_Attack_Hit = new ParticleType("MonsterBlueDragon_Attack_Hit");
    public static final ParticleType MonsterBlueDragon_Attack_Water = new ParticleType("MonsterBlueDragon_Attack_Water");
    public static final ParticleType MonsterBlueDragon_Attack_WaterSpray = new ParticleType("MonsterBlueDragon_Attack_WaterSpray");
    public static final ParticleType MonsterBlueDragon_Skill1_Gather = new ParticleType("MonsterBlueDragon_Skill1_Gather");
    public static final ParticleType MonsterBlueDragon_Skill1_SwordRain = new ParticleType("MonsterBlueDragon_Skill1_SwordRain");
    public static final ParticleType MonsterBlueDragon_Skill2_buff = new ParticleType("MonsterBlueDragon_Skill2_buff");
    public static final ParticleType MonsterBossAbyssDragon_Attack_Hit = new ParticleType("MonsterBossAbyssDragon_Attack_Hit");
    public static final ParticleType MonsterBossAbyssDragon_Attack_Water = new ParticleType("MonsterBossAbyssDragon_Attack_Water");
    public static final ParticleType MonsterBossAbyssDragon_Attack_WaterSpray = new ParticleType("MonsterBossAbyssDragon_Attack_WaterSpray");
    public static final ParticleType MonsterBossAbyssDragon_Skill1_Gather = new ParticleType("MonsterBossAbyssDragon_Skill1_Gather");
    public static final ParticleType MonsterBossAbyssDragon_Skill1_SwordRain = new ParticleType("MonsterBossAbyssDragon_Skill1_SwordRain");
    public static final ParticleType MonsterBossAbyssDragon_Skill2_buff = new ParticleType("MonsterBossAbyssDragon_Skill2_buff");
    public static final ParticleType MonsterBossAnubisDragon_Attack_Drop = new ParticleType("MonsterBossAnubisDragon_Attack_Drop");
    public static final ParticleType MonsterBossAnubisDragon_Attack_Hit = new ParticleType("MonsterBossAnubisDragon_Attack_Hit");
    public static final ParticleType MonsterBossAnubisDragon_Attack_Storage = new ParticleType("MonsterBossAnubisDragon_Attack_Storage");
    public static final ParticleType MonsterBossAnubisDragon_Hit_Brust = new ParticleType("MonsterBossAnubisDragon_Hit_Brust");
    public static final ParticleType MonsterBossAnubisDragon_Hit_Shield = new ParticleType("MonsterBossAnubisDragon_Hit_Shield");
    public static final ParticleType MonsterBossAnubisDragon_Idle_Buff = new ParticleType("MonsterBossAnubisDragon_Idle_Buff");
    public static final ParticleType MonsterBossAnubisDragon_Idle_Buff02 = new ParticleType("MonsterBossAnubisDragon_Idle_Buff02");
    public static final ParticleType MonsterBossAnubisDragon_Skill1_Caster = new ParticleType("MonsterBossAnubisDragon_Skill1_Caster");
    public static final ParticleType MonsterBossAnubisDragon_Skill1_Hit = new ParticleType("MonsterBossAnubisDragon_Skill1_Hit");
    public static final ParticleType MonsterBossAnubisDragon_Skill1_Sand01 = new ParticleType("MonsterBossAnubisDragon_Skill1_Sand01");
    public static final ParticleType MonsterBossAnubisDragon_Skill1_Sand02 = new ParticleType("MonsterBossAnubisDragon_Skill1_Sand02");
    public static final ParticleType MonsterBossAnubisDragon_Skill1_Sand03 = new ParticleType("MonsterBossAnubisDragon_Skill1_Sand03");
    public static final ParticleType MonsterBossAnubisDragon_Victory_Gather = new ParticleType("MonsterBossAnubisDragon_Victory_Gather");
    public static final ParticleType MonsterBossAnubisDragon_Victory_Loop_Wing = new ParticleType("MonsterBossAnubisDragon_Victory_Loop_Wing");
    public static final ParticleType MonsterBossAnubisDragon_Victory_Wing = new ParticleType("MonsterBossAnubisDragon_Victory_Wing");
    public static final ParticleType MonsterBossUmlautTheFirst_Attack = new ParticleType("MonsterBossUmlautTheFirst_Attack");
    public static final ParticleType MonsterBossUmlautTheFirst_Attack_Line = new ParticleType("MonsterBossUmlautTheFirst_Attack_Line");
    public static final ParticleType MonsterBossUmlautTheFirst_Skill1_Earthquake1 = new ParticleType("MonsterBossUmlautTheFirst_Skill1_Earthquake1");
    public static final ParticleType MonsterBossUmlautTheFirst_Skill1_Earthquake2 = new ParticleType("MonsterBossUmlautTheFirst_Skill1_Earthquake2");
    public static final ParticleType MonsterBossUmlautTheFirst_Skill2_Base = new ParticleType("MonsterBossUmlautTheFirst_Skill2_Base");
    public static final ParticleType MonsterBossUmlautTheFirst_Skill2_Litht1 = new ParticleType("MonsterBossUmlautTheFirst_Skill2_Litht1");
    public static final ParticleType MonsterBossUmlautTheFirst_Skill2_Litht2 = new ParticleType("MonsterBossUmlautTheFirst_Skill2_Litht2");
    public static final ParticleType MonsterBossUmlautTheFirst_Skill2_Twinkle = new ParticleType("MonsterBossUmlautTheFirst_Skill2_Twinkle");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Attack = new ParticleType("MonsterBossUmlautthefifthFirst_Attack");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Attack_Hit = new ParticleType("MonsterBossUmlautthefifthFirst_Attack_Hit");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Death = new ParticleType("MonsterBossUmlautthefifthFirst_Death");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill1_Bolt = new ParticleType("MonsterBossUmlautthefifthFirst_Skill1_Bolt");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill1_Gather2 = new ParticleType("MonsterBossUmlautthefifthFirst_Skill1_Gather2");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill1_Gather3 = new ParticleType("MonsterBossUmlautthefifthFirst_Skill1_Gather3");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill1_Gather4 = new ParticleType("MonsterBossUmlautthefifthFirst_Skill1_Gather4");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill1_Hit = new ParticleType("MonsterBossUmlautthefifthFirst_Skill1_Hit");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill1_Knife02 = new ParticleType("MonsterBossUmlautthefifthFirst_Skill1_Knife02");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill2 = new ParticleType("MonsterBossUmlautthefifthFirst_Skill2");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill3_Gather = new ParticleType("MonsterBossUmlautthefifthFirst_Skill3_Gather");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill3_Gather02 = new ParticleType("MonsterBossUmlautthefifthFirst_Skill3_Gather02");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill3_Line = new ParticleType("MonsterBossUmlautthefifthFirst_Skill3_Line");
    public static final ParticleType MonsterBossUmlautthefifthFirst_Skill3_Shockwave = new ParticleType("MonsterBossUmlautthefifthFirst_Skill3_Shockwave");
    public static final ParticleType MonsterBreakerMkii_Attack = new ParticleType("MonsterBreakerMkii_Attack");
    public static final ParticleType MonsterBreakerMkii_Skill_Attack = new ParticleType("MonsterBreakerMkii_Skill_Attack");
    public static final ParticleType MonsterBreakerMkii_Skill_End = new ParticleType("MonsterBreakerMkii_Skill_End");
    public static final ParticleType MonsterBreakerMkii_Skill_Star = new ParticleType("MonsterBreakerMkii_Skill_Star");
    public static final ParticleType MonsterCauldron_Death = new ParticleType("MonsterCauldron_Death");
    public static final ParticleType MonsterCauldron_Death_Fire = new ParticleType("MonsterCauldron_Death_Fire");
    public static final ParticleType MonsterCauldron_Vicotry_Hit = new ParticleType("MonsterCauldron_Vicotry_Hit");
    public static final ParticleType MonsterCauldron_Vicotry_SplashF = new ParticleType("MonsterCauldron_Vicotry_SplashF");
    public static final ParticleType MonsterCloud_AttackImpact = new ParticleType("MonsterCloud_AttackImpact");
    public static final ParticleType MonsterCloud_Shield_rain = new ParticleType("MonsterCloud_Shield_rain");
    public static final ParticleType MonsterCloud_VictoryRain = new ParticleType("MonsterCloud_VictoryRain");
    public static final ParticleType MonsterCrystalLizard_Attack_Follow = new ParticleType("MonsterCrystalLizard_Attack_Follow");
    public static final ParticleType MonsterCrystalLizard_Attack_Hit = new ParticleType("MonsterCrystalLizard_Attack_Hit");
    public static final ParticleType MonsterCrystalLizard_Skill1_End_Blast = new ParticleType("MonsterCrystalLizard_Skill1_End_Blast");
    public static final ParticleType MonsterCrystalLizard_Skill1_Loop_Circle = new ParticleType("MonsterCrystalLizard_Skill1_Loop_Circle");
    public static final ParticleType MonsterCrystalLizard_Skill1_Start_Gather = new ParticleType("MonsterCrystalLizard_Skill1_Start_Gather");
    public static final ParticleType MonsterEyeball_AttackPop = new ParticleType("MonsterEyeball_AttackPop");
    public static final ParticleType MonsterEyeball_HitImpact = new ParticleType("MonsterEyeball_HitImpact");
    public static final ParticleType MonsterFleaDemon_attack_hit = new ParticleType("MonsterFleaDemon_attack_hit");
    public static final ParticleType MonsterFleaDemon_deathPop = new ParticleType("MonsterFleaDemon_deathPop");
    public static final ParticleType MonsterGoblin_impact = new ParticleType("MonsterGoblin_impact");
    public static final ParticleType MonsterHeadCrab_Attack = new ParticleType("MonsterHeadCrab_Attack");
    public static final ParticleType MonsterInfernoSpider_AttackFireStart = new ParticleType("MonsterInfernoSpider_AttackFireStart");
    public static final ParticleType MonsterInfernoSpider_AttackFire_Proj = new ParticleType("MonsterInfernoSpider_AttackFire_Proj");
    public static final ParticleType MonsterInfernoSpider_AttackLanded = new ParticleType("MonsterInfernoSpider_AttackLanded");
    public static final ParticleType MonsterInfernoSpider_AttackLaunching = new ParticleType("MonsterInfernoSpider_AttackLaunching");
    public static final ParticleType MonsterKamikazeGnome_AttackExplosion = new ParticleType("MonsterKamikazeGnome_AttackExplosion");
    public static final ParticleType MonsterKamikazeGnome_AttackFuse = new ParticleType("MonsterKamikazeGnome_AttackFuse");
    public static final ParticleType MonsterKamikazeGnome_Ground = new ParticleType("MonsterKamikazeGnome_Ground");
    public static final ParticleType MonsterKingImp_Gold_EnergyExplosion = new ParticleType("MonsterKingImp_Gold_EnergyExplosion");
    public static final ParticleType MonsterKingImp_Gold_MeatExplosion = new ParticleType("MonsterKingImp_Gold_MeatExplosion");
    public static final ParticleType MonsterKingImp_Gold_RedSmokeExplosion = new ParticleType("MonsterKingImp_Gold_RedSmokeExplosion");
    public static final ParticleType MonsterKingImp_Gold_ShieldBubble = new ParticleType("MonsterKingImp_Gold_ShieldBubble");
    public static final ParticleType MonsterKingImp_Silver_EnergyExplosion = new ParticleType("MonsterKingImp_Silver_EnergyExplosion");
    public static final ParticleType MonsterKingImp_Silver_GraySmokeExplosion = new ParticleType("MonsterKingImp_Silver_GraySmokeExplosion");
    public static final ParticleType MonsterKingImp_Silver_MeatExplosion = new ParticleType("MonsterKingImp_Silver_MeatExplosion");
    public static final ParticleType MonsterKingImp_Silver_ShieldBubble = new ParticleType("MonsterKingImp_Silver_ShieldBubble");
    public static final ParticleType MonsterKingImp_Skill2_Transformation = new ParticleType("MonsterKingImp_Skill2_Transformation");
    public static final ParticleType MonsterLyingLantern_deathFlash_01 = new ParticleType("MonsterLyingLantern_deathFlash_01");
    public static final ParticleType MonsterLyingLantern_death_02 = new ParticleType("MonsterLyingLantern_death_02");
    public static final ParticleType MonsterLyingLantern_debuff_01 = new ParticleType("MonsterLyingLantern_debuff_01");
    public static final ParticleType MonsterLyingLantern_skill = new ParticleType("MonsterLyingLantern_skill");
    public static final ParticleType MonsterLyingLantern_skill_Bg = new ParticleType("MonsterLyingLantern_skill_Bg");
    public static final ParticleType MonsterMagicGolem_Death = new ParticleType("MonsterMagicGolem_Death");
    public static final ParticleType MonsterMagicGolem_DeathH = new ParticleType("MonsterMagicGolem_DeathH");
    public static final ParticleType MonsterMagicGolem_MissileExplosion = new ParticleType("MonsterMagicGolem_MissileExplosion");
    public static final ParticleType MonsterMagicGolem_MissileExplosion_rt = new ParticleType("MonsterMagicGolem_MissileExplosion_rt");
    public static final ParticleType MonsterMagicGolem_MissileImpact = new ParticleType("MonsterMagicGolem_MissileImpact");
    public static final ParticleType MonsterMagicGolem_hit = new ParticleType("MonsterMagicGolem_hit");
    public static final ParticleType MonsterMagicGolem_victory = new ParticleType("MonsterMagicGolem_victory");
    public static final ParticleType MonsterMagicImp_EnergyExplosion = new ParticleType("MonsterMagicImp_EnergyExplosion");
    public static final ParticleType MonsterMagicImp_MeatExplosion = new ParticleType("MonsterMagicImp_MeatExplosion");
    public static final ParticleType MonsterMagicImp_RedSmokeExplosion = new ParticleType("MonsterMagicImp_RedSmokeExplosion");
    public static final ParticleType MonsterMagicImp_ShieldBubble = new ParticleType("MonsterMagicImp_ShieldBubble");
    public static final ParticleType MonsterManEatingPlant_AttackSplash = new ParticleType("MonsterManEatingPlant_AttackSplash");
    public static final ParticleType MonsterManEatingPlant_Hide_Puff = new ParticleType("MonsterManEatingPlant_Hide_Puff");
    public static final ParticleType MonsterManEatingPlant_Hide_Smoke = new ParticleType("MonsterManEatingPlant_Hide_Smoke");
    public static final ParticleType MonsterManEatingPlant_Hide_SmokeBg = new ParticleType("MonsterManEatingPlant_Hide_SmokeBg");
    public static final ParticleType MonsterManEatingPlant_Hit = new ParticleType("MonsterManEatingPlant_Hit");
    public static final ParticleType MonsterManEatingPlant_WalkDust = new ParticleType("MonsterManEatingPlant_WalkDust");
    public static final ParticleType MonsterManEatingPlant_WalkDustFG = new ParticleType("MonsterManEatingPlant_WalkDustFG");
    public static final ParticleType MonsterMrSmashy_AttackDust = new ParticleType("MonsterMrSmashy_AttackDust");
    public static final ParticleType MonsterMrSmashy_AttackDustBG = new ParticleType("MonsterMrSmashy_AttackDustBG");
    public static final ParticleType MonsterMrSmashy_AttackRing = new ParticleType("MonsterMrSmashy_AttackRing");
    public static final ParticleType MonsterMrSmashy_DeathDust = new ParticleType("MonsterMrSmashy_DeathDust");
    public static final ParticleType MonsterMrSmashy_DeathDustFG = new ParticleType("MonsterMrSmashy_DeathDustFG");
    public static final ParticleType MonsterMrSmashy_Hit = new ParticleType("MonsterMrSmashy_Hit");
    public static final ParticleType MonsterMrSmashy_WalkDust = new ParticleType("MonsterMrSmashy_WalkDust");
    public static final ParticleType MonsterMushroom_AttackShoot = new ParticleType("MonsterMushroom_AttackShoot");
    public static final ParticleType MonsterMushroom_AttackSpore = new ParticleType("MonsterMushroom_AttackSpore");
    public static final ParticleType MonsterMushroom_AttackSpore_Impact = new ParticleType("MonsterMushroom_AttackSpore_Impact");
    public static final ParticleType MonsterMushroom_Victory = new ParticleType("MonsterMushroom_Victory");
    public static final ParticleType MonsterPhysGolem_Death = new ParticleType("MonsterPhysGolem_Death");
    public static final ParticleType MonsterPhysGolem_DeathH = new ParticleType("MonsterPhysGolem_DeathH");
    public static final ParticleType MonsterPhysGolem_MissileExplosion = new ParticleType("MonsterPhysGolem_MissileExplosion");
    public static final ParticleType MonsterPhysGolem_MissileExplosion_rt = new ParticleType("MonsterPhysGolem_MissileExplosion_rt");
    public static final ParticleType MonsterPhysGolem_MissileImpact = new ParticleType("MonsterPhysGolem_MissileImpact");
    public static final ParticleType MonsterPhysGolem_hit = new ParticleType("MonsterPhysGolem_hit");
    public static final ParticleType MonsterPhysGolem_victory = new ParticleType("MonsterPhysGolem_victory");
    public static final ParticleType MonsterPhysImp_EnergyExplosion = new ParticleType("MonsterPhysImp_EnergyExplosion");
    public static final ParticleType MonsterPhysImp_GraySmokeExplosion = new ParticleType("MonsterPhysImp_GraySmokeExplosion");
    public static final ParticleType MonsterPhysImp_MeatExplosion = new ParticleType("MonsterPhysImp_MeatExplosion");
    public static final ParticleType MonsterPhysImp_ShieldBubble = new ParticleType("MonsterPhysImp_ShieldBubble");
    public static final ParticleType MonsterPlagueSkulker_attack = new ParticleType("MonsterPlagueSkulker_attack");
    public static final ParticleType MonsterPlagueSkulker_attack_A = new ParticleType("MonsterPlagueSkulker_attack_A");
    public static final ParticleType MonsterPlagueSkulker_attack_B = new ParticleType("MonsterPlagueSkulker_attack_B");
    public static final ParticleType MonsterPlagueSkulker_death_gutSplat = new ParticleType("MonsterPlagueSkulker_death_gutSplat");
    public static final ParticleType MonsterPlagueSkulker_death_ratrun1 = new ParticleType("MonsterPlagueSkulker_death_ratrun1");
    public static final ParticleType MonsterPlagueSkulker_death_ratrun2 = new ParticleType("MonsterPlagueSkulker_death_ratrun2");
    public static final ParticleType MonsterPlagueSkulker_death_ratrun3 = new ParticleType("MonsterPlagueSkulker_death_ratrun3");
    public static final ParticleType MonsterPlagueSkulker_death_soft = new ParticleType("MonsterPlagueSkulker_death_soft");
    public static final ParticleType MonsterRedtiger_Attack_Claw = new ParticleType("MonsterRedtiger_Attack_Claw");
    public static final ParticleType MonsterRedtiger_Attack_Hit = new ParticleType("MonsterRedtiger_Attack_Hit");
    public static final ParticleType MonsterRedtiger_Skill_Enchantment_End = new ParticleType("MonsterRedtiger_Skill_Enchantment_End");
    public static final ParticleType MonsterRedtiger_Skill_Enchantment_Hit = new ParticleType("MonsterRedtiger_Skill_Enchantment_Hit");
    public static final ParticleType MonsterRedtiger_Skill_Enchantment_Loop = new ParticleType("MonsterRedtiger_Skill_Enchantment_Loop");
    public static final ParticleType MonsterRedtiger_Skill_Enchantment_Start = new ParticleType("MonsterRedtiger_Skill_Enchantment_Start");
    public static final ParticleType MonsterScarecrow_DeathDust = new ParticleType("MonsterScarecrow_DeathDust");
    public static final ParticleType MonsterScarecrow_DeathSmokey = new ParticleType("MonsterScarecrow_DeathSmokey");
    public static final ParticleType MonsterScarecrow_PumpkinBurst = new ParticleType("MonsterScarecrow_PumpkinBurst");
    public static final ParticleType MonsterScarecrow_PumpkinFire = new ParticleType("MonsterScarecrow_PumpkinFire");
    public static final ParticleType MonsterScarecrow_PumpkinFireThin = new ParticleType("MonsterScarecrow_PumpkinFireThin");
    public static final ParticleType MonsterScarecrow_PumpkinProj = new ParticleType("MonsterScarecrow_PumpkinProj");
    public static final ParticleType MonsterScarecrow_Victory = new ParticleType("MonsterScarecrow_Victory");
    public static final ParticleType MonsterSharkWarrior_attack = new ParticleType("MonsterSharkWarrior_attack");
    public static final ParticleType MonsterSharkWarrior_attackImpact = new ParticleType("MonsterSharkWarrior_attackImpact");
    public static final ParticleType MonsterSharkWarrior_counterBite = new ParticleType("MonsterSharkWarrior_counterBite");
    public static final ParticleType MonsterSharkWarrior_death = new ParticleType("MonsterSharkWarrior_death");
    public static final ParticleType MonsterSinisterAssailant_Attack_Hit1 = new ParticleType("MonsterSinisterAssailant_Attack_Hit1");
    public static final ParticleType MonsterSinisterAssailant_Attack_Hit3 = new ParticleType("MonsterSinisterAssailant_Attack_Hit3");
    public static final ParticleType MonsterSinisterAssailant_Attack_Smoke = new ParticleType("MonsterSinisterAssailant_Attack_Smoke");
    public static final ParticleType MonsterSinisterAssailant_Death = new ParticleType("MonsterSinisterAssailant_Death");
    public static final ParticleType MonsterSinisterAssailant_Death_Rotate = new ParticleType("MonsterSinisterAssailant_Death_Rotate");
    public static final ParticleType MonsterSinisterAssailant_Idle_Skull = new ParticleType("MonsterSinisterAssailant_Idle_Skull");
    public static final ParticleType MonsterSinisterAssailant_Idle_Somke = new ParticleType("MonsterSinisterAssailant_Idle_Somke");
    public static final ParticleType MonsterSinisterAssailant_Idle_Somke2 = new ParticleType("MonsterSinisterAssailant_Idle_Somke2");
    public static final ParticleType MonsterSinisterAssailant_Skill1_Ballistic = new ParticleType("MonsterSinisterAssailant_Skill1_Ballistic");
    public static final ParticleType MonsterSinisterAssailant_Skill1_Ballistic2 = new ParticleType("MonsterSinisterAssailant_Skill1_Ballistic2");
    public static final ParticleType MonsterSinisterAssailant_Skill1_Converge = new ParticleType("MonsterSinisterAssailant_Skill1_Converge");
    public static final ParticleType MonsterSinisterAssailant_Skill1_Hit1 = new ParticleType("MonsterSinisterAssailant_Skill1_Hit1");
    public static final ParticleType MonsterSinisterAssailant_Skill1_knife = new ParticleType("MonsterSinisterAssailant_Skill1_knife");
    public static final ParticleType MonsterSinisterAssailant_Victory = new ParticleType("MonsterSinisterAssailant_Victory");
    public static final ParticleType MonsterSinisterAssailant_Walk_Skull = new ParticleType("MonsterSinisterAssailant_Walk_Skull");
    public static final ParticleType MonsterSinisterAssailant_Walk_Smoke = new ParticleType("MonsterSinisterAssailant_Walk_Smoke");
    public static final ParticleType MonsterSinisterAssailant_hit_Skull = new ParticleType("MonsterSinisterAssailant_hit_Skull");
    public static final ParticleType MonsterSkeletonDeer_Attack_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Attack_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Charge_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Charge_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Death_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Death_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Hit_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Hit_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Idle_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Idle_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Stun_Attack_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Stun_Attack_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Victory_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Victory_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_Walk_Shine_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_Walk_Shine_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_attackFlame = new ParticleType("MonsterSkeletonDeer_attackFlame");
    public static final ParticleType MonsterSkeletonDeer_attackFlame_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_attackFlame_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_attackHooves = new ParticleType("MonsterSkeletonDeer_attackHooves");
    public static final ParticleType MonsterSkeletonDeer_deathExplosion = new ParticleType("MonsterSkeletonDeer_deathExplosion");
    public static final ParticleType MonsterSkeletonDeer_deathExplosion_skin_ascendant_deer = new ParticleType("MonsterSkeletonDeer_deathExplosion_skin_ascendant_deer");
    public static final ParticleType MonsterSkeletonDeer_spawnBlacksmoke = new ParticleType("MonsterSkeletonDeer_spawnBlacksmoke");
    public static final ParticleType MonsterSkeletonDeer_stunGlowEyes = new ParticleType("MonsterSkeletonDeer_stunGlowEyes");
    public static final ParticleType MonsterSkeletonDeer_stunHooves = new ParticleType("MonsterSkeletonDeer_stunHooves");
    public static final ParticleType MonsterSkeletonDeer_stunSwipe = new ParticleType("MonsterSkeletonDeer_stunSwipe");
    public static final ParticleType MonsterSkeletonDeer_stunSwipe_Impact = new ParticleType("MonsterSkeletonDeer_stunSwipe_Impact");
    public static final ParticleType MonsterSpriteBuff_AttackStcik = new ParticleType("MonsterSpriteBuff_AttackStcik");
    public static final ParticleType MonsterSpriteBuff_AttackTummy = new ParticleType("MonsterSpriteBuff_AttackTummy");
    public static final ParticleType MonsterSpriteHeal_EnergyHeal = new ParticleType("MonsterSpriteHeal_EnergyHeal");
    public static final ParticleType MonsterSpriteHeal_EnergyStick = new ParticleType("MonsterSpriteHeal_EnergyStick");
    public static final ParticleType MonsterSquid_AttackInk_Proj = new ParticleType("MonsterSquid_AttackInk_Proj");
    public static final ParticleType MonsterSquid_AttackInk_Release = new ParticleType("MonsterSquid_AttackInk_Release");
    public static final ParticleType MonsterSquid_InkEvaporate = new ParticleType("MonsterSquid_InkEvaporate");
    public static final ParticleType MonsterSquirrel_hit = new ParticleType("MonsterSquirrel_hit");
    public static final ParticleType MonsterTrollBlob_AttackSplash = new ParticleType("MonsterTrollBlob_AttackSplash");
    public static final ParticleType MonsterTrollBlob_WalkSlime = new ParticleType("MonsterTrollBlob_WalkSlime");
    public static final ParticleType MonsterUmlautthefifthFirst_Attack = new ParticleType("MonsterUmlautthefifthFirst_Attack");
    public static final ParticleType MonsterUmlautthefifthFirst_Attack_Hit = new ParticleType("MonsterUmlautthefifthFirst_Attack_Hit");
    public static final ParticleType MonsterUmlautthefifthFirst_Death = new ParticleType("MonsterUmlautthefifthFirst_Death");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill1_Bolt = new ParticleType("MonsterUmlautthefifthFirst_Skill1_Bolt");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill1_Gather2 = new ParticleType("MonsterUmlautthefifthFirst_Skill1_Gather2");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill1_Gather3 = new ParticleType("MonsterUmlautthefifthFirst_Skill1_Gather3");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill1_Gather4 = new ParticleType("MonsterUmlautthefifthFirst_Skill1_Gather4");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill1_Hit = new ParticleType("MonsterUmlautthefifthFirst_Skill1_Hit");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill1_Knife02 = new ParticleType("MonsterUmlautthefifthFirst_Skill1_Knife02");
    public static final ParticleType MonsterUmlautthefifthFirst_Skill2 = new ParticleType("MonsterUmlautthefifthFirst_Skill2");
    private static final Map<ParticleType, UnitType> PARTICLE_MAPPING = new HashMap();
    public static final ParticleType Rewards_glow = new ParticleType("Rewards_glow");
    public static final ParticleType Rewards_tier_blue = new ParticleType("Rewards_tier_blue");
    public static final ParticleType Rewards_tier_green = new ParticleType("Rewards_tier_green");
    public static final ParticleType Rewards_tier_pink = new ParticleType("Rewards_tier_pink");
    public static final ParticleType Rewards_tier_plane = new ParticleType("Rewards_tier_plane");
    public static final ParticleType Rewards_tier_yellow = new ParticleType("Rewards_tier_yellow");
    public static final ParticleType RuneEmpower_dust = new ParticleType("RuneEmpower_dust");
    public static final ParticleType RuneEmpower_loop_burst = new ParticleType("RuneEmpower_loop_burst");
    public static final ParticleType RuneEmpower_only_swirl = new ParticleType("RuneEmpower_only_swirl");
    public static final ParticleType RuneEmpower_only_swirl_fail = new ParticleType("RuneEmpower_only_swirl_fail");
    public static final ParticleType Rune_ActivationGlowA = new ParticleType("Rune_ActivationGlowA");
    public static final ParticleType Rune_Shrine_centerMagic = new ParticleType("Rune_Shrine_centerMagic");
    public static final ParticleType Rune_Shrine_flashStone = new ParticleType("Rune_Shrine_flashStone");
    public static final ParticleType Rune_Shrine_floatingStoneFollow = new ParticleType("Rune_Shrine_floatingStoneFollow");
    public static final ParticleType Rune_Shrine_lfMagic = new ParticleType("Rune_Shrine_lfMagic");
    public static final ParticleType Rune_Shrine_rtMagic = new ParticleType("Rune_Shrine_rtMagic");
    public static final ParticleType Rune_StarMask = new ParticleType("Rune_StarMask");
    public static final ParticleType Shield_break = new ParticleType("Shield_break");
    public static final ParticleType StarBurst = new ParticleType("StarBurst");
    public static final ParticleType Trail = new ParticleType("Trail");
    public static final ParticleType UI_Chest_13642_FLASH = new ParticleType("UI_Chest_13642_FLASH");
    public static final ParticleType UI_Chest_13642_PULSE = new ParticleType("UI_Chest_13642_PULSE");
    private static final Map<UnitType, Set<ParticleType>> UNIT_MAPPING = new HashMap();
    private static final Set<ParticleType> UPDATE_IN_REALTIME = new HashSet();
    public static final ParticleType chest_spring_FX_BG = new ParticleType("chest_spring_FX_BG");
    public static final ParticleType chest_spring_FX_MID = new ParticleType("chest_spring_FX_MID");
    public static final ParticleType chest_spring_FX_TOP = new ParticleType("chest_spring_FX_TOP");
    public static final ParticleType chest_valentine_FX_BG = new ParticleType("chest_valentine_FX_BG");
    public static final ParticleType chest_valentine_FX_MID = new ParticleType("chest_valentine_FX_MID");
    public static final ParticleType chest_valentine_FX_TOP = new ParticleType("chest_valentine_FX_TOP");
    public static final ParticleType chests_open_DEFAULT_FX_BG = new ParticleType("chests_open_DEFAULT_FX_BG");
    public static final ParticleType chests_open_DEFAULT_FX_MID = new ParticleType("chests_open_DEFAULT_FX_MID");
    public static final ParticleType chests_open_DEFAULT_FX_TOP = new ParticleType("chests_open_DEFAULT_FX_TOP");
    public static final ParticleType chests_open_EXPEDITION_FX_BG = new ParticleType("chests_open_EXPEDITION_FX_BG");
    public static final ParticleType chests_open_EXPEDITION_FX_MID = new ParticleType("chests_open_EXPEDITION_FX_MID");
    public static final ParticleType chests_open_EXPEDITION_FX_TOP = new ParticleType("chests_open_EXPEDITION_FX_TOP");
    public static final ParticleType chests_open_GOLD_FX_BG = new ParticleType("chests_open_GOLD_FX_BG");
    public static final ParticleType chests_open_GOLD_FX_MID = new ParticleType("chests_open_GOLD_FX_MID");
    public static final ParticleType chests_open_GOLD_FX_TOP = new ParticleType("chests_open_GOLD_FX_TOP");
    public static final ParticleType chests_open_ORANGE_FX_BG = new ParticleType("chests_open_ORANGE_FX_BG");
    public static final ParticleType chests_open_ORANGE_FX_MID = new ParticleType("chests_open_ORANGE_FX_MID");
    public static final ParticleType chests_open_ORANGE_FX_TOP = new ParticleType("chests_open_ORANGE_FX_TOP");
    public static final ParticleType chests_open_PURPLE_FX_BG = new ParticleType("chests_open_PURPLE_FX_BG");
    public static final ParticleType chests_open_PURPLE_FX_MID = new ParticleType("chests_open_PURPLE_FX_MID");
    public static final ParticleType chests_open_PURPLE_FX_TOP = new ParticleType("chests_open_PURPLE_FX_TOP");
    public static final ParticleType chests_open_SILVER_FX_BG = new ParticleType("chests_open_SILVER_FX_BG");
    public static final ParticleType chests_open_SILVER_FX_MID = new ParticleType("chests_open_SILVER_FX_MID");
    public static final ParticleType chests_open_SILVER_FX_TOP = new ParticleType("chests_open_SILVER_FX_TOP");
    public static final ParticleType chests_open_SOUL_FX_BG = new ParticleType("chests_open_SOUL_FX_BG");
    public static final ParticleType chests_open_SOUL_FX_MID = new ParticleType("chests_open_SOUL_FX_MID");
    public static final ParticleType chests_open_SOUL_FX_TOP = new ParticleType("chests_open_SOUL_FX_TOP");
    public static final ParticleType combat_HeroButton_ActiveSkill_Pulse_B = new ParticleType("combat_HeroButton_ActiveSkill_Pulse_B");
    public static final ParticleType combat_HeroButton_ActiveSkill_Surge_ANIM_B = new ParticleType("combat_HeroButton_ActiveSkill_Surge_ANIM_B");
    public static final ParticleType combat_HeroButton_ActiveSkill_TAP = new ParticleType("combat_HeroButton_ActiveSkill_TAP");
    public static final ParticleType combat_HeroButton_FairyDragon_FullCharge = new ParticleType("combat_HeroButton_FairyDragon_FullCharge");
    public static final ParticleType combat_HeroButton_FairyDragon_blueCirc_ANIM = new ParticleType("combat_HeroButton_FairyDragon_blueCirc_ANIM");
    public static final ParticleType combat_HeroButton_FairyDragon_sparkles = new ParticleType("combat_HeroButton_FairyDragon_sparkles");
    public static final ParticleType confetti_BLOW_L = new ParticleType("confetti_BLOW_L");
    public static final ParticleType confetti_BLOW_R = new ParticleType("confetti_BLOW_R");
    public static final ParticleType confetti_FALL_L_A = new ParticleType("confetti_FALL_L_A");
    public static final ParticleType confetti_FALL_L_B = new ParticleType("confetti_FALL_L_B");
    public static final ParticleType confetti_FALL_L_C = new ParticleType("confetti_FALL_L_C");
    public static final ParticleType confetti_FALL_L_D = new ParticleType("confetti_FALL_L_D");
    public static final ParticleType confetti_FALL_R_A = new ParticleType("confetti_FALL_R_A");
    public static final ParticleType confetti_FALL_R_B = new ParticleType("confetti_FALL_R_B");
    public static final ParticleType confetti_FALL_R_C = new ParticleType("confetti_FALL_R_C");
    public static final ParticleType confetti_FALL_R_D = new ParticleType("confetti_FALL_R_D");
    public static final ParticleType contests_flamingSword_REF = new ParticleType("contests_flamingSword_REF");
    public static final ParticleType contests_meterSparkle = new ParticleType("contests_meterSparkle");
    public static final ParticleType contests_meterSparkle_proj = new ParticleType("contests_meterSparkle_proj");
    public static final ParticleType contests_sword_shockwave = new ParticleType("contests_sword_shockwave");
    public static final ParticleType enchanting_flashStar = new ParticleType("enchanting_flashStar");
    public static final ParticleType enchanting_glowStar = new ParticleType("enchanting_glowStar");
    public static final ParticleType heroProgression_whirl_BG = new ParticleType("heroProgression_whirl_BG");
    public static final ParticleType heroProgression_whirl_FR = new ParticleType("heroProgression_whirl_FR");
    public static final ParticleType newHero_fireWorks_A = new ParticleType("newHero_fireWorks_A");
    public static final ParticleType newHero_fireWorks_B = new ParticleType("newHero_fireWorks_B");
    public static final ParticleType newHero_fireWorks_C = new ParticleType("newHero_fireWorks_C");
    public static final ParticleType newHero_fireWorks_D = new ParticleType("newHero_fireWorks_D");
    public static final ParticleType newHero_fireWorks_TOP = new ParticleType("newHero_fireWorks_TOP");
    public static final ParticleType newHero_starCircle = new ParticleType("newHero_starCircle");
    public static final ParticleType newHero_whoosh = new ParticleType("newHero_whoosh");
    public static final ParticleType promote_ready_button_bg = new ParticleType("promote_ready_button_bg");
    public static final ParticleType sign_in_vip_sparkler_A = new ParticleType("sign_in_vip_sparkler_A");
    public static final ParticleType swirl_A = new ParticleType("swirl_A");
    public static final ParticleType swirl_C = new ParticleType("swirl_C");
    public static final ParticleType swirl_D = new ParticleType("swirl_D");
    public static final ParticleType tutorial_charTentacles = new ParticleType("tutorial_charTentacles");
    public static final ParticleType tutorial_smokeContinuous = new ParticleType("tutorial_smokeContinuous");
    public static final ParticleType tutorial_smokeCrawl_LR = new ParticleType("tutorial_smokeCrawl_LR");
    public static final ParticleType tutorial_smokeCrawl_RL = new ParticleType("tutorial_smokeCrawl_RL");
    public static final ParticleType ui_alley_glowingEye_blue = new ParticleType("ui_alley_glowingEye_blue");
    public static final ParticleType ui_alley_glowingEye_green = new ParticleType("ui_alley_glowingEye_green");
    public static final ParticleType ui_alley_glowingEye_yellow = new ParticleType("ui_alley_glowingEye_yellow");
    public static final ParticleType ui_alley_lightRay = new ParticleType("ui_alley_lightRay");
    public static final ParticleType ui_main_bird = new ParticleType("ui_main_bird");
    public static final ParticleType ui_main_campFire_HI = new ParticleType("ui_main_campFire_HI");
    public static final ParticleType ui_main_campFire_LO = new ParticleType("ui_main_campFire_LO");
    public static final ParticleType ui_main_campFire_on_tap = new ParticleType("ui_main_campFire_on_tap");
    public static final ParticleType ui_main_cauldron = new ParticleType("ui_main_cauldron");
    public static final ParticleType ui_main_chestSparkles = new ParticleType("ui_main_chestSparkles");
    public static final ParticleType ui_main_contests_flamingSword = new ParticleType("ui_main_contests_flamingSword");
    public static final ParticleType ui_main_contests_flamingSword_REF = new ParticleType("ui_main_contests_flamingSword_REF");
    public static final ParticleType ui_main_contests_hold_FX = new ParticleType("ui_main_contests_hold_FX");
    public static final ParticleType ui_main_contests_hold_Fr = new ParticleType("ui_main_contests_hold_Fr");
    public static final ParticleType ui_main_contests_hold_Rr = new ParticleType("ui_main_contests_hold_Rr");
    public static final ParticleType ui_main_contests_sword_Fr = new ParticleType("ui_main_contests_sword_Fr");
    public static final ParticleType ui_main_contests_sword_Rr = new ParticleType("ui_main_contests_sword_Rr");
    public static final ParticleType ui_main_contests_sword_shockwave = new ParticleType("ui_main_contests_sword_shockwave");
    public static final ParticleType ui_main_lavasteam = new ParticleType("ui_main_lavasteam");
    public static final ParticleType ui_main_lightBugs_LITE_combined = new ParticleType("ui_main_lightBugs_LITE_combined");
    public static final ParticleType ui_main_snowing = new ParticleType("ui_main_snowing");
    public static final ParticleType ui_main_summit_mist = new ParticleType("ui_main_summit_mist");
    public static final ParticleType ui_main_torch = new ParticleType("ui_main_torch");
    public static final ParticleType ui_main_torchSmoke = new ParticleType("ui_main_torchSmoke");
    public static final ParticleType ui_marina_boat = new ParticleType("ui_marina_boat");
    public static final ParticleType ui_marina_front_boat = new ParticleType("ui_marina_front_boat");
    public static final ParticleType ui_rune_altar_BLU = new ParticleType("ui_rune_altar_BLU");
    public static final ParticleType ui_rune_altar_GLD = new ParticleType("ui_rune_altar_GLD");
    public static final ParticleType ui_rune_altar_PRP = new ParticleType("ui_rune_altar_PRP");
    public static final ParticleType ui_shipyard_seagull = new ParticleType("ui_shipyard_seagull");
    public static final ParticleType ui_tavern_dust = new ParticleType("ui_tavern_dust");
    private static ParticleType[] values = null;
    private String name;

    static {
        Map hashMap = new HashMap();
        ATLAS_MAPPINGS = hashMap;
        hashMap.put(BosspitEvilWizard_CastSmoke, "bosspit_evil_wizard.atlas");
        ATLAS_MAPPINGS.put(BosspitEvilWizard_DeadSmoke, "bosspit_evil_wizard.atlas");
        ATLAS_MAPPINGS.put(BosspitEvilWizard_SummonGhostHero, "bosspit_evil_wizard.atlas");
        ATLAS_MAPPINGS.put(BosspitEvilWizard_SummonHand, "bosspit_evil_wizard.atlas");
        ATLAS_MAPPINGS.put(BosspitEvilWizard_ThrowExplode, "bosspit_evil_wizard.atlas");
        ATLAS_MAPPINGS.put(BosspitEvilWizard_ThrowHand, "bosspit_evil_wizard.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlantRoot_BiteHitImpact, "bosspit_giant_plant_root.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlantRoot_RootDeath_dust, "bosspit_giant_plant_root.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlantRoot_RootGrowth_dust, "bosspit_giant_plant_root.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlant_BiteAttack, "bosspit_giant_plant.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlant_SpewMouth, "bosspit_giant_plant.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlant_SpewSeeds_explode, "bosspit_giant_plant.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlant_SpewSeeds_gas, "bosspit_giant_plant.atlas");
        ATLAS_MAPPINGS.put(BosspitGiantPlant_SpewSeeds_gas_single, "bosspit_giant_plant.atlas");
        ATLAS_MAPPINGS.put(BosspitGoldColossus_EastingGold_appearShield, "bosspit_gold_colossus.atlas");
        ATLAS_MAPPINGS.put(BosspitGoldColossus_EatingCoin, "bosspit_gold_colossus.atlas");
        ATLAS_MAPPINGS.put(BosspitGoldColossus_MeleeAttack_sword, "bosspit_gold_colossus.atlas");
        ATLAS_MAPPINGS.put(BosspitGoldColossus_RangedAttack_mouth, "bosspit_gold_colossus.atlas");
        ATLAS_MAPPINGS.put(BosspitGoldColossus_Victory_dust, "bosspit_gold_colossus.atlas");
        ATLAS_MAPPINGS.put(Common_BrokenShield, "common.atlas");
        ATLAS_MAPPINGS.put(Common_Cat, "common.atlas");
        ATLAS_MAPPINGS.put(Common_HitDown, "common.atlas");
        ATLAS_MAPPINGS.put(Common_Silence, "common.atlas");
        ATLAS_MAPPINGS.put(Common_Sunglasses, "common.atlas");
        ATLAS_MAPPINGS.put(Common_stunned, "common.atlas");
        ATLAS_MAPPINGS.put(Contribution_laurel_lf, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Contribution_laurel_rt, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Contribution_lensflare, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Craft_normal, "craft.atlas");
        ATLAS_MAPPINGS.put(Craft_success, "craft.atlas");
        ATLAS_MAPPINGS.put(FledSmoke, "ui_main.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_Hit, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_Hit_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_IceHit_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_Ice_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_Water, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_WaterSpray, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_WaterSpray_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Attack_Water_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill1_Gather, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill1_Gather_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill1_SwordRain, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill1_SwordRain_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill2_buff, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill2_buff_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill3_Hit, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill3_Hit_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill3_Water, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill3_WaterSpray, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill3_WaterSpray_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill3_Water_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill4_Gather, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill4_Gather_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill4_Hit, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill4_Hit_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill4_WaterSpray, "hero_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAbyssDragon_Skill4_WaterSpray_skin_ice_dragon, "skin_abyss_dragon_ice_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Hit, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Hit_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Knife, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Knife_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Range_Hatchet, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Range_Hatchet_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Range_Hit, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Attack_Range_Hit_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill1_Buff, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill1_Buff_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill1_Ground, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill1_Ground_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill1_Lash, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill1_Lash_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Charge, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Charge_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Hit, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Hit02, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Hit02_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Hit03, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Hit03_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill2_Hit_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill3_Treatment, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill3_Treatment_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Cannon, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Cannon_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Charge, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Charge_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Hit, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Hit_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Muzzle, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Muzzle02, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Muzzle02_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Muzzle_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Stone, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Stone02, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Stone02_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Skill4_Stone_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Victory_Blast02, "hero_ancient_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroAncientDwarf_Victory_Blast02_skin_ancient_dwarf_mecha, "skin_ancient_dwarf_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Attack_Circle_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Attack_Fire_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Attack_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Attack_Treatment_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_BasicAttack_Circle, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_BasicAttack_Circle_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_BasicAttack_Treatment, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_BasicAttack_Treatment_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_End_Stars, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_End_Stars_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Loop01_Glistening, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Loop01_Glistening_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Loop02_Glistening, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Loop02_Glistening_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Start01_Convergence, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Start01_Convergence_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Start02_Convergence, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill01_Start02_Convergence_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_End01_Blast, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_End01_Blast_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_End02_Blast, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_End02_Blast_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_Loop01_Convergence, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_Loop01_Convergence_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_Loop02_Blast, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_Loop02_Blast_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_Start_Convergence, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill02_Start_Convergence_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_End_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_End_Stars_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_Loop_Glistening_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_Loop_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_Loop_Line_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_Start_Collect_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_Start_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill1_Start_Ring_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_End_Blast_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_End_Bomb_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_End_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_Loop_Blast_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_Loop_Convergence_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_Loop_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_Start_Convergence_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_Skill2_Start_Head_skin_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill1, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill1_Fallen, "skin_angel_dragon_fallen.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill1_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill2_1, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill2_1_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill2_2, "hero_angel_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroAngelDragon_buff_angel_dragon_skill2_2_skin_usercontest, "skin_angel_dragon_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroAngelicHerald_BasicAttack_Waves, "hero_angelic_herald.atlas");
        ATLAS_MAPPINGS.put(HeroAngelicHerald_Skill1_loop_Light, "hero_angelic_herald.atlas");
        ATLAS_MAPPINGS.put(HeroAngelicHerald_Skill2_Hit, "hero_angelic_herald.atlas");
        ATLAS_MAPPINGS.put(HeroAngelicHerald_Skill2_Sonic, "hero_angelic_herald.atlas");
        ATLAS_MAPPINGS.put(HeroAngelicHerald_Skill5, "hero_angelic_herald.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_GenericPuff, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_GroundHitImpact, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_LegendShield, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_LightBeamImpact, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_Meteor, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_MeteorHitGround, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_RingForFood, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_Shield_only, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_Skill6_Absorb, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_Skill6_Converge, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_Skill6_Hand_Effect, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_StuffGlow, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_StuffGlowBlue, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_StuffSparkle, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_StuffStun, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_ThrustUp, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_ThrustUpTrail, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroApprentice_Whack, "hero_apprentice.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_AttackWaterSpout, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_AttackfromStuff, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_DeathSplush, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill1Wave_Proj, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill1fromStuff_Proj, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill2WaterSpout, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill2WaterSpoutBase, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill2WaterSpoutSingle, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill3Whirlpool, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill3WhirlpoolSelf, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroAquaticMan_Skill3fromStuff_Proj, "hero_aquatic_man.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_death, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill0_breath, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill0_projectile, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill1, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill3_DoT_A, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill3_mark_NPC, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill3_wisps_A, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill3_wisps_B, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBanshee_skill4_hit, "hero_banshee.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_AWave, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_AWaveB, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_AWaveBImpact, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_AttackImpact, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_Buff, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_BuffBardbarian, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_Buff_Notes, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_Buff_Ring, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_Skill3Impact, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBardbarian_Victory, "hero_bardbarian.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Fire, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Fire02, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Fire02_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Fire_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Flight, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Flight_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Hit, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Attack_Hit_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Blade, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Blade_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Boom, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Boom_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Fire, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Fire_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Hit, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill1_Hit_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill2_Wing, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill2_Wing_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill4_Gather, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill4_Gather_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill4_Glow, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill4_Glow02, "hero_black_wing.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill4_Glow02_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBlackWing_Skill4_Glow_skin_black_wing_mecha, "skin_black_wing_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_AttackMouthFire, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_AttackMouthSmoke, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_AttackSmoke_Landed, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_AttackSmoke_Proj, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_DeathSmoke, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill1Fire_Landed, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill1MouthFire, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill1MouthSmoke, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill1RibFire, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill1Smoke_Proj, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill2MouthFire, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill2MouthSmoke, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill2Smoke_Proj, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill2TarLanded_Proj, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill3Buff_Proj, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBoneDragon_Skill3MouthSmoke, "hero_bone_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Damage, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_ExplodingShieldLoop, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Heal, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_HealingShieldLoop, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Impact, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_MagicMace, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Magicexplode_break, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Magicexplode_ring, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Magicshield, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBrozerker_Stars, "hero_brozerker.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_BiteFireWorks, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_BiteSplash, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_BuffRing, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_BurstFlame, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_BurstSmoke, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_FireHitDamage, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_FirePlume, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_FirePlumeLanded, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_GreenGas, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_GreenGasFeet, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_HeadDrop, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_Skill6_Buff, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_Skill6_Buff_Bottom, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_SmokeMouth, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_SmokeMouthGreen, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBruteDragon_SteamNose, "hero_brute_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_attack_crit, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_attack_explosion1, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill1_end_collision, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill1_end_glow2, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill1_end_wave, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill2_end_blindness, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill2_end_glow, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill2_loop_goldlight, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill2_start_converge, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill3_loop_crack, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill3_loop_explosion, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill3_loop_flash, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill3_loop_laser, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill3_loop_wave, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBulwarkAngel_skill3_start_glow, "hero_bulwark_angel.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Attack_Hit_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Attack_Spray_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_End2_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_End_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_Hit_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_Loop2_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_Loop_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_Puff_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_Skill1_Start_skin_voodoo, "skin_burnt_one_voodoo.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_activeEnd_A, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_activeEnd_B, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_activeEnd_hit, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_activeStart_A, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_activeStart_B, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_activeStart_puff, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_attack_hit, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_passiveLoop_A, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill1_passiveLoop_B, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill3_magmaWave, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroBurntOne_skill3_magmaWave_halfHeight, "hero_burnt_one.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Confetti, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_ConfettiExplosion, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_DeathDust, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_FireBall, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_FireBall2, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_FireBall2Trail, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_FireBallTrail, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Hit, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill1RockLand, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill1RockLand_Ground, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill1RockLand_Top, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill2SmokeLand, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill2SmokeLand_Ground, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill2SmokeLand_Top, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCatapultKnight_Skill3RockLand, "hero_catapult_knight.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_ArrowCharge, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_ArrowChargeGlow, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_ArrowRelease, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_HitEnergy, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_HitEnergy_skin_mastery, "skin_centaur_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_HitEnergy_skin_resplendent, "skin_centaur_resplendent.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_HitImpact, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_HitImpact_skin_mastery, "skin_centaur_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_HitImpact_skin_resplendent, "skin_centaur_resplendent.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_Silence, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_Stopwatch, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroCentaur_VictoryHorn, "hero_centaur.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Attack_Cllawlight, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Hit_Cllawlight1, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Hit_Cllawlight2, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Hit_Cllawlight3, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Hit_Cllawlight4, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill1_Cllawlight, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill2_Cllawlight1, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill2_Cllawlight2, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill2_Cllawlight3, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill2_Hit, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill2_Venom, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill3_Cllawlight, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill3_buff, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroClawMan_Skill4_Grin, "hero_claw_man.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Blink_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Cold_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_DOT_burn, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_DOT_burn_Rr, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_DOT_burn_Rr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_DOT_burn_Rr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_DOT_burn_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_DOT_burn_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Ground_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Head_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Laser_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Petal_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Ray_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Shockwave_pulse_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Shockwave_pulse_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Spary_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Staff_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_Syrup_skin_hawaii, "skin_cursed_statue_hawaii.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack_impact_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack_impact_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack_noBeam_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack_noBeam_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_attack_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_crumble_A_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_crumble_A_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_crumble_B_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_crumble_B_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_crumble_C_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_crumble_C_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_ground, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_groundA_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_groundA_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_ground_Rr, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_ground_Rr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_ground_Rr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_ground_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_ground_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_head, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_head_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_head_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_staff, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_staff_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_death_staff_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_ground_Fr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_ground_Fr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill2_BG, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill2_BG_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill2_BG_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill2_eyes01, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill2_eyes01_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill2_eyes01_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_Fr, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_Fr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_Fr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_Rr, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_Rr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_Rr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_rays_Rr, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_rays_Rr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skill_03_rays_Rr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull1_eyesGlow, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull1_eyesGlow_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull1_eyesGlow_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull2_eyesGlow, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull2_eyesGlow_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull2_eyesGlow_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull_eyesGlow, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull_eyesGlow_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_skull_eyesGlow_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spearDissolve_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spearDissolve_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_Fr_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_Fr_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_Shockwave_burn_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_Shockwave_burn_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockBeam, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockBeam_GRN, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockBeam_GRN_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockBeam_GRN_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockBeam_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockBeam_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_BLUE, "hero_cursed_statue.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_BLUE_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_BLUE_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_GRN_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_GRN_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_RED_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_RED_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_spear_shockwave_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_swapGlow_skin_meer, "skin_cursed_statue_meer.atlas");
        ATLAS_MAPPINGS.put(HeroCursedStatue_swapGlow_skin_usercontest, "skin_cursed_statue_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Attack_Impact, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Attack_OnStaff, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Death, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill1_BodyArc, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill1_Impact, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill1_Shoot, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill1_SkyLightning, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill1_lightning, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill2_Eball, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill2_Eball_Impact, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill3_BoltFeet, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill3_HitGround, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill3_OnStaff, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Skill3_burstImpact, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroCyclopsWizard_Victory, "hero_cyclops_wizard.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Attack_Gunfiren, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Attack_Gunfiren_Hit, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_End_Ballistic, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_End_Gunfiren, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_End_Gunfiren_Hit, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_End_Normal_Array1, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_Loop_Normal_Array1, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_Smoke, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill1_Start_Normal_Array1, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill2_Ballistic_01, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill2_Gunfiren, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill2_Gunfiren_Hit, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill3_Gunfiren, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill3_Gunfiren_Hit, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill4_Normal_Array1, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHero_Skill4_Normal_Array3, "hero_dark_hero.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Attack, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Death, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_DeathBG, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Skill1Attack, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Skill2Attack, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Skill3GroundCircle, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Skill3GroundHit, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Skill3ShieldPopUp, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDarkHorse_Skill3ShieldPopUp_ShieldOnly, "hero_dark_horse.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Attack_Impact, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Attack_proj, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill1Shield, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill1Shield_end, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill1Shield_loop, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill1Shield_mid, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill1Shield_start, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill2_Geyser, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill2_Stomp, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill3_proj, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill6_Effect, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill6_Green_Absorb, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Skill6_Green_Converge, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDeepDragon_Victory, "hero_deep_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_AttackT1, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_AttackT2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_AttackT3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_AttackTAll, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Death_t1, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Death_t2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Death_t3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_HitAll, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_HitT1, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_HitT2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_HitT3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill1_t1Impact, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill1_t2Impact, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill1_t3Impact, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill2_PuffSmoke, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill2_ShieldArc, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill2_ShieldArc_t2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill2_ShieldArc_t3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill3T1, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill3T2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill3T3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill5_Totem1_End_Fall, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill5_Totem1_Start_Pound, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill5_Totem2_End_Fall, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill5_Totem2_Start_Pound, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill5_Totem3_End_Fall, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill5_Totem3_Start_Pound, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill6_totem1, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill6_totem2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill6_totem3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill6_totem_bottom1, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill6_totem_bottom2, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDemonTotem_Skill6_totem_bottom3, "hero_demon_totem.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Attack_Knife, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill1_Claw, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill1_Fist, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill1_Talon, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill2_Body, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill2_Hand, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill2_Hit, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill2_Root, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill2_Spear, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill3_Body, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill3_Crack, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill3_Fall, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill3_Ground, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill3_Samuel, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill4_Impact, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill4_Parry, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDiggerMole_Skill5_Ball, "hero_digger_mole.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_Skill1_Blast_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_Skill2_fireball_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_Skill2_flies_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_Skill2_hand_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_Skill2_pillar_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_attackImpact, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_attackImpact_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_attack_proj, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_death, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill1_spray, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill2_push, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill2_push2, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill2_wave, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill3_StartWave, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill3_death, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_skill3_death_skin_molten, "skin_doppelganger_molten.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_walk, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDoppelganger_walk_water, "hero_doppelganger.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Attack_Hit_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Hit_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Skill1_Dragon_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Skill1_Gather_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Skill1_Hit_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Skill1_Up_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Skill2_Hit_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_Skill3_Palm_skin_Spaceknight, "skin_dragon_lady_space_knight.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_dragontrail, "hero_dragon_lady.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_energy_beam3, "hero_dragon_lady.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_energycharge, "hero_dragon_lady.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_fireworks_explosion, "hero_dragon_lady.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_impact, "hero_dragon_lady.atlas");
        ATLAS_MAPPINGS.put(HeroDragonLady_slap, "hero_dragon_lady.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Attack_Blink, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Attack_Blink_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Attack_Hit, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Attack_Knife, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Attack_Knife_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Attack_Swoosh, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill1_Hit, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill1_Hit_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill1_Knife, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill1_Knife_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill1_Swoosh, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill2_Eye, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill2_PauldronEyes, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill2_Pulse, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill2_Start, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill2_Twinkle, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Assemble, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Assemble_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Circle, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Circle_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Hit, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Hit_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Jump, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill3_Jump_skin_Unicorn, "skin_dragon_slayer_unicorn.atlas");
        ATLAS_MAPPINGS.put(HeroDragonSlayer_Skill4_Treatment, "hero_dragon_slayer.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Attack_BeamEye, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Attack_BeamImpact, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Attack_BeamLaser, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_MouthBlob, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_MouthBlob2, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_MouthBlob3, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_OnEye, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_YellowBlob_proj, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_YellowGas, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill1_YellowGas_Landed, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill2_MouthBlob, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill2_OrangeBlob_proj, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill2_OrangeGas, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill2_OrangeGas_Landed, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Skill5_Glow, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Victory_smoke, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDragzilla_Victory_smokeBG, "hero_dragzilla.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_AttackGlow, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_AttackWhip, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Attack_Glow, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Attack_Hit, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Attack_Whip, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_BackwardWalk_Glow, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_CloneGlow, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Clone_Glow, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Clone_Petal, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Death, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Death_Dissipation, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Hit, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Hit_Gethit, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Idle, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1Darts, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1DartsHand, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1EnergyBar_drain, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1GlowBody, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1Hit, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1_Darts, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1_DartsHand, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1_GlowBody, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1_GlowEyeLF, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill1_GlowEyeRT, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill2Hit, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill2Whip, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill2_BodyGlow, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill2_HandGlow, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill2_Hit, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill2_Whip, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill3Energy_Proj, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill3HandReceive, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill3HandRelease, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill3_BodyGlow, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill3_Cohesion, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Skill3_HandRelease, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_VictoryWhip, "hero_druidinatrix.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Victory_Fireworks, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDruidinatrix_Victory_Whip, "skin_druidinatrix_mastery_dx.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Attack_Accuse_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Death_Roll_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Death_trap_char, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Death_trapdoors, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Door_Fog_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Door_Shockwave_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Door_Trap_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Hit_Injured_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Skill1_Flight_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_Skill1_Hit_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_attack_D6, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_attack_D6_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill1_D20, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill1_D20_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill1_boulderDie, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill1_boulderDie_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill1_die_hits, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill1_die_hits_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill2_rat_running, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill2_rat_running_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_DM_start, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_DM_start_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_Start_skin_mastery, "skin_dungeon_man_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_shockwave, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_shockwave_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_trap_char, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_trap_char_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_trapdoors, "hero_dungeon_man.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill3_trapdoors_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill4_boltSmoke_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDungeonMan_skill4_smokeBurstAppear_skin_dungeon_man_mecha, "skin_dungeon_man_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Attack_ArrowHit, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Attack_ArrowVapor, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill1_ArrowRay, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill1_FeetSwirl, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill1_GreenRay, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill2_ArrowGreen, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill2_Hit, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill3_Feetbuff, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Skill3_GlowShape, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroDwarvenArcher_Victory_Dust, "hero_dwarven_archer.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_ElectricityRing, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_Verlightning, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_cloudlightning, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_impact, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_lightning_energyhorn, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_lightning_finger, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_lightning_ground_burst, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_lightning_hit_projectile2, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroElectroYeti_lightning_leg, "hero_electroyeti.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Attack_Hit_Issue, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Attack_Launch_Issue, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Attack_Missile_Issue, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Death_Blast, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Death_Twinkle, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill1_End_Complete1, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill1_Hit, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill1_Loop_Accuse, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill1_Start_Circle, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill2_Assemble, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill2_Bolt, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill2_Hit, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill2_Source, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill3_End_Shield, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill3_Loop_Shield, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill3_Loop_Sparkle, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill3_Start_Shield, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt02, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt03, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt04, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt05, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt06, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroEternalEnchanter_Skill5_Bolt07, "hero_eternal_enchanter.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Attack_Crit_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_BlueBallCharge, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_BlueBallEnergy, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_BlueBallExplode, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_BlueBallExplode_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_BlueBallPuff, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_LightBeamBallOnly, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_LightBeamBallOnly_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_LightBeamFlashOnly, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_LightBeamOnly, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_RedBallEnergy, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_RedBallExplode, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_RedBallExplode_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_RedBallPuff, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Ripple, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_RippleGround, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Skill1_End_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Skill1_Start_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Skill2_Ball_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Skill2_Twinkle_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Skill3_Thunder_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_ThreeBeam, "hero_fairy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFairyDragon_Victory_Cirque_skin_mecha, "skin_fairy_dragon_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_ProjectileBook_glow, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_ProjectileBook_glow_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_circle_healonly, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_circle_healonly_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_circle_only, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_circle_only_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_dusttwirl, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_dusttwirl_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_impactbook, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_impactbook_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_msmoke, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_msmoke_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_pastelcharms, "hero_faith_healer.atlas");
        ATLAS_MAPPINGS.put(HeroFaithHealer_pastelcharms_skin_cthulu, "skin_faith_healer_cthulu.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Attack_Hit, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Attack_Light, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Attack_Torrent, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Death_Float, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Hit_Gethit, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill1_Glow, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill1_Ground, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill1_Mouth, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill1_Wind, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill2_Blink, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill2_Wind, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill3_Treatment, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Skill4_Sunshine, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroForgottenDragon_Walk_Leaf, "hero_forgotten_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_AttackExplode, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_AttackSBall_Proj, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_DeathExplode, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_IdleAir, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill1Gas, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill1Hit, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill1SideSplash, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill1SnowBreeze_Proj, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill2IcecleHit, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill2Icecle_Proj, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill3BlastAir, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill3FrostGround, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_Skill3IntakeAir, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroFrostGiant_WalkAir, "hero_frost_giant.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Attack, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Attack_cowglow, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Death, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill1_Impact, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill1_cannon, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill2_SmokeLamp, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill2_SmokeLamp_out, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill3_Impact, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill3_goatglow, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill3_hand, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill4_Horn, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_End, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_End2, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_End3, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_End4, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Loop, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Loop2, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Loop3, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Loop4, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Puff, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Smoke, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGenie_Skill5_Start, "hero_genie.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_Skill4_quagmire, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_attack1, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill1_attack, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill1_barrage, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill1_bow, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill1_focusenergy, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill1_hitspark, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill2_inhale, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill2_roar, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill2_stomp, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill3_focusenergy, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill3_hitring, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill3_hitsmoke, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill3_hitspark, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGrandHuntress_skill3_trail, "hero_grand_huntress.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Attack_Tooth, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill1_End_Fire, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill1_Fire, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill1_Start_Fire, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill2_Ground, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill2_Smoke, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill3_Chicken, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Skill4_Flashlight, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGreedyDragon_Victory_Fire, "hero_greedy_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_AttackBee_Proj, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_AttackHand, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_AttackHandRelease, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_AttackHandRelease_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_AttackHand_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_AttackImpact, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Ball_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Blink_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_DeathDust, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_DeathDust_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Ears_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Flight_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Flower_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_HedgehogSpike_Proj, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Honour_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Impact_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Injured_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_LegendSmoke, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Line_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Lug_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Path_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Radiance_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Seedling_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Shine2_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Shine3_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Shine4_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Shine5_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Shine6_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Shine_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Skill1Hand, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Skill1Impact, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Skill2BeeCast, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Skill2BeeSwarm_Proj, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Skill3MagicalArmor, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Skill3MagicalCast, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Staff_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Streamer_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Swing_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_Tailing_skin_disco, "skin_groovy_druid_disco.atlas");
        ATLAS_MAPPINGS.put(HeroGroovyDruid_WalkFlower, "hero_groovy_druid.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Attack_Flight, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Attack_Flight_Other, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Attack_Hit, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Attack_Hit_Other, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Death_Smoke, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill1_Loop_Ground, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill2_Smoke, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill2_Smoke2, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill2_Smoke_Other, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill3_Caster, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill3_Drop, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill4_Hit, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill4_Hit_Duration, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKaraokeKing_Skill4_water, "hero_karaoke_king.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_Drop_skin_mechalord, "skin_kraken_king_mechalord.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_Impact_skin_mechalord, "skin_kraken_king_mechalord.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_Injured_skin_mechalord, "skin_kraken_king_mechalord.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_Roquet_skin_mechalord, "skin_kraken_king_mechalord.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_attack, "hero_kraken_king.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_debuff, "hero_kraken_king.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_skill1_drop, "hero_kraken_king.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_skill2_glowTentacle, "hero_kraken_king.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_skill2_glowTentacle_small, "hero_kraken_king.atlas");
        ATLAS_MAPPINGS.put(HeroKrakenKing_skill3Impact, "hero_kraken_king.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Attack_Hammer_Hit, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Attack_Hammer_Knife, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Attack_Shield_Hit, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Death_Smoke, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill1_End_Born, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill1_Loop_Crack, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill1_Loop_Explode, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill1_Loop_Knife, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill1_Loop_Knife2, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill1_Start_Born, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill2_Shield, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill2_Shield_Loop, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill3_Passive, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroLastDefender_Skill5_Shield, "hero_last_defender.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_AttackBall_Proj, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_AttackExplosion, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_AttackLaunching, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_DeathGlow, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_DeathGlowInside, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill1Ball_Proj, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill1Explosion, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill1Hand, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill2Explosion, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill3Ball_Proj, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill3Explosion, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_SKill3Hand, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_Skill1Launching, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_Skill2Ball_Proj, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_Skill2Launching, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_Skill3Launching, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_Victory_Proj, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMagicDragon_WalkMist, "hero_magic_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EnergyBall, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EnergyBall_Release, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EnergyBall_Release_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EnergyBall_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EyeLaser, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EyeLaserImpact, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EyeLaserImpact_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EyeLaserRed_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_EyeLaser_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_Skill1Impact, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_Skill1Impact_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_Skill2Impact, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_Skill2Impact_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_SnakeLaser, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_SnakeLaser_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_WalkDust, "hero_medusa.atlas");
        ATLAS_MAPPINGS.put(HeroMedusa_WalkDust_skin_futakuchi, "skin_medusa_futakuchi.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_AttackHitImpact, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Attack_swing, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Death_Smoke, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill1_Impact, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill1_swing, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill2_Attack, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill2_AttackImpact, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill2_FootDust, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill2_Shield, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_ArmorBonus, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_AtackBonus, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_Blue_GlassFloor, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_GainEnergy, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_Green_GlassFloor, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_HealSelf_BG, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_HealSelf_FG, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_Skill3_Yellow_GlassFloor, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMinotaur_VictorySmoke, "hero_minotaur.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_attack_hit, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_attack_preload, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_attack_projectile, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_death, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_death2, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill1_clawSpray, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_claw_BG, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_claw_FG, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddleClaw_Dn, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddleClaw_Loop, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddleClaw_Up, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddle_loop_LG, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddle_loop_SM, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddle_spread, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill2_puddle_spread2, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill3_burst, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill3_charge, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill3_charge_BG, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill3_charge_FG, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroMistressManicure_skill3_projectile, "hero_mistress_manicure.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Debuff_Beer, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Debuff_Beer_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Impact, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_ImpactNew, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_ImpactNew_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Impact_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Skill6_Hit_Rate_Reduction, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh2, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh2_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh3, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh3_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh4, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh4_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Swoosh_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Victory, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Victory_drink, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Victory_drink_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_Victory_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_WhirlingRing, "hero_ninja_dwarf.atlas");
        ATLAS_MAPPINGS.put(HeroNinjaDwarf_WhirlingRing_skin_animal, "skin_ninja_dwarf_animal.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_BurnerSmoke, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_BurnerSmokeWalk, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_Skill1_ringSmoke, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_Skill1_ringSmoke_angel, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_Skill2_bubbleBurst, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_Skill2_bubbleBurst_Ally, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_Skill3_SmokeRing, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroOrcMonk_Skill3_Smoke_proj, "hero_orc_monk.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Attack_Drop, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Attack_Hit, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Attack_Storage, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Hit_Brust, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Hit_shield, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Idle_Buff, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Idle_Buff02, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill1_Drop2, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill1_Hit, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill1_Storage, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill2, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill3_Arm, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill3_Brust, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill3_Gather, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Skill4_Glistening, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Victory_Gather, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Victory_Loop_Wing, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPchAnubisDragon_Victory_Wing, "hero_pch_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Attack_CannonBall, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Attack_Explosion, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Attack_HitImpact, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Death_Splash, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill1_ExplosionSplash, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill1_HitImpact, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill1_WaterBullet, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill2_Shield, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill3_AnchorTrail, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill3_HitImpact, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill4_CannonBall, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill4_Explosion, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Skill4_HitImpact, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPirate_Victory_Gun, "hero_pirate.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_attack, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_attack_hit, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_death_gas, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill1_bladeDrip, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill2_debuff, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill2_plagueGas_hit, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill2_vialSteam, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill2_vial_KILL_ON_THROW, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill3_drip, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlagueEntrepreneur_skill3_spear, "hero_plague_entrepreneur.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_Death_Currency, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_Enchant_Currency, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_Hit, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_Hit_Petals, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_Idle_Currency, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_Skill1_Enchant, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoulMaster_SwordHit_Petals, "skin_plant_soul_mastery_ps.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_coreGlow1, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_deathGlow_A, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_deathMote_A, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_deathMote_B1, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_deathMote_coreGen, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_hit, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_hit_leaves, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_skill1_blast, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_swordBang, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_swordHit_leaves, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_swordSlash_A, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_swordTrail, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_swordTrail_anim, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPlantSoul_swordTrail_sm, "hero_plant_soul.atlas");
        ATLAS_MAPPINGS.put(HeroPolemaster_EnergyDrain, "hero_polemaster.atlas");
        ATLAS_MAPPINGS.put(HeroPolemaster_GroundHit, "hero_polemaster.atlas");
        ATLAS_MAPPINGS.put(HeroPolemaster_Kick, "hero_polemaster.atlas");
        ATLAS_MAPPINGS.put(HeroPolemaster_SplashyGreen, "hero_polemaster.atlas");
        ATLAS_MAPPINGS.put(HeroPolemaster_SplashyGreenMulti, "hero_polemaster.atlas");
        ATLAS_MAPPINGS.put(HeroPolemaster_SplashyGreenRing, "hero_polemaster.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_AttackFireBall, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_AttackFireBall_Impact, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_AttackFireBall_Mouth, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_AttackFireBallv2, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_AttackNose_Smoke, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill1_4thseg, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill1_5thsegBite, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill1_5thsegBite1, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill1_5thsegCloud, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill1_5thsegCloudBg, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill2MachineGun, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill2MachineGun_Impact, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill2MachineGun_Mouth, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRabidDragon_Skill3GlowNose, "hero_rabid_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_Skill5_Gain, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_Skill5_Line, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_attack, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_attack_b, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill1_ally, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill1_sacrifice_back, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill1_smoke, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill2_hit, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill2_projectile, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill3_shockwave, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill3_shockwave_Fr, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill3_shockwave_ally, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill4, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_skill4_energyPull_root, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRagingRevenant_swordCharge, "hero_raging_revenant.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_DeathSmoke, "hero_red_shaman.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_DeathSmoke_skin_crow, "skin_red_shaman_crow.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_GlowingBuff, "hero_red_shaman.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_GlowingBuff_skin_crow, "skin_red_shaman_crow.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_ShimmerBuff, "hero_red_shaman.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_ShimmerBuff_skin_crow, "skin_red_shaman_crow.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_SummonBall, "hero_red_shaman.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_SummonBallMulti, "hero_red_shaman.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_SummonBallMulti_skin_crow, "skin_red_shaman_crow.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_SummonBall_skin_crow, "skin_red_shaman_crow.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_SummonRing, "hero_red_shaman.atlas");
        ATLAS_MAPPINGS.put(HeroRedShaman_SummonRing_skin_crow, "skin_red_shaman_crow.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_CrackGroundImpact, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_RockImpact, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_ShockWave, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_debuff_Roller_Viking_skill6, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_punchImpact, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_punchImpactMulti, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroRollerViking_punchLast, "hero_roller_viking.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Bolt, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Bolt02, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Bolt02_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Bolt_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Hit, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Hit_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Sheet, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Attack_Sheet_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_End_Buff, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_End_Buff_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_End_Debuff, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_End_Debuff_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_End_Heart, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_End_Heart_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_Star_Gas, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_Star_Gas_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill1_Star_Heart_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_End_02, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_End_02_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_End_Shere, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_End_Shere1_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_End_Shere2_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_End_Shere_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_Loop_01, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_Loop_01_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_Recovery, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_Recovery_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_Start_01, "hero_sadistic_dancer.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_Skill2_Start_01_skin_scarlett_fox, "skin_sadistic_dancer_scarlett_fox.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Bolt, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Bolt02, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Hit, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Attack_Sheet, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Buff, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Debuff, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_End_Heart, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_Star_Gas, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill1_Star_Heart, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_02, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere1, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_End_Shere2, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Loop_01, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Recovery, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Start_01, "skin_sadistic_dancer_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_BigFireBall, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_FireBallHit, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_FirePlume, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_FirePlumeL, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_FirePlumeLanded, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_dustdeath, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_dustdeath_bk, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_fireball, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_fireballlanded, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_firefeet, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_sandball_impact, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_sandball_onlyfront, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_sandring, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSandDragon_wind_blast, "hero_sand_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Attack_bellWave, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill1_arrowTrail, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill1_flut, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill1_hitImpact, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill2_ballTrail, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill2_flut, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill2_healMusic, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSatyr_Skill2_healMusic_allies, "hero_satyr.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_AttackClaw, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_DeathDust, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_DeathDustFr, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_Skill1Wave, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_Skill1WaveLoop, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_Skill2Claw, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_Skill2ClawR, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroSavageCutie_Skill3Claw, "hero_savage_cutie.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_AttackHit, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_AttackYKnifeProj, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_AttackYKnifeProj_skin_watch, "skin_shadow_assassin_watch.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Attack_Splash_skin_watch, "skin_shadow_assassin_watch.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Attack_Spray_skin_watch, "skin_shadow_assassin_watch.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Cross_only, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_DeathSmoke, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill1Hit, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill1VaPuff, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill2BKnife, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill2BKnifeProj, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill2BKnifeProj_skin_watch, "skin_shadow_assassin_watch.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill2Hit, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill3Hit, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill3WKnifeProj, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill3WKnifeProj_skin_watch, "skin_shadow_assassin_watch.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill6_Gain, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill6_Line, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowAssassin_Skill6_Slash, "hero_shadow_assassin.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Attack_Knife, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Death_Atmosphere, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_End_Bolt, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_End_Door, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_Loop_Black, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_Loop_Bolt, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_Loop_Door, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_Start_Black, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill1_Start_Bolt, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill2_Ground, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill2_Knife, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill2_Shift, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill3_State, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill4_Hit, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill5_Gather, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_Skill5_Laser, "hero_shadow_of_sven.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Attack_Knife, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Death_Atmosphere, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_End_Bolt, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_End_Door, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Black, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Bolt, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Loop_Door, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Start_Black, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill1_Start_Bolt, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Ground, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Knife, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill2_Shift, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill3_State, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill4_Hit, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill5_Gather, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroShadowOfSven_skin_shadow_of_sven_mecha_Skill5_Laser, "skin_shadow_of_sven_mecha.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_attack_Bg, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_attack_Fr, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_attack_end, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_attack_smoke_blk, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_attack_smoke_wht, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_skill1_wallCollapse, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_skill1_wall_FPO, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_skill2, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSilentSpirit_skill3_hammer, "hero_silent_spirit.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Attack_Impact, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Attack_Impact_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Attack_Ink, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Attack_Ink_proj, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Attack_Spray_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Death_Body_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Death_End_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Death_Glow_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Death_smoke, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Hit_Injured_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Idle_Shine2_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill1_Laser_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill1_SmokeBody_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill1_boltSmoke, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill1_smokeBurstAppear, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_DamageShoot, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_DamageSmoke, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_DamageSmoke_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_Foot_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_Gather2_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_Gather_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill2_HealingRing, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill3_Ink, "hero_skeleton_king.atlas");
        ATLAS_MAPPINGS.put(HeroSkeletonKing_Skill3_Strengthen_skin_ascendant, "skin_skeleton_king_ascendant.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_Skill1GlowWing, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_concentric_ring_loop, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_concentric_ring_mouth, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_death_dust, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_death_dust_skin_sea_dragon, "skin_snake_dragon_sea_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_impact, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_spatter_top, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_spatter_top_skin_sea_dragon, "skin_snake_dragon_sea_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_walk_dust, "hero_snake_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSnakeDragon_walk_dust_skin_sea_dragon, "skin_snake_dragon_sea_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_AttackBlow, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_AttackEnemy_Proj, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_AttackHand, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Hit, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill1_GlowRing, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill1_GlowRing_boost, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill1_MagicOnHand, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill2_Buff, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill2_MagicOnHand, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill3_Cloth_Proj, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_Skill3_MagicPuff, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_VictoryHair, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSniperWolf_VictoryHairTip, "hero_sniper_wolf.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Attack_Fireball, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Attack_Hit, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill1_Hit, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill1_fly, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill2_Caster, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill2_Hit, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill3_Gather, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill3_Main, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill3_Smoke, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill5_Blast, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSojournerSorceress_Skill5_Smoke, "hero_sojourner_sorceress.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Attack_Sample, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill1_Attack_Fissure, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill1_Attack_Glow, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill1_Attack_Knife, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill1_Loop_Glow, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill1_Loop_Storage, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill1_Loop_Storage02, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill2_Shield, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill3_Hollow, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill3_Hollow02, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSolidLongevity_Skill4_Buff, "hero_solid_longevity.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_attack_hit, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_attack_hit_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_attack_projectile, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_attack_projectile_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_death, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_death_motes, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_death_motes_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_death_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill1_hit_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill1_projectile, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill1_projectile_HOT, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill1_projectile_HOT_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill1_projectile_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill3_hit, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill3_hit_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill4_mote_hit, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill4_mote_hit_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill4_motes, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skill4_motes_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_hit, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_projectile, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_death, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_death_motes, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_hit, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile_HOT, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_skill3_hit, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_skill4_mote_hit, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_skill4_motes, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire_L_R, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_skin_spectral_dragon_reddragon_talismanFire_hit, "skin_spectral_dragon_reddragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_talismanFire, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_talismanFire_L_R, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_talismanFire_L_R_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_talismanFire_hit, "hero_spectral_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_talismanFire_hit_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpectralDragon_talismanFire_skin_easter, "skin_spectral_dragon_easter.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_attack, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_attack_hit, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_basicAttack, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_children, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_cocoon_pop, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_baseEmit, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_base_lateral, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_base_vertical, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_handKnit_A, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_handKnit_B, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_knit, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_silk_knit2, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill0, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill0_victim, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill1_cocoon_swirl, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill1_cocooning, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill1_hit_Rr, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill1_hit_momentary_Fr, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill1_legStab, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill2_bite, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill2_bite_L, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill2_bite_R, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill2_bite_tooth, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_skill2_bite_victim, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_venom, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueenMastery_venom2, "skin_spider_queen_mastery_sq.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_basicAttack, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_children, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_cocoon_pop, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_silk_baseEmit, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_silk_base_vertical, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_skill1_legStab, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_skill2_bite, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_skill2_bite_L, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpiderQueen_skill2_bite_R, "hero_spider_queen.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackImpact, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackSpike_Proj1, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackSpike_Proj2, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackSpike_Proj3, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackSpike_Proj4, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackSpike_Proj5, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_AttackTail, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill1ImpactGround, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill1Release, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill1Spike_Proj, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill2ImpactGround, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill2Launch, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill2Release, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill2Spike_Proj, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill3Release, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill3Release2, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill3Release3, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill3Spike_Proj, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroSpikeyDragon_Skill5DayquillBlast, "hero_spikey_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Attack_Hammer, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Attack_Hammer_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_End_Flight, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_End_Flight_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_End_hit, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_End_hit_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_Loop_Smoke, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_Loop_Smoke_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_Smoke, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_Smoke_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_Start_Glow, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill1_Start_Glow_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill2_Build, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill2_Build_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill2_Wall, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill2_Wall_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill3_Body, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill3_Body_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill4_Board, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill4_Board_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill4_Hand, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill4_Hand_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill4_hit, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_Skill4_hit_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_basic_attack_hit, "hero_stepladder_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStepladderBrothers_basic_attack_hit_skin_kabuki, "skin_stepladder_brothers_kabuki_brothers.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Attack, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_AttackBolt, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Attack_Impact, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Attack_Loading, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill1Breath, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill1Tornado_Dust, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill1Tornado_Impact, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill2Breath, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill2Cloud_Cover, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill2Tornado_Dust, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill2Tornado_Impact, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill3, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill3Bolt, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill3_Impact, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_Skill3_Loading, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_SystemShock_back, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStormDragon_SystemShock_front, "hero_storm_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_attack_gunfire, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_attack_impact, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_boomerang, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_boomerangImpact, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_boomerang_proj, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_coin, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_coinImpact, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_coin_proj, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_grab, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_grenade, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_grenadeImpact, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_grenade_proj, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_photobomb, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_photobombImpact, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_photobomb_proj, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_tearJar, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_tearJarImpact, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill1_tearJar_proj, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill2_grab, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill4_handglow, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroStowaway_skill4_vanishAppear, "hero_stowaway.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Attack_Falchion, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Attack_Knife, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill1_Ball, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill1_Fire, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill1_Follow, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill1_Hit, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill1_ballFollow, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill1_fireBall, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill2_Fire, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill2_Gather, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill2_Hit, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill3_Daytime, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill3_Night, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Blast, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Gather, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Sun, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Sun_End, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Sun_Loop, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Sun_Start, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_Skill4_Sunline, "hero_sun_seeker.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Attack_Falchion, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Attack_Knife, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill1_Ball, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill1_Fire, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill1_Follow, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill1_Hit, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill1_ballFollow, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill1_fireBall, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill2_Fire, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill2_Gather, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill2_Hit, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill3_Daytime, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill3_Night, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Blast, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Gather, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_End, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Loop, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Start, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sunline, "skin_sun_seeker_snow.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Attack_Hit, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Attack_Hit_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Attack_Projectile, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Attack_Projectile_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Attack_Spike1, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Attack_Spike1_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill1_Convergence1, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill1_Convergence1_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill1_Imprisonment, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill1_Imprisonment_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill1_end, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill1_end_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill2_Clawslash4, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill2_Clawslash4_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill2_Projectile, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill2_Projectile_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill3_Explosion1, "hero_tomb_angel.atlas");
        ATLAS_MAPPINGS.put(HeroTombAngel_Skill3_Explosion1_skin_usercontest, "skin_tomb_angel_usercontest.atlas");
        ATLAS_MAPPINGS.put(HeroTripleThreat_attack_clawslash, "hero_triple_threat.atlas");
        ATLAS_MAPPINGS.put(HeroTripleThreat_skill1_stingout, "hero_triple_threat.atlas");
        ATLAS_MAPPINGS.put(HeroTripleThreat_skill2_bite, "hero_triple_threat.atlas");
        ATLAS_MAPPINGS.put(HeroTripleThreat_skill3_explode, "hero_triple_threat.atlas");
        ATLAS_MAPPINGS.put(HeroTripleThreat_skill3_fire, "hero_triple_threat.atlas");
        ATLAS_MAPPINGS.put(HeroTripleThreat_skill3_projectile, "hero_triple_threat.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Attack, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Attack_Line, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill1_Earthquake1, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill1_Earthquake2, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill2_Base, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill2_Litht1, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill2_Litht2, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill2_Twinkle, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill4_Base, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill4_Litht1, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill4_Litht2, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUmlautTheFirst_Skill4_Twinkle, "hero_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Attack_Impact, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Attack_slash, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Cute, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Death, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Skill1_Impact, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Skill2_Impact, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Skill2_spin, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Skill3_FromHorn, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnicorgi_Skill3_HealOnly, "hero_unicorgi.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Attack_Papaw, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Death_Dragon, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Death_Egg, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Death_Egg_Light, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Egg_Idle, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill1, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill1_Ballistic, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill1_Hit, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill2, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill3_End, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill3_End_Ballistic, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill3_End_Hit, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill3_Loop_Papaw, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Skill4_Papaw, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroUnripeMythology_Victory_Papaw, "hero_unripe_mythology.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_GroundSmoke, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_GroundSmoke02_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_GroundSmoke_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_HandSplash, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_HandSplash2, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_HandSplash2_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_HandSplash_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleDamage, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleDamage_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMagicReturn, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMagicReturn_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMagicTwist, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMagicTwist02_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMagicTwist_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMagic_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMouth, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleMouth_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleWave, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_PurpleWave_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_SoulEnergy, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_SoulEnergy_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_hit, "hero_vampire_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVampireDragon_hit_skin_vamp, "skin_vampire_dragon_vamp_dracul.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Attack_FireFlight, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Attack_Hit, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Attack_Rune, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill1_Hit, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill1_Rune, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill1_Sprint, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill2_Rune, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill2_Sole, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill3_Caster, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVermilionBird_Skill4_Caster, "hero_vermilion_bird.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_attack, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_drips, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_skill2_puddle_creep, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_skill2_puddle_gen, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_skill2_puddle_gen_steam, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_skill4_blast, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_skill5_puddle_reversal, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_spew, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_steamer, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_stomp, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_stomp_L, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVileBile_stomp_R, "hero_vile_bile.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Attack, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Attack_Tail_Precharge, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Attack_quse, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill1_Detonation, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill1_Loop, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill2_Projectile, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill3_Gust_00, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill3_Gust_01, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill4_DOT, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill4_DOT_BG, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill4_DOT_FG, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Skill4_DOT_REF, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_Victory, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvernMastery_death, "skin_void_wyvern_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_attack, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_death, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_death_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_hit, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_detonation, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_detonation_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_loop, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_loop2, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_loop2_test, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_loop_02, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_loop_IN, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill1_loop_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill2_projectile, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill2_projectile_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill3_gust_00, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill3_gust_00_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill3_gust_01, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill3_gust_01_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill4_DOT, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill4_DOT_BG, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill4_DOT_FG, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill4_DOT_REF, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_skill4_DOT_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_tail_precharge, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_tail_precharge_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_victory, "hero_void_wyvern.atlas");
        ATLAS_MAPPINGS.put(HeroVoidWyvern_victory_imagination, "skin_void_wyvern_imagination.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_HandSplash, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_Hit, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_LaserPoint, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_RingHit, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_Skill6_RingHit, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_Skill6_SoulEnergy, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_Skill6_wave, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_Teleporter, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_TeleporterHand, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVulcanElf_Torpedo, "hero_vulcan_elf.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_attack, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_attack_Rr, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill4, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill4_Fr, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill4_Rr, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill4_dot, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill4_hit, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill5_blue_fire, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill5_blue_fire02, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_skill5_blue_fire03, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroVultureDragon_wingFlap, "hero_vulture_dragon.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_attack, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_attack_hit, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_attack_hit_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_attack_pre, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_attack_pre_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_attack_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill1_hit, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill1_hit_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill1_launch, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill1_launch_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill1_projectile, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill1_projectile_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill2_beam_A, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_skill2_beam_A_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_victory, "hero_wee_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWeeWitch_victory_skin_pumpkin_witch, "skin_wee_witch_pumpkin_witch.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Attack_Hand, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Attack_Hand_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Skill1_Fire_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Skill1_Fireburst_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Skill1_Smoke_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Skill3_FlameSurge, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Skill3_Knit_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_Skill3_Weave, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_attack, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_attack_hand, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_attack_projectile, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill1_fire_BG, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill1_fire_FR, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill1_fireburst, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill3_beam, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill3_beam_fireFlare, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill3_beam_hit_engulf, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill3_beam_hit_flare, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill3_flameSurge, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill3_weave, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill5_blue_fire, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill5_blue_fire02, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill5_fire, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill5_hit, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWereDragon_skill5_hit02, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Death_Smoke_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Dynamic_Fire_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Revert_Rise_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Revert_Trim_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Skill1_Revert_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Skill1_Upward_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_Underfooting_Smoke_skin_mastery, "skin_weredragon_mastery.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_death_revert, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_revert_spinner, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_revert_upward, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWeredragon_skill1_revert, "hero_weredragon.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Hit01, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Hit02, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Hit03, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Line, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Line00, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Line01, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Line02, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Line03, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Punch01, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Punch02, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Attack_Punch03, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill1_Ballistic, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill1_Caster, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill1_Energy, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill1_Hit, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill2_Arrogance, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill2_Blast, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill2_Sole, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill3_Ballistic, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill3_Caster, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroWhiteTiger_Skill4_Caster, "hero_white_tiger.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Attack_Pop_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Attack_Wound_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_BloodSplash, "hero_zombie_squire.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_BloodSplashLeg, "hero_zombie_squire.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_BloodSplashSk2, "hero_zombie_squire.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Death_Drop_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Death_Twinkle_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Dust, "hero_zombie_squire.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Hit_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_ReviveFire, "hero_zombie_squire.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Shimmer, "hero_zombie_squire.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Skill1_Hit_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Skill2_Hit_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Walk_Dust_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(HeroZombieSquire_Walk_Particle_skin_Digital, "skin_zombie_squire_digital.atlas");
        ATLAS_MAPPINGS.put(MonsterAngelicAvenger_BasicAttack, "monster_angelic_avenger.atlas");
        ATLAS_MAPPINGS.put(MonsterAnt_ambush, "monster_ant.atlas");
        ATLAS_MAPPINGS.put(MonsterAnt_digdug, "monster_ant.atlas");
        ATLAS_MAPPINGS.put(MonsterAnt_digdug_Fr, "monster_ant.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Attack_Drop, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Attack_Hit, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Attack_Storage, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Hit_Brust, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Hit_Shield, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Idle_Buff, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Idle_Buff02, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Skill1_Caster, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Skill1_Hit, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Skill1_Sand01, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Skill1_Sand02, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Skill1_Sand03, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Victory_Gather, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Victory_Loop_Wing, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterAnubisDragon_Victory_Wing, "monster_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterArcherGrunt_ArrowImpact, "monster_archer_grunt.atlas");
        ATLAS_MAPPINGS.put(MonsterArcherGrunt_ArrowRelease, "monster_archer_grunt.atlas");
        ATLAS_MAPPINGS.put(MonsterArcherMagic_ArrowCharge, "monster_archer_magic.atlas");
        ATLAS_MAPPINGS.put(MonsterArcherMagic_ArrowImpact, "monster_archer_magic.atlas");
        ATLAS_MAPPINGS.put(MonsterArcherPhys_ArrowImpact, "monster_archer_phys.atlas");
        ATLAS_MAPPINGS.put(MonsterArcherPhys_ArrowRelease, "monster_archer_phys.atlas");
        ATLAS_MAPPINGS.put(MonsterBlueDragon_Attack_Hit, "monster_blue_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBlueDragon_Attack_Water, "monster_blue_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBlueDragon_Attack_WaterSpray, "monster_blue_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBlueDragon_Skill1_Gather, "monster_blue_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBlueDragon_Skill1_SwordRain, "monster_blue_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBlueDragon_Skill2_buff, "monster_blue_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAbyssDragon_Attack_Hit, "monster_boss_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAbyssDragon_Attack_Water, "monster_boss_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAbyssDragon_Attack_WaterSpray, "monster_boss_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAbyssDragon_Skill1_Gather, "monster_boss_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAbyssDragon_Skill1_SwordRain, "monster_boss_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAbyssDragon_Skill2_buff, "monster_boss_abyss_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Attack_Drop, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Attack_Hit, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Attack_Storage, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Hit_Brust, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Hit_Shield, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Idle_Buff, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Idle_Buff02, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Skill1_Caster, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Skill1_Hit, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Skill1_Sand01, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Skill1_Sand02, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Skill1_Sand03, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Victory_Gather, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Victory_Loop_Wing, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossAnubisDragon_Victory_Wing, "monster_boss_anubis_dragon.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Attack, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Attack_Line, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Skill1_Earthquake1, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Skill1_Earthquake2, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Skill2_Base, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Skill2_Litht1, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Skill2_Litht2, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautTheFirst_Skill2_Twinkle, "monster_boss_umlaut_the_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Attack, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Attack_Hit, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Death, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill1_Bolt, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill1_Gather2, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill1_Gather3, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill1_Gather4, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill1_Hit, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill1_Knife02, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill2, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill3_Gather, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill3_Gather02, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill3_Line, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBossUmlautthefifthFirst_Skill3_Shockwave, "monster_boss_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterBreakerMkii_Attack, "monster_breaker_mkii.atlas");
        ATLAS_MAPPINGS.put(MonsterBreakerMkii_Skill_Attack, "monster_breaker_mkii.atlas");
        ATLAS_MAPPINGS.put(MonsterBreakerMkii_Skill_End, "monster_breaker_mkii.atlas");
        ATLAS_MAPPINGS.put(MonsterBreakerMkii_Skill_Star, "monster_breaker_mkii.atlas");
        ATLAS_MAPPINGS.put(MonsterCauldron_Death, "monster_cauldron.atlas");
        ATLAS_MAPPINGS.put(MonsterCauldron_Death_Fire, "monster_cauldron.atlas");
        ATLAS_MAPPINGS.put(MonsterCauldron_Vicotry_Hit, "monster_cauldron.atlas");
        ATLAS_MAPPINGS.put(MonsterCauldron_Vicotry_SplashF, "monster_cauldron.atlas");
        ATLAS_MAPPINGS.put(MonsterCloud_AttackImpact, "monster_cloud.atlas");
        ATLAS_MAPPINGS.put(MonsterCloud_Shield_rain, "monster_cloud.atlas");
        ATLAS_MAPPINGS.put(MonsterCloud_VictoryRain, "monster_cloud.atlas");
        ATLAS_MAPPINGS.put(MonsterCrystalLizard_Attack_Follow, "monster_crystal_lizard.atlas");
        ATLAS_MAPPINGS.put(MonsterCrystalLizard_Attack_Hit, "monster_crystal_lizard.atlas");
        ATLAS_MAPPINGS.put(MonsterCrystalLizard_Skill1_End_Blast, "monster_crystal_lizard.atlas");
        ATLAS_MAPPINGS.put(MonsterCrystalLizard_Skill1_Loop_Circle, "monster_crystal_lizard.atlas");
        ATLAS_MAPPINGS.put(MonsterCrystalLizard_Skill1_Start_Gather, "monster_crystal_lizard.atlas");
        ATLAS_MAPPINGS.put(MonsterEyeball_AttackPop, "monster_eyeball.atlas");
        ATLAS_MAPPINGS.put(MonsterEyeball_HitImpact, "monster_eyeball.atlas");
        ATLAS_MAPPINGS.put(MonsterFleaDemon_attack_hit, "monster_flea_demon.atlas");
        ATLAS_MAPPINGS.put(MonsterFleaDemon_deathPop, "monster_flea_demon.atlas");
        ATLAS_MAPPINGS.put(MonsterGoblin_impact, "monster_goblin.atlas");
        ATLAS_MAPPINGS.put(MonsterHeadCrab_Attack, "monster_head_crab.atlas");
        ATLAS_MAPPINGS.put(MonsterInfernoSpider_AttackFireStart, "monster_inferno_spider.atlas");
        ATLAS_MAPPINGS.put(MonsterInfernoSpider_AttackFire_Proj, "monster_inferno_spider.atlas");
        ATLAS_MAPPINGS.put(MonsterInfernoSpider_AttackLanded, "monster_inferno_spider.atlas");
        ATLAS_MAPPINGS.put(MonsterInfernoSpider_AttackLaunching, "monster_inferno_spider.atlas");
        ATLAS_MAPPINGS.put(MonsterKamikazeGnome_AttackExplosion, "monster_kamikaze_gnome.atlas");
        ATLAS_MAPPINGS.put(MonsterKamikazeGnome_AttackFuse, "monster_kamikaze_gnome.atlas");
        ATLAS_MAPPINGS.put(MonsterKamikazeGnome_Ground, "monster_kamikaze_gnome.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Gold_EnergyExplosion, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Gold_MeatExplosion, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Gold_RedSmokeExplosion, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Gold_ShieldBubble, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Silver_EnergyExplosion, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Silver_GraySmokeExplosion, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Silver_MeatExplosion, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Silver_ShieldBubble, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterKingImp_Skill2_Transformation, "monster_king_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterLyingLantern_deathFlash_01, "monster_lying_lantern.atlas");
        ATLAS_MAPPINGS.put(MonsterLyingLantern_death_02, "monster_lying_lantern.atlas");
        ATLAS_MAPPINGS.put(MonsterLyingLantern_debuff_01, "monster_lying_lantern.atlas");
        ATLAS_MAPPINGS.put(MonsterLyingLantern_skill, "monster_lying_lantern.atlas");
        ATLAS_MAPPINGS.put(MonsterLyingLantern_skill_Bg, "monster_lying_lantern.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_Death, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_DeathH, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_MissileExplosion, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_MissileExplosion_rt, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_MissileImpact, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_hit, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicGolem_victory, "monster_magic_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicImp_EnergyExplosion, "monster_magic_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicImp_MeatExplosion, "monster_magic_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicImp_RedSmokeExplosion, "monster_magic_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterMagicImp_ShieldBubble, "monster_magic_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_AttackSplash, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_Hide_Puff, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_Hide_Smoke, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_Hide_SmokeBg, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_Hit, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_WalkDust, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterManEatingPlant_WalkDustFG, "monster_man_eating_plant.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_AttackDust, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_AttackDustBG, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_AttackRing, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_DeathDust, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_DeathDustFG, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_Hit, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMrSmashy_WalkDust, "monster_mr_smashy.atlas");
        ATLAS_MAPPINGS.put(MonsterMushroom_AttackShoot, "monster_mushroom.atlas");
        ATLAS_MAPPINGS.put(MonsterMushroom_AttackSpore, "monster_mushroom.atlas");
        ATLAS_MAPPINGS.put(MonsterMushroom_AttackSpore_Impact, "monster_mushroom.atlas");
        ATLAS_MAPPINGS.put(MonsterMushroom_Victory, "monster_mushroom.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_Death, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_DeathH, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_MissileExplosion, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_MissileExplosion_rt, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_MissileImpact, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_hit, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysGolem_victory, "monster_phys_golem.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysImp_EnergyExplosion, "monster_phys_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysImp_GraySmokeExplosion, "monster_phys_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysImp_MeatExplosion, "monster_phys_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterPhysImp_ShieldBubble, "monster_phys_imp.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_attack, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_attack_A, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_attack_B, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_death_gutSplat, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_death_ratrun1, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_death_ratrun2, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_death_ratrun3, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterPlagueSkulker_death_soft, "monster_plague_skulker.atlas");
        ATLAS_MAPPINGS.put(MonsterRedtiger_Attack_Claw, "monster_redtiger.atlas");
        ATLAS_MAPPINGS.put(MonsterRedtiger_Attack_Hit, "monster_redtiger.atlas");
        ATLAS_MAPPINGS.put(MonsterRedtiger_Skill_Enchantment_End, "monster_redtiger.atlas");
        ATLAS_MAPPINGS.put(MonsterRedtiger_Skill_Enchantment_Hit, "monster_redtiger.atlas");
        ATLAS_MAPPINGS.put(MonsterRedtiger_Skill_Enchantment_Loop, "monster_redtiger.atlas");
        ATLAS_MAPPINGS.put(MonsterRedtiger_Skill_Enchantment_Start, "monster_redtiger.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_DeathDust, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_DeathSmokey, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_PumpkinBurst, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_PumpkinFire, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_PumpkinFireThin, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_PumpkinProj, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterScarecrow_Victory, "monster_scarecrow.atlas");
        ATLAS_MAPPINGS.put(MonsterSharkWarrior_attack, "monster_shark.atlas");
        ATLAS_MAPPINGS.put(MonsterSharkWarrior_attackImpact, "monster_shark.atlas");
        ATLAS_MAPPINGS.put(MonsterSharkWarrior_counterBite, "monster_shark.atlas");
        ATLAS_MAPPINGS.put(MonsterSharkWarrior_death, "monster_shark.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Attack_Hit1, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Attack_Hit3, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Attack_Smoke, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Death, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Death_Rotate, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Idle_Skull, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Idle_Somke, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Idle_Somke2, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Skill1_Ballistic, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Skill1_Ballistic2, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Skill1_Converge, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Skill1_Hit1, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Skill1_knife, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Victory, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Walk_Skull, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_Walk_Smoke, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSinisterAssailant_hit_Skull, "monster_sinister_assailant.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Attack_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Charge_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Death_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Hit_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Idle_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Stun_Attack_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Victory_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_Walk_Shine_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_attackFlame, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_attackFlame_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_attackHooves, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_deathExplosion, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_deathExplosion_skin_ascendant_deer, "skin_skeleton_deer_ascendant_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_spawnBlacksmoke, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_stunGlowEyes, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_stunHooves, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_stunSwipe, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSkeletonDeer_stunSwipe_Impact, "monster_skeleton_deer.atlas");
        ATLAS_MAPPINGS.put(MonsterSpriteBuff_AttackStcik, "monster_sprite_buff.atlas");
        ATLAS_MAPPINGS.put(MonsterSpriteBuff_AttackTummy, "monster_sprite_buff.atlas");
        ATLAS_MAPPINGS.put(MonsterSpriteHeal_EnergyHeal, "monster_sprite_heal.atlas");
        ATLAS_MAPPINGS.put(MonsterSpriteHeal_EnergyStick, "monster_sprite_heal.atlas");
        ATLAS_MAPPINGS.put(MonsterSquid_AttackInk_Proj, "monster_squid.atlas");
        ATLAS_MAPPINGS.put(MonsterSquid_AttackInk_Release, "monster_squid.atlas");
        ATLAS_MAPPINGS.put(MonsterSquid_InkEvaporate, "monster_squid.atlas");
        ATLAS_MAPPINGS.put(MonsterSquirrel_hit, "monster_squirrel.atlas");
        ATLAS_MAPPINGS.put(MonsterTrollBlob_AttackSplash, "monster_troll_blob.atlas");
        ATLAS_MAPPINGS.put(MonsterTrollBlob_WalkSlime, "monster_troll_blob.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Attack, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Attack_Hit, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Death, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill1_Bolt, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill1_Gather2, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill1_Gather3, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill1_Gather4, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill1_Hit, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill1_Knife02, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(MonsterUmlautthefifthFirst_Skill2, "monster_umlautthefifth_first.atlas");
        ATLAS_MAPPINGS.put(Rewards_glow, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Rewards_tier_blue, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Rewards_tier_green, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Rewards_tier_pink, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Rewards_tier_plane, "ui_war.atlas");
        ATLAS_MAPPINGS.put(Rewards_tier_yellow, "ui_war.atlas");
        ATLAS_MAPPINGS.put(RuneEmpower_dust, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(RuneEmpower_loop_burst, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(RuneEmpower_only_swirl, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(RuneEmpower_only_swirl_fail, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_ActivationGlowA, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_Shrine_centerMagic, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_Shrine_flashStone, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_Shrine_floatingStoneFollow, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_Shrine_lfMagic, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_Shrine_rtMagic, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Rune_StarMask, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(Shield_break, "ui_war.atlas");
        ATLAS_MAPPINGS.put(StarBurst, "ui_quests.atlas");
        ATLAS_MAPPINGS.put(Trail, "ui_main.atlas");
        ATLAS_MAPPINGS.put(UI_Chest_13642_FLASH, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(UI_Chest_13642_PULSE, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chest_spring_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chest_spring_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chest_spring_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chest_valentine_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chest_valentine_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chest_valentine_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_DEFAULT_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_DEFAULT_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_DEFAULT_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_EXPEDITION_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_EXPEDITION_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_EXPEDITION_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_GOLD_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_GOLD_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_GOLD_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_ORANGE_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_ORANGE_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_ORANGE_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_PURPLE_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_PURPLE_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_PURPLE_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_SILVER_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_SILVER_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_SILVER_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_SOUL_FX_BG, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_SOUL_FX_MID, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(chests_open_SOUL_FX_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(combat_HeroButton_ActiveSkill_Pulse_B, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(combat_HeroButton_ActiveSkill_Surge_ANIM_B, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(combat_HeroButton_ActiveSkill_TAP, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(combat_HeroButton_FairyDragon_FullCharge, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(combat_HeroButton_FairyDragon_blueCirc_ANIM, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(combat_HeroButton_FairyDragon_sparkles, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(confetti_BLOW_L, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_BLOW_R, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_L_A, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_L_B, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_L_C, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_L_D, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_R_A, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_R_B, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_R_C, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(confetti_FALL_R_D, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(contests_flamingSword_REF, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(contests_meterSparkle, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(contests_meterSparkle_proj, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(contests_sword_shockwave, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(enchanting_flashStar, "ui_enchanting.atlas");
        ATLAS_MAPPINGS.put(enchanting_glowStar, "ui_enchanting.atlas");
        ATLAS_MAPPINGS.put(heroProgression_whirl_BG, "ui_experience.atlas");
        ATLAS_MAPPINGS.put(heroProgression_whirl_FR, "ui_experience.atlas");
        ATLAS_MAPPINGS.put(newHero_fireWorks_A, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(newHero_fireWorks_B, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(newHero_fireWorks_C, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(newHero_fireWorks_D, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(newHero_fireWorks_TOP, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(newHero_starCircle, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(newHero_whoosh, "ui_chests.atlas");
        ATLAS_MAPPINGS.put(promote_ready_button_bg, "ui_combat.atlas");
        ATLAS_MAPPINGS.put(sign_in_vip_sparkler_A, "ui_main.atlas");
        ATLAS_MAPPINGS.put(swirl_A, "ui_main.atlas");
        ATLAS_MAPPINGS.put(swirl_C, "ui_main.atlas");
        ATLAS_MAPPINGS.put(swirl_D, "ui_main.atlas");
        ATLAS_MAPPINGS.put(tutorial_charTentacles, "ui_tutorial.atlas");
        ATLAS_MAPPINGS.put(tutorial_smokeContinuous, "ui_tutorial.atlas");
        ATLAS_MAPPINGS.put(tutorial_smokeCrawl_LR, "ui_tutorial.atlas");
        ATLAS_MAPPINGS.put(tutorial_smokeCrawl_RL, "ui_tutorial.atlas");
        ATLAS_MAPPINGS.put(ui_alley_glowingEye_blue, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_alley_glowingEye_green, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_alley_glowingEye_yellow, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_alley_lightRay, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_main_bird, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_campFire_HI, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_campFire_LO, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_campFire_on_tap, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_cauldron, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_chestSparkles, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_flamingSword, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_flamingSword_REF, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_hold_FX, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_hold_Fr, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_hold_Rr, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_sword_Fr, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_sword_Rr, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_contests_sword_shockwave, "ui_contests.atlas");
        ATLAS_MAPPINGS.put(ui_main_lavasteam, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_lightBugs_LITE_combined, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_snowing, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_summit_mist, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_torch, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_main_torchSmoke, "ui_main.atlas");
        ATLAS_MAPPINGS.put(ui_marina_boat, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_marina_front_boat, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_rune_altar_BLU, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(ui_rune_altar_GLD, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(ui_rune_altar_PRP, "ui_rune.atlas");
        ATLAS_MAPPINGS.put(ui_shipyard_seagull, "ui_chapter_vfx.atlas");
        ATLAS_MAPPINGS.put(ui_tavern_dust, "ui_chapter_vfx.atlas");
        for (Object put : UnitType.values()) {
            UNIT_MAPPING.put(put, new HashSet());
        }
        for (ParticleType particleType : values()) {
            UnitType unitTypeForParticle = AssetNameMapping.getUnitTypeForParticle(particleType);
            if (unitTypeForParticle != null) {
                ((Set) UNIT_MAPPING.get(unitTypeForParticle)).add(particleType);
                PARTICLE_MAPPING.put(particleType, unitTypeForParticle);
            }
        }
    }

    public static String getAtlasName(ParticleType particleType) {
        return (String) ATLAS_MAPPINGS.get(particleType);
    }

    public static ParticleType[] values() {
        return (ParticleType[]) ATLAS_MAPPINGS.keySet().toArray(new ParticleType[ATLAS_MAPPINGS.size()]);
    }

    private ParticleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public static ParticleType[] valuesCached() {
        if (values == null) {
            values = values();
        }
        return values;
    }

    public long getEmitDuration() {
        getBaseParticle(this).getName().hashCode();
        return -1;
    }

    public long getRepeatDuration() {
        getBaseParticle(this).getName().hashCode();
        return -1;
    }

    public ParticleLayer getDefaultLayer() {
        String name = getBaseParticle(this).getName();
        Object obj = -1;
        switch (name.hashCode()) {
            case -2123793710:
                if (name.equals("HeroBurntOne_skill3_magmaWave_halfHeight")) {
                    obj = 72;
                    break;
                }
                break;
            case -2116640403:
                if (name.equals("HeroShadowAssassin_Skill3WKnifeProj")) {
                    obj = 32;
                    break;
                }
                break;
            case -2104304789:
                if (name.equals("HeroShadowAssassin_Skill2BKnifeProj_skin_watch")) {
                    obj = 31;
                    break;
                }
                break;
            case -2041695267:
                if (name.equals("HeroDemonTotem_Skill6_totem_bottom1")) {
                    obj = 90;
                    break;
                }
                break;
            case -2041695266:
                if (name.equals("HeroDemonTotem_Skill6_totem_bottom2")) {
                    obj = 91;
                    break;
                }
                break;
            case -2041695265:
                if (name.equals("HeroDemonTotem_Skill6_totem_bottom3")) {
                    obj = 92;
                    break;
                }
                break;
            case -1989156763:
                if (name.equals("HeroVileBile_stomp_L")) {
                    obj = 53;
                    break;
                }
                break;
            case -1989156757:
                if (name.equals("HeroVileBile_stomp_R")) {
                    obj = 54;
                    break;
                }
                break;
            case -1988303858:
                if (name.equals("HeroVermilionBird_Skill2_Sole")) {
                    obj = 67;
                    break;
                }
                break;
            case -1879264190:
                if (name.equals("HeroDarkHero_Skill1_End_Normal_Array1")) {
                    obj = 95;
                    break;
                }
                break;
            case -1871182672:
                if (name.equals("HeroUmlautTheFirst_Skill4_Litht1")) {
                    obj = 84;
                    break;
                }
                break;
            case -1846646471:
                if (name.equals("HeroFaithHealer_circle_only")) {
                    obj = 18;
                    break;
                }
                break;
            case -1668659302:
                if (name.equals("MonsterSinisterAssailant_Skill1_Ballistic")) {
                    obj = 102;
                    break;
                }
                break;
            case -1635615819:
                if (name.equals("HeroSpectralDragon_talismanFire")) {
                    obj = 46;
                    break;
                }
                break;
            case -1633271671:
                if (name.equals("MonsterPlagueSkulker_death_gutSplat")) {
                    obj = 17;
                    break;
                }
                break;
            case -1585378283:
                if (name.equals("HeroElectroYeti_ElectricityRing")) {
                    obj = 43;
                    break;
                }
                break;
            case -1501758042:
                if (name.equals("MonsterAnubisDragon_Victory_Wing")) {
                    obj = 64;
                    break;
                }
                break;
            case -1485375900:
                if (name.equals("HeroWhiteTiger_Skill2_Sole")) {
                    obj = 78;
                    break;
                }
                break;
            case -1428042776:
                if (name.equals("HeroVultureDragon_skill5_blue_fire03")) {
                    obj = 88;
                    break;
                }
                break;
            case -1333882835:
                if (name.equals("HeroBruteDragon_Skill6_Buff_Bottom")) {
                    obj = 89;
                    break;
                }
                break;
            case -1288891844:
                if (name.equals("HeroBoneDragon_Skill2TarLanded_Proj")) {
                    obj = 24;
                    break;
                }
                break;
            case -1172005521:
                if (name.equals("HeroSkeletonKing_Skill2_Foot_skin_ascendant")) {
                    obj = 73;
                    break;
                }
                break;
            case -1142079611:
                if (name.equals("HeroCyclopsWizard_Skill3_BoltFeet")) {
                    obj = 13;
                    break;
                }
                break;
            case -1073652974:
                if (name.equals("HeroBrozerker_Magicexplode_ring")) {
                    obj = 5;
                    break;
                }
                break;
            case -1061836046:
                if (name.equals("HeroUmlautTheFirst_Skill2_Litht1")) {
                    obj = 81;
                    break;
                }
                break;
            case -855071726:
                if (name.equals("HeroClawMan_Skill3_buff")) {
                    obj = 97;
                    break;
                }
                break;
            case -823524423:
                if (name.equals("MonsterCauldron_Vicotry_SplashF")) {
                    obj = 3;
                    break;
                }
                break;
            case -797220128:
                if (name.equals("MonsterBossUmlautthefifthFirst_Skill1_Gather2")) {
                    obj = 69;
                    break;
                }
                break;
            case -722627443:
                if (name.equals("HeroCatapultKnight_Skill2SmokeLand_Ground")) {
                    obj = 23;
                    break;
                }
                break;
            case -722001082:
                if (name.equals("HeroCursedStatue_spear_shockwave")) {
                    obj = 15;
                    break;
                }
                break;
            case -692221766:
                if (name.equals("HeroForgottenDragon_Skill1_Ground")) {
                    obj = 75;
                    break;
                }
                break;
            case -685658825:
                if (name.equals("HeroFaithHealer_pastelcharms")) {
                    obj = 19;
                    break;
                }
                break;
            case -602205885:
                if (name.equals("HeroApprentice_RingForFood")) {
                    obj = 11;
                    break;
                }
                break;
            case -599452339:
                if (name.equals("HeroDwarvenArcher_Skill1_FeetSwirl")) {
                    obj = 37;
                    break;
                }
                break;
            case -548667877:
                if (name.equals("HeroShadowAssassin_AttackYKnifeProj_skin_watch")) {
                    obj = 29;
                    break;
                }
                break;
            case -546661355:
                if (name.equals("HeroUmlautTheFirst_Skill2_Base")) {
                    obj = 80;
                    break;
                }
                break;
            case -495801915:
                if (name.equals("HeroVultureDragon_wingFlap")) {
                    obj = 14;
                    break;
                }
                break;
            case -489403053:
                if (name.equals("HeroUmlautTheFirst_Skill4_Base")) {
                    obj = 83;
                    break;
                }
                break;
            case -487872735:
                if (name.equals("HeroShadowAssassin_Skill2BKnifeProj")) {
                    obj = 30;
                    break;
                }
                break;
            case -475321483:
                if (name.equals("HeroDiggerMole_Skill3_Crack")) {
                    obj = 76;
                    break;
                }
                break;
            case -468972166:
                if (name.equals("HeroApprentice_MeteorHitGround")) {
                    obj = 7;
                    break;
                }
                break;
            case -452985192:
                if (name.equals("HeroFaithHealer_ProjectileBook_glow")) {
                    obj = 20;
                    break;
                }
                break;
            case -373093784:
                if (name.equals("HeroBruteDragon_SmokeMouth")) {
                    obj = 21;
                    break;
                }
                break;
            case -361369847:
                if (name.equals("HeroWereDragon_skill5_hit")) {
                    obj = 4;
                    break;
                }
                break;
            case -293477206:
                if (name.equals("HeroDragonSlayer_Skill3_Hit")) {
                    obj = 58;
                    break;
                }
                break;
            case -272209781:
                if (name.equals("HeroGroovyDruid_Skill1Impact")) {
                    obj = 2;
                    break;
                }
                break;
            case -254668303:
                if (name.equals("HeroWereDragon_skill5_blue_fire")) {
                    obj = 87;
                    break;
                }
                break;
            case -235913814:
                if (name.equals("HeroSunSeeker_skin_sun_seeker_snow_Skill3_Night")) {
                    obj = 71;
                    break;
                }
                break;
            case -82537685:
                if (name.equals("HeroShadowAssassin_Cross_only")) {
                    obj = 42;
                    break;
                }
                break;
            case -3630768:
                if (name.equals("MonsterAnubisDragon_Idle_Buff")) {
                    obj = 63;
                    break;
                }
                break;
            case 28889950:
                if (name.equals("MonsterBreakerMkii_Skill_End")) {
                    obj = 99;
                    break;
                }
                break;
            case 73907555:
                if (name.equals("HeroBanshee_skill3_DoT_A")) {
                    obj = 49;
                    break;
                }
                break;
            case 159753899:
                if (name.equals("HeroBardbarian_Buff_Ring")) {
                    obj = 27;
                    break;
                }
                break;
            case 166796353:
                if (name.equals("MonsterSkeletonDeer_attackFlame")) {
                    obj = 39;
                    break;
                }
                break;
            case 197183691:
                if (name.equals("MonsterSkeletonDeer_deathExplosion")) {
                    obj = 56;
                    break;
                }
                break;
            case 211092371:
                if (name.equals("MonsterUmlautthefifthFirst_Skill1_Gather2")) {
                    obj = 68;
                    break;
                }
                break;
            case 216581844:
                if (name.equals("HeroSunSeeker_Skill3_Daytime")) {
                    obj = 60;
                    break;
                }
                break;
            case 296008095:
                if (name.equals("HeroShadowAssassin_Skill3WKnifeProj_skin_watch")) {
                    obj = 33;
                    break;
                }
                break;
            case 323182847:
                if (name.equals("HeroMagicDragon_WalkMist")) {
                    obj = 26;
                    break;
                }
                break;
            case 343737208:
                if (name.equals("HeroUmlautTheFirst_Skill2_Twinkle")) {
                    obj = 82;
                    break;
                }
                break;
            case 345103059:
                if (name.equals("HeroGreedyDragon_Skill2_Ground")) {
                    obj = 62;
                    break;
                }
                break;
            case 363152991:
                if (name.equals("HeroDarkHero_Skill1_Loop_Normal_Array1")) {
                    obj = 94;
                    break;
                }
                break;
            case 390398066:
                if (name.equals("HeroLastDefender_Skill1_Loop_Crack")) {
                    obj = 74;
                    break;
                }
                break;
            case 405537948:
                if (name.equals("HeroWereDragon_skill1_fireburst")) {
                    obj = 50;
                    break;
                }
                break;
            case 422929787:
                if (name.equals("HeroSunSeeker_skin_sun_seeker_snow_Skill3_Daytime")) {
                    obj = 70;
                    break;
                }
                break;
            case 451721737:
                if (name.equals("HeroDarkHero_Skill1_Start_Normal_Array1")) {
                    obj = 93;
                    break;
                }
                break;
            case 530655040:
                if (name.equals("HeroSilentSpirit_skill2")) {
                    obj = 48;
                    break;
                }
                break;
            case 550090978:
                if (name.equals("HeroSpectralDragon_talismanFire_skin_easter")) {
                    obj = 47;
                    break;
                }
                break;
            case 615929547:
                if (name.equals("HeroWereDragon_skill5_hit02")) {
                    obj = 86;
                    break;
                }
                break;
            case 636787492:
                if (name.equals("HeroSunSeeker_skin_sun_seeker_snow_Skill4_Sun_Loop")) {
                    obj = 96;
                    break;
                }
                break;
            case 660774437:
                if (name.equals("HeroPchAnubisDragon_Victory_Wing")) {
                    obj = 66;
                    break;
                }
                break;
            case 691600064:
                if (name.equals("HeroUmlautTheFirst_Skill1_Earthquake2")) {
                    obj = 79;
                    break;
                }
                break;
            case 736761998:
                if (name.equals("HeroGrandHuntress_Skill4_quagmire")) {
                    obj = 59;
                    break;
                }
                break;
            case 795678237:
                if (name.equals("HeroSilentSpirit_attack_Bg")) {
                    obj = 16;
                    break;
                }
                break;
            case 896011311:
                if (name.equals("MonsterBreakerMkii_Skill_Star")) {
                    obj = 98;
                    break;
                }
                break;
            case 983733103:
                if (name.equals("HeroSavageCutie_Skill1WaveLoop")) {
                    obj = 10;
                    break;
                }
                break;
            case 1015094541:
                if (name.equals("HeroDruidinatrix_Skill1GlowBody")) {
                    obj = 36;
                    break;
                }
                break;
            case 1023795578:
                if (name.equals("HeroUmlautTheFirst_Skill4_Twinkle")) {
                    obj = 85;
                    break;
                }
                break;
            case 1069416648:
                if (name.equals("HeroFairyDragon_RippleGround")) {
                    obj = 6;
                    break;
                }
                break;
            case 1075943960:
                if (name.equals("HeroSniperWolf_Skill1_GlowRing")) {
                    obj = 44;
                    break;
                }
                break;
            case 1168797142:
                if (name.equals("HeroGroovyDruid_HedgehogSpike_Proj")) {
                    obj = 34;
                    break;
                }
                break;
            case 1182188105:
                if (name.equals("HeroWhiteTiger_Skill2_Blast")) {
                    obj = 77;
                    break;
                }
                break;
            case 1246585389:
                if (name.equals("HeroSkeletonKing_Skill2_HealingRing")) {
                    obj = 38;
                    break;
                }
                break;
            case 1326077307:
                if (name.equals("HeroMistressManicure_skill2_puddle_spread2")) {
                    obj = 52;
                    break;
                }
                break;
            case 1379317716:
                if (name.equals("HeroVileBile_skill2_puddle_gen")) {
                    obj = 55;
                    break;
                }
                break;
            case 1410136819:
                if (name.equals("HeroBruteDragon_BuffRing")) {
                    obj = 40;
                    break;
                }
                break;
            case 1422351509:
                if (name.equals("HeroBruteDragon_FirePlumeLanded")) {
                    obj = 9;
                    break;
                }
                break;
            case 1428250007:
                if (name.equals("HeroMistressManicure_skill2_puddle_spread")) {
                    obj = 51;
                    break;
                }
                break;
            case 1430863961:
                if (name.equals("HeroDragonSlayer_Skill3_Circle")) {
                    obj = 57;
                    break;
                }
                break;
            case 1435377987:
                if (name.equals("HeroSunSeeker_Skill3_Night")) {
                    obj = 61;
                    break;
                }
                break;
            case 1541187798:
                if (name.equals("HeroCatapultKnight_Skill1RockLand_Ground")) {
                    obj = 22;
                    break;
                }
                break;
            case 1555001100:
                if (name.equals("HeroPchAnubisDragon_Victory_Loop_Wing")) {
                    obj = 65;
                    break;
                }
                break;
            case 1579691457:
                if (name.equals("HeroElectroYeti_cloudlightning")) {
                    obj = null;
                    break;
                }
                break;
            case 1581582708:
                if (name.equals("HeroBruteDragon_GreenGasFeet")) {
                    obj = 8;
                    break;
                }
                break;
            case 1635222534:
                if (name.equals("HeroCyclopsWizard_Skill1_lightning")) {
                    obj = 45;
                    break;
                }
                break;
            case 1682377088:
                if (name.equals("HeroWereDragon_skill5_fire")) {
                    obj = 101;
                    break;
                }
                break;
            case 1719182245:
                if (name.equals("HeroZombieSquire_ReviveFire")) {
                    obj = 41;
                    break;
                }
                break;
            case 1922261609:
                if (name.equals("HeroBardbarian_AWave")) {
                    obj = 1;
                    break;
                }
                break;
            case 1937014675:
                if (name.equals("HeroBoneDragon_Skill1RibFire")) {
                    obj = 25;
                    break;
                }
                break;
            case 1952860891:
                if (name.equals("MonsterMrSmashy_AttackRing")) {
                    obj = 12;
                    break;
                }
                break;
            case 2022527601:
                if (name.equals("HeroShadowAssassin_AttackYKnifeProj")) {
                    obj = 28;
                    break;
                }
                break;
            case 2075929969:
                if (name.equals("HeroMinotaur_Skill3_HealSelf_BG")) {
                    obj = 35;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
            case 2:
            case 3:
            case 4:
                return ParticleLayer.FOREGROUND;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                return ParticleLayer.ENTITY_BACKGROUND;
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
                return ParticleLayer.BACKGROUND;
            case 98:
            case 99:
                return ParticleLayer.ENTITY;
            default:
                return ParticleLayer.ENTITY_FOREGROUND;
        }
    }

    public boolean renderOnGround() {
        String name = getBaseParticle(this).getName();
        boolean z = true;
        switch (name.hashCode()) {
            case -1288891844:
                if (name.equals("HeroBoneDragon_Skill2TarLanded_Proj")) {
                    z = false;
                    break;
                }
                break;
            case -235913814:
                if (name.equals("HeroSunSeeker_skin_sun_seeker_snow_Skill3_Night")) {
                    z = true;
                    break;
                }
                break;
            case -82537685:
                if (name.equals("HeroShadowAssassin_Cross_only")) {
                    z = true;
                    break;
                }
                break;
            case 216581844:
                if (name.equals("HeroSunSeeker_Skill3_Daytime")) {
                    z = true;
                    break;
                }
                break;
            case 422929787:
                if (name.equals("HeroSunSeeker_skin_sun_seeker_snow_Skill3_Daytime")) {
                    z = true;
                    break;
                }
                break;
            case 1435377987:
                if (name.equals("HeroSunSeeker_Skill3_Night")) {
                    z = true;
                    break;
                }
                break;
            case 1519512005:
                if (name.equals("HeroFrostGiant_Skill3FrostGround")) {
                    z = true;
                    break;
                }
                break;
            case 1558638821:
                if (name.equals("MonsterBreakerMkii_Skill_Attack")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                return true;
            default:
                return false;
        }
    }

    public boolean renderMultiplePerEntity() {
        String name = getBaseParticle(this).getName();
        boolean z = true;
        switch (name.hashCode()) {
            case -1768445450:
                if (name.equals("HeroSadisticDancer_Skill2_Loop_01")) {
                    z = true;
                    break;
                }
                break;
            case 14968986:
                if (name.equals("HeroForgottenDragon_Skill2_Wind")) {
                    z = true;
                    break;
                }
                break;
            case 216581844:
                if (name.equals("HeroSunSeeker_Skill3_Daytime")) {
                    z = false;
                    break;
                }
                break;
            case 1404080658:
                if (name.equals("HeroSadisticDancer_skin_sadistic_dancer_mecha_Skill2_Loop_01")) {
                    z = true;
                    break;
                }
                break;
            case 1435377987:
                if (name.equals("HeroSunSeeker_Skill3_Night")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
                return true;
            default:
                return false;
        }
    }

    public boolean useSimulationTime() {
        return !UPDATE_IN_REALTIME.contains(getBaseParticle(this));
    }

    public long getDelay() {
        getBaseParticle(this).getName().hashCode();
        return 0;
    }

    public float getNoParticleZoneRadius() {
        return 1.0f;
    }

    public boolean shouldAllowCompletion() {
        String name = getBaseParticle(this).getName();
        boolean z = true;
        switch (name.hashCode()) {
            case -2120480758:
                if (name.equals("HeroCentaur_Stopwatch")) {
                    z = true;
                    break;
                }
                break;
            case -1912847045:
                if (name.equals("HeroPirate_Skill2_Shield")) {
                    z = true;
                    break;
                }
                break;
            case -1830399745:
                if (name.equals("HeroStowaway_skill1_grenade_proj")) {
                    z = true;
                    break;
                }
                break;
            case -1668659302:
                if (name.equals("MonsterSinisterAssailant_Skill1_Ballistic")) {
                    z = true;
                    break;
                }
                break;
            case -1635615819:
                if (name.equals("HeroSpectralDragon_talismanFire")) {
                    z = true;
                    break;
                }
                break;
            case -1623881595:
                if (name.equals("HeroVileBile_skill2_puddle_creep")) {
                    z = true;
                    break;
                }
                break;
            case -1603982688:
                if (name.equals("HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_projectile")) {
                    z = true;
                    break;
                }
                break;
            case -1506846747:
                if (name.equals("HeroMistressManicure_skill3_projectile")) {
                    z = true;
                    break;
                }
                break;
            case -1464731339:
                if (name.equals("HeroSpectralDragon_skill1_projectile_HOT_skin_easter")) {
                    z = true;
                    break;
                }
                break;
            case -1388237943:
                if (name.equals("HeroMinotaur_Skill2_Shield")) {
                    z = true;
                    break;
                }
                break;
            case -1241261516:
                if (name.equals("HeroVermilionBird_Skill1_Sprint")) {
                    z = true;
                    break;
                }
                break;
            case -971762829:
                if (name.equals("HeroDragzilla_Skill1_MouthBlob3")) {
                    z = true;
                    break;
                }
                break;
            case -888971644:
                if (name.equals("HeroDarkHero_Skill2_Ballistic_01")) {
                    z = true;
                    break;
                }
                break;
            case -846460206:
                if (name.equals("HeroSpectralDragon_attack_projectile")) {
                    z = true;
                    break;
                }
                break;
            case -719167352:
                if (name.equals("HeroSpectralDragon_skill1_projectile_HOT")) {
                    z = true;
                    break;
                }
                break;
            case -700156329:
                if (name.equals("HeroDarkHero_Skill1_End_Ballistic")) {
                    z = true;
                    break;
                }
                break;
            case -640702232:
                if (name.equals("HeroVultureDragon_skill4")) {
                    z = true;
                    break;
                }
                break;
            case -626272792:
                if (name.equals("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile")) {
                    z = true;
                    break;
                }
                break;
            case -616266809:
                if (name.equals("HeroSpectralDragon_skill1_projectile_skin_easter")) {
                    z = true;
                    break;
                }
                break;
            case -479114170:
                if (name.equals("HeroAncientDwarf_Skill4_Stone02")) {
                    z = true;
                    break;
                }
                break;
            case -396221064:
                if (name.equals("MonsterAnubisDragon_Attack_Drop")) {
                    z = true;
                    break;
                }
                break;
            case -360717831:
                if (name.equals("HeroStowaway_skill1_photobomb_proj")) {
                    z = true;
                    break;
                }
                break;
            case -240013217:
                if (name.equals("Common_stunned")) {
                    z = true;
                    break;
                }
                break;
            case -219910094:
                if (name.equals("Common_Sunglasses")) {
                    z = true;
                    break;
                }
                break;
            case 131249690:
                if (name.equals("HeroSpectralDragon_skill1_projectile")) {
                    z = true;
                    break;
                }
                break;
            case 159113428:
                if (name.equals("HeroStowaway_skill1_tearJar_proj")) {
                    z = true;
                    break;
                }
                break;
            case 166796353:
                if (name.equals("MonsterSkeletonDeer_attackFlame")) {
                    z = true;
                    break;
                }
                break;
            case 183519326:
                if (name.equals("HeroBrozerker_HealingShieldLoop")) {
                    z = false;
                    break;
                }
                break;
            case 488505896:
                if (name.equals("HeroDungeonMan_skill1_D20")) {
                    z = true;
                    break;
                }
                break;
            case 506178421:
                if (name.equals("HeroRabidDragon_AttackFireBall")) {
                    z = true;
                    break;
                }
                break;
            case 550090978:
                if (name.equals("HeroSpectralDragon_talismanFire_skin_easter")) {
                    z = true;
                    break;
                }
                break;
            case 621797143:
                if (name.equals("HeroWhiteTiger_Skill3_Ballistic")) {
                    z = true;
                    break;
                }
                break;
            case 818310404:
                if (name.equals("HeroMagicDragon_SKill1Ball_Proj")) {
                    z = true;
                    break;
                }
                break;
            case 846273571:
                if (name.equals("HeroSatyr_Skill2_ballTrail")) {
                    z = true;
                    break;
                }
                break;
            case 929625624:
                if (name.equals("HeroVermilionBird_Attack_FireFlight")) {
                    z = true;
                    break;
                }
                break;
            case 1005384942:
                if (name.equals("HeroDragzilla_Skill2_OrangeBlob_proj")) {
                    z = true;
                    break;
                }
                break;
            case 1070367871:
                if (name.equals("HeroSpectralDragon_attack_projectile_skin_easter")) {
                    z = true;
                    break;
                }
                break;
            case 1075943960:
                if (name.equals("HeroSniperWolf_Skill1_GlowRing")) {
                    z = true;
                    break;
                }
                break;
            case 1079437506:
                if (name.equals("HeroSatyr_Skill1_arrowTrail")) {
                    z = true;
                    break;
                }
                break;
            case 1096727087:
                if (name.equals("HeroAquaticMan_Skill3Whirlpool")) {
                    z = true;
                    break;
                }
                break;
            case 1259239679:
                if (name.equals("HeroFairyDragon_LightBeamBallOnly")) {
                    z = true;
                    break;
                }
                break;
            case 1278848139:
                if (name.equals("HeroStowaway_skill1_boomerang_proj")) {
                    z = true;
                    break;
                }
                break;
            case 1294543002:
                if (name.equals("HeroStowaway_skill1_coin_proj")) {
                    z = true;
                    break;
                }
                break;
            case 1379317716:
                if (name.equals("HeroVileBile_skill2_puddle_gen")) {
                    z = true;
                    break;
                }
                break;
            case 1401415784:
                if (name.equals("HeroKrakenKing_debuff")) {
                    z = true;
                    break;
                }
                break;
            case 1403709782:
                if (name.equals("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile_HOT")) {
                    z = true;
                    break;
                }
                break;
            case 1566686501:
                if (name.equals("HeroVileBile_skill2_puddle_gen_steam")) {
                    z = true;
                    break;
                }
                break;
            case 1996025365:
                if (name.equals("HeroVulcanElf_Teleporter")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
            case true:
                return false;
            default:
                return true;
        }
    }

    public boolean reverseFlip() {
        String name = getBaseParticle(this).getName();
        boolean z = true;
        switch (name.hashCode()) {
            case -640702232:
                if (name.equals("HeroVultureDragon_skill4")) {
                    z = false;
                    break;
                }
                break;
            case 795678237:
                if (name.equals("HeroSilentSpirit_attack_Bg")) {
                    z = true;
                    break;
                }
                break;
            case 795678372:
                if (name.equals("HeroSilentSpirit_attack_Fr")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
                return true;
            default:
                return false;
        }
    }

    public boolean shouldFlip() {
        String name = getBaseParticle(this).getName();
        boolean z = true;
        switch (name.hashCode()) {
            case -65059711:
                if (name.equals("Common_HitDown")) {
                    z = true;
                    break;
                }
                break;
            case 233370207:
                if (name.equals("HeroRollerViking_debuff_Roller_Viking_skill6")) {
                    z = true;
                    break;
                }
                break;
            case 1101139533:
                if (name.equals("Common_Silence")) {
                    z = false;
                    break;
                }
                break;
            case 1190130522:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill2_1")) {
                    z = true;
                    break;
                }
                break;
            case 1190130523:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill2_2")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
            case true:
            case true:
            case true:
            case true:
                return false;
            default:
                return true;
        }
    }

    public String getFollowBone() {
        String name = getBaseParticle(this).getName();
        Object obj = -1;
        switch (name.hashCode()) {
            case -2143771165:
                if (name.equals("HeroVampireDragon_PurpleDamage")) {
                    obj = 19;
                    break;
                }
                break;
            case -2131479560:
                if (name.equals("MonsterLyingLantern_debuff_01")) {
                    obj = 10;
                    break;
                }
                break;
            case -2120480758:
                if (name.equals("HeroCentaur_Stopwatch")) {
                    obj = null;
                    break;
                }
                break;
            case -1982062750:
                if (name.equals("HeroGrandHuntress_skill1_hitspark")) {
                    obj = 28;
                    break;
                }
                break;
            case -1870413121:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill1_skin_usercontest")) {
                    obj = 16;
                    break;
                }
                break;
            case -1780589873:
                if (name.equals("HeroBulwarkAngel_skill2_end_glow")) {
                    obj = 18;
                    break;
                }
                break;
            case -1779103084:
                if (name.equals("HeroDarkHero_Skill3_Gunfiren_Hit")) {
                    obj = 34;
                    break;
                }
                break;
            case -1238658304:
                if (name.equals("HeroSolidLongevity_Skill4_Buff")) {
                    obj = 51;
                    break;
                }
                break;
            case -1211712234:
                if (name.equals("MonsterAnubisDragon_Skill1_Sand01")) {
                    obj = 47;
                    break;
                }
                break;
            case -1211712233:
                if (name.equals("MonsterAnubisDragon_Skill1_Sand02")) {
                    obj = 48;
                    break;
                }
                break;
            case -1211712232:
                if (name.equals("MonsterAnubisDragon_Skill1_Sand03")) {
                    obj = 49;
                    break;
                }
                break;
            case -1155379428:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill1_Fallen")) {
                    obj = 17;
                    break;
                }
                break;
            case -1129566333:
                if (name.equals("HeroShadowAssassin_Skill6_Slash")) {
                    obj = 32;
                    break;
                }
                break;
            case -1129536525:
                if (name.equals("HeroBulwarkAngel_attack_explosion1")) {
                    obj = 27;
                    break;
                }
                break;
            case -1116713086:
                if (name.equals("Common_Cat")) {
                    obj = 3;
                    break;
                }
                break;
            case -964351217:
                if (name.equals("HeroStormDragon_Skill2Cloud_Cover")) {
                    obj = 42;
                    break;
                }
                break;
            case -827249714:
                if (name.equals("HeroClawMan_Skill4_Grin")) {
                    obj = 54;
                    break;
                }
                break;
            case -779676957:
                if (name.equals("HeroVermilionBird_Skill4_Caster")) {
                    obj = 50;
                    break;
                }
                break;
            case -733189469:
                if (name.equals("MonsterKingImp_Silver_ShieldBubble")) {
                    obj = 25;
                    break;
                }
                break;
            case -558369723:
                if (name.equals("HeroPolemaster_EnergyDrain")) {
                    obj = 21;
                    break;
                }
                break;
            case -240013217:
                if (name.equals("Common_stunned")) {
                    obj = 4;
                    break;
                }
                break;
            case -219910094:
                if (name.equals("Common_Sunglasses")) {
                    obj = 5;
                    break;
                }
                break;
            case -135180012:
                if (name.equals("MonsterPhysImp_ShieldBubble")) {
                    obj = 23;
                    break;
                }
                break;
            case -65059711:
                if (name.equals("Common_HitDown")) {
                    obj = 7;
                    break;
                }
                break;
            case 73907555:
                if (name.equals("HeroBanshee_skill3_DoT_A")) {
                    obj = 44;
                    break;
                }
                break;
            case 129143597:
                if (name.equals("HeroSniperWolf_Skill2_Buff")) {
                    obj = 9;
                    break;
                }
                break;
            case 198823768:
                if (name.equals("HeroVulcanElf_Skill6_SoulEnergy")) {
                    obj = 30;
                    break;
                }
                break;
            case 233370207:
                if (name.equals("HeroRollerViking_debuff_Roller_Viking_skill6")) {
                    obj = 15;
                    break;
                }
                break;
            case 310204591:
                if (name.equals("HeroDarkHorse_Skill3ShieldPopUp")) {
                    obj = 37;
                    break;
                }
                break;
            case 521755440:
                if (name.equals("MonsterKingImp_Gold_ShieldBubble")) {
                    obj = 24;
                    break;
                }
                break;
            case 736761998:
                if (name.equals("HeroGrandHuntress_Skill4_quagmire")) {
                    obj = 46;
                    break;
                }
                break;
            case 945340016:
                if (name.equals("HeroUnicorgi_Cute")) {
                    obj = 11;
                    break;
                }
                break;
            case 1011608030:
                if (name.equals("HeroCentaur_Silence")) {
                    obj = 1;
                    break;
                }
                break;
            case 1091346059:
                if (name.equals("HeroDarkHero_Skill4_Normal_Array3")) {
                    obj = 53;
                    break;
                }
                break;
            case 1101139533:
                if (name.equals("Common_Silence")) {
                    obj = 2;
                    break;
                }
                break;
            case 1168797142:
                if (name.equals("HeroGroovyDruid_HedgehogSpike_Proj")) {
                    obj = 36;
                    break;
                }
                break;
            case 1170274061:
                if (name.equals("HeroGrandHuntress_skill3_hitring")) {
                    obj = 40;
                    break;
                }
                break;
            case 1190130522:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill2_1")) {
                    obj = 13;
                    break;
                }
                break;
            case 1190130523:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill2_2")) {
                    obj = 14;
                    break;
                }
                break;
            case 1192064313:
                if (name.equals("HeroStormDragon_Skill1Tornado_Dust")) {
                    obj = 41;
                    break;
                }
                break;
            case 1259239679:
                if (name.equals("HeroFairyDragon_LightBeamBallOnly")) {
                    obj = 35;
                    break;
                }
                break;
            case 1342610845:
                if (name.equals("HeroGroovyDruid_LegendSmoke")) {
                    obj = 8;
                    break;
                }
                break;
            case 1401415784:
                if (name.equals("HeroKrakenKing_debuff")) {
                    obj = 43;
                    break;
                }
                break;
            case 1435873703:
                if (name.equals("HeroAngelDragon_buff_angel_dragon_skill1")) {
                    obj = 12;
                    break;
                }
                break;
            case 1853888336:
                if (name.equals("HeroGrandHuntress_skill3_trail")) {
                    obj = 45;
                    break;
                }
                break;
            case 1891541362:
                if (name.equals("Common_BrokenShield")) {
                    obj = 6;
                    break;
                }
                break;
            case 1902910870:
                if (name.equals("HeroVulcanElf_Skill6_wave")) {
                    obj = 31;
                    break;
                }
                break;
            case 1914479450:
                if (name.equals("HeroDarkHero_Skill1_End_Gunfiren_Hit")) {
                    obj = 33;
                    break;
                }
                break;
            case 1919801394:
                if (name.equals("HeroGrandHuntress_skill3_hitsmoke")) {
                    obj = 29;
                    break;
                }
                break;
            case 1996025365:
                if (name.equals("HeroVulcanElf_Teleporter")) {
                    obj = 20;
                    break;
                }
                break;
            case 2021131228:
                if (name.equals("HeroOrcMonk_Skill1_ringSmoke_angel")) {
                    obj = 38;
                    break;
                }
                break;
            case 2026803252:
                if (name.equals("HeroSojournerSorceress_Skill5_Blast")) {
                    obj = 52;
                    break;
                }
                break;
            case 2035704657:
                if (name.equals("HeroBulwarkAngel_attack_crit")) {
                    obj = 26;
                    break;
                }
                break;
            case 2093898555:
                if (name.equals("MonsterMagicImp_ShieldBubble")) {
                    obj = 22;
                    break;
                }
                break;
            case 2103370972:
                if (name.equals("HeroOrcMonk_Skill3_SmokeRing")) {
                    obj = 39;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return AnimationConstants.BUFF_LOCATION_BONE;
            case 18:
                return AnimationConstants.HEAD_LOCATION_BONE;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                return AnimationConstants.HIT_LOCATION_BONE;
            case 35:
                return "shooting_point";
            case 36:
                return "head_h";
            case 37:
            case 38:
            case 39:
            case 40:
                return AnimationConstants.ROOT;
            case 41:
                return "bone48";
            case 42:
                return "bolt3_1";
            case 43:
                return AnimationConstants.BUFF_LOCATION_BONE;
            case 44:
                return AnimationConstants.BUFF_LOCATION_BONE;
            case 45:
                return "skill3_spear_tail";
            case 46:
                return AnimationConstants.ROOT;
            case 47:
                return "vfx_skill1-01";
            case 48:
                return "vfx_skill1-02";
            case 49:
                return "vfx_skill1-03";
            case 50:
            case 51:
                return "bone";
            case 52:
                return "Arm15";
            case 53:
                return "belt2";
            case 54:
                return AnimationConstants.BUFF_LOCATION_BONE;
            default:
                return null;
        }
    }

    public float calculateScale(Entity entity) {
        String name = getName();
        Object obj = -1;
        switch (name.hashCode()) {
            case -1252377344:
                if (name.equals("HeroDoppelganger_skill3_death_skin_molten")) {
                    obj = 1;
                    break;
                }
                break;
            case 2145105975:
                if (name.equals("HeroDoppelganger_attackImpact_skin_molten")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
                return DisplayDataUtil.getUnitScale(UnitType.DOPPELGANGER) * 0.7f;
            default:
                name = getBaseParticle(this).getName();
                obj = -1;
                switch (name.hashCode()) {
                    case -2143771165:
                        if (name.equals("HeroVampireDragon_PurpleDamage")) {
                            obj = 26;
                            break;
                        }
                        break;
                    case -2124612749:
                        if (name.equals("HeroWeeWitch_skill1_projectile")) {
                            obj = 148;
                            break;
                        }
                        break;
                    case -2055470707:
                        if (name.equals("MonsterCauldron_Vicotry_Hit")) {
                            obj = 56;
                            break;
                        }
                        break;
                    case -2045301120:
                        if (name.equals("HeroSniperWolf_AttackEnemy_Proj")) {
                            obj = 67;
                            break;
                        }
                        break;
                    case -2017844917:
                        if (name.equals("HeroShadowAssassin_AttackHit")) {
                            obj = 49;
                            break;
                        }
                        break;
                    case -2017416255:
                        if (name.equals("HeroDragzilla_Skill2_OrangeGas_Landed")) {
                            obj = 81;
                            break;
                        }
                        break;
                    case -1975910170:
                        if (name.equals("HeroPirate_Skill1_HitImpact")) {
                            obj = 72;
                            break;
                        }
                        break;
                    case -1939489994:
                        if (name.equals("HeroSpectralDragon_talismanFire_hit_skin_easter")) {
                            obj = 130;
                            break;
                        }
                        break;
                    case -1911805042:
                        if (name.equals("HeroApprentice_Shield_only")) {
                            obj = 66;
                            break;
                        }
                        break;
                    case -1881118616:
                        if (name.equals("HeroDragzilla_Skill1_YellowGas_Landed")) {
                            obj = 80;
                            break;
                        }
                        break;
                    case -1830399745:
                        if (name.equals("HeroStowaway_skill1_grenade_proj")) {
                            obj = 100;
                            break;
                        }
                        break;
                    case -1823793759:
                        if (name.equals("HeroDoppelganger_attackImpact")) {
                            obj = 91;
                            break;
                        }
                        break;
                    case -1810047472:
                        if (name.equals("HeroSandDragon_FireBallHit")) {
                            obj = 18;
                            break;
                        }
                        break;
                    case -1804337107:
                        if (name.equals("MonsterMagicGolem_hit")) {
                            obj = 10;
                            break;
                        }
                        break;
                    case -1766693769:
                        if (name.equals("HeroBanshee_skill3_mark_NPC")) {
                            obj = 145;
                            break;
                        }
                        break;
                    case -1708663689:
                        if (name.equals("HeroSpectralDragon_attack_hit_skin_easter")) {
                            obj = 128;
                            break;
                        }
                        break;
                    case -1635615819:
                        if (name.equals("HeroSpectralDragon_talismanFire")) {
                            obj = 125;
                            break;
                        }
                        break;
                    case -1603982688:
                        if (name.equals("HeroSpectralDragon_skin_spectral_dragon_reddragon_attack_projectile")) {
                            obj = 123;
                            break;
                        }
                        break;
                    case -1602720284:
                        if (name.equals("HeroApprentice_Whack")) {
                            obj = 24;
                            break;
                        }
                        break;
                    case -1591397187:
                        if (name.equals("HeroPolemaster_SplashyGreenMulti")) {
                            obj = 20;
                            break;
                        }
                        break;
                    case -1588990432:
                        if (name.equals("HeroCursedStatue_spear_shockBeam_GRN")) {
                            obj = 109;
                            break;
                        }
                        break;
                    case -1585378283:
                        if (name.equals("HeroElectroYeti_ElectricityRing")) {
                            obj = 65;
                            break;
                        }
                        break;
                    case -1527519453:
                        if (name.equals("HeroVoidWyvern_skill2_projectile")) {
                            obj = 151;
                            break;
                        }
                        break;
                    case -1498568334:
                        if (name.equals("HeroVultureDragon_skill4_dot")) {
                            obj = 106;
                            break;
                        }
                        break;
                    case -1498564676:
                        if (name.equals("HeroVultureDragon_skill4_hit")) {
                            obj = 105;
                            break;
                        }
                        break;
                    case -1495877159:
                        if (name.equals("HeroSilentSpirit_attack_smoke_blk")) {
                            obj = 119;
                            break;
                        }
                        break;
                    case -1494188852:
                        if (name.equals("HeroDungeonMan_skill2_rat_running")) {
                            obj = 149;
                            break;
                        }
                        break;
                    case -1490164588:
                        if (name.equals("HeroDruidinatrix_Skill3Energy_Proj")) {
                            obj = 52;
                            break;
                        }
                        break;
                    case -1466805236:
                        if (name.equals("tutorial_smokeCrawl_LR")) {
                            obj = 37;
                            break;
                        }
                        break;
                    case -1466805056:
                        if (name.equals("tutorial_smokeCrawl_RL")) {
                            obj = 38;
                            break;
                        }
                        break;
                    case -1464731339:
                        if (name.equals("HeroSpectralDragon_skill1_projectile_HOT_skin_easter")) {
                            obj = 138;
                            break;
                        }
                        break;
                    case -1364240666:
                        if (name.equals("MonsterAnt_digdug")) {
                            obj = 113;
                            break;
                        }
                        break;
                    case -1299341968:
                        if (name.equals("HeroRabidDragon_AttackFireBall_Impact")) {
                            obj = 54;
                            break;
                        }
                        break;
                    case -1274845592:
                        if (name.equals("HeroPirate_Skill3_HitImpact")) {
                            obj = 73;
                            break;
                        }
                        break;
                    case -1274757379:
                        if (name.equals("tutorial_smokeContinuous")) {
                            obj = 39;
                            break;
                        }
                        break;
                    case -1241261516:
                        if (name.equals("HeroVermilionBird_Skill1_Sprint")) {
                            obj = 157;
                            break;
                        }
                        break;
                    case -1218682956:
                        if (name.equals("HeroSandDragon_sandball_impact")) {
                            obj = 13;
                            break;
                        }
                        break;
                    case -1179737161:
                        if (name.equals("MonsterInfernoSpider_AttackLanded")) {
                            obj = 44;
                            break;
                        }
                        break;
                    case -1157990799:
                        if (name.equals("HeroBrozerker_Heal")) {
                            obj = 2;
                            break;
                        }
                        break;
                    case -1147398355:
                        if (name.equals("HeroVultureDragon_attack")) {
                            obj = 103;
                            break;
                        }
                        break;
                    case -1146553240:
                        if (name.equals("HeroStowaway_skill1_tearJar")) {
                            obj = 101;
                            break;
                        }
                        break;
                    case -1142079611:
                        if (name.equals("HeroCyclopsWizard_Skill3_BoltFeet")) {
                            obj = 86;
                            break;
                        }
                        break;
                    case -1116668812:
                        if (name.equals("MonsterPhysGolem_hit")) {
                            obj = 8;
                            break;
                        }
                        break;
                    case -1073652974:
                        if (name.equals("HeroBrozerker_Magicexplode_ring")) {
                            obj = null;
                            break;
                        }
                        break;
                    case -1046810099:
                        if (name.equals("HeroStormDragon_Skill1Tornado_Impact")) {
                            obj = 57;
                            break;
                        }
                        break;
                    case -1037617874:
                        if (name.equals("HeroPirate_Attack_HitImpact")) {
                            obj = 71;
                            break;
                        }
                        break;
                    case -997934543:
                        if (name.equals("HeroSpectralDragon_skill3_hit_skin_easter")) {
                            obj = 133;
                            break;
                        }
                        break;
                    case -996484602:
                        if (name.equals("MonsterMagicGolem_MissileImpact")) {
                            obj = 11;
                            break;
                        }
                        break;
                    case -978867902:
                        if (name.equals("HeroFairyDragon_RedBallExplode")) {
                            obj = 22;
                            break;
                        }
                        break;
                    case -971762829:
                        if (name.equals("HeroDragzilla_Skill1_MouthBlob3")) {
                            obj = 83;
                            break;
                        }
                        break;
                    case -957993331:
                        if (name.equals("HeroDoppelganger_skill2_push2")) {
                            obj = 93;
                            break;
                        }
                        break;
                    case -854729031:
                        if (name.equals("HeroDungeonMan_skill1_die_hits")) {
                            obj = 150;
                            break;
                        }
                        break;
                    case -846460206:
                        if (name.equals("HeroSpectralDragon_attack_projectile")) {
                            obj = 121;
                            break;
                        }
                        break;
                    case -834910443:
                        if (name.equals("HeroRagingRevenant_skill2_hit")) {
                            obj = 143;
                            break;
                        }
                        break;
                    case -723576804:
                        if (name.equals("HeroCursedStatue_spear_shockBeam")) {
                            obj = 108;
                            break;
                        }
                        break;
                    case -722001082:
                        if (name.equals("HeroCursedStatue_spear_shockwave")) {
                            obj = 110;
                            break;
                        }
                        break;
                    case -719167352:
                        if (name.equals("HeroSpectralDragon_skill1_projectile_HOT")) {
                            obj = 136;
                            break;
                        }
                        break;
                    case -685658825:
                        if (name.equals("HeroFaithHealer_pastelcharms")) {
                            obj = 3;
                            break;
                        }
                        break;
                    case -644675134:
                        if (name.equals("HeroSandDragon_sandring")) {
                            obj = 15;
                            break;
                        }
                        break;
                    case -640702232:
                        if (name.equals("HeroVultureDragon_skill4")) {
                            obj = 104;
                            break;
                        }
                        break;
                    case -626272792:
                        if (name.equals("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile")) {
                            obj = 139;
                            break;
                        }
                        break;
                    case -616266809:
                        if (name.equals("HeroSpectralDragon_skill1_projectile_skin_easter")) {
                            obj = 137;
                            break;
                        }
                        break;
                    case -612817932:
                        if (name.equals("HeroDeepDragon_Skill3_proj")) {
                            obj = 96;
                            break;
                        }
                        break;
                    case -558369723:
                        if (name.equals("HeroPolemaster_EnergyDrain")) {
                            obj = 34;
                            break;
                        }
                        break;
                    case -550488648:
                        if (name.equals("HeroBrozerker_Damage")) {
                            obj = 1;
                            break;
                        }
                        break;
                    case -539081499:
                        if (name.equals("BosspitGiantPlant_SpewSeeds_gas_single")) {
                            obj = 53;
                            break;
                        }
                        break;
                    case -505044792:
                        if (name.equals("HeroApprentice_GenericPuff")) {
                            obj = 25;
                            break;
                        }
                        break;
                    case -499326550:
                        if (name.equals("HeroCyclopsWizard_Skill1_Impact")) {
                            obj = 85;
                            break;
                        }
                        break;
                    case -495801915:
                        if (name.equals("HeroVultureDragon_wingFlap")) {
                            obj = 107;
                            break;
                        }
                        break;
                    case -472655437:
                        if (name.equals("HeroCursedStatue_spear_shockwave_BLUE")) {
                            obj = 111;
                            break;
                        }
                        break;
                    case -373093784:
                        if (name.equals("HeroBruteDragon_SmokeMouth")) {
                            obj = 32;
                            break;
                        }
                        break;
                    case -360717831:
                        if (name.equals("HeroStowaway_skill1_photobomb_proj")) {
                            obj = 99;
                            break;
                        }
                        break;
                    case -339811954:
                        if (name.equals("HeroDragzilla_Skill1_OnEye")) {
                            obj = 82;
                            break;
                        }
                        break;
                    case -286519428:
                        if (name.equals("HeroSnakeDragon_concentric_ring_loop")) {
                            obj = 4;
                            break;
                        }
                        break;
                    case -253092364:
                        if (name.equals("HeroBanshee_skill0_projectile")) {
                            obj = 115;
                            break;
                        }
                        break;
                    case -219910094:
                        if (name.equals("Common_Sunglasses")) {
                            obj = 21;
                            break;
                        }
                        break;
                    case -141254889:
                        if (name.equals("HeroRagingRevenant_skill1_ally")) {
                            obj = 141;
                            break;
                        }
                        break;
                    case -136144444:
                        if (name.equals("HeroCyclopsWizard_Skill3_burstImpact")) {
                            obj = 87;
                            break;
                        }
                        break;
                    case -106763350:
                        if (name.equals("HeroStowaway_skill4_handglow")) {
                            obj = 98;
                            break;
                        }
                        break;
                    case -94753968:
                        if (name.equals("MonsterSquid_InkEvaporate")) {
                            obj = 55;
                            break;
                        }
                        break;
                    case -82537685:
                        if (name.equals("HeroShadowAssassin_Cross_only")) {
                            obj = 64;
                            break;
                        }
                        break;
                    case -82065430:
                        if (name.equals("HeroDoppelganger_skill3_death")) {
                            obj = 92;
                            break;
                        }
                        break;
                    case -81440286:
                        if (name.equals("HeroSpectralDragon_skill4_mote_hit_skin_easter")) {
                            obj = 131;
                            break;
                        }
                        break;
                    case 5320380:
                        if (name.equals("HeroSniperWolf_Skill1_GlowRing_boost")) {
                            obj = 70;
                            break;
                        }
                        break;
                    case 73907555:
                        if (name.equals("HeroBanshee_skill3_DoT_A")) {
                            obj = 144;
                            break;
                        }
                        break;
                    case 129143597:
                        if (name.equals("HeroSniperWolf_Skill2_Buff")) {
                            obj = 69;
                            break;
                        }
                        break;
                    case 131249690:
                        if (name.equals("HeroSpectralDragon_skill1_projectile")) {
                            obj = 135;
                            break;
                        }
                        break;
                    case 166796353:
                        if (name.equals("MonsterSkeletonDeer_attackFlame")) {
                            obj = 62;
                            break;
                        }
                        break;
                    case 169878928:
                        if (name.equals("HeroVampireDragon_GroundSmoke")) {
                            obj = 28;
                            break;
                        }
                        break;
                    case 198823768:
                        if (name.equals("HeroVulcanElf_Skill6_SoulEnergy")) {
                            obj = 159;
                            break;
                        }
                        break;
                    case 221873101:
                        if (name.equals("HeroSandDragon_fireballlanded")) {
                            obj = 16;
                            break;
                        }
                        break;
                    case 233370207:
                        if (name.equals("HeroRollerViking_debuff_Roller_Viking_skill6")) {
                            obj = 161;
                            break;
                        }
                        break;
                    case 258982304:
                        if (name.equals("HeroAquaticMan_Skill2WaterSpoutSingle")) {
                            obj = 42;
                            break;
                        }
                        break;
                    case 282269394:
                        if (name.equals("HeroElectroYeti_impact")) {
                            obj = 6;
                            break;
                        }
                        break;
                    case 323182847:
                        if (name.equals("HeroMagicDragon_WalkMist")) {
                            obj = 48;
                            break;
                        }
                        break;
                    case 326186127:
                        if (name.equals("HeroSandDragon_wind_blast")) {
                            obj = 14;
                            break;
                        }
                        break;
                    case 350568889:
                        if (name.equals("HeroVermilionBird_Skill1_Hit")) {
                            obj = 158;
                            break;
                        }
                        break;
                    case 379353564:
                        if (name.equals("HeroPolemaster_SplashyGreen")) {
                            obj = 35;
                            break;
                        }
                        break;
                    case 384885366:
                        if (name.equals("HeroMagicDragon_Skill1Launching")) {
                            obj = 45;
                            break;
                        }
                        break;
                    case 387644479:
                        if (name.equals("HeroTombAngel_Skill2_Projectile")) {
                            obj = 154;
                            break;
                        }
                        break;
                    case 420560107:
                        if (name.equals("HeroBruteDragon_FirePlume")) {
                            obj = 30;
                            break;
                        }
                        break;
                    case 425283394:
                        if (name.equals("HeroMagicDragon_SKill3Ball_Proj")) {
                            obj = 47;
                            break;
                        }
                        break;
                    case 442494438:
                        if (name.equals("HeroAquaticMan_Skill1Wave_Proj")) {
                            obj = 41;
                            break;
                        }
                        break;
                    case 460741710:
                        if (name.equals("HeroStormDragon_Skill2Tornado_Impact")) {
                            obj = 59;
                            break;
                        }
                        break;
                    case 497502415:
                        if (name.equals("HeroSandDragon_sandball_onlyfront")) {
                            obj = 12;
                            break;
                        }
                        break;
                    case 550090978:
                        if (name.equals("HeroSpectralDragon_talismanFire_skin_easter")) {
                            obj = 129;
                            break;
                        }
                        break;
                    case 590413359:
                        if (name.equals("HeroSpectralDragon_skill1_hit_skin_easter")) {
                            obj = 134;
                            break;
                        }
                        break;
                    case 669485859:
                        if (name.equals("HeroSkeletonKing_Skill2_DamageSmoke")) {
                            obj = 60;
                            break;
                        }
                        break;
                    case 686759951:
                        if (name.equals("HeroStowaway_attack_impact")) {
                            obj = 97;
                            break;
                        }
                        break;
                    case 736761998:
                        if (name.equals("HeroGrandHuntress_Skill4_quagmire")) {
                            obj = 156;
                            break;
                        }
                        break;
                    case 759548769:
                        if (name.equals("HeroDemonTotem_HitT1")) {
                            obj = 77;
                            break;
                        }
                        break;
                    case 759548770:
                        if (name.equals("HeroDemonTotem_HitT2")) {
                            obj = 78;
                            break;
                        }
                        break;
                    case 759548771:
                        if (name.equals("HeroDemonTotem_HitT3")) {
                            obj = 79;
                            break;
                        }
                        break;
                    case 795678237:
                        if (name.equals("HeroSilentSpirit_attack_Bg")) {
                            obj = 117;
                            break;
                        }
                        break;
                    case 795678372:
                        if (name.equals("HeroSilentSpirit_attack_Fr")) {
                            obj = 116;
                            break;
                        }
                        break;
                    case 818310404:
                        if (name.equals("HeroMagicDragon_SKill1Ball_Proj")) {
                            obj = 46;
                            break;
                        }
                        break;
                    case 859152701:
                        if (name.equals("HeroDeepDragon_Skill2_Geyser")) {
                            obj = 95;
                            break;
                        }
                        break;
                    case 881298797:
                        if (name.equals("HeroSpikeyDragon_Skill2ImpactGround")) {
                            obj = 51;
                            break;
                        }
                        break;
                    case 892189293:
                        if (name.equals("HeroVampireDragon_PurpleWave")) {
                            obj = 27;
                            break;
                        }
                        break;
                    case 909228932:
                        if (name.equals("HeroSpectralDragon_skill3_hit")) {
                            obj = 132;
                            break;
                        }
                        break;
                    case 985371829:
                        if (name.equals("HeroSpectralDragon_skill4_mote_hit")) {
                            obj = 127;
                            break;
                        }
                        break;
                    case 1005384942:
                        if (name.equals("HeroDragzilla_Skill2_OrangeBlob_proj")) {
                            obj = 84;
                            break;
                        }
                        break;
                    case 1059462564:
                        if (name.equals("HeroSkeletonKing_Skill1_smokeBurstAppear")) {
                            obj = 61;
                            break;
                        }
                        break;
                    case 1068725636:
                        if (name.equals("HeroSilentSpirit_skill3_hammer")) {
                            obj = 118;
                            break;
                        }
                        break;
                    case 1069416648:
                        if (name.equals("HeroFairyDragon_RippleGround")) {
                            obj = 23;
                            break;
                        }
                        break;
                    case 1070367871:
                        if (name.equals("HeroSpectralDragon_attack_projectile_skin_easter")) {
                            obj = 122;
                            break;
                        }
                        break;
                    case 1075943960:
                        if (name.equals("HeroSniperWolf_Skill1_GlowRing")) {
                            obj = 68;
                            break;
                        }
                        break;
                    case 1093767666:
                        if (name.equals("HeroSandDragon_firefeet")) {
                            obj = 19;
                            break;
                        }
                        break;
                    case 1171159159:
                        if (name.equals("HeroVoidWyvern_skill3_gust_00")) {
                            obj = 152;
                            break;
                        }
                        break;
                    case 1171159160:
                        if (name.equals("HeroVoidWyvern_skill3_gust_01")) {
                            obj = 153;
                            break;
                        }
                        break;
                    case 1174701804:
                        if (name.equals("HeroSpikeyDragon_Skill1ImpactGround")) {
                            obj = 50;
                            break;
                        }
                        break;
                    case 1175483644:
                        if (name.equals("HeroKrakenKing_skill3Impact")) {
                            obj = 90;
                            break;
                        }
                        break;
                    case 1180283793:
                        if (name.equals("HeroWeeWitch_attack_hit")) {
                            obj = 146;
                            break;
                        }
                        break;
                    case 1181934821:
                        if (name.equals("MonsterAnt_digdug_Fr")) {
                            obj = 114;
                            break;
                        }
                        break;
                    case 1192064313:
                        if (name.equals("HeroStormDragon_Skill1Tornado_Dust")) {
                            obj = 58;
                            break;
                        }
                        break;
                    case 1223170345:
                        if (name.equals("HeroPirate_Skill4_HitImpact")) {
                            obj = 74;
                            break;
                        }
                        break;
                    case 1278848139:
                        if (name.equals("HeroStowaway_skill1_boomerang_proj")) {
                            obj = 102;
                            break;
                        }
                        break;
                    case 1308256653:
                        if (name.equals("MonsterPhysGolem_MissileImpact")) {
                            obj = 9;
                            break;
                        }
                        break;
                    case 1342610845:
                        if (name.equals("HeroGroovyDruid_LegendSmoke")) {
                            obj = 63;
                            break;
                        }
                        break;
                    case 1401415784:
                        if (name.equals("HeroKrakenKing_debuff")) {
                            obj = 89;
                            break;
                        }
                        break;
                    case 1403709782:
                        if (name.equals("HeroSpectralDragon_skin_spectral_dragon_reddragon_skill1_projectile_HOT")) {
                            obj = 140;
                            break;
                        }
                        break;
                    case 1422351509:
                        if (name.equals("HeroBruteDragon_FirePlumeLanded")) {
                            obj = 31;
                            break;
                        }
                        break;
                    case 1507033127:
                        if (name.equals("HeroRagingRevenant_skill2_projectile")) {
                            obj = 142;
                            break;
                        }
                        break;
                    case 1520968550:
                        if (name.equals("HeroVulcanElf_RingHit")) {
                            obj = 29;
                            break;
                        }
                        break;
                    case 1529176192:
                        if (name.equals("HeroAngelicHerald_Skill1_loop_Light")) {
                            obj = 155;
                            break;
                        }
                        break;
                    case 1559256073:
                        if (name.equals("HeroSpectralDragon_talismanFire_hit")) {
                            obj = 126;
                            break;
                        }
                        break;
                    case 1563254585:
                        if (name.equals("HeroDeepDragon_Skill2_Stomp")) {
                            obj = 94;
                            break;
                        }
                        break;
                    case 1579691457:
                        if (name.equals("HeroElectroYeti_cloudlightning")) {
                            obj = 7;
                            break;
                        }
                        break;
                    case 1581582708:
                        if (name.equals("HeroBruteDragon_GreenGasFeet")) {
                            obj = 33;
                            break;
                        }
                        break;
                    case 1635222534:
                        if (name.equals("HeroCyclopsWizard_Skill1_lightning")) {
                            obj = 88;
                            break;
                        }
                        break;
                    case 1650448202:
                        if (name.equals("tutorial_charTentacles")) {
                            obj = 40;
                            break;
                        }
                        break;
                    case 1676777162:
                        if (name.equals("HeroSpectralDragon_attack_hit")) {
                            obj = MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES;
                            break;
                        }
                        break;
                    case 1678722580:
                        if (name.equals("HeroMedusa_Skill1Impact")) {
                            obj = 36;
                            break;
                        }
                        break;
                    case 1690018586:
                        if (name.equals("HeroWeeWitch_skill2_beam_A")) {
                            obj = 147;
                            break;
                        }
                        break;
                    case 1747841175:
                        if (name.equals("HeroSilentSpirit_skill1_wallCollapse")) {
                            obj = 120;
                            break;
                        }
                        break;
                    case 1814978722:
                        if (name.equals("HeroSpiderQueen_basicAttack")) {
                            obj = 112;
                            break;
                        }
                        break;
                    case 1891541362:
                        if (name.equals("Common_BrokenShield")) {
                            obj = 75;
                            break;
                        }
                        break;
                    case 1902910870:
                        if (name.equals("HeroVulcanElf_Skill6_wave")) {
                            obj = 160;
                            break;
                        }
                        break;
                    case 1937014675:
                        if (name.equals("HeroBoneDragon_Skill1RibFire")) {
                            obj = 43;
                            break;
                        }
                        break;
                    case 2025994300:
                        if (name.equals("HeroElectroYeti_lightning_hit_projectile2")) {
                            obj = 5;
                            break;
                        }
                        break;
                    case 2029316743:
                        if (name.equals("HeroSandDragon_BigFireBall")) {
                            obj = 17;
                            break;
                        }
                        break;
                    case 2071159037:
                        if (name.equals("HeroDemonTotem_HitAll")) {
                            obj = 76;
                            break;
                        }
                        break;
                }
                switch (obj) {
                    case null:
                        return DisplayDataUtil.getUnitScale(UnitType.BROZERKER) * 5.0f;
                    case 1:
                    case 2:
                        return DisplayDataUtil.getUnitScale(UnitType.BROZERKER) * 0.65f;
                    case 3:
                        return DisplayDataUtil.getUnitScale(UnitType.FAITH_HEALER) * 2.0f;
                    case 4:
                        return DisplayDataUtil.getUnitScale(UnitType.HYDRA) * 0.4f;
                    case 5:
                        return DisplayDataUtil.getUnitScale(UnitType.ELECTROYETI) * 5.0f;
                    case 6:
                        return DisplayDataUtil.getUnitScale(UnitType.ELECTROYETI) * 2.0f;
                    case 7:
                        return DisplayDataUtil.getUnitScale(UnitType.ELECTROYETI) * 1.3f;
                    case 8:
                        return DisplayDataUtil.getUnitScale(UnitType.NPC_CRYSTAL_GOLEM) * 2.5f;
                    case 9:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.NPC_CRYSTAL_GOLEM);
                    case 10:
                        return DisplayDataUtil.getUnitScale(UnitType.NPC_ICE_GOLEM) * 2.5f;
                    case 11:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.NPC_ICE_GOLEM);
                    case 12:
                        return DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL) * 0.75f;
                    case 13:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL);
                    case 14:
                        return DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL) * 3.0f;
                    case 15:
                        return DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL) * 0.75f;
                    case 16:
                        return DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL) * 2.5f;
                    case 17:
                        return DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL) * 2.5f;
                    case 18:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.DUST_DEVIL);
                    case 19:
                        return DisplayDataUtil.getUnitScale(((Unit) entity).getData().getType()) * 1.25f;
                    case 20:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.POLEMASTER);
                    case 21:
                        return 2.0f;
                    case 22:
                        return DisplayDataUtil.getUnitScale(UnitType.MOON_DRAKE) * 1.25f;
                    case 23:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.MOON_DRAKE);
                    case 24:
                    case 29:
                        return 1.5f;
                    case 25:
                        return 0.6f;
                    case 26:
                        return DisplayDataUtil.getUnitScale(UnitType.DARK_DRACUL) * 0.65f;
                    case 27:
                        return DisplayDataUtil.getUnitScale(UnitType.DARK_DRACUL) * 0.9f;
                    case 28:
                        return DisplayDataUtil.getUnitScale(UnitType.DARK_DRACUL) * 0.8f;
                    case 30:
                        return DisplayDataUtil.getUnitScale(UnitType.SNAP_DRAGON) * 2.0f;
                    case 31:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SNAP_DRAGON);
                    case 32:
                        return DisplayDataUtil.getUnitScale(UnitType.SNAP_DRAGON) * DisplayDataUtil.getCastingScaleMultiplier(UnitType.SNAP_DRAGON);
                    case 33:
                        return DisplayDataUtil.getUnitScale(UnitType.SNAP_DRAGON) * 0.75f;
                    case 34:
                        return DisplayDataUtil.getUnitScale(UnitType.POLEMASTER) * 0.75f;
                    case 35:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.POLEMASTER);
                    case 36:
                        return DisplayDataUtil.getUnitScale(UnitType.MEDUSA) * 2.0f;
                    case 37:
                    case 38:
                    case 39:
                        return 12.0f;
                    case 40:
                        return 6.0f;
                    case 41:
                        return DisplayDataUtil.getUnitScale(UnitType.AQUATIC_MAN) * 2.0f;
                    case 42:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.AQUATIC_MAN);
                    case 43:
                        return DisplayDataUtil.getUnitScale(UnitType.BONE_DRAGON) * 1.2f;
                    case 44:
                        return DisplayDataUtil.getUnitScale(UnitType.NPC_INFERNO_SPIDER) * 2.0f;
                    case 45:
                    case 46:
                    case 47:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.MAGIC_DRAGON);
                    case 48:
                        return DisplayDataUtil.getUnitScale(UnitType.MAGIC_DRAGON) * 0.75f;
                    case 49:
                        return DisplayDataUtil.getUnitScale(UnitType.SHADOW_ASSASSIN) * 0.75f;
                    case 50:
                        return DisplayDataUtil.getUnitScale(UnitType.SPIKEY_DRAGON) * 2.0f;
                    case 51:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SPIKEY_DRAGON);
                    case 52:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.DRUIDINATRIX);
                    case 53:
                        return 0.75f;
                    case 54:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.RABID_DRAGON);
                    case 55:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.NPC_SQUID);
                    case 56:
                        return DisplayDataUtil.getUnitScale(UnitType.NPC_CAULDRON_MONSTER) * 2.0f;
                    case 57:
                    case 58:
                    case 59:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.STORM_DRAGON);
                    case 60:
                        return DisplayDataUtil.getUnitScale(UnitType.SKELETON_KING) * 1.25f;
                    case 61:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SKELETON_KING);
                    case 62:
                        return DisplayDataUtil.getUnitScale(UnitType.NPC_SKELETON_DEER) * 0.85f;
                    case 63:
                        return DisplayDataUtil.getUnitScale(UnitType.GROOVY_DRUID) * 1.25f;
                    case 64:
                        return DisplayDataUtil.getUnitScale(UnitType.SHADOW_ASSASSIN) * 0.75f;
                    case 65:
                        return DisplayDataUtil.getUnitScale(UnitType.ELECTROYETI) * 1.1f;
                    case 66:
                        return DisplayDataUtil.getUnitScale(UnitType.UNSTABLE_UNDERSTUDY) * 1.3f;
                    case 67:
                    case 68:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SNIPER_WOLF);
                    case 69:
                        return DisplayDataUtil.getUnitScale(UnitType.SNIPER_WOLF) * 2.0f;
                    case 70:
                        return DisplayDataUtil.getUnitScale(UnitType.SNIPER_WOLF) * 2.5f;
                    case 71:
                    case 72:
                    case 73:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.PIRATE);
                    case 74:
                        return DisplayDataUtil.getUnitScale(UnitType.PIRATE) * 0.75f;
                    case 75:
                        return 1.35f;
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                        return DisplayDataUtil.getUnitScale(UnitType.DEMON_TOTEM) * 2.0f;
                    case 80:
                    case 81:
                    case 82:
                        return DisplayDataUtil.getUnitScale(UnitType.DRAGZILLA) * 1.35f;
                    case 83:
                        return DisplayDataUtil.getUnitScale(UnitType.DRAGZILLA) * 1.45f;
                    case 84:
                        return DisplayDataUtil.getUnitScale(UnitType.DRAGZILLA) * 1.65f;
                    case 85:
                        return DisplayDataUtil.getUnitScale(UnitType.CYCLOPS_WIZARD) * 0.85f;
                    case 86:
                    case 87:
                        return DisplayDataUtil.getUnitScale(UnitType.CYCLOPS_WIZARD) * 0.75f;
                    case 88:
                        return DisplayDataUtil.getUnitScale(UnitType.CYCLOPS_WIZARD) * 2.5f;
                    case 89:
                        return entity.getScale() * 6.0f;
                    case 90:
                        return DisplayDataUtil.getUnitScale(UnitType.KRAKEN_KING) * 0.5f;
                    case 91:
                    case 92:
                    case 93:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.DOPPELGANGER);
                    case 94:
                    case 95:
                    case 96:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.DEEP_DRAGON);
                    case 97:
                    case 98:
                        return DisplayDataUtil.getUnitScale(UnitType.STOWAWAY) * 2.0f;
                    case 99:
                        return DisplayDataUtil.getUnitScale(UnitType.STOWAWAY) * 1.25f;
                    case 100:
                    case 101:
                    case 102:
                        return DisplayDataUtil.getUnitScale(UnitType.STOWAWAY) * 0.75f;
                    case 103:
                    case 104:
                        return DisplayDataUtil.getUnitScale(UnitType.VULTURE_DRAGON) * 2.0f;
                    case 105:
                    case 106:
                    case 107:
                        return DisplayDataUtil.getUnitScale(UnitType.VULTURE_DRAGON) * 0.75f;
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                        return DisplayDataUtil.getUnitScale(UnitType.CURSED_STATUE) * 3.0f;
                    case 112:
                        return DisplayDataUtil.getUnitScale(UnitType.SPIDER_QUEEN) * 1.25f;
                    case 113:
                    case 114:
                        return DisplayDataUtil.getUnitScale(UnitType.NPC_ANT) * 0.25f;
                    case 115:
                        return DisplayDataUtil.getUnitScale(UnitType.BANSHEE) * 1.25f;
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                        return DisplayDataUtil.getUnitScale(UnitType.SILENT_SPIRIT) * 3.0f;
                    case 120:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SILENT_SPIRIT);
                    case 121:
                    case 122:
                    case 123:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SPECTRAL_DRAGON);
                    case MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES /*124*/:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                        return DisplayDataUtil.getUnitScale(UnitType.SPECTRAL_DRAGON) * 3.0f;
                    case 132:
                    case 133:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.SPECTRAL_DRAGON);
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                        return DisplayDataUtil.getUnitScale(UnitType.SPECTRAL_DRAGON) * 5.0f;
                    case 141:
                        return DisplayDataUtil.getUnitScale(UnitType.RAGING_REVENANT) * 1.35f;
                    case 142:
                        return 0.75f;
                    case 143:
                        return 5.0f;
                    case 144:
                        return 0.75f;
                    case 145:
                        return 2.5f;
                    case 146:
                        return 2.0f;
                    case 147:
                        return DisplayDataUtil.getUnitScale(UnitType.WEE_WITCH) * 3.0f;
                    case 148:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.WEE_WITCH);
                    case 149:
                        return DisplayDataUtil.getUnitScale(UnitType.DUNGEON_MAN) * 3.0f;
                    case 150:
                        return DisplayDataUtil.getUnitScale(UnitType.DUNGEON_MAN) * 3.0f;
                    case 151:
                        return 1.5f * DisplayDataUtil.getUnitScale(UnitType.VOID_WYVERN);
                    case 152:
                        return DisplayDataUtil.getUnitScale(UnitType.VOID_WYVERN) * 2.0f;
                    case 153:
                        return DisplayDataUtil.getUnitScale(UnitType.VOID_WYVERN) * 2.0f;
                    case 154:
                        return DisplayDataUtil.getUnitScale(UnitType.TOMB_ANGEL) * ((((float) Math.random()) * 0.5f) + 0.5f);
                    case 155:
                        return DisplayDataUtil.getUnitScale(UnitType.ANGELIC_HERALD) * 0.8f;
                    case 156:
                        return 2.2f;
                    case 157:
                        return 0.9f;
                    case 158:
                        return 0.6f;
                    case 159:
                    case 160:
                        return DisplayDataUtil.getUnitScale(UnitType.COSMIC_ELF) * 2.0f;
                    case 161:
                        return 1.3f;
                    default:
                        UnitType unitType = (UnitType) PARTICLE_MAPPING.get(getBaseParticle(this));
                        if (unitType == null) {
                            return 1.0f;
                        }
                        if (unitType == UnitType.TRIPLE_THREAT) {
                            return DisplayDataUtil.getUnitScale(unitType) * 2.0f;
                        }
                        return DisplayDataUtil.getUnitScale(unitType);
                }
        }
    }

    public float getPlaySpeed() {
        getName().hashCode();
        return 1.0f;
    }

    public static String getParticleSkinMapping(ItemType itemType) {
        String str = "_skin_";
        if (itemType == null) {
            return "";
        }
        switch (itemType) {
            case SKIN_CRIMSON_WITCH_CROW:
                return str + "crow";
            case SKIN_FAITH_HEALER_CTHULU:
                return str + "cthulu";
            case SKIN_HYDRA_SEA_DRAGON:
                return str + "sea_dragon";
            case SKIN_CENTAUR_RESPLENDENT:
                return str + "resplendent";
            case SKIN_CENTAUR_OF_ATTENTION_MASTERY:
                return str + "mastery";
            case SKIN_DOPPELGANGER_MOLTEN:
                return str + "molten";
            case SKIN_MOON_DRAKE_MECHA:
                return str + "mecha";
            case SKIN_SKELETON_KING_ASCENDANT:
                return str + "ascendant";
            case SKIN_SKELETON_DEER_ASCENDANT_DEER:
                return str + "ascendant_deer";
            case SKIN_PLANT_SOUL_COUNTRY:
                return str + "country";
            case SKIN_DUNGEON_MAN_MASTERY:
                return str + "masterry_dm";
            case SKIN_WEREDRAGON_MASTERY:
                return str + "masterry_wd";
            case SKIN_SPECTRAL_DRAGON_EASTER:
                return str + "easter";
            case SKIN_VOID_WYVERN_MASTERY:
                return str + "mastery_vw";
            case SKIN_ZOMBIE_SQUIRE_DIGITAL:
                return str + "digital";
            case SKIN_DRAGON_LADY_SPACE_KNIGHT:
                return str + "space_knight";
            case SKIN_SHADOW_ASSASSIN_WATCH:
                return str + "watch";
            case SKIN_VOID_WYVERN_IMAGINATION:
                return str + "imagination";
            case SKIN_ANGEL_DRAGON_FALLEN:
                return str + "fallen";
            case SKIN_BURNT_ONE_VOODOO:
                return str + "voodoo";
            case SKIN_CURSED_STATUE_HAWAII:
                return str + "hawaii";
            case SKIN_DRAGON_SLAYER_UNICORN:
                return str + "unicorn";
            case SKIN_GROOVY_DRUID_DISCO:
                return str + "disco";
            case SKIN_KRAKEN_KING_MECHALORD:
                return str + "mechalord";
            case SKIN_DRUIDINATRIX_MASTERY:
                return str + "mastery_dx";
            case SKIN_PLANT_SOUL_MASTERY:
                return str + "mastery_ps";
            case SKIN_SPIDER_QUEEN_MASTERY:
                return str + "mastery_sq";
            case SKIN_CURSED_STATUE_MEER:
                return str + "meer";
            case SKIN_CURSED_STATUE_USERCONTEST:
                return str + "usercontest_ct";
            case SKIN_TOMB_ANGEL_USERCONTEST:
                return str + "usercontest_ta";
            case SKIN_ANGEL_DRAGON_USERCONTEST:
                return str + "usercontest_ad";
            case SKIN_STEPLADDER_BROTHERS_HORROR:
                return str + "kabuki";
            case SKIN_MEDUSA_HORROR:
                return str + "futakuchi";
            case SKIN_WEE_WITCH_HORROR:
                return str + "pumpkin_witch";
            case SKIN_DARK_DRACUL_HORROR:
                return str + "vamp";
            case SKIN_ANCIENT_DWARF_MECHA:
                return str + "ancient_dwarf_mecha";
            case SKIN_BLACK_WING_MECHA:
                return str + "black_wing_mecha";
            case SKIN_DUNGEON_MAN_MECHA:
                return str + "dungeon_man_mecha";
            case SKIN_SADISTIC_DANCER_MECHA:
                return str + "sadistic_dancer_mecha";
            case SKIN_SHADOW_OF_SVEN_MECHA:
                return str + "shadow_of_sven_mecha";
            case SKIN_ABYSS_DRAGON_WINTER:
                return str + "ice_dragon";
            case SKIN_SADISTIC_DANCER_WINTER:
                return str + "scarlett_fox";
            case SKIN_SPECTRAL_DRAGON_REDDRAGON:
                return str + "spectral_dragon_reddragon";
            case SKIN_SUN_SEEKER_SNOW:
                return str + "sun_seeker_snow";
            default:
                return "";
        }
    }

    public static ItemType getSkinForParticleSuffix(String str) {
        if (str == null) {
            return null;
        }
        Object obj = -1;
        switch (str.hashCode()) {
            case -2109065882:
                if (str.equals("imagination")) {
                    obj = 16;
                    break;
                }
                break;
            case -2038064271:
                if (str.equals("mastery_dm")) {
                    obj = 9;
                    break;
                }
                break;
            case -2038064260:
                if (str.equals("mastery_dx")) {
                    obj = 23;
                    break;
                }
                break;
            case -2038063893:
                if (str.equals("mastery_ps")) {
                    obj = 24;
                    break;
                }
                break;
            case -2038063802:
                if (str.equals("mastery_sq")) {
                    obj = 25;
                    break;
                }
                break;
            case -2038063703:
                if (str.equals("mastery_vw")) {
                    obj = 12;
                    break;
                }
                break;
            case -2038063691:
                if (str.equals("mastery_wd")) {
                    obj = 10;
                    break;
                }
                break;
            case -1803303885:
                if (str.equals("spectral_dragon_reddragon")) {
                    obj = 42;
                    break;
                }
                break;
            case -1413116420:
                if (str.equals("animal")) {
                    obj = 27;
                    break;
                }
                break;
            case -1350338745:
                if (str.equals("cthulu")) {
                    obj = 1;
                    break;
                }
                break;
            case -1281887900:
                if (str.equals("fallen")) {
                    obj = 17;
                    break;
                }
                break;
            case -1224312349:
                if (str.equals("hawaii")) {
                    obj = 19;
                    break;
                }
                break;
            case -1139031225:
                if (str.equals("kabuki")) {
                    obj = 31;
                    break;
                }
                break;
            case -1077262388:
                if (str.equals("resplendent")) {
                    obj = 3;
                    break;
                }
                break;
            case -1068546861:
                if (str.equals("molten")) {
                    obj = 4;
                    break;
                }
                break;
            case -1010235670:
                if (str.equals("sun_seeker_snow")) {
                    obj = 43;
                    break;
                }
                break;
            case -969794247:
                if (str.equals("usercontest_ad")) {
                    obj = 30;
                    break;
                }
                break;
            case -969794170:
                if (str.equals("usercontest_cs")) {
                    obj = 28;
                    break;
                }
                break;
            case -969793661:
                if (str.equals("usercontest_ta")) {
                    obj = 29;
                    break;
                }
                break;
            case -810810194:
                if (str.equals("voodoo")) {
                    obj = 18;
                    break;
                }
                break;
            case -688537017:
                if (str.equals("ice_dragon")) {
                    obj = 40;
                    break;
                }
                break;
            case -649926682:
                if (str.equals("space_knight")) {
                    obj = 14;
                    break;
                }
                break;
            case -354920445:
                if (str.equals("sea_dragon")) {
                    obj = 2;
                    break;
                }
                break;
            case -287015784:
                if (str.equals("unicorn")) {
                    obj = 20;
                    break;
                }
                break;
            case -4939555:
                if (str.equals("ascendant")) {
                    obj = 6;
                    break;
                }
                break;
            case 3062423:
                if (str.equals("crow")) {
                    obj = null;
                    break;
                }
                break;
            case 3347525:
                if (str.equals("meer")) {
                    obj = 26;
                    break;
                }
                break;
            case 3612046:
                if (str.equals("vamp")) {
                    obj = 34;
                    break;
                }
                break;
            case 95593850:
                if (str.equals("disco")) {
                    obj = 21;
                    break;
                }
                break;
            case 103771140:
                if (str.equals("mecha")) {
                    obj = 5;
                    break;
                }
                break;
            case 112903375:
                if (str.equals("watch")) {
                    obj = 15;
                    break;
                }
                break;
            case 141917594:
                if (str.equals("dungeon_man_mecha")) {
                    obj = 37;
                    break;
                }
                break;
            case 448992304:
                if (str.equals("pumpkin_witch")) {
                    obj = 33;
                    break;
                }
                break;
            case 501321418:
                if (str.equals("scarlett_fox")) {
                    obj = 41;
                    break;
                }
                break;
            case 757519066:
                if (str.equals("shadow_of_sven_mecha")) {
                    obj = 39;
                    break;
                }
                break;
            case 824257790:
                if (str.equals("futakuchi")) {
                    obj = 32;
                    break;
                }
                break;
            case 918034192:
                if (str.equals("ascendant_deer")) {
                    obj = 7;
                    break;
                }
                break;
            case 957831062:
                if (str.equals("country")) {
                    obj = 8;
                    break;
                }
                break;
            case 1225036025:
                if (str.equals("mechalord")) {
                    obj = 22;
                    break;
                }
                break;
            case 1660481048:
                if (str.equals("digital")) {
                    obj = 13;
                    break;
                }
                break;
            case 1786060102:
                if (str.equals("easter_sd")) {
                    obj = 11;
                    break;
                }
                break;
            case 1839254368:
                if (str.equals("ancient_dwarf_mecha")) {
                    obj = 35;
                    break;
                }
                break;
            case 2029088373:
                if (str.equals("sadistic_dancer_mecha")) {
                    obj = 38;
                    break;
                }
                break;
            case 2115971856:
                if (str.equals("black_wing_mecha")) {
                    obj = 36;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return ItemType.SKIN_CRIMSON_WITCH_CROW;
            case 1:
                return ItemType.SKIN_FAITH_HEALER_CTHULU;
            case 2:
                return ItemType.SKIN_HYDRA_SEA_DRAGON;
            case 3:
                return ItemType.SKIN_CENTAUR_RESPLENDENT;
            case 4:
                return ItemType.SKIN_DOPPELGANGER_MOLTEN;
            case 5:
                return ItemType.SKIN_MOON_DRAKE_MECHA;
            case 6:
                return ItemType.SKIN_SKELETON_KING_ASCENDANT;
            case 7:
                return ItemType.SKIN_SKELETON_DEER_ASCENDANT_DEER;
            case 8:
                return ItemType.SKIN_PLANT_SOUL_COUNTRY;
            case 9:
                return ItemType.SKIN_DUNGEON_MAN_MASTERY;
            case 10:
                return ItemType.SKIN_WEREDRAGON_MASTERY;
            case 11:
                return ItemType.SKIN_SPECTRAL_DRAGON_EASTER;
            case 12:
                return ItemType.SKIN_VOID_WYVERN_MASTERY;
            case 13:
                return ItemType.SKIN_ZOMBIE_SQUIRE_DIGITAL;
            case 14:
                return ItemType.SKIN_DRAGON_LADY_SPACE_KNIGHT;
            case 15:
                return ItemType.SKIN_SHADOW_ASSASSIN_WATCH;
            case 16:
                return ItemType.SKIN_VOID_WYVERN_IMAGINATION;
            case 17:
                return ItemType.SKIN_ANGEL_DRAGON_FALLEN;
            case 18:
                return ItemType.SKIN_BURNT_ONE_VOODOO;
            case 19:
                return ItemType.SKIN_CURSED_STATUE_HAWAII;
            case 20:
                return ItemType.SKIN_DRAGON_SLAYER_UNICORN;
            case 21:
                return ItemType.SKIN_GROOVY_DRUID_DISCO;
            case 22:
                return ItemType.SKIN_KRAKEN_KING_MECHALORD;
            case 23:
                return ItemType.SKIN_DRUIDINATRIX_MASTERY;
            case 24:
                return ItemType.SKIN_PLANT_SOUL_MASTERY;
            case 25:
                return ItemType.SKIN_SPIDER_QUEEN_MASTERY;
            case 26:
                return ItemType.SKIN_CURSED_STATUE_MEER;
            case 27:
                return ItemType.SKIN_NINJA_DWARF_FRIGGING_RABBIT;
            case 28:
                return ItemType.SKIN_CURSED_STATUE_USERCONTEST;
            case 29:
                return ItemType.SKIN_TOMB_ANGEL_USERCONTEST;
            case 30:
                return ItemType.SKIN_ANGEL_DRAGON_USERCONTEST;
            case 31:
                return ItemType.SKIN_STEPLADDER_BROTHERS_HORROR;
            case 32:
                return ItemType.SKIN_MEDUSA_HORROR;
            case 33:
                return ItemType.SKIN_WEE_WITCH_HORROR;
            case 34:
                return ItemType.SKIN_DARK_DRACUL_HORROR;
            case 35:
                return ItemType.SKIN_ANCIENT_DWARF_MECHA;
            case 36:
                return ItemType.SKIN_BLACK_WING_MECHA;
            case 37:
                return ItemType.SKIN_DUNGEON_MAN_MECHA;
            case 38:
                return ItemType.SKIN_SADISTIC_DANCER_MECHA;
            case 39:
                return ItemType.SKIN_SHADOW_OF_SVEN_MECHA;
            case 40:
                return ItemType.SKIN_ABYSS_DRAGON_WINTER;
            case 41:
                return ItemType.SKIN_SADISTIC_DANCER_WINTER;
            case 42:
                return ItemType.SKIN_SPECTRAL_DRAGON_REDDRAGON;
            case 43:
                return ItemType.SKIN_SUN_SEEKER_SNOW;
            default:
                return null;
        }
    }

    public static Set<ParticleType> getUnitParticles(UnitType unitType) {
        return (Set) UNIT_MAPPING.get(unitType);
    }

    public static Set<ParticleType> getUnitParticles(UnitType unitType, ItemType itemType) {
        Set<ParticleType> hashSet = new HashSet();
        for (ParticleType particleType : (Set) UNIT_MAPPING.get(unitType)) {
            if (!particleType.getName().contains("_skin")) {
                hashSet.add(particleType);
            } else if (!getParticleSkinMapping(itemType).equals("") && particleType.getName().contains(getParticleSkinMapping(itemType))) {
                hashSet.add(particleType);
            }
        }
        return hashSet;
    }

    public static ParticleType getBaseParticle(ParticleType particleType) {
        if (particleType.getName().contains("_skin")) {
            return getStringToParticle(particleType.getName().substring(0, particleType.getName().indexOf("_skin")), particleType);
        }
        return particleType;
    }

    public static ParticleType getStringToParticle(String str, ParticleType particleType) {
        for (ParticleType particleType2 : ATLAS_MAPPINGS.keySet()) {
            if (particleType2.getName().equals(str)) {
                return particleType2;
            }
        }
        return particleType;
    }
}
