# Galactic Minimal — prototype WFF

Cadran Wear OS expérimental pour Galaxy Watch 7 : heure numérique, date, batterie, noir AMOLED, texte #C8DCE1. Aucun titre ni logo sur le cadran.

Tous les éléments textuels demandent `SYNC_TO_DEVICE`. Cela **ne garantit pas** que la police Aurebesh modifiée via zFont 3 soit utilisée par le moteur de cadran.

## Compilation sur GitHub
1. Créer un dépôt GitHub **privé** `galactic-minimal`.
2. Décompresser ce ZIP puis téléverser **son contenu** à la racine du dépôt, y compris `.github/workflows/build.yml`.
3. Ouvrir l'onglet Actions, workflow **Build Watch Face APK**, puis **Run workflow**. Le workflow s'exécute aussi à chaque push sur `main`.
4. Ouvrir l'exécution terminée et télécharger l'artifact `galactic-minimal-debug-apk`.
5. Extraire l'APK et l'installer sur la montre avec Bugjaeger en mode débogage sans fil.

## Statut
Source prototype non compilée ni validée sur une montre. En cas d'échec du workflow, transmettre les dernières lignes du journal de compilation pour correction. Le debug APK n'est pas signé pour la distribution publique.
