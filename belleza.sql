-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-02-2025 a las 21:45:48
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `belleza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento1`
--

CREATE TABLE `departamento1` (
  `id_producto` int(11) NOT NULL,
  `Labial1` varchar(50) DEFAULT NULL,
  `Labial2` varchar(50) DEFAULT NULL,
  `Labial3` varchar(50) DEFAULT NULL,
  `Pestañina1` varchar(50) DEFAULT NULL,
  `Pestañina2` varchar(50) DEFAULT NULL,
  `Pestañina3` varchar(50) DEFAULT NULL,
  `Base1` varchar(50) DEFAULT NULL,
  `Base2` varchar(50) DEFAULT NULL,
  `Base3` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `departamento1`
--

INSERT INTO `departamento1` (`id_producto`, `Labial1`, `Labial2`, `Labial3`, `Pestañina1`, `Pestañina2`, `Pestañina3`, `Base1`, `Base2`, `Base3`) VALUES
(1, '10000', '5000', '15000', '20000', '10000', '10000', '5000', '5000', '20000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamento1`
--
ALTER TABLE `departamento1`
  ADD PRIMARY KEY (`id_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `departamento1`
--
ALTER TABLE `departamento1`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
