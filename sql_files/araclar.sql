-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 17 Oca 2022, 01:47:02
-- Sunucu sürümü: 10.4.22-MariaDB
-- PHP Sürümü: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `arac_kiralama_sistemi`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `araclar`
--

CREATE TABLE `araclar` (
  `id` int(11) NOT NULL,
  `Sahibi` text COLLATE utf8_turkish_ci NOT NULL,
  `GünlükFiyat_TL` int(11) NOT NULL,
  `Şehir` text COLLATE utf8_turkish_ci NOT NULL,
  `MarkaModel` text COLLATE utf8_turkish_ci NOT NULL,
  `VitesTipi` text COLLATE utf8_turkish_ci NOT NULL,
  `YakıtTipi` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `araclar`
--

INSERT INTO `araclar` (`id`, `Sahibi`, `GünlükFiyat_TL`, `Şehir`, `MarkaModel`, `VitesTipi`, `YakıtTipi`) VALUES
(1, '', 350, 'Ankara', 'Hyundai i20', 'Otomatik', 'Benzin'),
(2, '', 300, 'İstanbul', 'Hyundai Accent Blue', 'Manuel', 'Dizel'),
(3, '', 400, 'Bursa', 'Peugeot 208', 'Otomatik', 'LPG'),
(4, 'musteri5', 500, 'Eskişehir', 'Fiat Egea', 'Manuel', 'Benzin'),
(5, 'kadiruzun', 320, 'Balıkesir', 'VW Polo', 'Manuel', 'Benzin'),
(6, '', 310, 'Ankara', 'Renault Clio HB', 'Otomatik', 'Dizel'),
(7, '', 350, 'İstanbul', 'Renault Clio Symbol', 'Otomatik', 'LPG'),
(8, '', 410, 'Bursa', 'Citroen C-Elysee', 'Otomatik', 'Dizel'),
(9, '', 350, 'Eskişehir', 'Ford Torneo Courier', 'Manuel', 'Benzin'),
(10, 'musteri3', 350, 'Ankara', 'Hyundai i20', 'Otomatik', 'Benzin'),
(11, 'musteri5', 300, 'İstanbul', 'Hyundai Accent Blue', 'Manuel', 'Dizel'),
(12, '', 400, 'Bursa', 'Peugeot 208', 'Otomatik', 'LPG'),
(13, 'kadiruzun', 500, 'Eskişehir', 'Fiat Egea', 'Manuel', 'Benzin'),
(14, 'musteri5', 320, 'Balıkesir', 'VW Polo', 'Manuel', 'Benzin'),
(15, 'kadiruzun', 310, 'Ankara', 'Renault Clio HB', 'Otomatik', 'Dizel'),
(16, '', 350, 'İstanbul', 'Renault Clio Symbol', 'Otomatik', 'LPG'),
(17, '', 410, 'Bursa', 'Citroen C-Elysee', 'Otomatik', 'Dizel'),
(18, 'kadiruzun', 350, 'Eskişehir', 'Ford Torneo Courier', 'Manuel', 'Benzin'),
(25, 'musteri3', 350, 'Ankara', 'Hyundai i20', 'Otomatik', 'Benzin'),
(26, '', 350, 'Bursa', 'Mitsubishi Space', 'Otomatik', 'LPG'),
(27, '', 300, 'Eskişehir', 'Suzuki Swift Hybrid', 'Manuel', 'Benzin'),
(28, '', 400, 'Balıkesir', 'Kia Picanto', 'Manuel', 'Dizel'),
(29, '', 500, 'Bursa', 'Hyundai i20', 'Otomatik', 'LPG'),
(30, 'musteri3', 320, 'İstanbul', 'Hyundai Accent Blue', 'Manuel', 'Benzin'),
(31, '', 310, 'izmir', 'Peugeot 208', 'Otomatik', 'Dizel'),
(32, '', 350, 'Antalya', 'Fiat Egea', 'Manuel', 'LPG'),
(33, '', 410, 'Balıkesir', 'VW Polo', 'Otomatik', 'Benzin'),
(34, '', 350, 'Ankara', 'Renault Clio HB', 'Manuel', 'Dizel'),
(35, '', 300, 'İstanbul', 'Renault Clio Symbol', 'Otomatik', 'LPG'),
(36, '', 400, 'Bursa', 'Citroen C-Elysee', 'Manuel', 'LPG'),
(37, '', 500, 'Eskişehir', 'Ford Torneo Courier', 'Otomatik', 'Benzin'),
(38, '', 320, 'Balıkesir', 'Fiat Linea', 'Manuel', 'Dizel'),
(39, '', 310, 'Ankara', 'Peugeot 308', 'Manuel', 'LPG'),
(40, '', 350, 'Ankara', 'Opel Corsa', 'Otomatik', 'Benzin'),
(41, '', 410, 'İstanbul', 'Hyundai i20', 'Otomatik', 'Dizel'),
(42, '', 350, 'Bursa', 'Hyundai Accent Blue', 'Manuel', 'LPG'),
(43, '', 300, 'Eskişehir', 'Peugeot 208', 'Otomatik', 'LPG'),
(44, '', 400, 'Balıkesir', 'Fiat Egea', 'Manuel', 'Benzin'),
(45, '', 500, 'Ankara', 'VW Polo', 'Otomatik', 'Dizel'),
(46, '', 320, 'İstanbul', 'Renault Clio HB', 'Manuel', 'LPG'),
(47, '', 310, 'Ankara', 'Renault Clio Symbol', 'Manuel', 'Benzin'),
(48, '', 350, 'İstanbul', 'Citroen C-Elysee', 'Otomatik', 'Dizel'),
(49, '', 410, 'Bursa', 'Ford Torneo Courier', 'Otomatik', 'LPG'),
(50, '', 350, 'Eskişehir', 'Hyundai i20', 'Otomatik', 'Benzin'),
(51, '', 300, 'Balıkesir', 'Hyundai Accent Blue', 'Manuel', 'Dizel'),
(52, '', 400, 'Ankara', 'Peugeot 208', 'Otomatik', 'LPG'),
(53, '', 500, 'İstanbul', 'Fiat Egea', 'Otomatik', 'Benzin'),
(54, '', 320, 'Bursa', 'VW Polo', 'Otomatik', 'Dizel'),
(55, '', 310, 'Eskişehir', 'Renault Clio HB', 'Manuel', 'Benzin'),
(56, '', 350, 'Balıkesir', 'Renault Clio Symbol', 'Otomatik', 'Dizel'),
(57, '', 410, 'Bursa', 'Citroen C-Elysee', 'Manuel', 'LPG'),
(58, '', 350, 'Ankara', 'Ford Torneo Courier', 'Otomatik', 'Dizel'),
(59, '', 300, 'İstanbul', 'Hyundai i20', 'Manuel', 'Benzin'),
(60, '', 400, 'Bursa', 'Hyundai Accent Blue', 'Manuel', 'Dizel'),
(61, '', 500, 'Ankara', 'Peugeot 208', 'Otomatik', 'LPG'),
(62, '', 320, 'İstanbul', 'Fiat Egea', 'Otomatik', 'Benzin'),
(63, '', 310, 'Bursa', 'VW Polo', 'Manuel', 'Dizel'),
(64, '', 350, 'Eskişehir', 'Renault Clio HB', 'Otomatik', 'Benzin'),
(65, '', 410, 'Balıkesir', 'Renault Clio Symbol', 'Manuel', 'Dizel'),
(66, '', 350, 'Ankara', 'Citroen C-Elysee', 'Otomatik', 'LPG'),
(67, '', 300, 'İstanbul', 'Ford Torneo Courier', 'Manuel', 'Benzin'),
(68, '', 400, 'Bursa', 'Fiat Linea', 'Otomatik', 'Dizel'),
(69, '', 500, 'Eskişehir', 'Peugeot 308', 'Manuel', 'LPG'),
(70, '', 320, 'Balıkesir', 'Opel Corsa', 'Manuel', 'Benzin'),
(71, '', 310, 'Bursa', 'Peugeot Partner Tepee', 'Otomatik', 'Dizel'),
(72, '', 350, 'Ankara', 'Citroen Berlingo', 'Manuel', 'LPG'),
(73, '', 410, 'İstanbul', 'Citroen C3', 'Otomatik', 'LPG'),
(74, '', 410, 'Bursa', 'Fiat Doblo', 'Manuel', 'Benzin'),
(75, '', 350, 'Eskişehir', 'Mitsubishi Space', 'Manuel', 'Dizel'),
(76, '', 300, 'Balıkesir', 'Suzuki Swift Hybrid', 'Otomatik', 'LPG'),
(77, '', 400, 'Ankara', 'Kia Picanto', 'Manuel', 'Benzin'),
(78, '', 500, 'İstanbul', 'Peugeot Partner Tepee', 'Otomatik', 'Dizel'),
(79, '', 320, 'Bursa', 'Hyundai i20', 'Manuel', 'LPG'),
(80, '', 310, 'Eskişehir', 'Hyundai Accent Blue', 'Otomatik', 'Benzin'),
(81, '', 350, 'Balıkesir', 'Peugeot 208', 'Manuel', 'Dizel'),
(82, '', 410, 'Bursa', 'Fiat Egea', 'Otomatik', 'LPG'),
(83, '', 350, 'İstanbul', 'VW Polo', 'Otomatik', 'LPG'),
(84, '', 300, 'izmir', 'Renault Clio HB', 'Manuel', 'Benzin'),
(85, '', 400, 'Antalya', 'Renault Clio Symbol', 'Otomatik', 'Dizel'),
(86, '', 500, 'Ankara', 'Citroen C-Elysee', 'Manuel', 'LPG'),
(87, '', 320, 'İstanbul', 'Ford Torneo Courier', 'Manuel', 'LPG'),
(88, '', 310, 'Bursa', 'Hyundai i20', 'Otomatik', 'Benzin'),
(89, '', 350, 'Ankara', 'Hyundai Accent Blue', 'Otomatik', 'Dizel'),
(90, '', 410, 'İstanbul', 'Peugeot 208', 'Otomatik', 'LPG'),
(91, '', 350, 'Bursa', 'Fiat Egea', 'Manuel', 'LPG'),
(92, '', 300, 'Eskişehir', 'VW Polo', 'Otomatik', 'Benzin'),
(93, '', 400, 'Balıkesir', 'Renault Clio HB', 'Manuel', 'Dizel'),
(94, '', 500, 'Ankara', 'Hyundai i20', 'Otomatik', 'LPG'),
(95, '', 320, 'Ankara', 'Hyundai Accent Blue', 'Manuel', 'LPG'),
(96, '', 310, 'İstanbul', 'Peugeot 208', 'Otomatik', 'Benzin'),
(97, '', 350, 'Bursa', 'Fiat Egea', 'Manuel', 'Dizel'),
(98, '', 410, 'Eskişehir', 'VW Polo', 'Otomatik', 'LPG'),
(99, '', 350, 'Balıkesir', 'Renault Clio HB', 'Manuel', 'Benzin'),
(100, '', 300, 'Ankara', 'Renault Clio Symbol', 'Otomatik', 'Benzin'),
(101, '', 400, 'İstanbul', 'Citroen C-Elysee', 'Manuel', 'Benzin'),
(102, '', 500, 'Bursa', 'Ford Torneo Courier', 'Manuel', 'Dizel'),
(103, '', 320, 'Eskişehir', 'Fiat Linea', 'Otomatik', 'LPG'),
(104, '', 310, 'Balıkesir', 'Peugeot 308', 'Otomatik', 'Dizel'),
(105, '', 350, 'Bursa', 'Opel Corsa', 'Manuel', 'LPG'),
(106, '', 410, 'İstanbul', 'Peugeot Partner Tepee', 'Otomatik', 'Benzin'),
(107, '', 350, 'izmir', 'Citroen Berlingo', 'Manuel', 'Dizel'),
(108, '', 300, 'Antalya', 'Citroen C3', 'Manuel', 'LPG'),
(109, '', 400, 'Ankara', 'Fiat Doblo', 'Otomatik', 'LPG'),
(110, '', 1000, 'İstanbul', 'Tesla Model X', 'Otomatik', 'Elektrik'),
(111, '', 1200, 'İstanbul', 'Tesla Model Y', 'Otomatik', 'Elektrik'),
(112, '', 1500, 'İstanbul', 'Mercedes E200 ', 'Otomatik', 'Dizel'),
(113, '', 1000, 'Ankara', 'Range Rover Sport', 'Otomatik', 'Dizel'),
(114, '', 1000, 'İstanbul', 'BMW', 'Otomatik', 'Dizel');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `araclar`
--
ALTER TABLE `araclar`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `araclar`
--
ALTER TABLE `araclar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
