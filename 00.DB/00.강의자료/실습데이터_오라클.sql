create table dept (
  deptno   number(2), 
  dname    varchar2(14),
  loc      varchar2(20));

insert into dept values (10,'대표이사','서울');
insert into dept values (20,'기획부','서울');
insert into dept values (30,'기술부','서울');
insert into dept values (40,'영업부','서울');
insert into dept values (50,'운용팀','제주');
commit;

create table emp ( 
  empno     number(4), 
  ename     varchar2(10), 
  job       varchar2(9), 
  mgr       number(4), 
  birthday  date,
  hiredate  date, 
  salary    number(7),
  bonus     number(7), 
  deptno    number(2));

insert into emp values (1000,'서민구','대표',NULL,'1978-04-16','2010-01-01',1800,500,10);
insert into emp values (1002,'류현진','이사',1000,'1980-11-10','2013-01-03',1000,300,30);
insert into emp values (2001,'손흥민','차장',1000,'1982-01-12','2012-01-01',900,200,20);
insert into emp values (2002,'오승환','차장',1000,'1984-02-19','2014-10-01',900,200,40);
insert into emp values (2003,'선동렬','주임',2001,'1983-03-14','2012-10-01',700,100,20);
insert into emp values (2004,'최동원','사원',2002,'1990-04-20','2012-10-01',600,150,40);
insert into emp values (2005,'박세리','사원',2001,'1991-05-21','2014-09-01',500,150,20);
insert into emp values (2006,'양준혁','사원',1000,'1990-06-30','2014-10-01',600,150,50);
insert into emp values (2007,'장종훈','사원',2002,'1989-07-11','2015-11-01',550,NULL,40);
insert into emp values (2008,'이종법','과장',1002,'1980-08-23','2016-01-03',650,200,30);
insert into emp values (2009,'송진우','과장',1002,'1982-09-08','2016-01-03',650,200,30);
insert into emp values (2010,'이순철','사원',1002,'1980-10-06','2016-06-01',600,NULL,30);
insert into emp values (2011,'장채근','사원',1002,'1982-11-22','2016-06-01',500,NULL,30);
insert into emp values (2012,'류중일','사원',2002,'1992-12-16','2014-10-01',550,150,40);
commit;

create table major
( code number(3) , 
  name varchar2(25),
  part number(3),
  build  varchar2(25));

insert into major
values (101,'컴퓨터공학과',100,'정보관');

insert into major
values (102,'멀티미디어공학과',100,'멀티미디어관');

insert into major
values (103,'소프트웨어공학과',100,'소프트웨어관');

insert into major
values (201,'전자공학과',200,'전자제어관');

insert into major
values (202,'기계공학과',200,'기계실험관');

insert into major
values (301,'문헌정보학과',300,'인문관');

insert into major
values (100,'컴퓨터정보학부',10,null);

insert into major
values (200,'전기전자학부',10,null);

insert into major
values (300,'인문사회학부',20,null);

insert into major
values (10,'공과대학',null,null);

insert into major
values (20,'인문대학',null,null);

commit;

create table professor
(no number(4),
 name  varchar2(10), 
 id  varchar2(15),
 position varchar2(10),
 salary number(3),
 hiredate  date,
 bonus number(4) ,
 deptno  number(3),
 email  varchar2(50),
 url  varchar2(50));

insert into professor
values(1001,'서민구','smg','정교수',550,'2011-10-01',200,101,'smg@gmail.com','http://www.smgpage.net');

insert into professor
values(1002,'유재석','rjs','정교수',450,'2014-01-01',100,102,'rjs@gmail.com','http://www.rjspage.net');

insert into professor
values(1003,'박명수','pms','정교수',400,'2014-01-01',100,103,'pms@gmail.com','http://www.pmspage.net');

insert into professor
values(1004,'강호동','khd','조교수',350,'2016-10-01',100,101,'khd@gmail.com','http://www.khdpage.net');

insert into professor
values(1005,'이수근','lsg','조교수',300,'2017-03-01',100,102,'lsg@gmail.com','http://www.lsgpage.net');

insert into professor
values(1006,'김대희','kdh','조교수',350,'2015-03-01',100,103,'kdh@gmail.com','http://www.kdhpage.net');

insert into professor
values(1007,'유민상','rms','조교수',400,'2015-03-01',100,201,'rms@gmail.com','http://www.rmspage.net');
 
insert into professor
values(1008,'문세윤','msy','조교수',430,'2015-03-01',100,202,'msy@gmail.com','http://www.msypage.net');


insert into professor
values(1009,'김준현','kjh','조교수',512,'2015-03-01',100,101,'kjh@gmail.com','http://www.kjhpage.net');


insert into professor
values(5010,'김준호','kjh2','시간강사',280,'2015-03-01',NULL,102,'kjh2@gmail.com','http://www.kjh2page.net');


insert into professor
values(5011,'김병만','kbm','시간강사',355,'2015-03-01',NULL,103,'kbm@gmail.com','http://www.kbmpage.net');


insert into professor
values(5013,'유세윤','rsy','시간강사',200,'2015-03-01',NULL,301,'rsy@gmail.com','http://www.rsypage.net');

insert into professor
values(5014,'정형돈','jhd','시간강사',250,'2015-03-01',NULL,201,'jhd@gmail.com','http://www.jhdpage.net');

insert into professor
values(5015,'노홍철','nhc','시간강사',150,'2015-03-01',NULL,202,'nhc@gmail.com','http://www.nhcpage.net');
commit;

create table student
( studno number(6),
  name   varchar2(10),
  id varchar2(20),
  grade number,
  jumin char(13),
  birthday  date,
  tel varchar2(15),
  height  number(4),
  weight  number(3),
  major1 number(3),
  major2 number(3),
  profno  number(4));


insert into student values (
980111,'강진','kangjin',1,'9802231234567','1998-02-23','055)333-1234',183,71,101,null,null);

insert into student values (
980212,'곽종인','kwakjong',1,'9808021234567','1998-08-02','051)426-2345',178,65,102,null,null);

insert into student values (
980313,'박동인','kimdongin',1,'9810021234567','1998-10-02','053)566-3456',173,75,103,null,null);

insert into student values (
981113,'최정현','kimjunghyun',1,'9902082234567','1998-02-08','02)6122-4567',170,80,201,null,null);

insert into student values (
981213,'장영','kimyoung',1,'9812081234567','1998-12-08','031)122-5678',183,95,202,null,null);

insert into student values (
970111,'진영훈','kimyounghun',2,'9705231234567','1997-05-23','02)1220-6789',173,65,101,null,1001);

insert into student values (
970212,'이용','kimyong',2,'9712131234567','1997-12-13','055)222-6789',175,67,102,null,1002);

insert into student values (
970313,'김종연','kimyongyoun',2,'9711031234567','1997-11-03','051)356-9876',175,67,103,null,1003);

insert into student values (
971115,'하진석','hajinsuk',2,'9711031234567','1997-11-03','02)2212-6547',170,67,201,null,1007);

insert into student values (
971211,'유진성','youjinsung',2,'9703031234567','1997-03-03','031)567-5475',170,67,202,null,1008);

insert into student values (
960111,'이충연','leechungyun',3,'9603031234567','1996-03-03','032)3256-5445',169,67,101,301,1009);

insert into student values (
960212,'김태훈','kimtaehoon',3,'9603301234567','1996-03-30','02)5487-2345',189,63,102,null,1005);

insert into student values (
960315,'이철이','leechulri',3,'9612301234567','1996-12-30','02)2547-2345',180,67,103,null,1006);

insert into student values (
961115,'이여은','leeyueun',3,'9602252234567','1996-02-25','032)548-1445',159,48,201,103,1007);

insert into student values (
961215,'박재원','parkjewon',3,'9610271234567','1996-10-27','032)2582-9345',169,58,202,null,1008);

insert into student values (
950115,'이준희','leejunhee',4,'9410202234567','1994-10-20','02)2254-2645',163,59,101,null,1001);

insert into student values (
950211,'김희도','kimheedo',4,'9501201234567','1995-01-20','053)622-2459',173,69,102,null,1002);

insert into student values (
950315,'박동익','parkdongik',4,'9505211234567','1995-05-21','02)2152-2453',183,79,103,301,1003);

insert into student values (
951115,'장성태','jangsungtae',4,'9507211234567','1995-07-21','055)629-2475',178,73,201,301,1007);

insert into student values (
951215,'하정환','hajunghwan',4,'9508271234567','1995-08-27','02)6122-2554',176,71,202,101,1008);

commit;


