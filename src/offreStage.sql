-- phpMyAdmin SQL Dump
-- version 4.4.1.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost:3306
-- Généré le :  Ven 07 Avril 2017 à 11:42
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
  `id_admin` int(11) NOT NULL,
  `nom_admin` varchar(50) NOT NULL,
  `prenom_admin` varchar(50) NOT NULL,
  `email_admin` varchar(50) NOT NULL,
  `mdp_admin` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Admin`
--

INSERT INTO `Admin` (`id_admin`, `nom_admin`, `prenom_admin`, `email_admin`, `mdp_admin`) VALUES
(3, 'Mohamed', 'Elambari', 'mohamed@gmail.com', 'mohamed'),
(4, 'Rado', 'Manavane', 'rado@gmail.com', 'rado');

-- --------------------------------------------------------

--
-- Structure de la table `Entreprise`
--

CREATE TABLE `Entreprise` (
  `nom_entreprise` varchar(50) NOT NULL,
  `adresse_ville_entreprise` varchar(50) NOT NULL,
  `adresse_rue_entreprise` varchar(50) NOT NULL,
  `adresse_code_postal_entreprise` varchar(50) NOT NULL,
  `tel_entreprise` varchar(50) NOT NULL,
  `email_entreprise` varchar(50) NOT NULL,
  `secteur_activite` varchar(50) NOT NULL,
  `mdp_entreprise` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Entreprise`
--

INSERT INTO `Entreprise` (`nom_entreprise`, `adresse_ville_entreprise`, `adresse_rue_entreprise`, `adresse_code_postal_entreprise`, `tel_entreprise`, `email_entreprise`, `secteur_activite`, `mdp_entreprise`) VALUES
('Cora', 'Boussy-Saint-Antoine', 'place de la Liberté', '91800', '0169004536', 'cora@gmail.com', 'Grande distribution', 'cora'),
('EasyDev', 'Bagneux', '54 Avenue Albert-Petit', '92200', '0167564323', 'eaysydev@gmail.com', 'Conception logiciel', 'easydev'),
('Inter', 'Vitry sur seine', '13 rue arago', '94400 ', '0145377297', 'inter@gmail.fr', 'Realite virtuelle', 'inter'),
('La Pomme', 'Epinay sous senart', '6 rue Johann Strauss', '91860', '0169006789', 'lapomme.net', 'SSII', 'lapomme'),
('Nintendo', 'Saint-Denis', '78 Avenue Président Wilson', '93100', '0143231567', 'nintendo@gmail.com', 'Jeux vidéo', 'nintendo'),
('OM', 'Paris', 'rue Saint-Germain', '75006', '0149354678', 'om@gmail.com', 'Aviation', 'om'),
('SEGA', 'Villetaneuse', '73 Avenue du Gord', '93300 ', '0143567892', 'sega@gmail.com', 'Jeux vidéo', 'sega'),
('SuperDev', 'Boussy Saint Antoine', '4 rue de Molière', '91800', '0169003133', 'superdev@gmail.com', 'Conception Logiciel', 'superdev');

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
  `email_etudiant` varchar(50) NOT NULL,
  `mdp_etudiant` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Etudiant`
--

INSERT INTO `Etudiant` (`id_etudiant`, `nom_etudiant`, `prenom_etudiant`, `date_de_naissance`, `niveau_etude`, `email_etudiant`, `mdp_etudiant`) VALUES
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
  `nom_entreprise` varchar(50) NOT NULL,
  `email_entreprise` varchar(50) NOT NULL,
  `adresse_ville_entreprise` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `Offre`
--

INSERT INTO `Offre` (`id_offre`, `libelle_offre`, `description_offre`, `domaine_offre`, `date_debut_offre`, `duree_offre`, `chemin_offre`, `valide_offre`, `nom_entreprise`, `email_entreprise`, `adresse_ville_entreprise`) VALUES
(1, 'Dev C#', 'participer au développement d''apps en C#', 'Développement', '01/01/18', '6 semaines', 'Bureau', 0, 'PSG', 'asm@gmail.com', 'PARIS'),
(3, 'Analyste de données', 'Langage R et big Data', 'Big Data', '01/12/17', '7 semaines', 'Bureau', 0, 'OM', 'superdev@gmail.com', 'Boussy Saint Antoine '),
(5, 'SUPER DEV', 'CONNAITRE SQL', 'Développement', '15/10/17', '7 ', 'BUREAU', 0, 'PSG', 'asm@gmail.com', 'PARIS'),
(7, 'Stagiaire developpeur JAVA objet connecté', 'Developper des applications connectés à des objets', 'Objets connectés', '05/05/17', '6 semaines', 'Bureau', 0, 'OM', 'superdev@gmail.com', 'Boussy Saint Antoine '),
(8, 'Stage dev WEB', 'HTML CSS JS', 'Développement', '20/01/2017', '7 SEMAINES', 'BUREAU', 0, 'Barca', 'superdev@gmail.com', 'Boussy Saint Antoine'),
(9, 'dev c#', 'pro de c#', 'Développement', '01/01/17', '4 semaines', 'bureau/', 0, 'OM', 'superdev@gmail.com', 'Boussy Saint Antoine');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Index pour la table `Entreprise`
--
ALTER TABLE `Entreprise`
  ADD PRIMARY KEY (`nom_entreprise`);

--
-- Index pour la table `Etudiant`
--
ALTER TABLE `Etudiant`
  ADD PRIMARY KEY (`id_etudiant`),
  ADD UNIQUE KEY `adresse_mail` (`email_etudiant`);

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
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `Etudiant`
--
ALTER TABLE `Etudiant`
  MODIFY `id_etudiant` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `Offre`
--
ALTER TABLE `Offre`
  MODIFY `id_offre` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;