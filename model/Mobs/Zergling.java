package model.Mobs;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controller.ControllerMain;

public class Zergling extends Mob{

	public Zergling(List<Point> movementPath) {
		super(movementPath, ControllerMain.TILE_SIZE/3, ArmorAttribute.NONE, 
				AttackAttribute.WEAK_ATTACK, DefenseAttribute.SMALL, 
				SpeedAttribute.FAST, 
				new ArrayList<ResistanceAttribute>(Collections.singletonList(ResistanceAttribute.DEMO)), 
				"Zergling"+Mob.IDNumber++,
				"file:assets/images/mob/zerg/zergling.png");
	}

}