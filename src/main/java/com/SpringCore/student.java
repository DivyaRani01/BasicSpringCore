package com.SpringCore;


public class student {
	//Data members
    private String stdName; 
    private String stdCourse;
	//getters and setters
	@Override
	public String toString() {
		return "student [stdName=" + stdName + ", stdCourse=" + stdCourse + "]";
	}
	/**
	 * @return the stdName
	 */
	public String getStdName() {
		return stdName;
	}
	/**
	 * @param stdName the stdName to set
	 */
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	/**
	 * @return the stdCourse
	 */
	public String getStdCourse() {
		return stdCourse;
	}
	/**
	 * @param stdCourse the stdCourse to set
	 */
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	} 
    

}
