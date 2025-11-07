package com.projectEvergreen.seed_inventory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeedInventoryApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testCropCreation() {
		GrowingSeasons SUMMER = GrowingSeasons.SUMMER;
		Crop testCrop = new Crop("Corn", 50, 120, SUMMER);
		assert(testCrop.getCropName().equals("Corn"));
		assert(testCrop.getCurrentAmount() == 50);
		assert(testCrop.getCropPeriod() == 120);
		assert(testCrop.getSeason() == SUMMER);
	}

}
