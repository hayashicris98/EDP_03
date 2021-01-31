DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE 		Testing_System_Assignment_1;
USE 					Testing_System_Assignment_1;

CREATE TABLE `Department` (
	DepartmentID 	TINYINT UNSIGNED PRIMARY KEY,
    DepartmentName  NVARCHAR(50) UNIQUE KEY NOT NULL
 );	
 CREATE TABLE `Position` (
	PositionID 		TINYINT UNSIGNED PRIMARY KEY NOT NULL,
    PositionName 	ENUM('Dev', 'Test', 'Scrum Master', 'PM') UNIQUE KEY NOT NULL
 );	 
CREATE TABLE `Account` (
	AccountID 		SMALLINT UNSIGNED PRIMARY KEY,
    Email  			VARCHAR(50) UNIQUE KEY,
    Username   		VARCHAR(50) UNIQUE KEY NOT NULL,
    Fullname	 	NVARCHAR(50), 
    DepartmentID	TINYINT UNSIGNED NOT NULL,
    PositionID 		TINYINT UNSIGNED NOT NULL,	
    CreateDate 		DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(DepartmentID) REFERENCES Department(DepartmentID),
	FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
 );	 
 CREATE TABLE `Group` (
	GroupID 		TINYINT UNSIGNED PRIMARY KEY,
    GroupName 		VARCHAR(50) NOT NULL UNIQUE KEY,
    CreatorID 		SMALLINT UNSIGNED NOT NULL,
    CreateDate 		DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID)
 );	  
 CREATE TABLE GroupAccount (
	GroupID 		TINYINT UNSIGNED NOT NULL,
    AccountID 		SMALLINT UNSIGNED NOT NULL,
    JoinDate 		DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(GroupID,AccountID)
 );
 CREATE TABLE TypeQuestion (
	TypeID 			TINYINT UNSIGNED PRIMARY KEY,
    TypeName 		ENUM('Esay','Multiple-Choice') NOT NULL UNIQUE KEY
 );	
 CREATE TABLE CategoryQuestion (
	CategoryID  	TINYINT UNSIGNED PRIMARY KEY,
    CategoryName 	NVARCHAR(50) NOT NULL UNIQUE KEY
 );
 CREATE TABLE Question (
	QuestionID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 		VARCHAR(50) NOT NULL,
    CategoryID 		TINYINT UNSIGNED NOT NULL,
    TypeID 			TINYINT UNSIGNED,
    CreatorID 		SMALLINT UNSIGNED NOT NULL UNIQUE KEY,
    CreateDate 		DATETIME DEFAULT CURRENT_TIMESTAMP
 );
 CREATE TABLE Answer (
	AnswerID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 		VARCHAR(50) NOT NULL,
    QuestionID 		TINYINT UNSIGNED NOT NULL,
    isCorrect 		BIT DEFAULT 1,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID)
 );
 CREATE TABLE Exam (
	ExamID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Code			CHAR(10) NOT NULL,
    Title 			NVARCHAR(50) NOT NULL,
    CategoryID 		TINYINT UNSIGNED NOT NULL,
    Duration 		ENUM('30', '60', '90', '120'),
    CreatorID 		SMALLINT UNSIGNED NOT NULL,
    CreateDate 		DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountID)
 );
 CREATE TABLE ExamQuestion (
	ExamID 			TINYINT UNSIGNED NOT NULL,
    QuestionID 		TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID),
    FOREIGN KEY(ExamID) REFERENCES Exam(ExamID),
    PRIMARY KEY (ExamID,QuestionID)
 );

INSERT INTO Department(DepartmentName) 
VALUES
						(N'Marketing'	),
						(N'Sale'		),
						(N'Bảo vệ'		),
						(N'Nhân sự'		),
						(N'Kỹ thuật'	),
						(N'Tài chính'	),
						(N'Phó giám đốc'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Bán hàng'	);
 
