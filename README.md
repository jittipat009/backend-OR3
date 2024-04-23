# SQL query
```
 create database tododatabase;
use tododatabase; 
CREATE TABLE todos_table (
  taskId INT NOT NULL AUTO_INCREMENT,  -- Auto-incrementing primary key
  taskTitle VARCHAR(100) NOT NULL,
  taskDescription TEXT,
  taskAssignees VARCHAR(30) NOT NULL,
  taskStatus ENUM('No Status', 'To Do', 'Doing', 'Done') NOT NULL DEFAULT 'No Status',
  createdOn DATETIME NOT NULL,
  updatedOn DATETIME NOT NULL,
  PRIMARY KEY (taskId)  -- Set taskId as the primary key
);
```
