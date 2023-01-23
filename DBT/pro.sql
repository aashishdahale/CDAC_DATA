drop procesure if EXISTS proc1;
delimeter $$
create procesure proc1
BEGIN

		select * from emp WHERE deptno=10;
end $$
delemiter;
