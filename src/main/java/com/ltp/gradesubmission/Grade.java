package com.ltp.gradesubmission;

public class Grade {

  private String name;
  private String subject;
  private int grade;

  public Grade(String name, String subject, int grade) {
    this.name = name;
    this.subject = subject;
    this.grade = grade;

  }

  public Grade() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public int getGrade() {
    return this.grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

}
