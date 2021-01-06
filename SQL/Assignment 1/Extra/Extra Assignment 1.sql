DROP DATABASE IF EXISTS Fresher_Training_Management;
CREATE DATABASE 		Fresher_Training_Management;
USE 					Fresher_Training_Management;

CREATE TABLE Trainee (
	TraineeID      		VARCHAR(50),
    Full_Name 			VARCHAR(50),
    Birth_Date 			DATE,
    Gender 				VARCHAR(50),
    ET_IQ 				INT,
    ET_Gmath 			INT,
    ET_English 			INT,
    Training_Class 		INT,
    Evaluation_Notes 	INT,
    VTI_Account			INT NOT NULL UNIQUE
);
