create database EMP_data;

create database EMP_data character set utf8mb4 collate utf8mb4_unicode_ci;

use EMP_data;

create table EempMP(
EMPNO INT(5) NOT NULL primary key,
ENAME varchar(45),
JOB varchar(45),
MGR INT(5),
HIREDATE date,
SAL INT(5),
COMM INT(5),
DEPTNO int(10)
);

show columns from EMP;

select * from EMP;

insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values('7369', 'SMITH', 'CLERK', 7902, 19801217, 800, null, '20')
,('7499', 'ALLEN', 'SALESMAN', '7698', 19810220, 1600, '300', '30')
,('7521', 'WARD', 'SALESMAN', '7698', 19810222, 1250, '500', '30')
,('7566', 'JONES', 'MANAGER', '7839', 19810402, 2975, null, '20')
,('7654', 'MARTIN', 'SALESMAN', '7698', 19810928, 1250, '1400', '30')
,('7698', 'BLAKE', 'MANAGER', '7839', 19810501, 2850, null, '30')
,('7782', 'CLARK', 'MANAGER', '7839', 19810609, 2450,null , '10')
,('7788','SCOTT','ANALYST','7566',19870419,3000, null,'20')
,('7839','KING','PRESIDENT',null,19811117,5000,null,'10')
,('7844','TURNER','SALESMAN','7698',19810908,1500,'0','30')
,('7876','ADAMS','CLERK','7788',19870523,1100,null,'20')
,('7900','JAMES','CLERK','7698',19811203,950,null,'30')
,('7902','FORD','ANALYST','7566',19811203,3000,null,'20')
,('7934','MILLER','CLERK','7782',19820123,1300,null,'10');
delete FROM EMP WHERE DEPTNO = 20;

ALTER TABLE EMP ADD primary key(EMPNO);

drop database if exists aEMP;