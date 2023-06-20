-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: b6iutlu3twu0e5wktftd-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 20, 2023 at 02:24 AM
-- Server version: 8.0.22-13
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `b6iutlu3twu0e5wktftd`
--

-- --------------------------------------------------------

--
-- Table structure for table `acerca_de`
--

CREATE TABLE `acerca_de` (
  `id` bigint NOT NULL,
  `descripcion` text,
  `id_persona` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acerca_de`
--

INSERT INTO `acerca_de` (`id`, `descripcion`, `id_persona`) VALUES
(1, 'Ingeniero informático con más de diez años de experiencia en IT y más de cuatro años trabajando en desarrollo de software. Actualmente me desempeño como desarrollador en VENG S.A en el proyecto SAOCOM. Durante en mi carrera, me desempeñé en diferentes roles, como desarrollador full-stack, desarrollador back-end y administrador de sistemas. Me considero una persona proactiva y positiva con fuertes habilidades organizativas y de resolución de problemas. Además, tengo la versatilidad para trabajar tanto en equipo como de forma independiente con liderazgo.', 1);

-- --------------------------------------------------------

--
-- Table structure for table `acerca_de_seq`
--

CREATE TABLE `acerca_de_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `acerca_de_seq`
--

INSERT INTO `acerca_de_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `conocimientos_aptitudes`
--

CREATE TABLE `conocimientos_aptitudes` (
  `id` bigint NOT NULL,
  `descripcion` text,
  `id_persona` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `conocimientos_aptitudes`
--

INSERT INTO `conocimientos_aptitudes` (`id`, `descripcion`, `id_persona`) VALUES
(1, 'Conocimientos de nuevas tecnologías', 1),
(2, 'Armado y reparación de PC', 1),
(3, 'Redes informáticas', 1),
(4, 'Mantenimiento y Administrador de Windows Server', 1),
(5, 'Mantenimiento y Administrador de Linux Server', 1),
(6, 'Mantenimiento y Administración de Computadoras - Virtual Machine', 1),
(7, 'Mantenimiento y Administrador en Telecomunicaciones', 1),
(8, 'Sistema de Virtualización', 1),
(9, 'Sistemas Operativos utilizados: Ubuntu, Kubuntu, Debian, Gentoo, Windows Server', 1),
(10, 'Lenguajes de Scripting: Java Script, PHP, Python, PERL, Ruby, Bash', 1),
(11, 'Lenguajes de Programación: Java, C, C++, C#, MatLab, Asembler, TypeScrypt, XML/HTML', 1),
(12, 'Lenguajes de hojas de estilo: CSS', 1),
(13, 'Framework: Laravel, Angular, Bootstrap, Spring Boot', 1),
(14, 'Stack: LAMP - .NET', 1),
(15, 'Administración de base de datos: MySQL - MongoDB - PostgreSQL - Microsoft SQL Server', 1);

-- --------------------------------------------------------

--
-- Table structure for table `conocimientos_aptitudes_seq`
--

CREATE TABLE `conocimientos_aptitudes_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `conocimientos_aptitudes_seq`
--

INSERT INTO `conocimientos_aptitudes_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `cursos`
--

CREATE TABLE `cursos` (
  `id` bigint NOT NULL,
  `entidad` varchar(255) DEFAULT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `id_persona` int NOT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cursos`
--

INSERT INTO `cursos` (`id`, `entidad`, `fecha`, `id_persona`, `titulo`) VALUES
(1, 'Centro de Computos', '1998', 1, 'Operador de PC'),
(2, 'TechIT', '2005', 1, 'Armado y reparación de PC'),
(3, 'DUI UNC', '2010', 1, 'Operador de Linux'),
(4, 'Technology', '2005', 1, 'Programación Java - J2SE (Nivel I)'),
(5, 'Cisco Networking Academy de la UNC (Universidad Nacional de Cordoba)', '2005', 1, 'CCNA Exploration completo (CCNA 1, CCNA 2, CCNA 3 y CCNA 4)'),
(6, 'Congreso Nacional de Ingeniería Informática', '2015', 1, 'Congreso Conaiisi'),
(7, 'Universidad Tecnologica Nacional, Facultad Regional de Cordoba', '2016', 1, 'Diplomatura Superior: Administración de Redes de Computadoras'),
(8, 'Cisco Networking Academy', '2016', 1, 'Introduction to the Internet of Everything, Online'),
(9, 'Universidad Católica de Córdoba', '2016', 1, 'Diplomatura en Ciberseguridad (Cybersecurity Essentials, CCNA Cybersecurity Operations)'),
(10, 'Instituto de Altos Estudios Espaciales Mario Gulich (CONAE/UNC)', '2020', 1, 'Procesamiento Base de Imágenes Satelitales con Python'),
(11, 'Udemy platform, (CONAE)', '2022', 1, 'Apache Airflow'),
(12, 'Technology', '2005', 1, 'Programación Java - J2SE (Nivel I)'),
(13, 'Ministerio de Economía y la Cámara Empresarial de Software y Servicios Informáticos (CESSI)', '2022', 1, 'Plan Argentina Programa (#SeProgramar, primera etapa)'),
(14, 'Ministerio de Economía y la Cámara Empresarial de Software y Servicios Informáticos (CESSI)', '2023', 1, 'Plan Argentina Programa (#YoProgramo, segunda etapa)');

-- --------------------------------------------------------

--
-- Table structure for table `cursos_seq`
--

CREATE TABLE `cursos_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cursos_seq`
--

INSERT INTO `cursos_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `direccion`
--

CREATE TABLE `direccion` (
  `id` bigint NOT NULL,
  `calle` varchar(255) DEFAULT NULL,
  `dpto` varchar(255) DEFAULT NULL,
  `id_localidad` int NOT NULL,
  `numero` int NOT NULL,
  `piso` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `direccion`
--

INSERT INTO `direccion` (`id`, `calle`, `dpto`, `id_localidad`, `numero`, `piso`) VALUES
(1, 'calle 5, Gran Argentina', '', 1, 44, 0),
(2, 'Ruta C 45 - Km 8', '', 2, 0, 0),
(3, 'JOSE HENRY - OF 1', '', 1, 5275, 2),
(4, 'Av. Velez Sarsfield', '', 1, 299, 0),
(5, 'Valparaíso y Becar Varela', '', 1, 299, 0);

-- --------------------------------------------------------

--
-- Table structure for table `direccion_seq`
--

CREATE TABLE `direccion_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `direccion_seq`
--

INSERT INTO `direccion_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint NOT NULL,
  `duracion` varchar(255) DEFAULT NULL,
  `entidad` varchar(255) DEFAULT NULL,
  `id_persona` int NOT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `duracion`, `entidad`, `id_persona`, `titulo`) VALUES
(1, '6', 'Colegio San Francisco de Asís', 1, 'Primario Completo'),
(2, '5', 'Colegio San Francisco de Asís', 1, 'Secundario Completo - Bachiller'),
(3, '10', 'Universidad Nacional de Córdoba - FCEFyN', 1, 'Ingeniería en Computación'),
(4, '2', 'Universidad Tecnológica Nacional - FRC', 1, 'Técnico Superior en Programación'),
(5, '2', 'Universidad Nacional de Córdoba - Facultad de Lenguas', 1, 'Inglés Básico y Técnico I');

-- --------------------------------------------------------

--
-- Table structure for table `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id` bigint NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `id_direccion` int NOT NULL,
  `id_persona` int NOT NULL,
  `jornada` varchar(255) DEFAULT NULL,
  `tiempo` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id`, `cargo`, `descripcion`, `id_direccion`, `id_persona`, `jornada`, `tiempo`, `titulo`) VALUES
(1, 'Developer/Testing', '', 2, 1, 'completa', '2020 - actulidad', 'VENG S.A (CONAE)'),
(2, 'IT/Infrastructure Administrator', '', 2, 1, 'completa', '2015 - 2020', 'VENG S.A (CONAE)'),
(3, 'System Administrator', '', 3, 1, 'completa', '2010 - 2015', 'Communication Partner S.R.L'),
(4, 'System Administrator', '', 4, 1, 'media', '2010 - 2011', 'Laboratorio de Computación - UNC'),
(5, 'Freelancer', '', 1, 1, 'completa', '2010 - 2010', 'Trabajo en programación Web para consultora'),
(6, 'Technician Support', '', 4, 1, 'media', '2008', 'I.S.I.T - UNC'),
(7, 'Technician Support', '', 5, 1, 'completa', '2005 - 2006', 'Ciber');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia_seq`
--

CREATE TABLE `experiencia_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia_seq`
--

INSERT INTO `experiencia_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `localidad`
--

CREATE TABLE `localidad` (
  `id` bigint NOT NULL,
  `id_provincia` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `localidad`
--

INSERT INTO `localidad` (`id`, `id_provincia`, `nombre`) VALUES
(1, 1, 'Capital'),
(2, 1, 'Falda del Cañete');

-- --------------------------------------------------------

--
-- Table structure for table `localidad_seq`
--

CREATE TABLE `localidad_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `localidad_seq`
--

INSERT INTO `localidad_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` bigint NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `dni` int DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_nac` varchar(255) DEFAULT NULL,
  `id_direccion` int NOT NULL,
  `id_profesion` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tel` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `apellido`, `dni`, `email`, `fecha_nac`, `id_direccion`, `id_profesion`, `nombre`, `tel`) VALUES
(1, 'Herrera', 0, 'patriciaherrera.ic@gmail.com', '20/08/1983', 0, 0, 'Patricia', '156563937');

-- --------------------------------------------------------

--
-- Table structure for table `persona_seq`
--

CREATE TABLE `persona_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona_seq`
--

INSERT INTO `persona_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `profesion`
--

CREATE TABLE `profesion` (
  `id` bigint NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `profesion`
--

INSERT INTO `profesion` (`id`, `nombre`) VALUES
(1, 'Ing. en Computacion'),
(2, 'Técnico Superior en Programación');

-- --------------------------------------------------------

--
-- Table structure for table `profesion_seq`
--

CREATE TABLE `profesion_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `profesion_seq`
--

INSERT INTO `profesion_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `provincia`
--

CREATE TABLE `provincia` (
  `id` bigint NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `provincia`
--

INSERT INTO `provincia` (`id`, `nombre`) VALUES
(1, 'Córdoba'),
(2, 'Buenos Aires'),
(3, 'Catamarca'),
(4, 'Chaco'),
(5, 'Chubut'),
(6, 'Corrientes'),
(7, 'Entre Ríos'),
(8, 'Formosa'),
(9, 'Jujuy'),
(10, 'La Pampa'),
(11, 'La Rioja'),
(12, 'Mendoza'),
(13, 'Misiones'),
(14, 'Neuquén'),
(15, 'Río Negro'),
(16, 'Salta'),
(17, 'San Juan'),
(18, 'San Luis'),
(19, 'Santa Cruz'),
(20, 'Santa Fe'),
(21, 'Santiago del Estero'),
(22, 'Tierra del Fuego'),
(23, 'Tucumán');

-- --------------------------------------------------------

--
-- Table structure for table `provincia_seq`
--

CREATE TABLE `provincia_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `provincia_seq`
--

INSERT INTO `provincia_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `id` bigint NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `id_persona` int NOT NULL,
  `link` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`id`, `descripcion`, `fecha`, `id_persona`, `link`, `titulo`) VALUES
(1, 'Sistema de Monitoreo Cable Modem', '2012-10-12', 1, '', 'CM Monitor'),
(2, 'Sistema Administrador de la RED', '2016-08-04', 1, '', 'System Manager LIE'),
(3, 'Sistema de Alarma para notificar', '2017-01-15', 1, '', 'Alarm System LIE'),
(4, 'Sistema Administrador de las actividades de los paneles y alas en la antena SAR ', '2017-05-20', 1, '', 'System Manager LIE SAR'),
(5, 'Procesamiento de datos, generación de reportes automáticos de monitoreo', '2020-03-01 - actualidad', 1, '', 'SECF (SAR Engineering Calibration Facility)'),
(6, 'Aplicacion web full stack', '2023-09-01 - actualidad', 1, '', 'Portfolio Web Full Stack');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos_seq`
--

CREATE TABLE `proyectos_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos_seq`
--

INSERT INTO `proyectos_seq` (`next_val`) VALUES
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acerca_de`
--
ALTER TABLE `acerca_de`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `conocimientos_aptitudes`
--
ALTER TABLE `conocimientos_aptitudes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `localidad`
--
ALTER TABLE `localidad`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `profesion`
--
ALTER TABLE `profesion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
