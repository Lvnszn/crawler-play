DROP TABLE IF EXISTS `pc_url`;

CREATE TABLE `pc_url` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(256) NOT NULL,
  `title` varchar(256) NOT NULL,
  `main_url` varchar(256),
  `type` varchar(256),
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=134 DEFAULT CHARSET=utf8;