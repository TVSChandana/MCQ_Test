package com.sasmitha.gproject.model;

import javax.persistence.*;

@Entity
@Table(name="Answers_Table")
public class Answers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Answer_ID")
    private Integer Answer_Id;

    public Integer getAnswer_Id() {
        return Answer_Id;
    }

    public void setAnswer_Id(Integer answer_Id) {
        Answer_Id = answer_Id;
    }

    public Integer getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(Integer student_Id) {
        Student_Id = student_Id;
    }

    public Integer getQuestion_Data_Id() {
        return Question_Data_Id;
    }

    public void setQuestion_Data_Id(Integer question_Data_Id) {
        Question_Data_Id = question_Data_Id;
    }

    public Integer getQuestion_Id() {
        return Question_Id;
    }

    public void setQuestion_Id(Integer question_Id) {
        Question_Id = question_Id;
    }

    public Integer getCorr_Ans_1() {
        return Corr_Ans_1;
    }

    public void setCorr_Ans_1(Integer corr_Ans_1) {
        Corr_Ans_1 = corr_Ans_1;
    }

    public Integer getCorr_Ans_2() {
        return Corr_Ans_2;
    }

    public void setCorr_Ans_2(Integer corr_Ans_2) {
        Corr_Ans_2 = corr_Ans_2;
    }

    public Integer getCorr_Ans_3() {
        return Corr_Ans_3;
    }

    public void setCorr_Ans_3(Integer corr_Ans_3) {
        Corr_Ans_3 = corr_Ans_3;
    }

    public Integer getCorr_Ans_4() {
        return Corr_Ans_4;
    }

    public void setCorr_Ans_4(Integer corr_Ans_4) {
        Corr_Ans_4 = corr_Ans_4;
    }

    public Integer getStud_Ans_1() {
        return Stud_Ans_1;
    }

    public void setStud_Ans_1(Integer stud_Ans_1) {
        Stud_Ans_1 = stud_Ans_1;
    }

    public Integer getStud_Ans_2() {
        return Stud_Ans_2;
    }

    public void setStud_Ans_2(Integer stud_Ans_2) {
        Stud_Ans_2 = stud_Ans_2;
    }

    public Integer getStud_Ans_3() {
        return Stud_Ans_3;
    }

    public void setStud_Ans_3(Integer stud_Ans_3) {
        Stud_Ans_3 = stud_Ans_3;
    }

    public Integer getStud_Ans_4() {
        return Stud_Ans_4;
    }

    public void setStud_Ans_4(Integer stud_Ans_4) {
        Stud_Ans_4 = stud_Ans_4;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getAnswer_Status() {
        return Answer_Status;
    }

    public void setAnswer_Status(Integer answer_Status) {
        Answer_Status = answer_Status;
    }

    public Integer getStudent_mark() {
        return Student_mark;
    }

    public void setStudent_mark(Integer student_mark) {
        Student_mark = student_mark;
    }

    @Column(name = "Student_Id")
    private Integer Student_Id;

    @Column(name = "Question_Data_Id")
    private Integer Question_Data_Id;

    @Column(name = "Question_Id")
    private Integer Question_Id;

    public Integer getQuestion_Number() {
        return Question_Number;
    }

    public void setQuestion_Number(Integer question_Number) {
        Question_Number = question_Number;
    }

    @Column(name = "Question_Number")
    private Integer Question_Number;

    @Column(name = "Corr_Ans_1")
    private Integer Corr_Ans_1;

    @Column(name = "Corr_Ans_2")
    private Integer Corr_Ans_2;

    @Column(name = "Corr_Ans_3")
    private Integer Corr_Ans_3;

    @Column(name = "Corr_Ans_4")
    private Integer Corr_Ans_4;

    @Column(name = "Stud_Ans_1")
    private Integer Stud_Ans_1;

    @Column(name = "Stud_Ans_2")
    private Integer Stud_Ans_2;

    @Column(name = "Stud_Ans_3")
    private Integer Stud_Ans_3;

    @Column(name = "Stud_Ans_4")
    private Integer Stud_Ans_4;

    @Column(name = "mark")
    private Integer mark;

    @Column(name = "Answer_Status")
    private Integer Answer_Status;

    @Column(name = "Student_mark")
    private Integer Student_mark;

    public String getAnswered_Or_Not() {
        return Answered_Or_Not;
    }

    public void setAnswered_Or_Not(String answered_Or_Not) {
        Answered_Or_Not = answered_Or_Not;
    }

    @Column(name = "Answered_Or_Not")
    private String Answered_Or_Not;

    @Column(name = "Question")
    private String Quest;

    @Column(name = "Ans_1")
    private String Ans_1;

    public String getQuest() {
        return Quest;
    }

    public void setQuest(String quest) {
        Quest = quest;
    }

    public String getAns_1() {
        return Ans_1;
    }

    public void setAns_1(String ans_1) {
        Ans_1 = ans_1;
    }

    public String getAns_2() {
        return Ans_2;
    }

    public void setAns_2(String ans_2) {
        Ans_2 = ans_2;
    }

    public String getAns_3() {
        return Ans_3;
    }

    public void setAns_3(String ans_3) {
        Ans_3 = ans_3;
    }

    public String getAns_4() {
        return Ans_4;
    }

    public void setAns_4(String ans_4) {
        Ans_4 = ans_4;
    }

    @Column(name = "Ans_2")
    private String Ans_2;

    @Column(name = "Ans_3")
    private String Ans_3;

    @Column(name = "Ans_4")
    private String Ans_4;
}