--Lab 9 Perform SQL queries for Set operator and, Subqueries
--Sub Queries

CREATE TABLE STUDENT_DATA (
	RNO INT,
	NAME VARCHAR(20),
	CITY VARCHAR(20),
	DID INT
);

INSERT INTO STUDENT_DATA (RNO,NAME,CITY,DID) VALUES
(101,'RAJU','RAJKOT',10),
(102,'AMIT','AHMEDABAD',20),
(103,'SANJAY','BARODA',40),
(104,'NEHA','RAJKOT',20),
(105,'MEERA','AHMEDABAD',30),
(106,'MAHESH','BARODA',10);

SELECT * FROM STUDENT_DATA;

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
SELECT * FROM STUDENT_DATA
WHERE DID = (SELECT DID FROM DEPARTMENT WHERE DNAME = 'COMPUTER');

--2. Displays name of students whose SPI is more than 8.
SELECT NAME FROM STUDENT_DATA
WHERE RNO IN (SELECT RNO FROM ACADEMIC WHERE SPI > 8);

--3. Display details of students of computer department who belongs to Rajkot city.
SELECT * FROM STUDENT_DATA
WHERE CITY = 'RAJKOT' AND DID = (SELECT DID FROM DEPARTMENT WHERE DNAME = 'COMPUTER');

--4. Find total number of students of electrical department.
SELECT COUNT(*) AS STUDENT_COUNT_IN_ELECTRICAL FROM STUDENT_DATA
WHERE DID = (SELECT DID FROM DEPARTMENT WHERE DNAME = 'ELECTRICAL');

--5. Display name of student who is having maximum SPI.
SELECT NAME FROM STUDENT_DATA
WHERE RNO = (SELECT RNO FROM ACADEMIC WHERE SPI = (SELECT MAX(SPI) FROM ACADEMIC));

--6. Display details of students having more than 1 backlog.
SELECT * FROM STUDENT_DATA
WHERE RNO IN (SELECT RNO FROM ACADEMIC WHERE BKLOG > 1);

--Part – B:

--1. Display name of students who are either from computer department or from mechanical department.
SELECT NAME FROM STUDENT_DATA
WHERE DID IN (SELECT DID FROM DEPARTMENT WHERE DNAME = 'COMPUTER' OR DNAME = 'MECHABICAL');

--2. Display name of students who are in same department as 102 studying in.
SELECT NAME FROM STUDENT_DATA
WHERE DID = (SELECT DID FROM STUDENT_DATA WHERE RNO = 102);


--Part – C:

--1. Display name of students whose SPI is more than 9 and who is from electrical department.
SELECT NAME FROM STUDENT_DATA
WHERE DID = (SELECT DID FROM DEPARTMENT WHERE DNAME = 'ELECTRICAL') AND RNO = (SELECT RNO FROM ACADEMIC WHERE SPI > 9);

--2. Display name of student who is having second highest SPI.
SELECT NAME FROM STUDENT_DATA
WHERE RNO =(SELECT RNO FROM ACADEMIC
			WHERE SPI = (SELECT MAX(SPI) FROM ACADEMIC
						WHERE SPI <> (SELECT MAX(SPI) FROM ACADEMIC)
						)
			);

--3. Display city names whose students branch wise SPI is 9.2
SELECT CITY FROM STUDENT_DATA
WHERE RNO IN (SELECT RNO FROM ACADEMIC WHERE SPI = 9.2);

--SET Operators

--Part – A:
--Create below two tables as per following data.
CREATE TABLE Computer(
RollNo INT,
Name VARCHAR(50)
);

INSERT INTO Computer(RollNo,Name)VALUES
(101,'Ajay'),
(109,'Haresh'),
(115,'Manish');

CREATE TABLE Electrical(
RollNo INT PRIMARY KEY,
Name VARCHAR(50)
);

INSERT INTO Electrical(RollNo,Name)VALUES
(105,'Ajay'),
(107,'Mahesh'),
(115,'Manish');

SELECT * FROM Electrical;
SELECT * FROM Computer;

--1. Display name of students who is either in Computer or in Electrical.
SELECT Name FROM Computer
UNION
SELECT Name FROM Electrical;

--2. Display name of students who is either in Computer or in Electrical including duplicate data.
SELECT Name FROM Computer
UNION ALL
SELECT Name FROM Electrical;

--3. Display name of students who is in both Computer and Electrical.
SELECT Name FROM Computer
INTERSECT
SELECT Name FROM Electrical;

--4. Display name of students who are in Computer but not in Electrical.
SELECT Name FROM Computer
EXCEPT
SELECT Name FROM Electrical;

--5. Display name of students who are in Electrical but not in Computer.
SELECT Name FROM Electrical
EXCEPT
SELECT Name FROM Computer;

--6. Display all the details of students who are either in Computer or in Electrical.
SELECT * FROM Computer
UNION
SELECT * FROM Electrical;

--7. Display all the details of students who are in both Computer and Electrical. 
SELECT * FROM Computer
INTERSECT
SELECT * FROM Electrical;

------------------ PART B ----------------------

CREATE TABLE Emp_DATA(
    EID INT,
    Name VARCHAR(50)
);

INSERT INTO Emp_DATA(EID,Name)VALUES
(1,'Ajay'),
(9,'Haresh'),
(5,'Manish');

CREATE TABLE Customer(
    CID INT,
    Name VARCHAR(50)
);

INSERT INTO Customer(CID,Name)VALUES
(5,'Ajay'),
(7,'Mahesh'),
(5,'Manish');

SELECT * FROM Emp_DATA;
SELECT * FROM Customer;

--1. Display name of persons who is either Employee or Customer.
SELECT NAME FROM Emp_DATA
UNION
SELECT NAME FROM Customer;

--2. Display name of persons who is either Employee or Customer including duplicate data.
SELECT NAME FROM Emp_DATA
UNION ALL
SELECT NAME FROM Customer;

--3. Display name of persons who is both Employee as well as Customer.
SELECT NAME FROM Emp_DATA
INTERSECT
SELECT NAME FROM Customer;

--4. Display name of persons who are Employee but not Customer.
SELECT NAME FROM Emp_DATA
EXCEPT
SELECT NAME FROM Customer;

--5. Display name of persons who are Customer but not Employee.
SELECT NAME FROM Customer
EXCEPT
SELECT NAME FROM Emp_DATA;

--Part – C:

--1. Perform all the queries of Part-B but display ID and Name columns instead of Name only.
--1.
SELECT * FROM Emp_DATA
UNION
SELECT * FROM Customer;

--2.
SELECT * FROM Emp_DATA
UNION ALL
SELECT * FROM Customer;

--3.
SELECT * FROM Emp_DATA
INTERSECT
SELECT * FROM Customer;

--4.
SELECT * FROM Emp_DATA
EXCEPT
SELECT * FROM Customer;

--5.
SELECT * FROM Customer
EXCEPT
SELECT * FROM Emp_DATA;
