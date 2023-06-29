-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 09, 2022 at 05:44 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan_obat`
--

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(11) NOT NULL,
  `nama_kategori` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama_kategori`) VALUES
(1, 'kapsul'),
(2, 'sirup'),
(3, 'tablet');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` int(11) NOT NULL,
  `id_kategori` varchar(11) NOT NULL,
  `id_suplier` varchar(11) NOT NULL,
  `nama_obat` varchar(255) NOT NULL,
  `harga` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `id_kategori`, `id_suplier`, `nama_obat`, `harga`) VALUES
(1, '1 ', '1 ', 'paracetamol', 25000),
(2, '3 ', '2 ', 'promaag', 15000),
(3, '2 ', '2 ', 'mylanta', 20000),
(4, '1 ', '3 ', 'diapet', 5000),
(5, '2 ', '1 ', 'ibuprofen', 22500);

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `id_suplier` int(11) NOT NULL,
  `nama_suplier` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `no_telp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suplier`
--

INSERT INTO `suplier` (`id_suplier`, `nama_suplier`, `alamat`, `no_telp`) VALUES
(1, 'bila', 'malang', '08923457911'),
(2, 'nadira', 'surabaya', '08567844356'),
(3, 'bill', 'sidoarjo', '08156721678');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_obat` int(11) NOT NULL,
  `jumlah` int(20) NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_obat`, `jumlah`, `total`) VALUES
(1, 1, 4, 100000),
(2, 2, 5, 75000),
(3, 3, 3, 60000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(20) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `nim` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama`, `nim`, `email`, `username`, `password`) VALUES
(1, 'Sabina Okta Restati', '213140707111015', 'sabinaokta@student.ub.ac.id', 'sabina', '123'),
(2, 'Mochammad Agatha Rahmawan Putra', '213140714111032', 'mochagatha@student.ub.ac.id', 'agatha', '123'),
(3, 'Nadia', '213140714111064 ', 'nadia@student.ub.ac.id', 'nadia', '123'),
(4, 'Desyntha Hesty Fitria', '213140714111115', 'desyntha@student.ub.ac.id', 'desyntha', '123'),
(5, 'Raudya Rifky Adzikra', '213140714111131', 'raudyarifky@student.ub.ac.id', 'rifky', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`),
  ADD KEY `id_kategori` (`id_kategori`),
  ADD KEY `id_suplier` (`id_suplier`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`id_suplier`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_obat` (`id_obat`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `id_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11111112;

--
-- AUTO_INCREMENT for table `suplier`
--
ALTER TABLE `suplier`
  MODIFY `id_suplier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7778;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33334;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
