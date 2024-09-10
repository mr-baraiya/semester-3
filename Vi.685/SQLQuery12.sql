-------------------------- LAB 12 -------------------------------------------------------

--Complex Joins --


CREATE TABLE DEPT (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100) NOT NULL UNIQUE,
    DepartmentCode VARCHAR(50) NOT NULL UNIQUE,
    Location VARCHAR(50) NOT NULL
);

CREATE TABLE PERSON (
    PersonID INT PRIMARY KEY,
    PersonName VARCHAR(100) NOT NULL,
    DepartmentID INT NULL,
    Salary DECIMAL(8, 2) NOT NULL,
    JoiningDate DATETIME NOT NULL,
    City VARCHAR(100) NOT NULL,
    FOREIGN KEY (DepartmentID) REFERENCES Dept(DepartmentID)
);


INSERT INTO Dept (DepartmentID, DepartmentName, DepartmentCode, Location) VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block')
(6, 'ASDF', 'ASDD', 'A-Block');

INSERT INTO Person (PersonID, PersonName, DepartmentID, Salary, JoiningDate, City) VALUES
(101, 'Rahul Tripathi', 2, 56000, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000, '2000-05-25', 'Jamnagar');

SELECT * FROM DEPT;
SELECT * FROM PERSON;

--From the above given table perform the following queries:
--Part – A:

--1. Find all persons with their department name & code.
SELECT P.PersonName,D.DepartmentName,D.DepartmentCode
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID;

--2. Find the person's name whose department is in C-Block.
SELECT P.PersonName,D.Location
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE D.Location = 'C-Block';

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
SELECT P.PersonName,P.Salary,D.DepartmentName
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE P.City = 'Jamnagar';

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
SELECT P.PersonName,P.Salary,P.City,D.DepartmentName
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE P.CITY <> 'Rajkot';

--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
SELECT P.PersonName,D.DepartmentName,P.JoiningDate
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE D.DepartmentName = 'Civil' AND P.JoiningDate > '2001-08-01';

--6. Find details of all persons who belong to the computer department.
SELECT P.PersonName,D.DepartmentName
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE D.DepartmentName = 'Computer'; 

--7. Display all the person's name with the department whose joining date difference with the current date
--is more than 365 days.
SELECT P.PersonName,D.DepartmentName,P.JoiningDate
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE DATEDIFF(DAY,P.JoiningDate,GETDATE()) > 365;

--8. Find department wise person counts.
SELECT D.DepartmentName,COUNT(P.PersonID) AS Person_Count
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName;

--9. Give department wise maximum & minimum salary with department name.
SELECT D.DepartmentName,MAX(P.Salary) AS Max_Salary,MIN(P.Salary) AS Min_Salary
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName;

--10. Find city wise total, average, maximum and minimum salary.
SELECT P.City,SUM(P.Salary) AS Total_Salary, AVG(P.Salary) AS Avg_Salary ,MAX(P.Salary) AS Max_Salary,MIN(P.Salary) AS Min_Salary
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
GROUP BY P.City;

--11. Find the average salary of a person who belongs to Ahmedabad city.
SELECT P.City ,AVG(P.Salary) AS Avg_Salary
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE P.City = 'Ahmedabad'
GROUP BY P.City;

--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In
--single column)
SELECT P.PersonName + ' Lives in ' + P.City + ' and works in ' + D.DepartmentName + ' Department.'
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID

--Part – B:
--1. Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In
--single column)
SELECT CONCAT(P.PersonName,' earns ',P.Salary,' from ',D.DepartmentName,' Department Monthly.')
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID;

--2. Find city & department wise total, average & maximum salaries.
SELECT P.City,D.DepartmentName,SUM(P.Salary) AS Total_Salary, AVG(P.Salary) AS Avg_Salary ,MAX(P.Salary) AS Max_Salary,MIN(P.Salary) AS Min_Salary
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
GROUP BY P.City , D.DepartmentName;

--3. Find all persons who do not belong to any department.
SELECT P.PersonName , D.DepartmentName
FROM PERSON P LEFT OUTER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE D.DepartmentID IS NULL;

--4. Find all departments whose total salary is exceeding 100000.
SELECT D.DepartmentName,SUM(P.Salary) AS Total_Salary
FROM PERSON P INNER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName
HAVING SUM(P.Salary) > 100000;

--Part – C:
--1. List all departments who have no person.
SELECT P.PersonName , D.DepartmentName
FROM PERSON P RIGHT OUTER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
WHERE P.DepartmentID IS NULL;

--2. List out department names in which more than two persons are working.
SELECT D.DepartmentName,COUNT(P.PersonID) AS Person_Count
FROM PERSON P RIGHT OUTER JOIN DEPT D
ON P.DepartmentID = D.DepartmentID
GROUP BY D.DepartmentName
HAVING COUNT(P.PersonID) > 2;

--3. Give a 10% increment in the computer department employee’s salary. (Use Update)
UPDATE PERSON
SET Salary = Salary + 0.1*Salary
WHERE DepartmentID IN (SELECT P.DepartmentID FROM PERSON P JOIN DEPT D ON P.DepartmentID = D.DepartmentID WHERE D.DepartmentName = 'Computer');

SELECT * FROM PERSON;
