
-- Board
INSERT INTO board (subject,content) VALUES('test Subject', 'test Content');
INSERT INTO board (subject,content) VALUES('test Subject2','test Content2');

INSERT INTO board_table (type, subject, content) VALUES('Announce', '안녕', '하세요');


INSERT INTO board_table (type, subject, content) VALUES('Announce','Announce Subject3','Announce Content3');
update board_table board set board.type =('Announce') where board.seq='2';
update board_table set subject=#subject#,content=#content# where seq=#seq#;
delete from board_table where seq = '3';