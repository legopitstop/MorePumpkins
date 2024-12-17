package dev.lpsmods.morepumpkins;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: legopitstop
 */
public class Constants {
	public static final String MOD_ID = "morepumpkin";
	public static final String MOD_NAME = "More Pumpkins";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
	public static final List<ResourceLocation> VARIANTS = getVariants();

	public static List<ResourceLocation> getVariants() {
		List<String> list1 = List.of("creeper", "flower", "ghast", "globe", "observer", "skeleton", "snout", "zero","one","two","three","four","five","six","seven","eight","nine","lowercase_a","lowercase_b","lowercase_c","lowercase_d","lowercase_e","lowercase_f","lowercase_g","lowercase_h","lowercase_i","lowercase_j","lowercase_k","lowercase_l","lowercase_m","lowercase_n","lowercase_o","lowercase_p","lowercase_q","lowercase_r","lowercase_s","lowercase_t","lowercase_u","lowercase_v","lowercase_w","lowercase_x","lowercase_y","lowercase_z","uppercase_a","uppercase_b","uppercase_c","uppercase_d","uppercase_e","uppercase_f","uppercase_g","uppercase_h","uppercase_i","uppercase_j","uppercase_k","uppercase_l","uppercase_m","uppercase_n","uppercase_o","uppercase_p","uppercase_q","uppercase_r","uppercase_s","uppercase_t","uppercase_u","uppercase_v","uppercase_w","uppercase_x","uppercase_y","uppercase_z");
		List<ResourceLocation> list2 = new ArrayList<>();
		for (String variant : list1) {
			list2.add(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, variant));
		}
		return list2;
	}
}