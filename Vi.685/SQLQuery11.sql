--Lab 11 Implement SQL Joins
--Create below tables as per following data

SELECT * FROM STU_INFO;
SELECT * FROM RESULT;
SELECT * FROM EMPLOYEE_MASTER;

--Part – A:

--1. Combine information from student and result table using cross join or Cartesian product.
SELECT * FROM STU_INFO , RESULT;
SELECT * FROM STU_INFO CROSS JOIN RESULT;

--2. Perform inner join on Student and Result tables.
SELECT * FROM STU_INFO INNER JOIN RESULT
ON STU_INFO.RNO = RESULT.RNO;

--3. Perform the left outer join on Student and Result tables.
SELECT * FROM STU_INFO LEFT OUTER JOIN RESULT
ON STU_INFO.RNO = RESULT.RNO;

--4. Perform the right outer join on Student and Result tables.
SELECT * FROM STU_INFO RIGHT OUTER JOIN RESULT
ON STU_INFO.RNO = RESULT.RNO;

--5. Perform the full outer join on Student and Result tables.
SELECT * FROM STU_INFO FULL OUTER JOIN RESULT
ON STU_INFO.RNO = RESULT.RNO;

--6. Display Rno, Name, Branch and SPI of all students.
SELECT S.RNO, S.NAME, S.BRANCH, R.SPI
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO;

--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
SELECT S.RNO, S.NAME, S.BRANCH, R.SPI
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO
WHERE S.BRANCH = 'CE';

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
SELECT S.RNO, S.NAME, S.BRANCH, R.SPI
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO
WHERE S.BRANCH <> 'EC';

--9. Display average result of each branch.
SELECT S.BRANCH, AVG(R.SPI) AS AVG_RESULT
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO
GROUP BY S.BRANCH;

--10. Display average result of CE and ME branch.
SELECT S.BRANCH, AVG(R.SPI) AS AVG_RESULT
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO
WHERE S.BRANCH IN ('CE','ME')
GROUP BY S.BRANCH;

--Part – B:

--1. Display average result of each branch and sort them in ascending order by SPI.
SELECT S.BRANCH, AVG(R.SPI) AS AVG_RESULT
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO
GROUP BY S.BRANCH
ORDER BY AVG_RESULT ASC;

--2. Display highest SPI from each branch and sort them in descending order.
SELECT S.BRANCH, MAX(R.SPI) AS MAX_SPI
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO = R.RNO
GROUP BY S.BRANCH
ORDER BY MAX_SPI DESC;

--Part – C:
--1. Retrieve the names of employee along with their manager’s name from the Employee table.
SELECT E.NAME AS EMPLOYEE_NAME , M.NAME AS MANAGER_NAME
FROM EMPLOYEE_MASTER AS E INNER JOIN EMPLOYEE_MASTER AS M
ON E.MANAGERNO = M.EMPLOYEENO;
