-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Lun 24 Avril 2017 à 22:57
-- Version du serveur :  5.7.17-0ubuntu0.16.04.2
-- Version de PHP :  7.0.15-0ubuntu0.16.04.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `Testo`
--

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nom_admin` varchar(50) NOT NULL,
  `prenom_admin` varchar(50) NOT NULL,
  `email_admin` varchar(50) NOT NULL,
  `mdp_admin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `admin`
--

INSERT INTO `admin` (`id_admin`, `nom_admin`, `prenom_admin`, `email_admin`, `mdp_admin`) VALUES
(1, 'Marian', 'mohamed', 'marian@gmail.com', 'marian');

-- --------------------------------------------------------

--
-- Structure de la table `candidature`
--

CREATE TABLE `candidature` (
  `id_offre` int(50) NOT NULL,
  `id_etudiant` int(50) NOT NULL,
  `nom_entreprise` varchar(50) NOT NULL,
  `id_candidature` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `candidature`
--

INSERT INTO `candidature` (`id_offre`, `id_etudiant`, `nom_entreprise`, `id_candidature`) VALUES
(16, 9, 'sima', 6),
(17, 10, 'sima', 12),
(16, 10, 'sima', 13),
(17, 8, 'sima', 14);

-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

CREATE TABLE `entreprise` (
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
-- Contenu de la table `entreprise`
--

INSERT INTO `entreprise` (`nom_entreprise`, `adresse_ville_entreprise`, `adresse_rue_entreprise`, `adresse_code_postal_entreprise`, `tel_entreprise`, `email_entreprise`, `secteur_activite`, `mdp_entreprise`) VALUES
('sima', 'kfkfml', 'dddd', 'lkjjkf', '983863', 'sima@gmail.com', 'lol', 'sima');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `id_etudiant` int(11) NOT NULL,
  `nom_etudiant` varchar(50) NOT NULL,
  `prenom_etudiant` varchar(50) NOT NULL,
  `date_de_naissance` varchar(50) NOT NULL,
  `niveau_etude` varchar(50) NOT NULL,
  `email_etudiant` varchar(50) NOT NULL,
  `mdp_etudiant` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `etudiant` (`id_etudiant`, `nom_etudiant`, `prenom_etudiant`, `date_de_naissance`, `niveau_etude`, `email_etudiant`, `mdp_etudiant`) VALUES
(8, 'zaatout', 'hadad', '2871871', 'kjkd', 'zaatout', 'tout'),
(9, 'zack', 'lil', 'cc', 'dd', 'zak', 'zak'),
(10, 'zack', 'lil', 'cc', 'dd', 'val', 'val');

-- --------------------------------------------------------

--
-- Structure de la table `offre`
--

CREATE TABLE `offre` (
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `offre`
--

INSERT INTO `offre` (`id_offre`, `libelle_offre`, `description_offre`, `domaine_offre`, `date_debut_offre`, `duree_offre`, `chemin_offre`, `valide_offre`, `nom_entreprise`, `email_entreprise`, `adresse_ville_entreprise`) VALUES
(16, 'kolopi', 'developpeur', 'Développement', '19', '4mois', 'hdjd', 0, 'sima', 'sima@gmail.com', 'kfkfml'),
(17, 'kolopo', 'siiro dyal n3ass', 'Développement', '552', '4mois', 'hdjd', 0, 'sima', 'sima@gmail.com', 'kfkfml');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`),
  ADD UNIQUE KEY `id_admin` (`id_admin`);

--
-- Index pour la table `candidature`
--
ALTER TABLE `candidature`
  ADD PRIMARY KEY (`id_candidature`),
  ADD UNIQUE KEY `id_candidature` (`id_candidature`),
  ADD KEY `id_etudiant` (`id_etudiant`),
  ADD KEY `nom_entreprise_2` (`nom_entreprise`),
  ADD KEY `nom_entreprise_3` (`nom_entreprise`),
  ADD KEY `id_offre_2` (`id_offre`);

--
-- Index pour la table `entreprise`
--
ALTER TABLE `entreprise`
  ADD PRIMARY KEY (`nom_entreprise`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id_etudiant`),
  ADD UNIQUE KEY `adresse_mail` (`email_etudiant`);

--
-- Index pour la table `offre`
--
ALTER TABLE `offre`
  ADD PRIMARY KEY (`id_offre`),
  ADD KEY `nom_entreprise` (`nom_entreprise`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `candidature`
--
ALTER TABLE `candidature`
  MODIFY `id_candidature` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `id_etudiant` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT pour la table `offre`
--
ALTER TABLE `offre`
  MODIFY `id_offre` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `candidature`
--
ALTER TABLE `candidature`
  ADD CONSTRAINT `candidature_ibfk_1` FOREIGN KEY (`id_etudiant`) REFERENCES `etudiant` (`id_etudiant`),
  ADD CONSTRAINT `candidature_ibfk_2` FOREIGN KEY (`nom_entreprise`) REFERENCES `entreprise` (`nom_entreprise`),
  ADD CONSTRAINT `candidature_ibfk_3` FOREIGN KEY (`id_offre`) REFERENCES `offre` (`id_offre`);

--
-- Contraintes pour la table `offre`
--
ALTER TABLE `offre`
  ADD CONSTRAINT `offre_ibfk_1` FOREIGN KEY (`nom_entreprise`) REFERENCES `entreprise` (`nom_entreprise`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
