CREATE TABLE `board` (
	`boardid`	int	NOT NULL	COMMENT '게시판 id',
	`memberID`	varchar(8)	NOT NULL	COMMENT '회원id는 최대 8글자까지',
	`title`	varchar(100)	NULL,
	`content`	text	NULL
);

CREATE TABLE `member` (
	`memberID`	varchar(8)	NOT NULL	COMMENT '회원id는 최대 8글자까지',
	`name`	varchar(255)	NULL	COMMENT '회원이름은 한글 기준으로 255글자까지',
	`tel`	varchar(20)	NULL	COMMENT '연락처는 전화번호/집번호 둘 다 허용함.'
);

ALTER TABLE `board` ADD CONSTRAINT `PK_BOARD` PRIMARY KEY (
	`boardid`,
	`memberID`
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`memberID`
);

ALTER TABLE `board` ADD CONSTRAINT `FK_member_TO_board_1` FOREIGN KEY (
	`memberID`
)
REFERENCES `member` (
	`memberID`
);

