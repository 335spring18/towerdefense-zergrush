package model;

import java.awt.Point;

import controller.ControllerMain;
import model.Mobs.Mob;
import model.Mobs.SpeedAttribute;
import model.Towers.ElementalAttribute;


/*============================================================================*
 * 	DemoProjectile                                                            *
 *  Serves as a basic projectile, normal speed as well as damage, nothing     *
 *  special                                                                   *
 *============================================================================*/
public class DemoProjectile extends Projectile {

  
  public DemoProjectile(Point startLocation, Mob targetMob, int testing) {
    super(startLocation, 
        SpeedAttribute.PROJECTILE_SPEED, targetMob.getRadius(), 100.0, 
        ElementalAttribute.DEMO_ELEMENT, "file:assets/images/proj.png",testing);
    
    this.setMob(targetMob);
    this.targetLocation = targetMob.getCurrentLocation();
  }

  @Override
  protected void terminate() {
    targetMob.takeDamage(baseDmg, dmgType);
    ControllerMain.projectiles.remove(this);
  }
}
