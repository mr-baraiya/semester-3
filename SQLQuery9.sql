--Lab 9 Perform SQL queries for Set operator and, Subqueries
--Sub Queries

--STUDENT_DATA
--no Name City DID
--101 Raju Rajkot 10
--102 Amit Ahmedabad 20
--103 Sanjay Baroda 40
--104 Neha Rajkot 20
--105 Meera Ahmedabad 30
--106 Mahesh Baroda 10

CREATE TABLE STUDENT_DATA (
	NO INT,
	NAME VARCHAR(20),
	CITY VARCHAR(20),
	DID INT
);

INSERT INTO STUDENT_DATA (NO,NAME,CITY,DID) VALUES
(101,'RAJU','RAJKOT',10),
(102,'AMIT','AHMEDABAD',20),
(103,'SANJAY','BARODA',40),
(104,'NEHA','RAJKOT',20),
(105,'MEERA','AHMEDABAD',30),
(106,'MAHESH','BARODA',10);

SELECT * FROM STUDENT_DATA;

--ACADEMIC
--Rno SPI Bklog
--101 8.8 0
--102 9.2 2
--103 7.6 1
--104 8.2 4
--105 7.0 2
--106 8.9 3

CREATE TABLE ACADEMIC(
	RNO INT,
	SPI DECIMAL(8,2),
	BKLOG INT
);

INSERT INTO ACADEMIC VALUES
(101,8.8,0),
(102,9.2,2),
(103,7.6,1),
(104,8.2,4),
(105,7.0,2),
(106,8.9,3);

SELECT * FROM ACADEMIC;

--DEPARTMENT
--DID DName
--10 Computer
--20 Electrical
--30 Mechanical
--40 Civil
CREATE TABLE DEPARTMENT(
	DID INT,
	DNAME VARCHAR(20)
);

INSERT INTO DEPARTMENT VALUES
(10,'COMPUTER'),
(20,'ELECTRICAL'),
(30,'MECHANICAL'),
(40,'CIVIL');

SELECT * FROM DEPARTMENT;

--Sub Queries
--Part – A:

--1. Display details of students who are from computer department.
--2. Displays name of students whose SPI is more than 8.
--3. Display details of students of computer department who belongs to Rajkot city.
--4. Find total number of students of electrical department.
--5. Display name of student who is having maximum SPI.
--6. Display details of students having more than 1 backlog.

--Part – B:

--1. Display name of students who are either from computer department or from mechanical department.
--2. Display name of students who are in same department as 102 studying in.

--Part – C:

--1. Display name of students whose SPI is more than 9 and who is from electrical department.
--2. Display name of student who is having second highest SPI.
--3. Display city names whose students branch wise SPI is 9.2

--SET Operators

--Part – A:
--Create below two tables as per following data.

--COMPUTER     ELECTRICAL
--RollNo Name  RollNo Name
--101 Ajay     105 Ajay
--109 Haresh   107 Mahesh
--115 Manish   115 Manish

--1. Display name of students who is either in Computer or in Electrical.
--2. Display name of students who is either in Computer or in Electrical including duplicate data.
--3. Display name of students who is in both Computer and Electrical.
--4. Display name of students who are in Computer but not in Electrical.
--5. Display name of students who are in Electrical but not in Computer.
--6. Display all the details of students who are either in Computer or in Electrical.
--7. Display all the details of students who are in both Computer and Electrical. 

--Part – B:
--Create below two tables as per following data.

--EMP_DATA CUSTOMER
--EID Name CID Name
--1 Ajay 5 Ajay
--9 Haresh 7 Mahesh
--5 Manish 5 Manish

--1. Display name of persons who is either Employee or Customer.
--2. Display name of persons who is either Employee or Customer including duplicate data.
--3. Display name of persons who is both Employee as well as Customer.
--4. Display name of persons who are Employee but not Customer.
--5. Display name of persons who are Customer but not Employee.

--Part – C:

--1. Perform all the queries of Part-B but display ID and Name columns instead of Name only