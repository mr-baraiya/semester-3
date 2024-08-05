--Math functions
--Part – A:

--1.Display the result of 5 multiply by 30.
SELECT 5*30 AS _5_multiply_by_30;

--2.Find out the absolute value of -25, 25, -50 and 50.
SELECT ABS(-25),ABS(25),ABS(-50),ABS(50); 

--3.Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
SELECT CEILING(25.2),CEILING(25.7),CEILING(-25.2);

--4.Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
SELECT FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2);

--5.Find out remainder of 5 divided 2 and 5 divided by 3.
SELECT 5 % 2 , 5 % 3;

--6.Find out value of 3 raised to 2nd power and 4 raised 3rd power.
SELECT POWER(3,2) AS _3_raised_to_2,POWER(4,3) AS _4_raised_to_3;

--7.Find out the square root of 25, 30 and 50.
SELECT SQRT(25) AS SQURE_ROOT_OF_25,SQRT(30) AS SQURE_ROOT_OF_30,SQRT(50) AS SQURE_ROOT_OF_50;

--8.Find out the square of 5, 15, and 25.
SELECT SQUARE(5) AS SQURE_OF_5,SQUARE(15) AS SQURE_OF_15,SQUARE(25)AS SQURE_OF_25;

--9.Find out the value of PI.
SELECT PI() AS PI_;

--10.Find out round value of 157.732 for 2, 0 and -2 decimal points.
SELECT ROUND(157.732,2) AS ROUNT_UPTO_2_DIGITS,
	   ROUND(157.732,0) AS ROUNT_UPTO_0_DIGITS,
	   ROUND(157.732,-2) AS ROUNT_UPTO_2_DIGITS;

--11.Find out exponential value of 2 and 3.
SELECT EXP(2) AS exponential_value_of_2 ,EXP(3) AS exponential_value_of_3;

--12.Find out logarithm having base e of 10 and 2.
SELECT LOG(10) AS LOG_OF_10_TO_BASE_e ,LOG(2) AS LOG_OF_2_TO_BASE_e;

--13.Find out logarithm having base b having value 10 of 5 and 100.
SELECT LOG10(5) AS LOG_OF_5_TO_BASE_10,LOG10(100) AS LOG_OF_100_TO_BASE_10 ;

--14.Find sine, cosine and tangent of 3.1415.
SELECT SIN(3.1415) AS SINE_OF_PI ,COS(3.1415) AS COSINE_OF_PI, TAN(3.1415) AS TAN_OF_PI;

--15.Find sign of -25, 0 and 25.
SELECT SIGN(-25),SIGN(0),SIGN(25);

--16.Generate random number using function.
SELECT RAND() AS Random_number;

--Part – B:
--Create and Insert the following records in the EMP_MASTER table.

CREATE TABLE EMP_MASTER(
	EMPNO INT,
	EMPNAME VARCHAR(25),
	JOININGDATE DATETIME,
	SALARY DECIMAL(8,2),
	COMMISSION DECIMAL(8,2),
	CITY VARCHAR(25),
	DEPTCODE VARCHAR(5)
);



INSERT INTO EMP_MASTER VALUES (101, 'KEYUR', '2002-01-05', 12000.00 , 4500, 'RAJKOT', '3@G');
INSERT INTO EMP_MASTER VALUES (102, 'HARDIK', '2004-02-15', 14000.00 , 2500, 'AHMEDABAD', '3@');
INSERT INTO EMP_MASTER VALUES (103, 'KAJAL', '2006-03-14', 15000.00 , 3000, 'BARODA', '3-GD');
INSERT INTO EMP_MASTER VALUES (104, 'BHOOMI', '2005-06-23', 12500.00 , 1000, 'AHMEDABAD', '1A3D');
INSERT INTO EMP_MASTER VALUES (105, 'HARMIT', '2004-02-15', 14000.00 , 2000, 'RAJKOT', '312A');

SELECT * FROM EMP_MASTER;

--1.Display the result of Salary plus Commission.
SELECT  SUM(SALARY+COMMISSION) AS RESULT FROM EMP_MASTER GROUP BY EMPNO;

--2.Find smallest integer value that is greater than or equal to 55.2, 35.7 and -55.2.
SELECT CEILING(55.2),CEILING(35.7),CEILING(-55.2);

--3.Find largest integer value that is smaller than or equal to 55.2, 35.7 and -55.2.
SELECT FLOOR(55.2),FLOOR(35.7),FLOOR(-55.2);

--4.Find out remainder of 55 divided 2 and 55 divided by 3.
SELECT 55%2 AS REMAINDER_55_DIVIDED_BY_2 , 55%3 AS REMAINDER_55_DIVIDED_BY_3;

--5.Find out value of 23 raised to 2nd power and 14 raised 3rd power.
SELECT SQUARE(23) AS SQURE_OF_23,POWER(14,3) AS POWER_OF_14_RAISE_TO_3;

--Part – C:
--1.Find out the square root of 36, 49 and 81.
SELECT SQRT(36) AS SQURE_ROOT_OF_36,SQRT(49) AS SQURE_ROOT_OF_49,SQRT(81) AS SQURE_ROOT_OF_81;

--2.Find out the square of 3, 9, and 12.
SELECT SQUARE(3) AS SQURE_OF_3,SQUARE(9) AS SQURE_OF_9,SQUARE(12)AS SQURE_OF_12;

--3.Find out round value of 280.8952 for 2, 0 and -2 decimal points.
SELECT ROUND(280.8952,2) AS ROUNT_UPTO_2_DIGITS,
	   ROUND(280.8952,0) AS ROUNT_UPTO_0_DIGITS,
	   ROUND(280.8952,-2) AS ROUNT_UPTO_2_DIGITS;

--4.Find sine, cosine and tangent of 4.2014.
SELECT SIN(4.2014) AS SINE ,COS(4.2014) AS COSINE, TAN(4.2014) AS TAN_;

--5.Find sign of -55, 0 and 95.
SELECT SIGN(-55),SIGN(0),SIGN(95);


--String functions


--Part – A:

--1.Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
SELECT LEN('NULL') AS LENGTH_OF_NULL , LEN('HELLO') AS LENGTH_OF_HELLO , LEN('') AS LENGTH_OF_;

--2.Display your name in lower & upper case.
SELECT LOWER('Prasham') AS LOWER_CASE , UPPER('Prasham') AS UPPER_CASE;

--3.Display first three characters of your name.
SELECT SUBSTRING('Prasham' , 1 ,3);

--4.Display 3rd to 10th character of your name.
SELECT SUBSTRING('NEELGOHELH' ,3,10);

--5.Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
SELECT REPLACE('abc123efg' , '123' , 'XYZ'), REPLACE('abcabcabc' , 'C' , '5');

--6.Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
SELECT ASCII('A') AS ASCII_OF_A ,ASCII('a') AS ASCII_OF_a ,ASCII('Z') AS ASCII_OF_Z ,ASCII('z') AS ASCII_OF_z ,ASCII('0') AS ASCII_OF_0, ASCII('9') AS ASCII_OF_9;

--7.Write a query to display character based on number 97, 65,122,90,48,57.
SELECT CHAR('97'), CHAR('65'), CHAR('122'), CHAR('90'), CHAR('48'), CHAR('57')

--8.Write a query to remove spaces from left of a given string ‘ hello world ‘.
SELECT LTRIM(' HELLO WORLD ');

--9.Write a query to remove spaces from right of a given string ‘ hello world ‘.
SELECT RTRIM(' HELLO WORLD ');

--10.Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
SELECT LEFT('SQL SERVER',4) , RIGHT('SQL SERVER' , 5);

--11.Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
SELECT CAST(1234.56 AS numeric);
SELECT CONVERT(numeric , 1234.56);

--12.Write a query to convert a float 10.58 to integer (Use cast and convert function).
SELECT CAST(10.58 AS numeric);
SELECT CONVERT(numeric , 10.58);

--13.Put 10 space before your name using function.
SELECT SPACE(10) + 'Prasham';

--14.Combine two strings using + sign as well as CONCAT ().
SELECT 'Prasham' + 'Togadiya';
SELECT CONCAT('Prasham' , 'Togadiya');

--15.Find reverse of “Darshan”.
SELECT REVERSE('DARSHAN');

--16.Repeat your name 3 times.
SELECT REPLICATE('Prasham' , 3);

--Part – B:
--Perform following queries on Student table of practical no 5.

--1.Find the length of FirstName and LastName columns.
SELECT LEN(FIRSTNAME) AS LENGTH_OF_FIRSTNAME , LEN(LASTNAME) AS LENGTH_OF_LASTNAME FROM STUDENT;

--2.Display FirstName and LastName columns in lower & upper case.
SELECT LOWER(FIRSTNAME) AS FIRSTNAME_IN_LOWERCASE, LOWER(LASTNAME) AS LASTNAME_IN_LOWERCASE ,UPPER(FIRSTNAME) AS FIRSTNAME_IN_UPPERCASE,UPPER(LASTNAME) AS LASTNAME_IN_UPPERCASE FROM STUDENT;

--3.Display first three characters of FirstName column.
SELECT LEFT(FIRSTNAME,3) FROM STUDENT;

--4.Display 3rd to 10th character of Website column.
SELECT SUBSTRING(WEBSITE , 3, 10) FROM STUDENT;

--5.Write a query to display first 4 & Last 5 characters of Website column.
SELECT LEFT(WEBSITE , 4) AS FROM_STARTING, RIGHT(WEBSITE , 5) AS FROM_LAST FROM STUDENT;




--Part – C: Perform following queries on Student table of practical no 5.

--1.Put 10 space before FirstName using function.
SELECT SPACE(10) + FIRSTNAME FROM STUDENT;

--2.Combine FirstName and LastName columns using + sign as well as CONCAT ().
SELECT FIRSTNAME + LASTNAME FROM STUDENT;
SELECT CONCAT(FIRSTNAME , LASTNAME) FROM STUDENT;

--3.Combine all columns using + sign as well as CONCAT ().
SELECT  FIRSTNAME + LASTNAME + WEBSITE + ADDRESS + CITY FROM STUDENT;

--4.Find reverse of FirstName column.
SELECT REVERSE(FIRSTNAME) FROM STUDENT;

--5.Repeat FirstName column 3 times
SELECT REPLICATE(FIRSTNAME , 3) FROM STUDENT;

--6.Give the Names which contains 5 characters.
SELECT * FROM STUDENT WHERE FIRSTNAME LIKE '_____';

--7.Combine the result as <FirstName> Lives in <City>.
SELECT FIRSTNAME +' '+ 'Lives In' +' '+ CITY AS RESULT FROM STUDENT;

--8.Combine the result as Student_ID of < FirstName > is <StuID>.
SELECT CONCAT('Student_ID',' ' , FIRSTNAME ,' ', 'is',' ' , STUID) AS RESULT FROM STUDENT ;



--Date Functions



--Part – A:

--1.Write a query to display the current date & time. Label the column Today_Date.
SELECT GETDATE() AS TODAY_DATE;

--2.Write a query to find new date after 365 day with reference to today.
SELECT DATEADD(D,365 , GETDATE()) AS New_Date_After_365_Days;

--3.Display the current date in a format that appears as may 5 1994 12:00AM.
SELECT FORMAT(GETDATE(), 'MMMM d yyyy hh:mm tt') AS Formatted_Date;

--4.Display the current date in a format that appears as 03 Jan 1995.
SELECT FORMAT(GETDATE(), 'd MMMM yyyy') AS Formatted_Date;

--5.Display the current date in a format that appears as Jan 04, 96.
SELECT FORMAT(GETDATE(), 'MMMM dd , yy') AS Formatted_Date;

--6.Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
SELECT DATEDIFF(MONTH , '31-DEC-08', '31-MAR-09') AS NO_OF_MONTHS;

--7.Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
SELECT DATEDIFF(YEAR , '14-SEP-10','25-JAN-12') AS NO_OF_YEAR;

--8.Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
SELECT DATEDIFF(HOUR , '25-JAN-12 7:00' , '26-JAN-12 10:30') AS NO_OF_HOUR;

--9.Write a query to extract Day, Month, Year from given date 12-May-16.
SELECT DATENAME(DAY , '12-MAY-16') AS NO_OF_DAY;
SELECT DATENAME(MONTH , '12-MAY-16') AS NO_OF_MONTH;
SELECT DATENAME(YEAR , '12-MAY-16') AS NO_OF_YEAR;

--10.Write a query that adds 5 years to current date.
SELECT DATEADD(YEAR, 5 , GETDATE()) AS FIVE_YEARS_ADDED;

--11.Write a query to subtract 2 months from current date.
SELECT DATEDIFF(MONTH , 02 , GETDATE()) AS TWO_MONTH_SUBTRACTED;

--12.Extract month from current date using datename () and datepart () function.
SELECT DATENAME(DAY , GETDATE()) AS MONTH_;
SELECT DATEPART(DAY , GETDATE()) AS MONTH_;

--13.Write a query to find out last date of current month.
SELECT EOMONTH(GETDATE()) AS Last_Date_of_Current_Month;

--14.Calculate your age in years and months.
SELECT DATEDIFF(YEAR , '2006-3-16' , GETDATE());


--Part – B: 
--Create a table EMP_DETAIL and insert the following records in the table.

CREATE TABLE EMP_DETAIL(
	EMPNO INT,
	EMPNAME VARCHAR(15),
	JOININGDATE DATETIME,
	SALARY DECIMAL(8,2),
	CITY VARCHAR(10)
);

SELECT * FROM EMP_DETAIL;

INSERT INTO EMP_DETAIL VALUES(101 , 'KEYUR' , '02-01-15' , 12000 , 'RAJKOT');
INSERT INTO EMP_DETAIL VALUES(102 , 'HARDIK' , '04-02-15' , 14000 , 'AHMEDABAD');
INSERT INTO EMP_DETAIL VALUES(103 , 'KAJAL' , '06-03-14' , 12000 , 'RAJKOT');
INSERT INTO EMP_DETAIL VALUES(104 , 'BHOOMI' , '05-06-23' , 12000 , 'RAJKOT');
INSERT INTO EMP_DETAIL VALUES(105 , 'HARMIT' , '04-02-15' , 12000 , 'RAJKOT');
INSERT INTO EMP_DETAIL VALUES(106 , 'JAY' , '07-03-12' , 12000 , 'RAJKOT');

--1.Write a query to find new date after 365 day with reference to JoiningDate.
SELECT DATEADD(D,365 , JOININGDATE ) AS New_Date_After_365_Days FROM EMP_DETAIL;

--2.Display the JoiningDate in a format that appears as may 5 1994 12:00AM.
SELECT FORMAT(JOININGDATE, 'MMMM d yyyy hh:mm tt') AS Formatted_Date  FROM EMP_DETAIL;

--3.Display the JoiningDate in a format that appears as 03 Jan 1995.
SELECT FORMAT(JOININGDATE, 'dd MMMM yyyy') AS Formatted_Date FROM EMP_DETAIL;

--4.Display the JoiningDate in a format that appears as Jan 04, 96.
SELECT FORMAT(JOININGDATE, 'MMMM d, yy') AS Formatted_Date FROM EMP_DETAIL;

--5.Write a query to find out total number of months between JoiningDate and 31-Mar-09.
SELECT DATEDIFF(MONTH ,'31-MAR-09' , JOININGDATE) AS NO_OF_MONTHS FROM EMP_DETAIL;

--6.Write a query to find out total number of years between JoiningDate and 14-Sep-10.
SELECT DATEDIFF(YEAR , '14-SEP-10',JOININGDATE) AS NO_OF_YEAR FROM EMP_DETAIL;


--Part – C:
--1.Write a query to extract Day, Month, Year from JoiningDate.
SELECT DATENAME(DAY , JOININGDATE) AS NO_OF_DAY FROM EMP_DETAIL;
SELECT DATENAME(MONTH , JOININGDATE) AS NO_OF_MONTH FROM EMP_DETAIL;
SELECT DATENAME(YEAR , JOININGDATE) AS NO_OF_YEAR FROM EMP_DETAIL;

--2.Write a query that adds 5 years to JoiningDate.
SELECT DATEADD(YEAR, 5 , JOININGDATE) AS FIVE_YEARS_ADDED FROM EMP_DETAIL;

--3.Write a query to subtract 2 months from JoiningDate.
SELECT DATEDIFF(MONTH , 02 , JOININGDATE) AS TWO_MONTH_SUBTRACTED FROM EMP_DETAIL;

--4.Extract month from JoiningDate using datename () and datepart () function.
SELECT DATENAME(DAY , JOININGDATE) AS MONTH_ FROM EMP_DETAIL;
SELECT DATEPART(DAY , JOININGDATE) AS MONTH_ FROM EMP_DETAIL;

--5.Calculate your age in years and months
SELECT DATEDIFF(YEAR , '2006-3-16' , GETDATE());
SELECT DATEDIFF(MONTH , '2006-3-16' , GETDATE());

