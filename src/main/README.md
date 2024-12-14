# Prototype Design Pattern - Car Factory

Ce projet implémente le **design pattern Prototype** en Java pour gérer une série de voitures et leurs clones. L'idée principale est d'avoir des prototypes de voitures qui peuvent être clonées sans avoir à instancier de nouvelles classes à chaque fois.

## Structure du Projet

Le projet est structuré autour des éléments suivants :

- **Car** : Classe abstraite représentant une voiture. Chaque voiture a un modèle et une couleur. La classe définit une méthode abstraite `cloneCar()` pour cloner l'objet.
- **Hatchback**, **Sedan**, **SUV** : Classes concrètes représentant différents types de voitures.
- **CarFactory** : Classe qui crée des instances de voitures en fonction de leur modèle.
- **CarModel** : Enum définissant les modèles de voiture disponibles (`SEDAN`, `SUV`).
- **CarRegistry** : Registre des prototypes de voitures. Permet de récupérer des clones des voitures existantes.
- **CloneableCar** : Interface (non utilisée ici directement) définissant un comportement de clonage.
- **UnknownCarModelException** : Exception levée lorsqu'un modèle de voiture inconnu est demandé.

## Fonctionnalités

1. **Création de prototypes** : Le projet crée des prototypes de voitures (par exemple, `Sedan`, `SUV`) avec des couleurs par défaut.
2. **Clonage de voitures** : Une fois qu'un prototype est défini, il peut être cloné à l'aide de la méthode `cloneCar()`.
3. **Ajout dynamique de prototypes** : Le projet permet d'ajouter de nouveaux prototypes de voitures au registre dynamique via `CarRegistry`.
4. **Gestion des erreurs** : Une exception `UnknownCarModelException` est lancée lorsque vous tentez de cloner une voiture d'un modèle inconnu.

## Installation et Utilisation

### Prérequis

- JDK 11 ou supérieur installé sur votre machine.
- Un environnement de développement Java (comme IntelliJ IDEA, Eclipse, ou simplement la ligne de commande).

### Exécuter le projet

Clonez ce projet sur votre machine locale.
   ```bash

