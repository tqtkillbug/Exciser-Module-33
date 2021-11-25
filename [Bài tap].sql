use quanlysinhvien;
-- Hien thi tat ca hoc sinh bat dau bang chu h
-- select * from  student where StudentName like "h%";
 
 -- Hien thi thong tin lop hoc bat dau vao thang 12
 -- select * from class where StartDate like "%-12-%";

-- Hien thi tat ca thong tin mon hoc co credit 3-5
-- select * from subject where Credit between 3 and 5 

-- Thay doi ma lop cua sinh vien ten Hung la 
 -- update student set ClassId = "2" where StudentName = "Hung"
 
 -- Hien thi sap xep tang dan 
 select student.StudentName, mark.Mark,  subject.SubName from student 
 left join  mark on student.StudentId = Mark.StudentId
left join subject on mark.SubId = subject.SubId
order by mark.Mark desc