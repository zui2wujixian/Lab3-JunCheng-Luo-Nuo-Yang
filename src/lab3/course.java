package lab3;
/**
 * @author Roy Luo
 *
 */
public class course {
 private String cName;
 private int cNum;
 private int cTime;
 
public int getcTime() {
	return cTime;
}
public void setcTime(int cTime) {
	this.cTime = cTime;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public int getcNum() {
	return cNum;
}
public void setcNum(int cNum) {
	this.cNum = cNum;
}
 
course(String name,int num,int time){
	setcName(name);
	setcNum(num);
	setcTime(time);
}

public String toString() {
	return "Course name:"+this.getcName()+"\nCourse Number:"+this.getcNum()+"\nTime:"+this.getcTime()+"days";
	
}
 
 
 
}
