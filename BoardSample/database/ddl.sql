
-- BOARD
CREATE TABLE `board` (
	`seq` INT(11) NOT NULL AUTO_INCREMENT,	-- 식별자(공통)
	`subject` VARCHAR(128) NULL,		-- 제목(공통)
	`content` VARCHAR(4000) NULL,		-- 내용(공통)
	PRIMARY KEY(`seq`),
	UNIQUE KEY seq (seq)
	
);






