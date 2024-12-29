-- drop database quanlynhansu ;
create DATABASE quanlynhansu;

use quanlynhansu;
CREATE TABLE departments (
                             department_id INT PRIMARY KEY,
                             department_name VARCHAR(100) NOT NULL,
                             location VARCHAR(100) NOT NULL
);

INSERT INTO departments (department_id, department_name, location)
VALUES
    (1, 'IT', 'Hà Nội'),
    (2, 'HR', 'TP. Hồ Chí Minh'),
    (3, 'Finance', 'Đà Nẵng');

CREATE TABLE employees (
                           employee_id INT PRIMARY KEY,
                           name VARCHAR(100) NOT NULL,
                           position VARCHAR(50) NOT NULL,
                           salary DECIMAL(10, 2) NOT NULL,
                           department_id INT,
                           hire_date DATE NOT NULL,
                           FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO employees (employee_id, name, position, salary, department_id, hire_date)
VALUES
    (1, 'Nguyễn Văn A', 'Developer', 1500, 1, '2020-05-01'),
    (2, 'Trần Thị B', 'Tester', 1200, 1, '2021-03-15'),
    (3, 'Lê Văn C', 'Developer', 1500, 2, '2019-08-10'),
    (4, 'Nguyễn Thị D', 'Project Manager', 2500, 2, '2020-01-20'),
    (5, 'Phạm Văn E', 'Tester', 1300, 3, '2021-07-12'),
    (6, 'Hoàng Thị F', 'Developer', 1400, 3, '2022-09-01'),
    (7, 'Đặng Văn G', 'Developer', 1500, 1, '2022-05-20'),
    (8, 'Nguyễn Văn H', 'Developer', 2000, 2, '2018-12-15');

SELECT  distinct  e1.name AS employee1, e1.salary
FROM employees e1
         INNER JOIN employees e2
                    ON e1.salary = e2.salary AND e1.employee_id != e2.employee_id;

SELECT e.name, e.salary, d.department_name
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
         inner join (
    SELECT MAX(salary) as salary, department_id
    FROM employees
    GROUP BY department_id
) term on term.department_id = d.department_id and e.salary = term.salary;

-- 14
select emp.name,emp_colleague.name,dept.department_name from employees emp
                                                                 inner join departments dept on emp.department_id = dept.department_id
                                                                 inner join employees emp_colleague on emp_colleague.department_id = dept.department_id and emp_colleague.employee_id != emp.employee_id;

-- 15 DATEDIFF tính số năm giữa 2 ngày
SELECT d.department_name, SUM(YEAR(CURDATE()) - YEAR(e.hire_date)) AS total_experience
FROM employees e
         INNER JOIN departments d ON e.department_id = d.department_id
GROUP BY d.department_name;

-- index, partition
-- param condition
/*
1. GROUP BY:
Tính tổng lương của mỗi phòng ban:
2. HAVING:
Lọc các phòng ban có tổng lương lớn hơn 3000:
3. DISTINCT:
Lấy danh sách vị trí công việc duy nhất:
4. LIMIT & OFFSET:
Lấy 3 nhân viên đầu tiên, bỏ qua 2 nhân viên đầu tiên:
5. LIKE:
Tìm nhân viên có tên chứa “Nguyễn”:
6. SUM và AVG:
Tính tổng và trung bình lương của toàn bộ nhân viên:
7. INNER JOIN:
Lấy danh sách nhân viên và tên phòng ban của họ:
8. LEFT JOIN:
Lấy danh sách tất cả phòng ban và nhân viên của phòng ban đó (nếu có):
9. RIGHT JOIN:
Lấy danh sách tất cả nhân viên và thông tin phòng ban của họ (nếu có):
10. SELF JOIN:
Tìm các nhân viên có cùng mức lương
*/
-- c1
select d.department_name,sum(emp.salary) from employees emp
                                                  inner join departments d on emp.department_id = d.department_id
group by emp.department_id;
-- c2: Lọc các phòng ban có tổng lương lớn hơn 3000:
select d.department_name,sum(emp.salary) total_salary from employees emp
                                                               inner join departments d on emp.department_id = d.department_id
group by emp.department_id having total_salary > 3000;
-- c3: Lấy danh sách vị trí công việc duy nhất:
select distinct employees.position from employees;
-- c4 Lấy 3 nhân viên đầu tiên, bỏ qua 2 nhân viên đầu tiên,
/*
 offset: bắt đầu tu index nao
 limit: gioi han bao nhieu ban ghi
 */
select * from employees limit 3 offset 2;
-- c5 Tìm nhân viên có tên chứa “Nguyễn”:
select * from employees where name like '%Nguyễn%';
-- c6 Tính tổng và trung bình lương của toàn bộ nhân viên
/*
sum: tính tổng
avg: tính trung bình
 */
select sum(employees.salary) total_salary,avg(employees.salary) from employees;
-- c7 Lấy danh sách nhân viên và tên phòng ban của họ
select emp.name,dept.department_name from employees emp
                                              inner join departments dept on emp.department_id = dept.department_id;

-- c8 Lấy danh sách tất cả phòng ban và nhân viên của phòng ban đó (nếu có):
select dept.department_name,emp.name from departments dept left join employees emp
                                                                     on dept.department_id = emp.department_id;

-- 9. RIGHT JOIN: Lấy danh sách tất cả nhân viên và thông tin phòng ban của họ (nếu có):
select emp.name , dept.department_name, dept.location from employees emp right join departments dept
                                                                            on emp.department_id = dept.department_id;


-- 10 Tìm các nhân viên có cùng mức lương
select  emp.salary,emp.name from employees emp
                                             inner join employees emp_same_salary on emp.salary = emp_same_salary.salary
    and emp_same_salary.employee_id != emp.employee_id;

-- 11 Tìm phòng ban có nhiều nhân viên nhất và tổng lương của phòng ban đó
select dept.department_name,count(emp.employee_id),sum(emp.salary)
from departments dept
         inner join employees emp on dept.department_id = emp.department_id
group by dept.department_name order by count(emp.employee_id) desc limit 1;

-- 12. Tìm nhân viên có mức lương cao nhất trong mỗi phòng ban
select dept.department_id , emp.employee_id , emp.name , emp.salary
from employees emp
         inner join departments dept on dept.department_id = emp.department_id
where (dept.department_id , emp.salary) in (
    SELECT emp.department_id, MAX(emp.salary) as max_saraly
    FROM employees emp
    group by emp.department_id
    )
order by dept.department_name;

 --   13. Tính mức lương trung bình của từng vị trí công việc, chỉ hiển thị các vị trí có lương trung bình lớn hơn 1500
select emp.position AS vị_trí_công_việc , AVG(emp.salary) AS lương_trung_bình from employees emp
group by  emp.position having AVG(emp.salary) > 1500;

-- 14. Lấy danh sách nhân viên và đồng nghiệp cùng phòng ban (không bao gồm chính họ)
select emp.name as nhân_viên , emp2.name as đồng_nghiêp from employees emp join employees emp2
on emp.department_id = emp2.department_id and emp.employee_id != emp2.employee_id ;

-- 15. Tính tổng số năm kinh nghiệm của mỗi phòng ban
select department_id ,
       SUM( YEAR(CURDATE())-YEAR(employees.hire_date)) as tổng_kinh_nghiệm
from employees
group by department_id ;

-- 16. Tìm nhân viên được tuyển dụng sớm nhất trong mỗi phòng ban, bao gồm cả tên và ngày tuyển dụng
select department_id , employees.name , employees.hire_date from employees
where (department_id, hire_date) in (
    select department_id, MIN(hire_date)
    from employees
    group by department_id
    );

-- 17. Tìm phòng ban có tổng lương lớn nhất và hiển thị tên nhân viên, lương và phòng ban đó
select dept.department_name as phòng ,
       emp.employee_id as mã_nhân_viên ,
       emp.name as tên_nv ,
       emp.salary as lương
from employees emp inner join departments dept
    on emp.department_id = dept.department_id
where dept.department_id =(
    select emp.department_id from employees emp
    group by  emp.department_id order by sum(emp.salary) desc LIMIT 1
    ) ;

-- 18. Phân nhóm nhân viên theo bậc lương (ví dụ: < 1500, 1500-2000, > 2000) và tính tổng số nhân viên trong từng nhóm/-strong/-heart:>:o:-((:-h Sử dụng CASE và GROUP BY:
SELECT
    CASE
        WHEN emp.salary < 1500 THEN 'Duoi 1500'
        WHEN emp.salary BETWEEN 1500 AND 2000 THEN '1500-2000'
        ELSE 'Tren 2000'
        END AS bac_luong,
    COUNT(*) AS so_luong_nhan_vien
FROM
    employees emp
GROUP BY
    bac_luong;

-- 19. Tìm nhân viên có tổng số lương cao nhất trong tất cả các phòng ban (bao gồm cả tên phòng ban)
select
    emp.name,
    dept.department_name AS ten_phongban,
    emp.salary
from
    employees emp
     join
    departments dept
    on
        emp.department_id = dept.department_id
order by
    emp.salary DESC
LIMIT 1;

-- 20. Tìm tên nhân viên có lương cao hơn mức lương trung bình của phòng ban mà họ làm việc
SELECT
    emp.employee_id AS ma_nhan_vien,
    emp.name AS ten ,
    emp.salary AS luong,
    dept.department_name AS phong_ban
FROM
    employees emp
        INNER JOIN (
        SELECT
            department_id,
            AVG(salary) AS luong_trung_binh
        FROM
            employees
        GROUP BY
            department_id
    ) avg_salary
                   ON
                       emp.department_id = avg_salary.department_id
                           AND
                       emp.salary > avg_salary.luong_trung_binh
        INNER JOIN
    departments dept
    ON
        emp.department_id = dept.department_id;