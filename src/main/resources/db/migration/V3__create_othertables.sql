
 CREATE TABLE answeroption
 (
 id INT UNSIGNED  AUTO_INCREMENT PRIMARY KEY,
 a_text VARCHAR(500) NOT NULL,
 q_textID INT UNSIGNED NOT NULL,
 q_score INT UNSIGNED  NOT NULL DEFAULT 1,
  FOREIGN KEY (q_textID) REFERENCES question(id),
UNIQUE (q_textID,a_text) 
 );

 
 CREATE TABLE q_correct_answers
 (
 id INT UNSIGNED  AUTO_INCREMENT PRIMARY KEY,
 q_id INT UNSIGNED NOT NULL,
 ans_opt INT UNSIGNED  NOT NULL,
FOREIGN KEY (q_id) REFERENCES question(id),
FOREIGN KEY (ans_opt) REFERENCES answeroption(id),
UNIQUE (q_id) 
 );
 
 CREATE TABLE assessments
(
id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(50) NOT NULL,
UNIQUE (NAME)  
);

 CREATE TABLE assessment_quest
 (
 id INT UNSIGNED  AUTO_INCREMENT PRIMARY KEY,
 assessment_id INT UNSIGNED NOT NULL,
 q_id INT UNSIGNED  NOT NULL,
FOREIGN KEY (assessment_id) REFERENCES assessments(id),
FOREIGN KEY (q_id) REFERENCES question(id),
UNIQUE (assessment_id,q_id) 
 );

 