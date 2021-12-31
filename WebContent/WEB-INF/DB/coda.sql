-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : dim. 28 nov. 2021 à 00:00
-- Version du serveur :  10.4.18-MariaDB
-- Version de PHP : 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `coda`
--

-- --------------------------------------------------------

--
-- Structure de la table `bdcoda`
--

CREATE TABLE `bdcoda` (
  `num` int(100) NOT NULL,
  `date_commande` date NOT NULL,
  `quantite_commande` int(100) NOT NULL,
  `nom_fournisseur` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bdcoda`
--

INSERT INTO `bdcoda` (`num`, `date_commande`, `quantite_commande`, `nom_fournisseur`) VALUES
(1, '2021-11-02', 34, 'youssef'),
(2, '2021-11-05', 99, 'youssef');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `bdcoda`
--
ALTER TABLE `bdcoda`
  ADD PRIMARY KEY (`num`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `bdcoda`
--
ALTER TABLE `bdcoda`
  MODIFY `num` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
