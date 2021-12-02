use quanlysinhvien;
--  Hien thi thong tin mon hoc co credit cao nhat
-- select  subject.subid, subject.Subname, subject.Status,max(Credit) from subject

-- Hien thi mon hoc co diem thi cao nhat
-- select max(mark.mark),subject.subid, subject.Subname, subject.Status, subject.Credit sub from mark
-- left join subject on mark.SubId = subject.SubId 

-- Hien thi tat ca sinh vien va diem trung binh cua moi sinh vien
