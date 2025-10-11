# DOOnjon&Dragon - Jeu de Rôle Médiéval Fantasy

![Dragonlance](https://github.com/user-attachments/assets/211f52da-643c-4509-97a4-2d2d030f3332)

**DOOnjon&Dragon** est une application Java qui simule un jeu de rôle médiéval fantasy inspiré de *Donjons & Dragons*.  
Les joueurs incarnent des personnages (Guerrier, Clerc, Magicien, Roublard) appartenant à différentes races (Humain, Nain, Elfe, Halfelin) et affrontent des monstres dans une série de donjons successifs.
Ce projet a été réalisé dans le cadre d’un projet tutoré universitaire, en équipe de 2 personnes sur une durée de 7 semaines.

### Technologies utilisées
- **Langage :** Java 17
- **Paradigme :** Programmation orientée objet (OOP)
- **Tests unitaires :** JUnit 5
- **Gestion des erreurs et exceptions personnalisées**

# Installation
## Prérequis

Avant d’installer le projet, assurez-vous d’avoir :
- **Java 17** ou version supérieure
- **Git** installé sur votre machine
- **Un IDE Java** (ex. IntelliJ IDEA, VS Code, Eclipse)
- *(Optionnel)* **PlantUML** ou **StarUML** pour visualiser les diagrammes UML

---

## 🚀 Étapes d’installation

### 1️⃣ Cloner le projet
```bash
git clone https://github.com/<votre-utilisateur>/DOOnjon-Dragon.git
cd DOOnjonAndDragon
```
### Fonctionnalités :
- Créer des personnages personnalisés avec des caractéristiques uniques
- Gérer des combats au tour par tour dans des donjons générés procéduralement
- Utiliser différents types d'équipements (armes et armures) avec des effets spécifiques
- Lancer des sorts magiques (Guérison, Boogie Woogie, Arme magique)
- Offrir au Maître du Jeu des outils pour narrer l'aventure et intervenir sur le gameplay

---
### Exemple d'affichage

```console
Bienvenue dans DOOnjon et Dragons
Entrez le nom du joueur 1 : Abdullah
Choisir la race de ABDULLAH (entrez l'index) :
1 : Elfe
2 : Halfelin
3 : Humain
4 : Nain
Race : 1
Choisir la classe de ABDULLAH (entrez l'index) :
1 : Clercs
2 : Guerriers
3 : Magiciens
4 : Roublards
Classe : 1
Entrez le nom du joueur 2 : Thomas
Choisir la race de THOMAS (entrez l'index) :
1 : Elfe
2 : Halfelin
3 : Humain
4 : Nain
Race : 2
Choisir la classe de THOMAS (entrez l'index) :
1 : Clercs
2 : Guerriers
3 : Magiciens
4 : Roublards
Classe : 2
Entrez le nom du joueur 3 : Jean
Choisir la race de JEAN (entrez l'index) :
1 : Elfe
2 : Halfelin
3 : Humain
4 : Nain
Race : 3
Choisir la classe de JEAN (entrez l'index) :
1 : Clercs
2 : Guerriers
3 : Magiciens
4 : Roublards
Classe : 3
Entrez le nom du joueur 4 : Valentin
Choisir la race de VALENTIN (entrez l'index) :
1 : Elfe
2 : Halfelin
3 : Humain
4 : Nain
Race : 3
Choisir la classe de VALENTIN (entrez l'index) :
1 : Clercs
2 : Guerriers
3 : Magiciens
4 : Roublards
Classe : 3

===Donjon 1 ===
=== Easy Donjon ===
     A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y 
   *───────────────────────────────────────────────────────────────────────────*
 1 │ .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  . │
 2 │ .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  . │
 3 │ .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  . │
 4 │ .  .  .  .  . ▓▓▓X(1 .  .  .  .  .  .  .  .  .  . X^1 . ▓▓▓ .  .  .  .  . │
 5 │ .  .  .  .  . ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ . ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ .  .  .  .  . │
 6 │ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . │
 7 │ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . │
 8 │ .  .  .  .  .  .  .  .  .  . X(2 .  .  . X^2 .  .  .  .  .  .  .  .  .  . │
 9 │▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ .  .  .  .  .  *  .  .  .  .  . ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓│
10 │ .  .  .  .  .  * ▓▓▓ .  .  .  .  .  .  .  .  .  .  . ▓▓▓ *  .  .  .  .  . │
11 │ .  .  .  .  .  .  .  .  .  . ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ .  .  .  .  .  .  .  .  .  . │
12 │ .  .  .  .  .  .  .  .  .  . ▓▓▓ *  *  * ▓▓▓ .  .  .  .  .  .  .  .  .  . │
13 │ .  .  .  .  .  .  .  .  .  . ▓▓▓ .  .  . ▓▓▓ .  .  .  .  .  .  .  .  .  . │
14 │ .  .  .  .  .  .  .  .  .  . ▓▓▓ .  .  . ▓▓▓ .  .  .  .  .  .  .  .  .  . │
15 │ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . │
16 │ .  .  . VAL .  .  .  .  .  .  .  .  *  .  .  .  .  .  .  .  . JEA .  .  . │
17 │ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . │
18 │▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ .  .  .  .  .  .  .  .  .  .  .  .  . ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓│
19 │ .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  . │
20 │ .  .  .  .  .  .  . ▓▓▓ABD .  .  .  .  .  .  . THO▓▓▓ .  .  .  .  .  .  . │
21 │ .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  . │
22 │ .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  . │
23 │ .  *  *  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  . ▓▓▓ .  .  *  *  .  .  . │
24 │ .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  . │
25 │ .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  .  .  . ▓▓▓ .  .  .  .  .  .  . │
   *───────────────────────────────────────────────────────────────────────────*
Joueur : ABDULLAH

Veuillez equiper une arme
1) masse d'armes (COURANTE), Dégâts: 1d6, Portée: 1 cases
2) arbalète légère (COURANTE), Dégâts: 1d8, Portée: 16 cases
Mettre le numero de l'arme que vous voulez equiper: 1
Vous avez choisi l'arme : masse d'armes

Veuillez equiper une armure
1) armure d'écailles (LEGERE) - CA: 9
Mettre le numero de l'armure que vous voulez equiper: 1
Vous avez choisi l'armure : armure d'écailles
Joueur : THOMAS

Veuillez equiper une arme
1) épée longue (GUERRE), Dégâts: 1d8, Portée: 1 cases
2) arbalète légère (DISTANCE), Dégâts: 1d8, Portée: 16 cases
Mettre le numero de l'arme que vous voulez equiper: 2
Vous avez choisi l'arme : arbalète légère

Veuillez equiper une armure
1) cotte de mailles (LOURDE) - CA: 11
Mettre le numero de l'armure que vous voulez equiper: 1
Vous avez choisi l'armure : cotte de mailles
Joueur : JEAN

Veuillez equiper une arme
1) bâton (COURANTE), Dégâts: 1d6, Portée: 1 cases
2) fronde (DISTANCE), Dégâts: 1d4, Portée: 6 cases
Mettre le numero de l'arme que vous voulez equiper: 1
Vous avez choisi l'arme : bâton
Vous n'avez pas d'armure à équiper
Joueur : VALENTIN

Veuillez equiper une arme
1) bâton (COURANTE), Dégâts: 1d6, Portée: 1 cases
2) fronde (DISTANCE), Dégâts: 1d4, Portée: 6 cases
Mettre le numero de l'arme que vous voulez equiper: 2
Vous avez choisi l'arme : fronde
Vous n'avez pas d'armure à équiper



***************************************************************************
Donjon : 1

***************************************************************************
Tour: 1
 ->  ABDULLAH ( Elfe Clercs, 16/16 ) 
 Demogorgon 1 Demogorgon (45/45 ) 
 Dragon 2 Dragon (50/50 ) 
 Demogorgon 2 Demogorgon (45/45 ) 
 JEAN ( Humain Magiciens, 12/12 ) 
 Dragon 1 Dragon (50/50 ) 
 THOMAS ( Halfelin Guerriers, 20/20 ) 
 VALENTIN ( Humain Magiciens, 12/12 )

 Le maître du jeu souhaite-t-il intervenir ? (oui/non) : non

=== Tour de ABDULLAH ===
Actions restantes : 3
Choisissez une action :
1 - Se déplacer
2 - Attaquer
3 - S'équiper
4 - Ramasser un équipement
5 - Lancer un sort
Votre choix : 2
Aucun monstre à portée (1). Vous ne pouvez pas attaquer

ABDULLAH
    Vie : 16/16
    Armure : masse d'armes (COURANTE), Dégâts: 1d6, Portée: 1 cases
    Arm : masse d'armes (COURANTE), Dégâts: 1d6, Portée: 1 cases
    Inventaire  Arme équipée : masse d'armes
Armes dans l'inventaire :
  [1] arbalète légère
Armure équipée : armure d'écailles
Armures dans l'inventaire :
  (aucune autre armure)

    force : 13
    dexterite : 23
    vitesse : 14

Fin du tour de ABDULLAH

```
###  Cartes du jeu
<img width="657" height="622" alt="Capture d’écran du 2025-10-09 19-29-35" src="https://github.com/user-attachments/assets/8f827780-ac02-49a4-8f6e-bb227592fa3a" />  
<img width="535" height="488" alt="Capture d’écran du 2025-10-09 19-31-47" src="https://github.com/user-attachments/assets/79f3a854-e447-4c01-a31b-2c578e9c35d5" />  
<img width="413" height="391" alt="Capture d’écran du 2025-10-09 19-32-33" src="https://github.com/user-attachments/assets/bb9ed88d-b32e-4433-a086-7c283fd43fea" />  
