# Write your MySQL query statement below
select name, UNIQUE_ID from employees 
left join  employeeUNI
on employees.id=employeeUNI.id