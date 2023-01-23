

drop function if exists f1;
delimiter $
create function f1() returns varchar(20)
BEGIN
	return "hello world";
end $
delimiter ;

-----------------------------------

drop function if exists f3;
delimiter $
create function f3() returns int
BEGIN
	declare x int;
	select max(deptno) + 1 into x from dept;
	return x;
end $
delimiter ;






drop function if exists f2;
delimiter $
create function f2(p1 int, p2 int) returns int
BEGIN
	return (ifnull(p1,0) + ifnull(p2,0));
end $
delimiter ;

DROP PROCEDURE IF EXISTS pro16;
delimiter $$
CREATE PROCEDURE pro16()
begin
	DECLARE _DEPTNO INT;
	DECLARE _DNAME VARCHAR(20);
	DECLARE _LOC VARCHAR(20);
	DECLARE _PWD VARCHAR(20);
	DECLARE _STARTEDON VARCHAR(20);
	
	DECLARE X INT DEFAULT 0;
	
		declare c1 CURSOR for select * from dept ORDER BY DEPTNO DESC;
		-- DECLARE EXIT HANDLER FOR 1329 SELECT "NO ROWS TO EXTRACT" AS R1; 
		open c1;
		LBL:LOOP
		SET X := X + 1;
			fetch c1 into _DEPTNO, _DNAME, _LOC, _PWD, _STARTEDON;
			
			IF X <= 3 THEN
				SELECT _DEPTNO, LCASE(_DNAME), _LOC, _PWD, _STARTEDON;
			ELSE
				LEAVE LBL;
			END IF;
		END LOOP LBL;
		CLOSE C1;
end $$
delimiter ;



drop trigger if exists t1;
delimiter $
create trigger t1 before insert on dept for each row
BEGIN
	select "hello world";
end $
delimiter ;



drop trigger if exists t1;
delimiter $
create trigger t1 before insert on dept for each row
BEGIN
	insert into d values(new.deptno, new.dname, new.loc, new.pwd, new.startedon, curdate(), curtime(), user() );
end $
delimiter ;



drop trigger if exists t1;
delimiter $
create trigger t1 before delete on dept for each row
BEGIN
	insert into d values(old.deptno, old.dname, old.loc, old.pwd, old.startedon, curdate(), curtime(), user() );
end $
delimiter ;





drop trigger if exists t1;
delimiter $
create trigger t1 before insert on dept for each row
BEGIN
	set new.loc = ucase(new.loc);
end $
delimiter ;



drop trigger if exists t1;
delimiter $
create trigger t1 before insert on x for each row
BEGIN
	set new.c1 = new.c1  * 2;
end $
delimiter ;



drop trigger if exists t1;
delimiter $
create trigger t1 after insert on x for each row
BEGIN
	insert into x1 values(new.c1);
end $
delimiter ;
*/


-- insert into dept values(f3(), 'abc','surat','pwd','2020-01-01' );













































































