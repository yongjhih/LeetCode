SELECT *
FROM Employee Emp1
WHERE (1) = (
    SELECT COUNT(DISTINCT(Emp2.Salary))
    FROM Employee Emp2
    WHERE Emp2.Salary > Emp1.Salary);
