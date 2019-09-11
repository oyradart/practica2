-- Host: localhost:8889
-- Generation Time: Sep 11, 2019 at 04:47 PM
-- Server version: 5.7.26
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `unicoyespecial`
--

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nombre` char(30) DEFAULT NULL,
  `clave` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `clave`) VALUES
(1, 'daryo', 'hola'),
(2, 'otro', 'ajsd'),
(3, 'Lkmdf', 'sdkfknsd'),
(4, 'otro', 'nuevo'),
(5, 'otro', 'nuevo'),
(6, 'otro', 'nuevo'),
(7, 'ujdn', 'jdnfd'),
(8, 'ujdn', 'jdnfd'),
(9, 'ujdn', 'jdnfd'),
(10, 'kdf', 'kncvs');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
