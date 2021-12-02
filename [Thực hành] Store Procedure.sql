DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//
CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM student where student.ClassId = 2;

END //

DELIMITER 

call findAllCustomers();
