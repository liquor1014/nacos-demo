CREATE TABLE `user` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `name` varchar(64) DEFAULT NULL,
                        `age` int DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `user`(`id`, `name`, `age`) VALUES (5, 'li', 22);
INSERT INTO `user`(`id`, `name`, `age`) VALUES (6, 'l1', 26);
INSERT INTO `user`(`id`, `name`, `age`) VALUES (7, 'zhang', 21);