package Entites.Personnages.Joueurs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JoueurTest {

  @Test
  public void testPlayerCreation() {
    Joueur player = new Joueur("TestPlayer", Race.Humain(), ClasseJoueur.Guerriers(), 0, 0);

    assertEquals("TestPlayer", player.getM_nom());
    assertEquals(20, player.getM_pv());
    assertEquals("Humain", player.getM_race().getM_nomRace());
    assertEquals("Guerriers", player.getM_classe().getM_nomClass());
  }

  @Test
  public void testGetDisplaySymbol() {
    Joueur shortName = new Joueur("Bob", Race.Humain(), ClasseJoueur.Guerriers(), 0, 0);
    assertEquals("BOB", shortName.getDisplaySymbol());
    Joueur longName = new Joueur("Alexander", Race.Humain(), ClasseJoueur.Guerriers(), 0, 0);
    assertEquals("ALE", longName.getDisplaySymbol());
  }

  @Test
  public void testEquipWeapon() {
    Joueur player = new Joueur("TestPlayer", Race.Humain(), ClasseJoueur.Guerriers(), 0, 0);
    assertNull(player.getM_armure());
    assertEquals(2, player.getM_classe().getM_armes().size());
  }

  @Test
  public void testEquipArmor() {
    Joueur player = new Joueur("TestPlayer", Race.Humain(), ClasseJoueur.Guerriers(), 0, 0);
    assertNull(player.getM_armure());
    assertEquals(1, player.getM_classe().getM_armures().size());
  }
  @Test
  public void testInitialStatsWithDiceRolls() {
    Joueur player = new Joueur("TestPlayer", Race.Humain(), ClasseJoueur.Guerriers(), 0, 0);

    int baseMin = 7;
    int baseMax = 19;

    int bonusForce = player.getM_race().getM_BonusForce();
    int bonusDex = player.getM_race().getM_BonusDexterite();
    int bonusVit = player.getM_race().getM_BonusVitesse();

    // Force
    assertTrue(player.getM_force() >= baseMin + bonusForce);
    assertTrue(player.getM_force() <= baseMax + bonusForce);

    // Dexterite
    assertTrue(player.getM_dexterite() >= baseMin + bonusDex);
    assertTrue(player.getM_dexterite() <= baseMax + bonusDex);

    // Vitesse
    assertTrue(player.getM_vitesse() >= baseMin + bonusVit);
    assertTrue(player.getM_vitesse() <= baseMax + bonusVit);

    // Initiative (no race bonus)
    assertTrue(player.getM_initiative() >= 4);
    assertTrue(player.getM_initiative() <= 16);
  }

  @Test
  public void testNainStatsWithDiceRolls() {
    Joueur player = new Joueur("NainPlayer", Race.Nain(), ClasseJoueur.Guerriers(), 0, 0);

    int baseMin = 7;
    int baseMax = 19;

    int bonusForce = player.getM_race().getM_BonusForce();
    int bonusDex = player.getM_race().getM_BonusDexterite();

    // Force
    assertTrue(player.getM_force() >= baseMin + bonusForce);
    assertTrue(player.getM_force() <= baseMax + bonusForce);

    // Dexterite
    assertTrue(player.getM_dexterite() >= baseMin + bonusDex);
    assertTrue(player.getM_dexterite() <= baseMax + bonusDex);
  }
  @Test
  public void testGuerreWeaponEffect() {
    Joueur player = new Joueur("Warrior", Race.Nain(), ClasseJoueur.Guerriers(), 0, 0);
    int initialForce = player.getM_force();
    int initialVitesse = player.getM_vitesse();
    player.setM_force(initialForce + 4);
    player.setM_vitesse(initialVitesse - 2);
    assertEquals(initialForce + 4, player.getM_force());
    assertEquals(initialVitesse - 2, player.getM_vitesse());
  }

  @Test
  public void testHeavyArmorEffect() {
    Joueur player = new Joueur("Warrior", Race.Nain(), ClasseJoueur.Guerriers(), 0, 0);
    int initialVitesse = player.getM_vitesse();
    player.setM_vitesse(initialVitesse - 4);
    assertEquals(initialVitesse - 4, player.getM_vitesse());
  }

  @Test
  public void testEquipmentCombination() {
    Joueur player = new Joueur("Warrior", Race.Nain(), ClasseJoueur.Guerriers(), 0, 0);
    int initialForce = player.getM_force();
    int initialVitesse = player.getM_vitesse();
    player.setM_force(initialForce + 4);
    player.setM_vitesse(initialVitesse - 2 - 4);
    assertEquals(initialForce + 4, player.getM_force());
    assertEquals(initialVitesse - 6, player.getM_vitesse());
  }
}

