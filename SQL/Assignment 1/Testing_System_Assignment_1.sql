DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE 		Testing_System_Assignment_1;
USE 					Testing_System_Assignment_1;
CREATE TABLE Department (
	DepartmentID 	INT,
    DepartmentName  VARCHAR(50)
 );	
 CREATE TABLE `Position` (
	PositionID 		INT,
    PositionName 	VARCHAR(50)
 );	 
CREATE TABLE `Account` (
	AccountID 		VARCHAR(50),
    Email  			VARCHAR(150),
    Username   		VARCHAR(50),
    Fullname	 	VARCHAR(50),
    DepartmentID	INT,
    PositionID 		INT,	
    CreateDate 		DATE
 );	 
 CREATE TABLE `Group` (
	GroupID 		VARCHAR(50),
    GroupName 		VARCHAR(50),
    CreatorID 		VARCHAR(50),
    CreateDate 		DATE 
 );	  
 CREATE TABLE GroupAccount (
	GroupID 	VARCHAR(50),
    AccountID 	VARCHAR(50),
    JoinDate 	DATE
 );
 CREATE TABLE TypeQuestion (
	TypeID 			INT,
    TypeName 		VARCHAR(50)
 );	
 CREATE TABLE CategoryQuestion (
	CategoryID  	INT,
    CategoryName 	VARCHAR(50)
 );
 CREATE TABLE Question (
	QuestionID 		VARCHAR(50),
    Content 		VARCHAR(50),
    CategoryID 		INT,
    TypeID 			VARCHAR(50),
    CreatorID 		VARCHAR(50),
    CreateDate 		DATE
 );
 CREATE TABLE Answer (
	AnswerID		VARCHAR(50),
    Content 		VARCHAR(50),
    QuestionID 		VARCHAR(50),
    isCorrect 		VARCHAR(10)
 );
 CREATE TABLE Exam (
	ExamID 			VARCHAR(50),
    Code 			VARCHAR(50),
    Title 			VARCHAR(50),
    CategoryID 		INT,
    Duration 		VARCHAR(50),
    CreatorID 		VARCHAR(50),
    CreateDate 		DATE
 );
 CREATE TABLE ExamQuestion (
	ExamID 			VARCHAR(50),
    QuestionID 		VARCHAR(50)
 );
 
