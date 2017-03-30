-- phpMyAdmin SQL Dump
-- version 4.4.1.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost:3306
-- Généré le :  Jeu 30 Mars 2017 à 16:57
-- Version du serveur :  5.5.42
-- Version de PHP :  5.6.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `offreStage`
--

-- --------------------------------------------------------

--
-- Structure de la table `Admin`
--

CREATE TABLE `Admin` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mdp` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Admin`
--

INSERT INTO `Admin` (`id`, `nom`, `prenom`, `email`, `mdp`) VALUES
(3, 'Mohamed', 'Elambari', 'mohamed@gmail.com', 'mohamed'),
(4, 'Rado', 'Manavane', 'rado@gmail.com', 'rado');

-- --------------------------------------------------------

--
-- Structure de la table `Entreprise`
--

CREATE TABLE `Entreprise` (
  `id_entreprise` int(50) NOT NULL,
  `nom_entreprise` varchar(50) NOT NULL,
  `adresse_ville_entreprise` varchar(50) NOT NULL,
  `adresse_rue_entreprise` varchar(50) NOT NULL,
  `adresse_code_postal_entreprise` varchar(50) NOT NULL,
  `tel_entreprise` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `secteur_activite` varchar(50) NOT NULL,
  `mdp` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Entreprise`
--

INSERT INTO `Entreprise` (`id_entreprise`, `nom_entreprise`, `adresse_ville_entreprise`, `adresse_rue_entreprise`, `adresse_code_postal_entreprise`, `tel_entreprise`, `email`, `secteur_activite`, `mdp`) VALUES
(1, 'PSG', 'Evry', 'rue Champs-Elysées', '91000', '0145377489', 'psg@gmail.com', 'Informatique', 'psg'),
(2, 'OM', 'Paris', 'rue Saint-Germain', '75006', '0149354678', 'om@gmail.com', 'Aviation', 'om'),
(3, 'Barca', 'Tours', '4 allée de Luynes', '37100', '0247053133', 'barca@gmail.com', 'Comptabilité', 'barca'),
(4, 'Inter', 'Vitry sur seine', '13 rue arago', '94400 ', '0145377297', 'inter@gmail.fr', 'Realite virtuelle', 'inter'),
(5, 'AS MONACO', 'PARIS', 'RUE DE PARIS', '75018', '0198765434', 'asm@gmail.com', 'Ingénieurie', '');

-- --------------------------------------------------------

--
-- Structure de la table `Etudiant`
--

CREATE TABLE `Etudiant` (
  `id_etudiant` int(11) NOT NULL,
  `nom_etudiant` varchar(50) NOT NULL,
  `prenom_etudiant` varchar(50) NOT NULL,
  `date_de_naissance` varchar(50) NOT NULL,
  `niveau_etude` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mdp` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Etudiant`
--

INSERT INTO `Etudiant` (`id_etudiant`, `nom_etudiant`, `prenom_etudiant`, `date_de_naissance`, `niveau_etude`, `email`, `mdp`) VALUES
(1, 'Jérôme', 'Petit-Jean', '19/12/1988', 'MASTER', 'jerome@gmail.com', 'jerome'),
(2, 'Nicolas', 'Marchand', '16/07/1984', 'MASTER', 'nicolasm@gmail.com', 'nicolas'),
(3, 'Ahmed', 'Abal', '11/11/1989', 'BTS', 'Ahmeda@gmail.com', 'ahmed'),
(4, 'Anas', 'Khechab', '19/12/1990', 'L3', 'Anas@hotmail.com', 'anas'),
(5, 'Jules', 'César', '19/12/1998', 'L3', 'julesc@gmail.com', 'jules');

-- --------------------------------------------------------

--
-- Structure de la table `Offre`
--

CREATE TABLE `Offre` (
  `id_offre` int(50) NOT NULL,
  `libelle_offre` varchar(100) NOT NULL,
  `description_offre` text NOT NULL,
  `domaine_offre` varchar(50) NOT NULL,
  `date_debut_offre` varchar(50) NOT NULL,
  `duree_offre` varchar(11) NOT NULL,
  `chemin_offre` varchar(75) NOT NULL,
  `valide_offre` tinyint(1) NOT NULL DEFAULT '0',
  `id_entreprise` int(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Offre`
--

INSERT INTO `Offre` (`id_offre`, `libelle_offre`, `description_offre`, `domaine_offre`, `date_debut_offre`, `duree_offre`, `chemin_offre`, `valide_offre`, `id_entreprise`) VALUES
(1, 'Stage Developpeur Android', 'Développement d''android', 'Développement', '18/10/17', '6 semaines', 'Bureau/Offres', 0, 1);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `Entreprise`
--
ALTER TABLE `Entreprise`
  ADD PRIMARY KEY (`id_entreprise`);

--
-- Index pour la table `Etudiant`
--
ALTER TABLE `Etudiant`
  ADD PRIMARY KEY (`id_etudiant`),
  ADD UNIQUE KEY `adresse_mail` (`email`);

--
-- Index pour la table `Offre`
--
ALTER TABLE `Offre`
  ADD PRIMARY KEY (`id_offre`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `Admin`
--
ALTER TABLE `Admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `Entreprise`
--
ALTER TABLE `Entreprise`
  MODIFY `id_entreprise` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Etudiant`
--
ALTER TABLE `Etudiant`
  MODIFY `id_etudiant` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Offre`
--
ALTER TABLE `Offre`
  MODIFY `id_offre` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
