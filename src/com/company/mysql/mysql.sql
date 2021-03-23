-- 1、查询课程编号为“01”的课程比“02”的课程成绩高的所有学生的学号（重点）

SELECT * from score where score.c_id = 01;

SELECT * from score where score.c_id = 02;

SELECT a.s_id from (SELECT * from score where score.c_id = 01) as a ,
(SELECT * from score where score.c_id = 02) as b
where a.s_id = b.s_id and a.s_score > b.s_score;

-- 2、查询平均成绩大于60分的学生的学号和平均成绩（简单，第二道重点）
-- 必须先分组 group by 后使用having过滤
SELECT score.s_id, avg(score.s_score) as avg_score from score GROUP BY score.s_id HAVING avg_score > 60;

-- 2.1、所有成绩小于60分的学生信息
SELECT student.* from student where student.s_id in (SELECT DISTINCT score.s_id from score where score.s_score < 60); -- error

-- 所有成绩小于60
SELECT * FROM student where student.s_id not in (SELECT score.s_id from score where score.s_score > 60);

-- 所有成绩小于六十 not exists 版本
SELECT * FROM student where not EXISTS (SELECT score.s_id from score where score.s_score > 60 and score.s_id = student.s_id);

-- 2.2、查询平均成绩小于60分的学生的学号和平均成绩，考虑没参加考试的情况

SELECT score.s_id, avg(score.s_score) as avg_score from score GROUP BY score.s_id HAVING avg_score < 60; -- 不考虑未参加考试的情况

SELECT student.s_id, avg(IFNULL(score.s_score,0)) as avg_score from student
left join score on student.s_id = score.s_id GROUP BY score.s_id HAVING avg_score < 60; -- 考虑未参加考试的情况