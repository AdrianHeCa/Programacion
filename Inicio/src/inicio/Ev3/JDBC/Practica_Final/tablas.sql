--
-- Table structure for table `bodega`
--

CREATE TABLE `bodega` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `pais` varchar(50) NOT NULL,
  `id_enologo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bodega`
--

INSERT INTO `bodega` (`id`, `nombre`, `pais`, `id_enologo`) VALUES
(1, 'Viña Concha y Toro', 'Chile', 1),
(2, 'Bodega Norton', 'Argentina', 2),
(3, 'Château Margaux', 'Francia', 3),
(4, 'Frescobaldi', 'Italia', 4),
(5, 'Penfolds', 'Australia', 5);

-- --------------------------------------------------------

--
-- Table structure for table `enologo`
--

CREATE TABLE `enologo` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `enologo`
--

INSERT INTO `enologo` (`id`, `nombre`, `apellido1`, `apellido2`) VALUES
(1, 'Paco', 'Jones', 'Hemingway'),
(2, 'Aroa', 'Hernández', 'Caro'),
(3, 'Godofredo', 'Pía', 'Bello'),
(4, 'Reynalda', 'Rut', 'Sastre'),
(5, 'Benicio', 'Jaziel', 'Castillo');

-- --------------------------------------------------------

--
-- Table structure for table `uva`
--

CREATE TABLE `uva` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `uva`
--

INSERT INTO `uva` (`id`, `nombre`, `tipo`) VALUES
(1, 'Cabernet Sauvignon', 'Tinto'),
(2, 'Chardonnay', 'Blanco'),
(3, 'Merlot', 'Tinto'),
(4, 'Sauvignon Blanc', 'Blanco');

-- --------------------------------------------------------

--
-- Table structure for table `vino`
--

CREATE TABLE `vino` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `anyos` int(50) NOT NULL,
  `id_uva` int(11) NOT NULL,
  `id_bodega` int(11) NOT NULL,
  `calificacion` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vino`
--

INSERT INTO `vino` (`id`, `nombre`, `anyos`, `id_uva`, `id_bodega`, `calificacion`) VALUES
(1, 'Don Melchor', 10, 1, 1, 0.90),
(2, 'Catena Zapata Malbec', 8, 4, 1, 3.70),
(3, 'Château Margaux', 15, 2, 2, 5.45),
(4, 'Tignanello', 7, 3, 2, 9.56),
(5, 'Grange', 20, 4, 3, 0.83),
(6, 'Almaviva', 10, 1, 3, 7.15),
(7, 'Solaia', 9, 3, 4, 2.77),
(8, 'Penfolds Grange', 25, 2, 4, 4.86),
(9, 'Clos Apalta', 10, 3, 5, 0.29),
(10, 'Barolo Monfortino Riserva', 12, 1, 5, 0.07),
(11, 'Amon guz', 87, 3, 4, 5.49),
(12, 'Gabagool', 7, 2, 5, 0.37),
(13, 'Vino de caja to malo ni pa cocinar sirve', 0, 1, 1, 0.37),
(14, 'Vino cajoncio malardo aweonao por la chucha wn ctm', 0, 2, 1, 8.32),
(15, 'Aironou', 13, 2, 4, 8.06);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bodega`
--
ALTER TABLE `bodega`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_enologo` (`id_enologo`);

--
-- Indexes for table `enologo`
--
ALTER TABLE `enologo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `uva`
--
ALTER TABLE `uva`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vino`
--
ALTER TABLE `vino`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_uva` (`id_uva`),
  ADD KEY `id_bodega` (`id_bodega`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bodega`
--
ALTER TABLE `bodega`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `enologo`
--
ALTER TABLE `enologo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `uva`
--
ALTER TABLE `uva`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `vino`
--
ALTER TABLE `vino`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;