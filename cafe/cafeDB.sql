create table menu(
	name VARCHAR2(100) NOT NULL, --이름
	price number NOT NULL,-- 가격
	stock number NOT NULL, -- 재고
	PRIMARY KEY (name)
);

alter table menu modify stock default 0; -- 재고 디폴트값 0
alter table menu modify price default 0; -- 가격 디폴트값 0

--1.아메리카노 2.아샷추 3.키위주스 4.딸기주스 5.카모마일티 6.녹차
insert into menu values('아메리카노',4000,10);
insert into menu values('아샷추',4000,10);
insert into menu values('키위주스',6000,10);
insert into menu values('딸기주스',6000,10);
insert into menu values('카모마일티',5000,10);
insert into menu values('녹차',5000,10);

select count(*) from menu;
select * from menu where rownum = 1;