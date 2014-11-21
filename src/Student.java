public class Student {

    	private String name;
    	private int test[]= new int[3]; 
	
      public Student(){
		this("", 0, 0, 0);}

	public Student(String nm, int tst1, int tst2, int tst3) {
		name = nm;
		test[0] = tst1;
		test[1] = tst2;
		test[2] = tst3;}

	public Student(Student s) {
		this(s.name, s.test[0], s.test[1], s.test[2]);}
        
        public Student(String nm, int t[]){
            name = nm;
            for(int i = 0;i < 3;i++){
                test[i]=t[i];}
        }

    	
    public void setName(String nm) {
    	name = nm;}

    public void setMark(int whatmark, int num){
    	test[whatmark-1] = num;
    }

    public int getAverage() {
    	int average;
	average = (test[0] + test[1] + test[2]) / 3;
    	return average;}

    public int getMark(int whatmark) {
	return test[whatmark-1];}

    public int getHighscore() {
    	if (test[0] > test[1] && test[0] > test[2]) {
    		return test[0];}

    	else if (test[1] > test[0] && test[1] > test[2]){
    		return test[1];} 
	else {
    		return test[2];}
        }
    
    //public String toString(){
      String str;
      str= "Name:\t\t" + name + "\n";
      str+= "" + getAverage();
      return str;}//
    
    public String toString() {
    	String str = "Name: " + name;
    	result += "\nFirst mark is: \t" + test[0];
    	result += "\nSecond mark is: \t" + test[1];
    	result += "\nThird mark is: \t" + test[2];
    	result += "\n--------------------------------";
    	result += "\nThe average is: \t" + getAverage();
    	return str;}

    public String getName() {
    	return name;}

    public String validateData() {
    	String errormessage = null;
    	if (name.length() <2){ 
    		errormessage += "\nName is required\n";}
    	
	if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100){ 
    		errormessage += "\nAt least one mark is out of range.";}
	if (errormessage !=null){
		errormessage += ("\n Please re-enter all data. ");}

	return errormessage;}
 }